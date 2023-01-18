package com.rahatbek.mytest.multithreads.dmitriychuiko;

import java.util.concurrent.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.IntStream;

public class CompletableFutureDemo {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        // Методы: Создание

//        CompletableFuture()
//        - boolean complete(T value), нуспешно только для одного потока
//        - boolean completeExceptionally(Throwable ex)
//        CompletableFuture<U> completableFuture(U value)
//        CompletableFuture<U>
//                supplyAsync(Supplier<U> supplier [, Executor executor])
//        CompletableFuture<Void>
//                runAsync(Runnable runnable[Executor executor])
//        ForkJoinPool.commonPool() по умолчанию
//                - если выключен, new Thread()
        CompletableFuture<Long> cf1 = CompletableFuture.supplyAsync(() -> 42L);
        CompletableFuture<Long> start = CompletableFuture.completedFuture(42L);

        System.out.println(cf1);
        System.out.println(start);

        // Методы: *Отступление
        // упрощенная запись generics

//        Function<? super T,? extends U>
//                -> Function<T,U>
//        Consumer<? super T> -> Consumer<T>
//        ...

        // Методы: Трансформации (map)
        CompletableFuture<Long> cf2 = CompletableFuture
                .supplyAsync(() -> 42L)
                .thenApply(r1 -> r1 + 2016);
        System.out.println(cf2);

        // Методы: Подписка
//        CompletableFuture<Void> thenAccept(Consumer<T> block);
//        CompletableFuture<Void> thenRun(Runnable action);
//        Async versions

        CompletableFuture<Void> cf3 = CompletableFuture
                .supplyAsync(() -> 42L)
                .thenApply(r1 -> r1 + 2016)
                .thenAccept(System.out::println);

        // Методы: Комбинация (reduce)
//        CompletableFuture<V>
//                thenCombine(CompletionStage<U> other,
//                BiFunction<T,U,V> fn)
        CompletableFuture<Long> cf22 = CompletableFuture
                .supplyAsync(() -> 42L)
                .thenCombine(CompletableFuture.supplyAsync(() -> 2016), Math::min);
        System.out.println(cf22.get());

        // Методы: Для набора
//        CompletableFuture<Object>
//                anyOf(CompletableFuture<?>... cfs)
//        CompletableFuture<Void>
//                allOf(CompletableFuture<?>... cfs)

        // Методы: Для набора
//        CompletableFuture<U>
//                thenCompose(Function<T, CompletableFuture<U>> fn)
        CompletableFuture<Long> cfl = CompletableFuture
                .supplyAsync(() -> 42L)
                .thenCompose(x -> CompletableFuture.supplyAsync(() -> x + 2016));
        System.out.println(cfl.get());

        CompletableFuture<CompletableFuture<Long>> cfCfl = CompletableFuture
                .supplyAsync(() -> 42L)
                .thenApply(x -> CompletableFuture.supplyAsync(() -> x + 2016));
        System.out.println(cfCfl.get().get());

        // parallel where?
//        stream.paralel()
//                .map(x -> CompletableFuture.supplyAsync()...)
//        .map(CompletableFuture::join);

        // NOT Executors.newSingleThreadExecutor();
        ExecutorService es1 = new ForkJoinPool(1);
        Future<?> task1 = es1.submit(() -> {
            try {
                es1.submit(() -> System.out.println("1")).get();
            } catch (Exception e) {
            }
        });
        System.out.println(task1.get());

        // parallell where?
//        CompletableFuture.supplyAsync(() -> stream().parallel()..., fjpN);

        // Методы: Исполнение в потоках
//        isDone() -> исполнение метода в текущем потоке
//                Если не ...Async()
//                И для exceptionally()
//        helpPostComplete() на любой чих помогаем будить ждущих
//                и для exceptionally()
//                и для повторных вызовов complete()

        // Методы: @since 1.9
        // Наследование
//        CompletableFuture<U> newIncompleteFuture()
//        Executor defaultExecutor()
        // защитное копирование
//        CompletableFuture<T> copy()
//        CompletionStage<T> minimalCompletionStage()
        // Пропущенные методы
//        CompletableFuture<T>
//                completeAsync(Supplier<T> supplier[,Executor executor])
//        CompletionStage<U> completedStage(U value)
//        CompletableFuture<U> failedFuture(Throwable ex)
//        CompletionStage<U> failedStage(Throwable ex)


        // НАКЛАДНЫЕ РАСХОДЫ
        // Бенчмарк: Окружение
//        Intel Core i6-3320M (1x2x2, 3.3 GHz)
//        Linux x64 (kernel 3.19)
//        JDK 9 EA (b64)
//        OpenJDK JMH 1.10-SNAPSHOT
        // Бенчмарк: Базовые операции
//        @Param({ "1024" })
//        public volatile int loada;
//        @Param({ "1024" })
//        public volatile int loadb;
//        Integer a() {
//            Blackhole.consumeCPU(loada);
//            return loada;
//        }
//        Integer b() {
//            Blackhole.consumeCPU(loadb);
//            return loadb;
//        }
        // Что сравниваем
        // Простой вариант
//        @Benchmark
//        public Integer ab() {
//            return a() * b();
//        }
    }
    //        @Benchmark
    public Integer stream () throws InterruptedException, ExecutionException {
        return IntStream.range(0, 2)
                .mapToObj((i) -> i == 0 ? a() : b())
                .reduce(1, (a, b) -> a * b);
    }

//    @Benchmark
    public Integer parStream() throws InterruptedException, ExecutionException {
        return IntStream.range(0,2).parallel()
                .mapToObj((i) -> i == 0 ? a() : b())
                .reduce(1, (a, b) -> a * b);
    }

    // Future

//    @Benchmark
    public Integer future2() throws InterruptedException, ExecutionException {
        ExecutorService fjp = ForkJoinPool.commonPool();
        Future<Integer> fa = fjp.submit(() -> a());
        Future<Integer> fb = fjp.submit(() -> b());
        return fa.get() * fb.get();
    }
//    @Benchmark
    public Integer future3() throws InterruptedException, ExecutionException {
        ExecutorService fjp = ForkJoinPool.commonPool();
        Future<Integer> fa = fjp.submit(() -> a());
        Future<Integer> fb = fjp.submit(() -> b());
        return fjp.submit(() -> fa.get() * fb.get()).get();
    }
    // CompletableFuture

    private int a() {
        return 1;
    }
    private int b() {
        return 1;
    }

//    @Benchmark
    public Integer cf2() throws InterruptedException, ExecutionException {
        return CompletableFuture.supplyAsync(() -> a())
                .thenCombine(CompletableFuture.supplyAsync(() -> b()), (a, b) -> a * b)
                .get();
    }

    public Integer cf3() throws InterruptedException, ExecutionException {
        return CompletableFuture.supplyAsync(() -> a())
                .thenCombineAsync(CompletableFuture.supplyAsync(() -> b()), (a, b) -> a * b)
                .get();
    }

    // Пример. Rest-сервис

}

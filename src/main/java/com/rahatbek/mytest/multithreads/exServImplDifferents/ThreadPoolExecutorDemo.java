package com.rahatbek.mytest.multithreads.exServImplDifferents;

import com.rahatbek.mytest.multithreads.stackoverflow.blockingqueue.BlockingQueue;

import java.util.concurrent.*;

public class ThreadPoolExecutorDemo {
    public static ExecutorService newFixedThreadPool(int nThreads) {
        return new java.util.concurrent.ThreadPoolExecutor(nThreads, nThreads,
                0L, TimeUnit.MILLISECONDS, new LinkedBlockingDeque<Runnable>());
    }

    public ThreadPoolExecutorDemo(int corePoolSize, int maximumPoolSize, long keepAliveTime,
                                  TimeUnit unit, BlockingQueue<Runnable> workQueue,
                                  ThreadFactory threadFactory, RejectedExecutionHandler handler) {
    }
}

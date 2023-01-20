package com.rahatbek.mytest.multithreads.alekseivladykin.genericsCollections;

import java.util.List;

public class Main {

}
/*
 * - Возможность параметризовать класс или метода каким-либо типом
 * - Напоминает шаблоны в С++, но есть большие отличия (нельзя использовать примитивные типы и их значения)
 * - Поддержка добавлена в Java5
 * - Следующие примеры взяты из стандартной библиотеки (код приведен с сокращениями)*/

/* package java.lang.ref; Параметризованный класс*/
abstract class ReferenceTest<T> {
    private T referent;

    public T get() {
        return referent;
    }
}

/* package java.util */
class CollectionsTest {
    public static <T> List<T> nCopies(int n, T o) {
        return null;
    }
}
/* Реализация
* - Р generic'ов в Java основана на <<type erasure>>
* - Для generic класса или метода генерируется только один вариант, вне зависимости от кол-ва разных
* параметризаций
* - На этапе компиляции выполняются проверки типов и добавляются необходимые приведения типов*/

/* Ограничения
* - По имени параметра нельзя создать экземпляр или массив
* T obj = new T(); // compilation error
* T[] arr = new T[]; // compilation error
* - Во время исполнения информация о generic-параметрах недоступна
* if (ob instanceof T) // compilation error*/

/* Поддержка наследования
* - Если class Integer extends Number, то:
* Number number = new Integer(1); // OK
* Number[] numberArray = new Integer[0]; // OK
*
* Reference<Number> ref = new WeakReference<Integer>(1); // not OK!
* Reference<? extends Number> ref2 = new WeakReference<Integer>(1);*/ // OK

/* Что такое коллекции
* - Разнообразные контейнеры для хранения наборов объектов, более удобные, чем массивы
*   - добавление/удаление элементов
*   - read-only коллекции
*   - операции поиска, объединения, вычитания
*   - поддержка разнообразных специальных случаев
* - В отличие от массивов, могут хранить только объекты. Для примитивных типов - классы-обертки и autoboxing
* - Пакет java.util*/


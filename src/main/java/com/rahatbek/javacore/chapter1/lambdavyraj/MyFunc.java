package com.rahatbek.javacore.chapter1.lambdavyraj;

// Пример захвата локальной переменной из объемлющей области действия
public interface MyFunc {
    int func(int n);
}

class VarCapture {
    public static void main(String[] args) {

        int num = 10;

        MyFunc myLambda = (n) -> {

            int v = num + n;

            // Но следующая строка кода недопустима, поскольку в ней
            // предпринимается попытка видоизменить значение переменной num
//            num++;
            return v;
        };

        // И следующая строка кода приведет к ошибке, поскольку в ней
        // нарушается действительно завершенное состояние переменной num
//        num = 9;
    }
}
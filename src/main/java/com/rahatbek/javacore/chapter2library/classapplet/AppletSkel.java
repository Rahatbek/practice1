package com.rahatbek.javacore.chapter2library.classapplet;

import java.applet.Applet;
import java.awt.*;

public class AppletSkel extends Applet {
    // Этот метод вызывается первым
    public void init() {
        // инициализация
    }
    //Этот метод вызывается вторым, после метода init().
    //Вызывается также при перезапуске аплета.
    public void start() {
        // начать или возобновить выполенение аплета
    }
    // Этот метод вызывается при остановке аплета
    public void stop() {
        // приостановить выполнение аплета
    }
    // Этот метод вызывается перед уничтожением аплета .
    // Это последний выполняемый метод.
    public void destroy() {
        // выполнить завершающие действия
    }
    // Этот метод вызывается, когда окно аплета
    // должно быть восстановлено.
    public void paint(Graphics g) {
        // повторно воспроизвести содержимое окна
    }

}

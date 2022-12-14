package com.rahatbek.javacore.chapter2library.systeminoutnio.jdk7;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.nio.file.InvalidPathException;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class ExplicitChannelWrite {
    public static void main(String[] args) {
        FileOutputStream fOut = null;
        FileChannel fChan = null;
        ByteBuffer mBuf;

        try {
            fOut = new FileOutputStream("test.txt");

            fChan = fOut.getChannel();

            mBuf = ByteBuffer.allocate(26);

            for (int i = 0; i < 26; i++)
                mBuf.put((byte) ('A' + i));

            mBuf.rewind();

            fChan.write(mBuf);
        } catch (IOException e) {
            System.out.println("Ошибка ввода-вывода " + e);
        } finally {
            try {
                if (fChan != null)
                    fChan.close();
            } catch (IOException e) {
                System.out.println("Ошибка закрытия канала.");
            }
            try {
                if (fOut != null)
                    fOut.close();
            } catch (IOException e) {
                System.out.println("Ошибка закрытия файла.");
            }
        }
    }
}

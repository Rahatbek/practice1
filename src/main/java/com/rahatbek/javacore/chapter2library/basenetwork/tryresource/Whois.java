package com.rahatbek.javacore.chapter2library.basenetwork.tryresource;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

// TODO: REMEMBER this code
public class Whois {
    public static void main(String[] args) throws IOException {
        int c;

        try (Socket s = new Socket("whois.internic.net", 43)) {

            InputStream in = s.getInputStream();
            OutputStream out = s.getOutputStream();

            String str = (args.length == 0 ? "MHProfessional.com" : args[0]) + "\n";

            byte buf[] = str.getBytes();

            out.write(buf);

            while ((c = in.read()) != -1) {
                System.out.print((char) c);
            }
        }
    }
}

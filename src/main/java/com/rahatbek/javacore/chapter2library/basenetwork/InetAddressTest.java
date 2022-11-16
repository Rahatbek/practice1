package com.rahatbek.javacore.chapter2library.basenetwork;

import java.net.InetAddress;
import java.net.UnknownHostException;

// TODO: REMEMBER this code
public class InetAddressTest {
    public static void main(String[] args) throws UnknownHostException {
        InetAddress address = InetAddress.getLocalHost();
        System.out.println(address);

        address = InetAddress.getByName("www.HerbSchildt.com");
        System.out.println(address);

        InetAddress SW[] = InetAddress.getAllByName("www.nba.com");
        for (int i = 0; i < SW.length; i++){
            System.out.println(SW[i]);
        }
    }
}

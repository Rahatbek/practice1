package com.rahatbek.javacore.chapter2library.regex30;

import java.rmi.Naming;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

interface AddServerIntF extends Remote {
    double add(double d1, double d2) throws RemoteException;
}
public class AddServerImpl extends UnicastRemoteObject implements AddServerIntF {
    public AddServerImpl() throws RemoteException {
    }

    public double add(double d1, double d2) throws RemoteException {
        return d1 + d2;
    }
}

class AddServer {
    public static void main(String[] args) {
        try {
            AddServerImpl addServerImpl = new AddServerImpl();
            Naming.rebind("AddServer", addServerImpl);
        } catch (Exception e) {
            System.out.println("Исключение: " + e);
        }
    }
}

class AddClient {
    public static void main(String[] args) {
        try {
            String addServerURL = "rmi://" + args[0] + "/AddServer";
            AddServerIntF addServerIntF = (AddServerIntF) Naming.lookup(addServerURL);

            System.out.println("Первое число: " + args[1]);
            double d1 = Double.valueOf(args[1]).doubleValue();
            System.out.println("Второе число: " + args[2]);
            double d2 = Double.valueOf(args[2]).doubleValue();
            System.out.println("Сумма: " + addServerIntF.add(d1, d2));
        } catch (Exception e) {
            System.out.println("Исключение: " + e);
        }
    }
}
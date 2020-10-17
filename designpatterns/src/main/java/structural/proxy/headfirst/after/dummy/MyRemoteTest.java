package structural.proxy.headfirst.after.dummy;

import java.net.MalformedURLException;
import java.rmi.AlreadyBoundException;
import java.rmi.Naming;
import java.rmi.RemoteException;

public class MyRemoteTest {
    public static void main(String[] args) throws RemoteException, AlreadyBoundException, MalformedURLException {
        MyRemote service = new MyRemoteImple();
        Naming.bind("RemoteHello", service);
    }
}

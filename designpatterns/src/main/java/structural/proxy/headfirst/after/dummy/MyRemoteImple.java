package structural.proxy.headfirst.after.dummy;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class MyRemoteImple extends UnicastRemoteObject implements MyRemote {
    protected MyRemoteImple() throws RemoteException {
    }

    @Override
    public String sayHello() throws RemoteException {
        return "Server says , hello";
    }
}

import java.rmi.RemoteException;
import java.rmi.Remote;

public interface HelloInterface extends Remote {

    String sayHelloTo(String name) throws RemoteException;
}
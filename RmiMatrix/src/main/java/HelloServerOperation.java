import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.rmi.registry.Registry;
import java.rmi.registry.LocateRegistry;

public class HelloServerOperation extends UnicastRemoteObject implements HelloInterface {

    public static final long serialVersionUID = 1L;

    protected HelloServerOperation() throws RemoteException {
        super();
    }

    @Override

    public String sayHelloTo(String name) throws RemoteException {
        System.err.println(name + " is tryin to contact ");
        return "Server says hello dude " + name;
    }

    public static void main(String[] args) {
        try {
            HelloServerOperation server = new HelloServerOperation();
            Registry registry = LocateRegistry.getRegistry();
            registry.rebind("Hello-Server", server);
            System.err.println("Hello-Server server ready"); // Server installed suscesfully.
            } catch (Exception e) {
            System.err.println("Server exception: " + e.getMessage());
            e.printStackTrace();
        }
    }

}
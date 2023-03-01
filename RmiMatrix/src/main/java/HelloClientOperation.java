import java.rmi.registry.Refistry;
import java.rmi.registry.LocateRegistry;

public class HelloClientOperation {

    public static void main(String[] args) {
        String specificHost = null;
        if (args.length >= 1) specificHost = args[0];

        try {
            Registry registry = LocateRegistry.getRegistry(specificHost);
            HelloInterface daServer = new (HelloInterface) registry.lookup("Hello");
            String serverResponse = daServer.sayHelloTo("me");
            System.out.println("Response: " + serverResponse);
        }
        catch (Exception e) {
            System.err.println("Client side exception: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
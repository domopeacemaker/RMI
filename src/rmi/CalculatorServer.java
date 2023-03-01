package rmi;
import rmi.CalculatorImpl;

import java.rmi.Naming;
import java.rmi.Remote;
import java.rmi.registry.LocateRegistry;

class CalculatorServer {
    public static void main(String[] args) {
        try {
            // Creación del servidor de registro RMI
            LocateRegistry.createRegistry(1099);

            // Instanciación del objeto servidor
            CalculatorImpl calculator;
            calculator = new CalculatorImpl();

            // Enlazado del objeto servidor con el servidor de registro RMI
            Naming.rebind("rmi://localhost/calculator", (Remote) calculator);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

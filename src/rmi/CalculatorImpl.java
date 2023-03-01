package rmi;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class CalculatorImpl extends UnicastRemoteObject implements Calculator {
    // Implementación de las funciones remotas
    public CalculatorImpl() throws RemoteException {
        super();
    }

    public float addition(float a, float b) throws RemoteException {
        return a + b;
    }

    public float substraction(float a, float b) throws RemoteException {
        return a - b;
    }

    public float multiplication(float a, float b) throws RemoteException {
        return a * b;
    }

    public float division(float a, float b) throws RemoteException {
        return a / b;
    }

    public float power(float a, int b) throws RemoteException {
        return (float)Math.pow(a, b);
    }
}

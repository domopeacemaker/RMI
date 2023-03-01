package rmi;
import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Calculator extends Remote {
    // Declaración de las funciones remotas
    public float addition(float a, float b) throws RemoteException;
    public float substraction(float a, float b) throws RemoteException;
    public float multiplication(float a, float b) throws RemoteException;
    public float division(float a, float b) throws RemoteException;
    public float power(float a, int b) throws RemoteException;
}

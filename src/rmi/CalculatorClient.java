package rmi;
import java.rmi.Naming;

public class CalculatorClient {
    public static void main(String[] args) {
        try {
            // Obtención del objeto remoto
            Calculator calculator = (Calculator) Naming.lookup("rmi://localhost/calculator");

            // Uso de las funciones remotas
            float a = 1.5f;
            float b = 2.5f;

            System.out.println(calculator.addition(a, b));
            System.out.println(calculator.substraction(a, b));
            System.out.println(calculator.multiplication(a, b));
            System.out.println(calculator.division(a, b));
            System.out.println(calculator.power(a, (int) b)); // o sin int

        } catch (Exception e) {
            System.err.println("Client side exception: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
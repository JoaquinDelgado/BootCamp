import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un numero:");
        int a = scanner.nextInt();
        int i = 2;
        boolean esPrimo = true;
        while (i < a && esPrimo)  {
            if (a%i==0) {
                esPrimo = false;
            }
            i++;
        }
        if (esPrimo && a > 0) {
            System.out.println(a+" es Primo");
        } else {
            System.out.println(a+" no es Primo");
        }
        scanner.close();
    }
}

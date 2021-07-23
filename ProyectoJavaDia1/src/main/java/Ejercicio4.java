import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un numero:");
        int a = scanner.nextInt();
        int contador = 1;
        int j = 2;
        int i = 2;
        System.out.println(1);
        while (contador < a) {
            boolean esPrimo = true;
            while ((esPrimo) && (i < j)) {
                if (j % i == 0) {
                    esPrimo = false;
                }
                i = i + 1;
            }
            if ((j == 1) || (esPrimo)) {
                System.out.println(j);
                contador++;
            }
            j++;
            i = 2;
        }
        scanner.close();
    }
}

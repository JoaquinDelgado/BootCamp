import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un numero:");
        int a = scanner.nextInt();
        System.out.println("Ingrese un numero:");
        int b = scanner.nextInt();
        int contador = 0;
        int i = 0;
        while (contador < a) {
            if (i%b==0) {
                System.out.println(i);
                contador++;
            }
            i++;
        }
        scanner.close();
    }
}

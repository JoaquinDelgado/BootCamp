import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un numero:");
        int n = scanner.nextInt();
        System.out.println("Ingrese un numero:");
        int m = scanner.nextInt();
        System.out.println("Ingrese un numero:");
        int d = scanner.nextInt();
        int contador = 1;
        int cantidadDigitos = 0;
        int numero = 1;
        int digito;
        int resto;
        while (contador <= n) {
            boolean termine = false;
            int numeroTemporal = numero;
            while (cantidadDigitos < m && !termine) {
                digito = numeroTemporal % 10;
                resto = numeroTemporal / 10;
                if (resto == 0) {
                    termine = true;
                }
                if (digito == d) {
                    cantidadDigitos++;
                }
                numeroTemporal = resto;
            }
            if (cantidadDigitos == m) {
                System.out.println(numero);
                contador++;
            }
            cantidadDigitos = 0;
            numero++;
        }
        scanner.close();
    }
}

import java.util.Scanner;
public class Numeros {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero;
        System.out.print("Ingrese un numero: ");
        numero = teclado.nextInt();
        // Positivo, negativo o cero
        if (numero > 0) {
            System.out.println("El numero es positivo");
        } else {
            if (numero < 0) {
                System.out.println("El numero es negativo");
            } else {
                System.out.println("El numero es cero");
            }
        }
        // Par o impar
        if (numero % 2 == 0) {
            System.out.println("El numero es par");
        } else {
            System.out.println("El numero es impar");
        }
        // Multiplo de 3 y 5
        if (numero % 3 == 0 && numero % 5 == 0) {
            System.out.println("Es multiplo de 3 y 5");
        } else {
            if (numero % 3 == 0) {
                System.out.println("Es multiplo de 3");
            } else {
                if (numero % 5 == 0) {
                    System.out.println("Es multiplo de 5");
                } else {
                    System.out.println("No es multiplo de 3 ni de 5");
                }
            }
        }
    }
}
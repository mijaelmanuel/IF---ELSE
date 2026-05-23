import java.util.Scanner;
public class Triangulo2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double lado1, lado2, lado3;
        System.out.print("Ingrese lado 1: ");
        lado1 = teclado.nextDouble();
        System.out.print("Ingrese lado 2: ");
        lado2 = teclado.nextDouble();
        System.out.print("Ingrese lado 3: ");
        lado3 = teclado.nextDouble();
        if (lado1 + lado2 > lado3 &&
            lado1 + lado3 > lado2 &&
            lado2 + lado3 > lado1) {
            if (lado1 == lado2 && lado2 == lado3) {
                System.out.println("Triangulo equilatero");
            } else {
                if (lado1 == lado2 ||
                    lado1 == lado3 ||
                    lado2 == lado3) {
                    System.out.println("Triangulo isosceles");
                } else {
                    System.out.println("Triangulo escaleno");
                }
            }
        } else {
            System.out.println("Triangulo invalido");
        }
    }
}
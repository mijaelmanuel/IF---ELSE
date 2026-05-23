import java.util.Scanner;
public class puntualidades {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int puntualidad, productividad, cumplimiento;
        double promedio;
        System.out.print("Ingrese puntualidad (0-20): ");
        puntualidad = teclado.nextInt();
        System.out.print("Ingrese productividad (0-20): ");
        productividad = teclado.nextInt();
        System.out.print("Ingrese cumplimiento (0-20): ");
        cumplimiento = teclado.nextInt();
        promedio = (puntualidad + productividad + cumplimiento) / 3.0;
        if (promedio >= 18) {
            System.out.println("Excelente");
        } else {
            if (promedio >= 14) {
                System.out.println("Bueno");
            } else {
                if (promedio >= 11) {

                    System.out.println("Regular");
                } else {

                    System.out.println("Deficiente");
                }
            }
        }
    }
}
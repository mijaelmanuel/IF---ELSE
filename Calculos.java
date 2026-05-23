import java.util.Scanner;
public class Calculos {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double ingreso;
        double impuesto;
        System.out.print("Ingrese ingreso: ");
        ingreso = teclado.nextDouble();
        if (ingreso < 0) {
            System.out.println("Ingreso invalido");
        } else {
            if (ingreso >= 0 && ingreso <= 1000) {
                impuesto = ingreso * 0.05;
                System.out.println("Impuesto: " + impuesto);
            } else {
                if (ingreso >= 1001 && ingreso <= 5000) {
                    impuesto = ingreso * 0.10;
                    System.out.println("Impuesto: " + impuesto);
                } else {
                    impuesto = ingreso * 0.20;
                    System.out.println("Impuesto: " + impuesto);
                }
            }
        }
    }
}
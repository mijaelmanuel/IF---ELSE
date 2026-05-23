import java.util.Scanner;
public class Riesgo {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double ingreso;
        String historial;
        int edad;
        System.out.print("Ingrese ingreso mensual: ");
        ingreso = teclado.nextDouble();
        teclado.nextLine();
        System.out.print("Ingrese historial crediticio (bueno, regular, malo): ");
        historial = teclado.nextLine().toLowerCase();
        System.out.print("Ingrese edad: ");
        edad = teclado.nextInt();
        if (ingreso >= 3000) {
            if (historial.equals("bueno")) {
                if (edad >= 21) {
                    System.out.println("Riesgo Bajo");
                } else {
                    System.out.println("Riesgo Medio");
                }
            } else if (historial.equals("regular")) {
                System.out.println("Riesgo Medio");
            } else {
                System.out.println("Riesgo Alto");
            }
        } else {
            if (historial.equals("bueno")) {
                System.out.println("Riesgo Medio");
            } else {
                System.out.println("Riesgo Alto");
            }
        }
    }
}
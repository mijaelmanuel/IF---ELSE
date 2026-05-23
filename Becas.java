import java.util.Scanner;
public class Becas {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double promedio, ingresos;
        int cursos;
        System.out.print("Ingrese promedio: ");
        promedio = teclado.nextDouble();
        System.out.print("Ingrese ingresos familiares: ");
        ingresos = teclado.nextDouble();
        System.out.print("Ingrese numero de cursos desaprobados: ");
        cursos = teclado.nextInt();
        if (promedio >= 16 && ingresos < 2000 && cursos == 0) {
            System.out.println("Beca completa");
        } else {
            if ((promedio >= 16 && ingresos < 2000) ||
                (promedio >= 18 && cursos <= 1)) {

                System.out.println("Beca parcial");
            } else {
                System.out.println("No recibe beca");
            }
        }
    }
}
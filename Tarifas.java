import java.util.Scanner;
public class Tarifas {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double distancia;
        double tarifaBase;
        double total;
        String usuario;
        String horario;
        System.out.print("Ingrese distancia en km: ");
        distancia = teclado.nextDouble();
        teclado.nextLine();
        System.out.print("Ingrese tipo de usuario (estudiante, adulto, adulto mayor): ");
        usuario = teclado.nextLine().toLowerCase();
        System.out.print("Ingrese horario (normal o nocturno): ");
        horario = teclado.nextLine().toLowerCase();
        if (distancia <= 0) {
            System.out.println("Distancia invalida");
        } else {
            tarifaBase = distancia * 2;
            total = tarifaBase;
            if (usuario.equals("estudiante")) {
                total = total * 0.50;
            } else {
                if (usuario.equals("adulto mayor")) {
                    total = total * 0.70;
                } else {
                    if (usuario.equals("adulto")) {
                        total = total;
                    } else {
                        System.out.println("Tipo de usuario invalido");
                    }
                }
            }
            if (usuario.equals("estudiante") ||
                usuario.equals("adulto") ||
                usuario.equals("adulto mayor")) {
                if (horario.equals("nocturno")) {
                    total = total + (total * 0.20);
                } else {
                    if (horario.equals("normal")) {
                        total = total;
                    } else {
                        System.out.println("Horario invalido");
                    }
                }
                if (horario.equals("normal") ||
                    horario.equals("nocturno")) {
                    System.out.println("Costo total: S/ " + total);
                }
            }
        }
    }
}
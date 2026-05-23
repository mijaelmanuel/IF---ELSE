import java.util.Scanner;
public class Seguridad {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String contraseña;
        boolean mayuscula = false;
        boolean numero = false;
        boolean simbolo = false;
        System.out.print("Ingrese contraseña: ");
        contraseña = teclado.nextLine();
        int i = 0;
        while (i < contraseña.length()) {
            char c = contraseña.charAt(i);
            if (Character.isUpperCase(c)) {
                mayuscula = true;
            }
            if (Character.isDigit(c)) {
                numero = true;
            }
            if (!Character.isLetterOrDigit(c)) {
                simbolo = true;
            }
            i++;
        }
        if (contraseña.length() >= 8 &&
            mayuscula &&
            numero &&
            simbolo) {
            System.out.println("Contraseña segura");
        } else {
            System.out.println("La contraseña no es segura");
            if (contraseña.length() < 8) {
                System.out.println("- Falta minimo 8 caracteres");
            }
            if (!mayuscula) {
                System.out.println("- Falta una mayuscula");
            }
            if (!numero) {
                System.out.println("- Falta un numero");
            }
            if (!simbolo) {
                System.out.println("- Falta un simbolo");
            }
        }
    }
}
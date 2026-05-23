import java.util.Scanner;
public class Login {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String usuarioCorrecto = "admin";
        String contraseñaCorrecta = "1234";
        String usuario;
        String contraseña;
        int intentos = 0;
        System.out.print("Ingrese usuario: ");
        usuario = teclado.nextLine();
        System.out.print("Ingrese contraseña: ");
        contraseña = teclado.nextLine();
        if (usuario.equals(usuarioCorrecto) &&
            contraseña.equals(contraseñaCorrecta)) {
            System.out.println("Inicio de sesion exitoso");
        } else {
            intentos++;
            if (intentos < 3) {
                System.out.println("Usuario o contraseña incorrectos");
                System.out.println("Intentos usados: " + intentos);
            } else {
                System.out.println("Cuenta bloqueada");
            }
        }
    }
}
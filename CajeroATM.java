import java.util.Scanner;
public class CajeroATM {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int pinCorrecto = 1234;
        int pin;
        int intentos = 0;
        double saldo = 5000;
        double retiro;
        double limiteDiario = 2000;
        System.out.print("Ingrese PIN: ");
        pin = teclado.nextInt();
        if (pin == pinCorrecto) {
            System.out.println("PIN correcto");
            System.out.println("1. Retirar dinero");
            System.out.println("2. Verificar saldo");
            System.out.print("Seleccione opcion: ");
            int opcion = teclado.nextInt();
            if (opcion == 1) {
                System.out.print("Ingrese monto a retirar: ");
                retiro = teclado.nextDouble();
                if (retiro > limiteDiario) {
                    System.out.println("Supera el limite diario");
                } else {
                    if (retiro > saldo) {
                        System.out.println("Fondos insuficientes");
                    } else {
                        if (retiro <= 0) {
                            System.out.println("Monto invalido");
                        } else {
                            saldo = saldo - retiro;
                            System.out.println("Retiro exitoso");
                            System.out.println("Saldo restante: " + saldo);
                        }
                    }
                }
            } else {
                if (opcion == 2) {
                    System.out.println("Saldo actual: " + saldo);
                } else {
                    System.out.println("Opcion invalida");
                }
            }
        } else {
            intentos++;
            if (intentos < 3) {
                System.out.println("PIN incorrecto");
            } else {
                System.out.println("Tarjeta bloqueada");
            }
        }
    }
}
import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class Cajero_automatico {
    static void main() {
        Scanner sc = new Scanner(System.in);
        final int LIMITE_RETIRO = 5000;
        int saldodis;
        int cantidad, saldo;
        final int SALDO_ADVERTENCIA = 500;

        System.out.println("---------Bienvenido al Cajero Automatico---------");
        System.out.println("Ingresa tu saldo disponible:$");
        saldodis = sc.nextInt();
        System.out.println("Ingresa la cantidad que deseas retirar:");
        cantidad = sc.nextInt();
        if (cantidad <= 0) {
            System.out.println("Operacion invalida");
            System.out.println("La cantidad debe ser mayor a cero");
        }else if (cantidad > saldodis) {
            System.out.println("Operacion invalida");
            System.out.println("Tienes saldo insuficiente");
        }else if (cantidad > LIMITE_RETIRO) {
            System.out.println("Operacion invalida");
            System.out.println("Superas el limite de retiro (solo operaciones menores o iguales a $5000)");
        }else {
            System.out.println("Operacion valida");
            System.out.println("Retiras la cantidad de efectivo de:" + cantidad);
            saldo = saldodis - cantidad;
            System.out.println("Tu saldo restante es de:" + saldo);
            if (saldo < SALDO_ADVERTENCIA) {
                System.out.println("Advertencia, cuentas con un saldo menor de $500");
            }
        }
    }
}

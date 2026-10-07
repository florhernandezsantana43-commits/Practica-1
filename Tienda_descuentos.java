import java.util.Scanner;

public class Tienda_descuentos {
    static void main() {
        Scanner sc = new Scanner(System.in);
        String nom;
        int monto, tipo1, tipo2, tipo3, tipo, montotp2;
        double des = 0.0;
        double des2;
        System.out.println("Ingrese su nombre:");
        nom = sc.nextLine();
        System.out.println("Ingrese el monto de la compra:");
        monto = sc.nextInt();
        System.out.println("Ingrese el tipo de cliente que es:(1.Cliente nuevo, 2.Cliente frecuente,3.Cliente VIP)");
        tipo = sc.nextInt();
        if (tipo == 1) {
            System.out.println("El total a pagar es de:" + monto);
            if (monto >= 2000) {
                des = monto * 0.05;
                System.out.println("Su monto original es de:" + monto);
                System.out.println("Su descuento aplicado es de:" + des);
                System.out.println("El total a pagar es:" + (monto - des));

            }

        } else if (tipo == 2) {
            des = monto * 0.1;
            System.out.println("Su monto original es de:" + monto);
            System.out.println("Su descuento aplicado es de:" + des);
            System.out.println("El total a pagar es:" + (monto - des));
            if (monto >= 2000) {
                des = monto * 0.1;
                des2 = monto * 0.05;
                System.out.println("Su otro descuento aplicado es de:" + des2);
                System.out.println("El total a pagar es:" + (monto - des - des2));
            }
        } else if (tipo == 3) {
            des = monto * 0.2;
            System.out.println("Su monto original es de:" + monto);
            System.out.println("Su descuento aplicado es de:" + des);
            System.out.println("El total a pagar es:" + (monto - des));
            if (monto >= 2000) {
                des = monto * 0.2;
                des2 = monto * 0.05;
                System.out.println("Su otro descuento aplicado es de:" + des2);
                System.out.println("El total a pagar es:" + (monto - des - des2));
            }

        }
    }
}

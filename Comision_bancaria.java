import java.util.Scanner;

public class Comision_bancaria {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int saldo,cantidad;
        final int COMISION=10;
        final int LIMITE_RETIRO=5000;

        System.out.println("Ingrese su saldo disponible:");
        saldo= sc.nextInt();
        System.out.println("Ingrese la cantidad que desea retirar.");
        cantidad= sc.nextInt();

        if(cantidad<=0){
            System.out.println("La cantidad debe de ser mayor a cero");
        }else if(cantidad>LIMITE_RETIRO){
            System.out.println("La cantidad supera el limite de retiro");
        }else if(saldo<cantidad+COMISION){
            System.out.println("El saldo es insuficiente para cubrir el retiro y la comision");
        } else {
            System.out.println("Retira un monto de:"+cantidad);
            System.out.println("Su comision es de:"+COMISION);
            System.out.println("Su saldo final es:"+(cantidad-COMISION));
        }

    }
}

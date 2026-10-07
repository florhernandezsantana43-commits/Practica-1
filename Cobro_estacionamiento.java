import java.util.Scanner;

public class Cobro_estacionamiento {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int tipo, horas,tarifa;
        final int TARIFA_MOTO = 10;
        final int TARIFA_AUTO = 20;
        final int TARIFA_CAMIO = 30;
        final double DESCUENTO_5 = 0.1;
        final double DESCUENTO_10 = 0.2;
        double subtotal,des = 0.0;
        String nombreVehiculo;

        System.out.println("Ingrese su tipo de vehiculo:(1.Motocicleta  2. Automovil  3.Camioneta)");
        tipo = sc.nextInt();
        System.out.println("Cuantas horas permanecio estacionado:");
        horas = sc.nextInt();

        if (horas <= 0) {
            System.out.println("La cantidad de horas no es valida");
        }else{
            if (tipo == 1) {
                tarifa=TARIFA_MOTO;
                nombreVehiculo="Motocicleta";
            } else if (tipo==2){
                tarifa=TARIFA_AUTO;
                nombreVehiculo="Automovil";
            }else{
                tarifa=TARIFA_CAMIO;
                nombreVehiculo="Camioneta";
            }
            subtotal=tarifa*horas;
            if(horas>10){
                des=subtotal*DESCUENTO_10;
            }else if(horas>5){
                des=subtotal*DESCUENTO_5;
            }
            System.out.println("Su tipo de Vehiculo es una:"+nombreVehiculo);
            System.out.println("Estuvo estacionado: "+horas+" horas");
            System.out.println("La tarifa por hora es:"+tarifa);
            System.out.println("Su subtotal es de: "+subtotal);
            System.out.println("Usted obtuvo un descuento de:"+des);
            System.out.println("El total a pagar es de: "+(subtotal-des));
        }

    }
}


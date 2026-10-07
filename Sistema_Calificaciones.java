import java.util.Scanner;

public class Sistema_Calificaciones {
    static void main() {
        Scanner sc=new Scanner(System.in);
        int cal1,cal2,cal3,prom;
        final int MINIMO_APROVATORIO=70;
        final int MINIMO_UNIDAD=60;
        System.out.println("Ingresa la calificacon de la primera unida:");
        cal1= sc.nextInt();
        if (cal1<MINIMO_UNIDAD){
            System.out.println("Deberas de presentar recuperacion de la unidad correspondiente");
        }
        System.out.println("Ingresa la calificacon de la segunda unida:");
        cal2= sc.nextInt();
        if (cal2<MINIMO_UNIDAD){
            System.out.println("Deberas de presentar recuperacion de la unidad correspondiente");
        }
        System.out.println("Ingresa la calificacon de la tercera unida:");
        cal3= sc.nextInt();
        if (cal3<MINIMO_UNIDAD){
            System.out.println("Deberas de presentar recuperacion de la unidad correspondiente");
        }
        prom=(cal1+cal2+cal3)/3;
        System.out.println("Tu promedio final es de:"+prom);
        if (prom>=MINIMO_APROVATORIO){
            System.out.println("Haz aprobado la materia");
        }else{
            System.out.println("Haz reprobado la materia");
        }
    }
}

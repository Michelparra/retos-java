package Retos;
import java.util.Scanner;

public class Reto2dosis {
    public static void main(String[] args){
        Scanner leer=new Scanner(System.in);

        int p,m;
        int x,y;
        int dosis;
        System.out.println("ingresar peso");
        p=leer.nextInt();
        System.out.println("Ingresar los meses");
        m=leer.nextInt();

        x=10;
        y=8;

        dosis=((p+x)/(m*x))*y;
        System.out.println("la dosis a aplicar es"+dosis);
        dosis=leer.nextInt();
        leer.close();





    }
}

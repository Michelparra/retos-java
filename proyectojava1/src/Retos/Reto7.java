package Retos;

import java.util.Scanner;

public class Reto7 {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);

        String nombre, apellido;

        System.out.println("Digite su nombre");
        nombre=leer.nextLine();


        System.out.println("Digite su apellido");
        apellido=leer.nextLine();

        System.out.println("Su nombre en mayusculas es"+(nombre.toUpperCase()));
        System.out.println("Su apellido en minusculas es"+(apellido.toLowerCase()));

        System.out.println("Su nombre completo es"+nombre+""+apellido);
        System.out.println("Su nombre tiene"+nombre.length()+"caracteres");
        System.out.println("Su apellido tiene"+apellido.length()+"caracteres");

        System.out.println("Su usuario puede ser"+(nombre.substring(0, 2))+apellido);

    }
}

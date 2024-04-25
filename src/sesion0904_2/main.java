package sesion0904_2;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        persona p1 = new persona();
        p1.hablar();
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce tu nombre");
        String nombre1 = sc.next();
        System.out.println("Introduce tu apellido");
        String apellido1 = sc.next();
        System.out.println("Introduce tu segundo apellido");
        String apellido2 = sc.next();
        System.out.println("Introduce tu dni");
        String dni1 = sc.next();

        System.out.println();
    }
}

package sesion1804;

import java.util.Scanner;
public class main {
    public static void main(String[] args) throws IllegalArgumentException {
        Persona persona = new Persona("ivan",-5);
        Scanner sc = new Scanner(System.in);
        System.out.println("introduzca el nombre de una persona");
        String nombre = sc.next();
        System.out.println("introduzcame la edad de una persona");
        int edad = sc.nextInt();
        Persona persona1 = new Persona(nombre,edad);
    }
}


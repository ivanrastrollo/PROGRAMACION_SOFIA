package sesion1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Introduzca las dimensiones del array que quiere crear :");
        Scanner scanner = new Scanner(System.in);
        int dimensionArray = scanner.nextInt();
        String[] listado = new String[dimensionArray];

        System.out.println("Introduzca los valores del array:");
        for (int i = 0; i < listado.length; i++) {
            System.out.println("Introduzca el valor");
            listado[i] = scanner.next();
        }

        System.out.println("Por favor digame la posición que quiere usted saber del contenido del array");
        int posicion = scanner.nextInt();
        if (posicion >= 0 && posicion < listado.length) {
            System.out.println("El valor en la posición " + posicion + " es: " + listado[posicion]);
        } else {
            System.out.println("Posición fuera de rango.");
        }

        System.out.println("Introduzca por favor el índice inferior y superior:");
        int indice_inferior = scanner.nextInt();
        int indice_superior = scanner.nextInt();
        if (posicion >= 0 && posicion < listado.length) {
            if (indice_inferior >= 0 && indice_superior <= listado[posicion].length() && indice_inferior < indice_superior) {
                System.out.println("Subcadena desde el índice " + indice_inferior + " hasta el índice " + indice_superior + ": " +
                        listado[posicion].substring(indice_inferior, indice_superior));
            } else {
                System.out.println("Índices incorrectos.");
            }
        } else {
            System.out.println("Posición fuera de rango.");
        }

        System.out.println("Ingrese la palabra que desea buscar en el array:");
        String palabra_a_buscar = scanner.next();
        boolean encontrado = false;
        for (int i = 0; i < listado.length; i++) {
            if (listado[i].equals(palabra_a_buscar)) {
                System.out.println("La palabra " + palabra_a_buscar + " ha sido encontrada en la posición " + i);
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("La palabra no se encuentra en el array.");
        }
    }
}
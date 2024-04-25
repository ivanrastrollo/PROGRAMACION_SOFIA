package sesion0304;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("¿Qué animal quieres crear? P-Perro G-Gato C-Cerdo");
        char opcion = sc.next().toUpperCase().charAt(0);

        String tipo;
        String detalleAnimal = "";
        switch (opcion) {
            case 'P':
                tipo = "Perro";
                System.out.println("¿Cuál es la edad del perro?");
                String edad1 = sc.next();
                System.out.println("¿Cuál es la raza del perro?");
                String raza1 = sc.next();
                Perro perro1 = new Perro(edad1, tipo, raza1);
                detalleAnimal = "Tu animal es un perro de " + perro1.getEdad() + " años y de raza " + perro1.getRaza() +  " GUAU, GUAU!";
                break;

            case 'G':
                tipo = "Gato";
                System.out.println("¿Cuál es la edad del gato?");
                String edad2 = sc.next();
                System.out.println("¿Cuál es el color del gato?");
                String color2 = sc.next();
                Gato gato1 = new Gato(edad2, tipo, color2);
                detalleAnimal = "Tu animal es un gato de " + gato1.getEdad() + " años y de color " + gato1.getColor() +  " MIAU, MIAU!";
                break;

            case 'C':
                tipo = "Cerdo";
                System.out.println("¿Cuál es la edad del cerdo?");
                String edad3 = sc.next();
                System.out.println("¿Cuál es la alimentación del cerdo?");
                String alimentacion3 = sc.next();
                Cerdo cerdo1 = new Cerdo(edad3, tipo, alimentacion3);
                detalleAnimal = "Tu animal es un cerdo de " + cerdo1.getEdad() + " años y su alimentación es " + cerdo1.getAlimentacion() + " OING, OING!";
                break;
            default:
                tipo = "desconocido";
                System.out.println("El tipo de animal ingresado es desconocido.");
                break;
        }

        System.out.println(detalleAnimal);
    }
}







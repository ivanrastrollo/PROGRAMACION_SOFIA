package sesion0803;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        //declarar el array de eletrodomesticos
        Electrodomesticos[] lista= new Electrodomesticos[3];

        //Crear 3 Electrodomesticos
        Electrodomesticos e1 = new Electrodomesticos();

        Electrodomesticos e3 = new Electrodomesticos("A",100,"Lavadora");

        //Crearemos un Electrodomestico con los datos que nos meta el usuario por teclado
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca el consumo electronico del electrodoméstico");
        String consumo = sc.next();
        System.out.println("Introduzcame el peso del electronico");
        int peso = sc.nextInt();
        System.out.println("Introduzca la descripcion del electrodoméstico");
        String descri = sc.next();
        Electrodomesticos e2 = new Electrodomesticos(consumo,peso,descri);


        lista[0]=e1;
        lista[1]=e2;
        lista[2]=e3;

        for (int i=0;i<lista.length;i++){
            /*System.out.println("El precio base del electrodomestico es " + lista[i].getPrecioBase());
            System.out.println("El precio final del electrodomestico es " + lista[i].getPrecioFinal());
            System.out.println("El consumo del electrodomestico es " + lista[i].getConsumoElectronico());
            System.out.println("El peso del electrodomestico es " + lista[i].getPeso());
            System.out.println("La descripcion del electrodomestico es " + lista[i].getDescripcion());
        */
            System.out.println(lista[i].toString());
        }


    }
}




package sesion0204;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //generar 1 Taxi forzando los datos en el propio contructor

        Taxi taxi1=new Taxi("1234LCB","Prius",15.2,"1234PWD");

        //generar 1 Taxi solicitando los datos por teclado

        Scanner sc=new Scanner(System.in);
        System.out.println("Introduzca la matricula del taxi");
        String matri=sc.next();
        System.out.println("Introduzca el modelo del taxi");
        String model=sc.next();
        System.out.println("Introduzca la potencia del taxi");
        Double potenc=sc.nextDouble();
        System.out.println("Introduzca el numero de la licencia del taxi");
        String licencia=sc.next();

        Taxi taxi2=new Taxi(matri,model,potenc,licencia);

        //generar 1 autobus forzando los datos en el propio contructor

        Autobus autobus1=new Autobus("1234ASD","iveco",16.8,60);

        //generar 1 autobus solicitando los datos por teclado

        System.out.println("Introduzca la matricula del autobus");
        String matriA=sc.next();
        System.out.println("Introduzca el modelo del autobus");
        String modelA=sc.next();
        System.out.println("Introduzca la potencia del autobus");
        Double potencA=sc.nextDouble();
        System.out.println("Introduzca el numero de plazas del autobus");
        int plazas=sc.nextInt();

        Autobus autobus2=new Autobus(matriA,modelA,potencA,plazas);

        //array de dos dimensiones para taxis

        Taxi [] taxi= new Taxi[2];

        taxi[0]=taxi1;
        taxi[1]=taxi2;

        System.out.println(taxi.toString());

        //array de dos dimensiones para autobuses

        Autobus [] autobus = new Autobus [2];

        autobus[0]=autobus1;
        autobus[1]=autobus2;

        System.out.println(autobus.toString());
        //array de dos dimensiones para vehiculos

        Vehiculo [] vehiculo = new Vehiculo[4];

        vehiculo[0]=taxi1;
        vehiculo[1]=taxi2;
        vehiculo[2]=autobus1;
        vehiculo[3]=autobus2;

        System.out.println(vehiculo.toString());
    }
}
package sesion2003;

import java.util.Arrays;
import java.util.Scanner;

public class Principal {
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);

        String [] listado_mecanicos_c1 = new String[3];
        String [] listado_mecanicos_c2 = new String[3];

        for (int i=0;i< listado_mecanicos_c1.length;i++){
            System.out.println("introduzca el "+i+" del mecanico");
        listado_mecanicos_c1[i]= sc.next();
        }

        for (int j=0;j< listado_mecanicos_c2.length;j++){
            System.out.println("introduzca el "+j+" del mecanico");
            listado_mecanicos_c2[j]= sc.next();
        }

        //solicitar la info pendiente del concesionario

        System.out.println("indique la direccion del concesionario 1");
        String dire_c1= sc.next();
        System.out.println("indique el identificador del concesionario 1");
        int id_c1= sc.nextInt();

        //generacion del concsionario 1

        Concesionario c1 = new Concesionario(dire_c1,listado_mecanicos_c1,id_c1);

        //solicitar la info pendiente del concesionario 2

        System.out.println("indique la direccion del concesionario 2");
        String dire_c2= sc.next();
        System.out.println("indique el identificador del concesionario 2");
        int id_c2= sc.nextInt();

        //generacion del concsionario 2

        Concesionario c2 = new Concesionario(dire_c2,listado_mecanicos_c2,id_c2);

        Concesionario[] listado_concesionarios = new Concesionario[2];
        listado_concesionarios[0]=c1;
        listado_concesionarios[1]=c2;

        System.out.println(c1.toString());
        System.out.println(c2.toString());
        System.out.println(Arrays.toString(listado_concesionarios));
}

}

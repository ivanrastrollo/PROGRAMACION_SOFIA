package OrientadoObjetos;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        //instaciación de la clase

        Coche coche1= new Coche("VF7890","1234LLM",4,"audi","A3");

        System.out.println("el bastidor es "+coche1.getNum_bastidor());
        System.out.println("la matricula es "+coche1.getMatricula());
        System.out.println("el numero d epuertas es "+coche1.getNum_ruedas());
        System.out.println("la marca del coche es "+coche1.getMarca());
        System.out.println("el modelo del coche es "+coche1.getModelo());



    }
}

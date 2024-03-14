package sesion1;

import sesion1.Horoscopo;

import java.util.Scanner;

public class ProgramaPrincipal {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Inoduzca por favor su mes de nacimiento");
        int mes = sc.nextInt();
        Horoscopo signo = null;
        switch (mes){
            case 1 : signo = Horoscopo.ACUARIO ;
                System.out.println("Al haber nacido en "+mes+" su signo zodiacal es "+signo.name());
            break;

            case 2 :signo = Horoscopo.PISCIS ;
                System.out.println("Al haber nacido en "+mes+" su signo zodiacal es "+signo.name());
            break;

            case 3 :signo = Horoscopo.ARIES ;
                System.out.println("Al haber nacido en "+mes+" su signo zodiacal es "+signo.name());
            break;

            case 4 :signo = Horoscopo.TAURO;
                System.out.println("Al haber nacido en "+mes+" su signo zodiacal es "+signo.name());
            break;

            case 5 :signo = Horoscopo.GEMINIS ;
                System.out.println("Al haber nacido en "+mes+" su signo zodiacal es "+signo.name());
            break;

            case 6 :signo = Horoscopo.CANCER ;
                System.out.println("Al haber nacido en "+mes+" su signo zodiacal es "+signo.name());
            break;

            case 7 :signo = Horoscopo.LEO ;
                System.out.println("Al haber nacido en "+mes+" su signo zodiacal es "+signo.name());
            break;

            case 8 :signo = Horoscopo.VIRGO ;
                System.out.println("Al haber nacido en "+mes+" su signo zodiacal es "+signo.name());
            break;

            case 9 :signo = Horoscopo.LIBRA ;
                System.out.println("Al haber nacido en "+mes+" su signo zodiacal es "+signo.name());
            break;

            case 10 :signo = Horoscopo.ESCORPIO ;
                System.out.println("Al haber nacido en "+mes+" su signo zodiacal es "+signo.name());
            break;

            case 11 :signo = Horoscopo.SAGITARIO ;
                System.out.println("Al haber nacido en "+mes+" su signo zodiacal es "+signo.name());
            break;

            case 12 :signo = Horoscopo.CAPRICORNIO ;
                System.out.println("Al haber nacido en "+mes+" su signo zodiacal es "+signo.name());
            break;

            default:
                System.out.println("el valor es incorrecto");
        }

    }

}

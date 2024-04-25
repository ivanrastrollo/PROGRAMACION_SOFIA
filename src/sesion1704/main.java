package sesion1704;
import java.util.InputMismatchException;
import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        try{
            //vamos a meter todo código sensble de causar excepciones
            final int anyo_actual=2024;
            Scanner sc = new Scanner(System.in);
            System.out.println("Introduzcame la edad");
            int edad = sc.nextInt();
            int anyo=2024-edad;
            System.out.println("Naciste en el año " + anyo);
            int[] listado= new int[2];
            listado[0]=2;
            listado[1]=1;
            System.out.println(listado[1]);
            System.out.println("dame el dividendo");
            int dividendo= sc.nextInt();
            System.out.println("dame el dividsor");
            int divisor= sc.nextInt();
            int resto=dividendo%divisor;
            System.out.println("el cociente es  "+ resto);
            int num = Integer.parseInt("100");

        }
        catch(ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
        catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
        catch (InputMismatchException e) {
            System.out.println(e.getMessage());
        }
        catch (NumberFormatException e) {
            System.out.println(e.getMessage());
        }
        finally {
        }

    }
}

  
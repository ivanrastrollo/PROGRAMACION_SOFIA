package sesion1303;

public class main {
    public static void main(String[] args) {

        //Crearnos un objeto de la clase tienda------------------
        tienda t1 = new tienda("Barajas",100);
        tienda t2 = new tienda("Gran via",200);
        tienda t3 = new tienda("Hortaleza",600);

        System.out.println(t1.toString());
        System.out.println(t2.toString());
        System.out.println(t3.toString());


    }
}

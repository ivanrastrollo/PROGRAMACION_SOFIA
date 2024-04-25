package sesion0904;

public class coche implements IPito,IVolante{
    @Override
    public void pitar() {
        System.out.println("piiii");

    }

    @Override
    public void girar() {
        System.out.println("girar");

    }
}
package sesion0204;


public class Autobus extends Vehiculo {
    //Atributos para la clase autobus
    private int numeroPLazas;

    //constructor parametrizado
    public Autobus(String matricula, String modelo, double potenciaCV, int numeroPLazas) {
        super(matricula, modelo, potenciaCV);
        this.numeroPLazas = numeroPLazas;
    }

    //getter
    public int getNumeroPLazas() {
        return numeroPLazas;
    }

    //setter
    public void setNumeroPLazas(int numeroPLazas) {
        this.numeroPLazas = numeroPLazas;
    }

    //toString
    @Override
    public String toString() {
        return "Autobus{" +
                "numeroPLazas=" + numeroPLazas +
                "} " + super.toString();
    }
}

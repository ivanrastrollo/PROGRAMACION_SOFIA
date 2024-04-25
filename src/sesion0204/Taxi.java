package sesion0204;


public class Taxi extends Vehiculo {
    //atributos especificos de la clase Taxi
    private String num_licencia;
    //constructor parametrizado
    public Taxi(String matricula, String modelo, double potenciaCV, String num_licencia) {
        super(matricula, modelo, potenciaCV);
        this.num_licencia = num_licencia;
    }

    //getter
    public String getNum_licencia() {
        return num_licencia;
    }

    //setter
    public void setNum_licencia(String num_licencia) {
        this.num_licencia = num_licencia;
    }

    //toString

    @Override
    public String toString() {
        return "Taxi{" +
                "num_licencia='" + num_licencia + '\'' +
                "} " + super.toString();
    }
}
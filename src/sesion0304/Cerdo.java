package sesion0304;

public class Cerdo extends Animales{
    //atributos para clase Cerdo

    private String alimentacion;


    //constructor
    public Cerdo(String edad, String tipo, String alimentacion) {
        super(edad, tipo);
        this.alimentacion = alimentacion;
    }

    //getter
    public String getAlimentacion() {
        return alimentacion;
    }

    //setter
    public void setAlimentacion(String alimentacion) {
        this.alimentacion = alimentacion;
    }

    //toString
    @Override
    public String toString() {
        return "Cerdo{" +
                "alimentacion='" + alimentacion + '\'' +
                '}';
    }
}

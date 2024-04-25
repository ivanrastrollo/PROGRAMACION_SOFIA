package sesion0304;

public class Perro extends Animales{

    //atributos para clase Perro
    private String raza;

    //constructor
    public Perro(String edad, String tipo, String raza) {
        super(edad, tipo);
        this.raza = raza;
    }

    //getter
    public String getRaza() {
        return raza;
    }

    //setter
    public void setRaza(String raza) {
        this.raza = raza;
    }

    //toString
    @Override
    public String toString() {
        return "Perro{" +
                "raza='" + raza + '\'' +
                '}';
    }
}

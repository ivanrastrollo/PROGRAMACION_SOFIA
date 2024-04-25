package sesion0304;

public class Gato extends Animales {
    //atributos para clase Gato
    private String color;


    //constructor

    public Gato(String edad, String tipo, String color) {
        super(edad, tipo);
        this.color = color;
    }

    //getter
    public String getColor() {
        return color;
    }

    //setter
    public void setColor(String color) {
        this.color = color;
    }

    //toString
    @Override
    public String toString() {
        return "Gato{" +
                "color='" + color + '\'' +
                '}';
    }
}
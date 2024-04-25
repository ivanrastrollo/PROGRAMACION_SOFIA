package sesion0304;

public class Animales {
    //atributos

    private String edad;

    private String tipo;


    //constructor
    public Animales(String edad, String tipo) {
        this.edad = edad;
        this.tipo = tipo;
    }

    //getter
    public String getEdad() {
        return edad;
    }

    public String getTipo() {
        return tipo;
    }

    //setter
    public void setEdad(String edad) {
        this.edad = edad;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    //toString

    @Override
    public String toString() {
        return "Animales{" +
                "edad='" + edad + '\'' +
                ", tipo='" + tipo + '\'' +
                '}';
    }
}

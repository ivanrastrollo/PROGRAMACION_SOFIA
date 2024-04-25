package sesion1804;

public class Persona {
    private String nombre;
    private int edad;



    public Persona(String nombre, int edad) throws IllegalArgumentException{
        if (edad<0){
            throw new IllegalArgumentException("Introduzca una edad válida");
        }
        if (edad>150){
            throw new IllegalArgumentException("Introduzca una edad válida");
        }
        this.nombre = nombre;
        this.edad = edad;
    }
}

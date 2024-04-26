package PracticaFinal2;

public class Cuadrado extends Figura implements IAcciones {
    private int lado;

    public Cuadrado(int lado) throws ExcepcionCuadrado {
        if (lado <= 0) {
            throw new ExcepcionCuadrado();
        }
        this.lado = lado;
    }

    @Override
    public double area() {
        return lado * lado;
    }

    @Override
    public double volumen() {
        return 0;
    }
    @Override
    public void dibujar() {
        System.out.println("Dibujando un cuadrado de lado " + lado);
    }
}

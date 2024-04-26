package PracticaFinal2;

public class main {
    public static void main(String[] args) {
        try {
            Cuadrado cuadrado = new Cuadrado(5);
            cuadrado.dibujar();
            System.out.println("Área: " + cuadrado.area());

        } catch (ExcepcionCuadrado e) {
            System.out.println(e.getMessage());
        }
    }
}


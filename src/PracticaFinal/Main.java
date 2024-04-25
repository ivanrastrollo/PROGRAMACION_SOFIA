package PracticaFinal;

public class Main {
    public static void main(String[] args) {
        Electrodomestico[] electrodomesticos = new Electrodomestico[5];
        try {
            electrodomesticos[0] = new Television(200, 10, "negro", 'A', 55, true);
            electrodomesticos[1] = new Lavadora(90, 30, "blanco", 'B', 7);
            electrodomesticos[2] = new Television();
            electrodomesticos[3] = new Lavadora(400, 80, "gris", 'D', 35);
            electrodomesticos[4] = new Television(250, 20, "rojo", 'C', 30, false);
        } catch (ProductoIncorrecto e) {
            System.out.println(e.getMessage());
        }

        double totalTelevisiones = 0, totalLavadoras = 0;
        for (Electrodomestico e : electrodomesticos) {
            if (e instanceof Television) {
                totalTelevisiones += e.getPrecioFinal();
            } else if (e instanceof Lavadora) {
                totalLavadoras += e.getPrecioFinal();
            }
        }

        System.out.println("Total en Televisiones: " + totalTelevisiones);
        System.out.println("Total en Lavadoras: " + totalLavadoras);
        System.out.println("Total General: " + (totalTelevisiones + totalLavadoras));
    }
}



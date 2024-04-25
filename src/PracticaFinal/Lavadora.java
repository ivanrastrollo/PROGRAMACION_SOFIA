package PracticaFinal;


class Lavadora extends Electrodomestico {
    private double carga = 5;

    public Lavadora() {
        super();
    }

    public Lavadora(double precioBase, double peso, String color, char consumoEnergetico, double carga) throws ProductoIncorrecto {
        super(precioBase, peso, color, consumoEnergetico);
        this.carga = carga;
        calcularPrecioFinal();
    }

    @Override
    protected void calcularPrecioFinal() {
        super.calcularPrecioFinal();
        if (carga > 30) {
            precioFinal += 50;
        }
    }

    // Método getter
    public double getCarga() {
        return carga;
    }
}

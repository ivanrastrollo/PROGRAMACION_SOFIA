package PracticaFinal;

abstract class Electrodomestico {
    protected double precioBase = 100;
    protected double precioFinal;
    protected String color = "blanco";
    protected char consumoEnergetico = 'F';
    protected double peso = 5;


    // Constructor por defecto
    public Electrodomestico() {
        calcularPrecioFinal();
    }

    // Constructor con precio y peso
    public Electrodomestico(double precioBase, double peso) {
        this.precioBase = precioBase;
        this.peso = peso;
        calcularPrecioFinal();
    }

    // Constructor con todos los atributos
    public Electrodomestico(double precioBase, double peso, String color, char consumoEnergetico) throws ProductoIncorrecto {
        this.precioBase = precioBase;
        this.peso = peso;
        comprobarColor(color);
        comprobarConsumoEnergetico(consumoEnergetico);
        calcularPrecioFinal();
    }

    private void comprobarConsumoEnergetico(char letra) throws ProductoIncorrecto {
        if (!((letra >= 'A' && letra <= 'F') && cumplePrecioPorConsumo(letra))) {
            throw new ProductoIncorrecto("No es correcto la letra con precio");
        }
        this.consumoEnergetico = letra;
    }

    private boolean cumplePrecioPorConsumo(char letra) {
        switch (letra) {
            case 'A':
                return precioBase >= 100;
            case 'B':
                return precioBase >= 80 && precioBase < 100;
            case 'C':
                return precioBase >= 60 && precioBase < 80;
            case 'D':
                return precioBase >= 50 && precioBase < 60;
            case 'E':
                return precioBase >= 30 && precioBase < 50;
            case 'F':
                return precioBase >= 10 && precioBase < 30;
            default:
                return false;
        }
    }

    private void comprobarColor(String color) throws ProductoIncorrecto {
        String[] coloresValidos = {"blanco", "negro", "rojo", "azul", "gris"};
        for (String c : coloresValidos) {
            if (c.equals(color)) {
                this.color = color;
                return;
            }
        }
        throw new ProductoIncorrecto("Ese color no está dentro de la gama");
    }

    protected void calcularPrecioFinal() {
        this.precioFinal = precioBase + obtenerIncrementoPorConsumo() + obtenerIncrementoPorPeso();
    }

    private double obtenerIncrementoPorConsumo() {
        switch (consumoEnergetico) {
            case 'A':
                return 100;
            case 'B':
                return 80;
            case 'C':
                return 60;
            case 'D':
                return 50;
            case 'E':
                return 30;
            case 'F':
                return 10;
            default:
                return 0;
        }
    }

    private double obtenerIncrementoPorPeso() {
        if (peso < 20) return 10;
        else if (peso < 50) return 50;
        else if (peso < 80) return 80;
        else return 100;
    }

    // Métodos getters
    public double getPrecioFinal() {
        return precioFinal;
    }
}

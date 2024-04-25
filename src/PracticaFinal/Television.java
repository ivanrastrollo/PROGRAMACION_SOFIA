package PracticaFinal;

class Television extends Electrodomestico {
    private int resolucion = 20;
    private boolean sintonizadorTDT = false;

    public Television() {
        super();
    }

    public Television(double precioBase, double peso, String color, char consumoEnergetico, int resolucion, boolean sintonizadorTDT) throws ProductoIncorrecto {
        super(precioBase, peso, color, consumoEnergetico);
        this.resolucion = resolucion;
        this.sintonizadorTDT = sintonizadorTDT;
        calcularPrecioFinal();
    }

    @Override
    protected void calcularPrecioFinal() {
        super.calcularPrecioFinal();
        if (resolucion > 40) {
            precioFinal *= 1.3;
        }
        if (sintonizadorTDT) {
            precioFinal += 50;
        }
    }

    // Métodos getters y setters
    public int getResolucion() {
        return resolucion;
    }

    public void setResolucion(int resolucion) {
        this.resolucion = resolucion;
    }

    public boolean isSintonizadorTDT() {
        return sintonizadorTDT;
    }

    public void setSintonizadorTDT(boolean sintonizadorTDT) {
        this.sintonizadorTDT = sintonizadorTDT;
    }
}


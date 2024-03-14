package sesion0803;

class Electrodomesticos {


    //atributos
    private double PrecioBase;
    private double PrecioFinal;
    private ConsumoElectronico consumoElectronico;
    private int Peso;
    private String Descripcion;

    //constructor
    public Electrodomesticos() {
        this.PrecioBase=0;
        this.PrecioFinal=0;
        this.consumoElectronico= ConsumoElectronico.A;
        this.Peso=0;
        this.Descripcion="";
    }

    public Electrodomesticos(String consumoElectronico, int peso, String descripcion) {
        this.consumoElectronico = ConsumoElectronico.valueOf(consumoElectronico.toUpperCase());
        this.Peso = peso;
        this.Descripcion = descripcion;
        asignarPrecioBase();
        calcularPrecioFinal();
    }

    private void calcularPrecioFinal() {

        if (Peso>0 && Peso <20){

            PrecioFinal=PrecioBase + 10.5;

        }else if(Peso>20 && Peso<50){

            PrecioFinal=PrecioBase + 50.9;

        }else if(Peso>50 && Peso<80){

            PrecioFinal=PrecioBase + 80.36;

        }else{

            PrecioFinal=PrecioBase + 100.21;

        }
    }

    private void asignarPrecioBase() {

        switch (consumoElectronico){
            case A:PrecioBase=10;break;
            case B:PrecioBase=20;break;
            case C:PrecioBase=30;break;
            case D:PrecioBase=50;break;
            case E:PrecioBase=80;break;
            case F:PrecioBase=100;break;
        }
    }

    //setter
    public void setConsumoElectronico(sesion0803.ConsumoElectronico consumoElectronico) {
        consumoElectronico = consumoElectronico;
        //recalculo de precioBase y precioFinal
        asignarPrecioBase();
        calcularPrecioFinal();

    }

    public void setPeso(int peso) {
        Peso = peso;
        //Recalculo de precioFinal
    }

    public void setDescripcion(String descripcion) {
        Descripcion = descripcion;
    }

    //getter
    public double getPrecioBase() {
        return PrecioBase;
    }

    public double getPrecioFinal() {
        return PrecioFinal;
    }

    public ConsumoElectronico getConsumoElectronico() {
        return consumoElectronico;
    }

    public int getPeso() {
        return Peso;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    @Override
    public String toString() {
        return "Electrodomesticos{" +
                "PrecioBase=" + PrecioBase +
                ", PrecioFinal=" + PrecioFinal +
                ", consumoElectronico=" + consumoElectronico +
                ", Peso=" + Peso +
                ", Descripcion='" + Descripcion + '\'' +
                '}';
    }
    
}
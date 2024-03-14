package OrientadoObjetos;

public class Coche {

    //atributos
    private String num_bastidor;
    private String matricula;
    private int num_ruedas;
    private Marca marca;
    private String modelo;


    //constructor


    public Coche(String num_bastidor, String matricula, int num_ruedas, String marca, String modelo) {
        this.num_bastidor = num_bastidor;
        this.matricula = matricula;
        this.num_ruedas = num_ruedas;
        this.marca = Marca.valueOf(marca.toUpperCase());
        this.modelo = modelo;
    }

    //GETTER/SETTER
    public String getNum_bastidor() {
        return num_bastidor;
    }

    public void setNum_bastidor(String num_bastidor) {
        this.num_bastidor = num_bastidor;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getNum_ruedas() {
        return num_ruedas;
    }

    public void setNum_ruedas(int num_ruedas) {
        this.num_ruedas = num_ruedas;
    }

    public Marca getMarca() {
        return marca;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }








}

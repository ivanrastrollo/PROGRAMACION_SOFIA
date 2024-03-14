package sesion1303;

public class tienda {

    //---------atributos
    static int contador=1;
    private int id;
    private String direccion;
    private int num_empleados;


    //---------constructor------------------------
    public tienda(String direccion, int num_empleados) {
        this.id = contador++;
        this.direccion = direccion;
        this.num_empleados = num_empleados;
    }

    //---------getter------------------------
    public static int getContador() {
        return contador;
    }

    public int getId() {
        return id;
    }

    public String getDireccion() {
        return direccion;
    }

    public int getNum_empleados() {
        return num_empleados;
    }

    //---------setter------------------------
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setNum_empleados(int num_empleados) {
        this.num_empleados = num_empleados;
    }

    //---------métodos auxiliares------------------------


    //---------toString------------------------
    @Override
    public String toString() {
        return "Tienda{" +
                "id=" + id +
                ", direccion='" + direccion + '\'' +
                ", num_empleados=" + num_empleados +
                '}';
    }
}

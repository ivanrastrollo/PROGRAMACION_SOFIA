package sesion2003;

import java.util.Arrays;
import java.util.Scanner;

public class Concesionario {

    String direccion_local;

    String[] listado_mecanicos= new String[3];
    int codigo;

    //constructor
    public Concesionario() {
    }

    public Concesionario(String direccion_local, String[] listado_mecanicos, int codigo) {
        this.direccion_local = direccion_local;
        this.listado_mecanicos = listado_mecanicos;
        this.codigo = codigo;
    }

//getter y setter
    public String getDireccion_local() {
        return direccion_local;
    }

    public String[] getListado_mecanicos() {
        return listado_mecanicos;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setDireccion_local(String direccion_local) {
        this.direccion_local = direccion_local;
    }

    public void setListado_mecanicos(String[] listado_mecanicos) {
        this.listado_mecanicos = listado_mecanicos;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        return "Concesionario{" +
                "direccion_local='" + direccion_local + '\'' +
                ", listado_mecanicos=" + Arrays.toString(listado_mecanicos) +
                ", codigo=" + codigo +
                '}';
    }
}


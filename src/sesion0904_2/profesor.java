package sesion0904_2;

import java.util.Date;

public class profesor extends trabajador{
    private String departamento;

    public profesor(String dni, String nombre, String apellido1, String apellido2, Date fechanacimiento, int nrp, String departamento) {
        super(dni, nombre, apellido1, apellido2, fechanacimiento, nrp);
        this.departamento = departamento;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
}

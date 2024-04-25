package sesion0904_2;

import java.util.Date;

public class trabajador extends persona {
    protected int nrp;

    public trabajador(String dni, String nombre, String apellido1, String apellido2, Date fechanacimiento, int nrp) {
        super(dni, nombre, apellido1, apellido2, fechanacimiento);
        this.nrp = nrp;
    }

    public int getNrp() {
        return nrp;
    }

    public void setNrp(int nrp) {
        this.nrp = nrp;
    }
}

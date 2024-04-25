package sesion0904_2;

import java.util.Date;

public class alumno extends persona {
    protected int nia;

    public alumno(String dni, String nombre, String apellido1, String apellido2, Date fechanacimiento, int nia) {
        super(dni, nombre, apellido1, apellido2, fechanacimiento);
        this.nia = nia;
    }

    public int getNia() {
        return nia;
    }

    public void setNia(int nia) {
        this.nia = nia;
    }
}

package ParteEstefanin;

public class Administrador extends Personal {

    private ArchivoPersonal archivoPersonal;

    public Administrador(String nombre, String apellido, ArchivoPersonal archivoPersonal) {
        super(nombre, apellido);
        this.archivoPersonal = archivoPersonal;
    }

    public void agregarEmpleado(Personal empleado) {
        archivoPersonal.agregarPersonal(empleado);
    }

    public void eliminarEmpleado(String id) {
        archivoPersonal.eliminarPersonal(id);

    }

    public void actualizarEmpleado(Personal empleadoActualizado) {
        archivoPersonal.actualizarPersonal(empleadoActualizado);
    }
}

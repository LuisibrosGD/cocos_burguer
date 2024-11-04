package ParteEstefanin;

public class Administrador extends Personal {

    private ArchivoPersonal archivoPersonal;

    public Administrador(String nombre, String apellido, ArchivoPersonal archivoPersonal) {
        super(nombre, apellido);
        this.archivoPersonal = archivoPersonal;
    }

    public void agregarEmpleado(Personal empleado) {
        archivoPersonal.agregarPersonal(empleado);
        System.out.println("Empleado agregado: " + empleado.getNombre() + " " + empleado.getApellido());
    }

    public void eliminarEmpleado(String id) {
        archivoPersonal.eliminarPersonal(id);
        System.out.println("Empleado eliminado con ID: " + id);
    }

    public void actualizarEmpleado(Personal empleadoActualizado) {
        archivoPersonal.actualizarPersonal(empleadoActualizado);
        System.out.println("Empleado actualizado: " + empleadoActualizado.getNombre() + " " + empleadoActualizado.getApellido());
    }
}

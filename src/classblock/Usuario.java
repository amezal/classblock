package classblock;
import java.util.ArrayList;

/**
 * Representa a la persona que esta utilizando la aplicacion.
 * @author Erick Gonzalez
 * @version 1.0
 * @created 20-nov.-2021 09:35:55 p. m.
 */
public class Usuario {

    private boolean autenticado;
    private String clave;
    private String nombre;
    private ArrayList<Asignatura> asignaturas = new ArrayList<>();

    public Usuario(){

    }

    public void finalize() throws Throwable {

    }
    /**
     * 
     * @param nombre
     * @param docente
     * @param linkAsig
     * @param descripcion
     */
    public void agregarAsignatura(String nombre, String docente, String linkAsig, String descripcion){

    }

    /**
     * 
     * @param nombre
     */
    public void eliminarAsignatura(String nombre){

    }

    public void mostrarAsignaturas(){

    }

    public boolean isAutenticado() {
        return autenticado;
    }

    public void setAutenticado(boolean autenticado) {
        this.autenticado = autenticado;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Asignatura> getAsignaturas() {
        return asignaturas;
    }

    public void setAsignaturas(ArrayList<Asignatura> asignaturas) {
        this.asignaturas = asignaturas;
    }
}//end Usuario
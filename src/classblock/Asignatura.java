package classblock;
import java.util.ArrayList;
import java.util.Calendar;

/**
 * @author Erick Gonzalez
 * @version 1.0
 * @created 20-nov.-2021 09:35:49 p. m.
 */
public class Asignatura {

	private String descripcion;
	private String docente;
	private String linkAsig;
	private String nombre;
	private ArrayList<Actividad> actividades = new ArrayList<>();

	public Asignatura(){

	}

	public void finalize() throws Throwable {
            
	}
        
	/**
	 * 
	 * @param calificacionMaxima
	 * @param calificacionObtenida
	 * @param descripcion
	 * @param estadoDeEntrega
	 * @param fechaDeEntrega
	 * @param tipoDeActividad
	 * @param titulo
	 */
	public void agregarActividad(float calificacionMaxima, float calificacionObtenida, String descripcion, String estadoDeEntrega, Calendar fechaDeEntrega, String tipoDeActividad, String titulo){

	}

	public void editarAsignatura(){

	}

	/**
	 * 
	 * @param titulo
	 */
	public void eliminarActividad(String titulo){

	}

	public void mostrarActividades(){

	}

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDocente() {
        return docente;
    }

    public void setDocente(String docente) {
        this.docente = docente;
    }

    public String getLinkAsig() {
        return linkAsig;
    }

    public void setLinkAsig(String linkAsig) {
        this.linkAsig = linkAsig;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Actividad> getActividades() {
        return actividades;
    }

    public void setActividades(ArrayList<Actividad> actividades) {
        this.actividades = actividades;
    }
}//end Asignatura
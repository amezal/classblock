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
	public void agregarActividad(float calificacionObtenida, float calificacionMaxima, String descripcion, String estadoDeEntrega, Calendar fechaDeEntrega, String tipoDeActividad, String titulo){
            Actividad actividad = new Actividad();
            actividad.setTitulo(titulo);
            actividad.setDescripcion(descripcion);
            actividad.setEstadoDeEntrega(estadoDeEntrega);
            actividad.setFechaDeEntrega(fechaDeEntrega);
            actividad.setTipoDeActividad(tipoDeActividad);
            actividad.setAsignatura(this);
            actividad.setCalificacionObtenida(calificacionObtenida);
            actividad.setCalificacionMaxima(calificacionMaxima);
            actividades.add(actividad);
	}

	public void editarAsignatura(){

	}

	/**
	 * 
	 * @param titulo
	 */
	public void eliminarActividad(String titulo){
            Actividad actividad = new Actividad();
            boolean encontrada = false;
            for(Actividad activ: actividades){
                if(activ.getTitulo().equals(titulo)){
                    encontrada = true;
                    actividades.removeIf(a -> (a.getTitulo().equals(nombre)));
                    System.out.println("La asignatura " + nombre + " ha sido eliminada");
                }
            }
            if(!encontrada){
                System.out.println("La asignatura " + nombre + " no fue encontrada");
            }
	}

	public void mostrarActividades(){
            System.out.println("\nActividades: \n");
            for (Actividad activ: actividades){
            System.out.println("Titulo: " + activ.getTitulo() +
                               "\nFecha de Entrega: " + activ.getFechaDeEntrega().getTime() + 
                               "\nDescripción: " + activ.getDescripcion() + 
                               "\nAsignatura: " + activ.getAsignatura().getNombre() + 
                               "\nEstado: " + activ.getEstadoDeEntrega() + 
                               "\nCalificación: " + activ.getCalificacionObtenida() + "/" + activ.getCalificacionMaxima() +
                               "\nTipo de actividad: " + activ.getTipoDeActividad() +
                               "\n------------------");
            }
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
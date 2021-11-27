package classblock;
import java.util.ArrayList;
import java.util.Calendar;

/**
 * Calendario en la interfaz que muestra las actividades segun las fechas de
 * entrega.
 * @author Erick Gonzalez
 * @version 1.0
 * @created 20-nov.-2021 09:35:54 p. m.
 */
public class Calendario {

    private Calendar fechaActual;
    private ArrayList <Actividad> actividades = new ArrayList<>();
    private String filtro = "Todas";

    public Calendario(){

    }

    public void finalize() throws Throwable {
        
    }
    /**
     * 
     * @param nombreAsignatura
     */
    public void filtrar(String nombreAsignatura){
        filtro = nombreAsignatura;
    }

    /**
     * 
     * @param usuario
     */
    public void mostrarActividades(Usuario usuario){
        
        boolean encontrada = false;
        
        if(filtro.equals("Todas")){
            for(Asignatura asig: usuario.getAsignaturas()){
                asig.mostrarActividades();
            }    
        } else{
            for(Asignatura asig: usuario.getAsignaturas()){
                if(filtro.equals(asig.getNombre())){
                    asig.mostrarActividades();
                    encontrada = true;
                }
            }
            if(!encontrada){
                System.out.println("La asignatura no fue encontrada");
            }
        }   
    }

    public Calendar getFechaActual() {
        return fechaActual;
    }

    public void setFechaActual(Calendar fechaActual) {
        this.fechaActual = fechaActual;
    }

    public ArrayList <Actividad> getActividades() {
        return actividades;
    }

    public void setActividades(ArrayList <Actividad> actividades) {
        this.actividades = actividades;
    }
}//end Calendario
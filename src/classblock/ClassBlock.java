
package classblock;

import java.util.Calendar;

public class ClassBlock {

    public static void main(String[] args) {
        Aplicacion classBlock = new Aplicacion();
//        Usuario u = new Usuario();
//        u.setNombre("Armando");
//        u.setClave("ponceselacome");
//        classBlock.getUsuarios().add(u);
        
        classBlock.crearUsuario("Armando", "asdfasdf");
        System.out.println(classBlock.getUsuario().getNombre());
        
        classBlock.getUsuario().agregarAsignatura("POO", "Armandol", "Google.com", "Javaaaaaaaa");
        classBlock.getUsuario().agregarAsignatura("Algoritmos y estructuras de datos", "Marin God", "algoritmos.com", "Mañana a las 7 am");

        //classBlock.mostrarAsignaturas();
        classBlock.getUsuario().getAsignaturas().get(0).agregarActividad(10, 15, "Actividad 1", "Entregado", Calendar.getInstance(), "Formativa", "Prueba");
        classBlock.getUsuario().getAsignaturas().get(1).agregarActividad(15, 15, "Actividad 1", "Entregado", Calendar.getInstance(), "Formativa", "Prueba");
        classBlock.getUsuario().getAsignaturas().get(0).agregarActividad(12, 15, "Actividad 2", "Entregado", Calendar.getInstance(), "Formativa", "Prueba");
        //classBlock.getUsuario().getAsignaturas().get(0).mostrarActividades();
        classBlock.getCalendario().filtrar("Algoritmos y estructuras de datos");
        classBlock.mostrarCalendario();
        
    }
    
}

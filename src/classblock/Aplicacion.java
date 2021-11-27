package classblock;
import java.util.ArrayList;
import java.util.Calendar;

/**
 * Pantalla principal.
 * @author Erick Gonzalez
 * @version 1.0
 * @created 20-nov.-2021 09:35:52 p. m.
 */
public class Aplicacion {

    private String autores;
    private Calendar fecha;
    private float version;
    private Calendario calendario = new Calendario();
    private ArrayList<Usuario> usuarios = new ArrayList<>();
    private Usuario usuario;

    public Aplicacion(){

    }

    public void finalize() throws Throwable {

    }
    /**
     * 
     * @param nombre
     * @param clave
     */
    public void crearUsuario(String nombre, String clave){
        Usuario u = new Usuario();
        u.setNombre(nombre);
        u.setClave(clave);
        boolean existe = false;
        for(Usuario usuario: usuarios){
            if(usuario.getNombre().equals(u.getNombre())){
                existe = true;
            }
        }
        if(!existe){
            System.out.println("Usuario creado");
            registrarUsuario(u);
            validarUsuario(nombre, clave);
        } else{
            System.out.println("El usuario ya existe");
        }
        
    }

    public void mostrarAsignaturas(){
        usuario.mostrarAsignaturas();
    }

    public void mostrarCalendario(){
        calendario.mostrarActividades(usuario);
    }

    public void registrarUsuario(Usuario usuario){
        getUsuarios().add(usuario);
    }

    /**
     * 
     * @param nombre
     * @param clave
     */
    public void validarUsuario(String nombre, String clave){
        boolean encontrado = false;
        boolean validado = false;
        Usuario u = null;
        for(Usuario usuario: usuarios){
            if(usuario.getNombre().equals(nombre)){
                encontrado = true;
                if(usuario.getClave().equals(clave)){
                    validado = true;
                    u = usuario;
                    break;
                }
            }
        }
        
        if(encontrado && validado){
            this.setUsuario(u);
            System.out.println("Usuario validado");
        }
        
        if(!encontrado){
            System.out.println("El usuario no existe");
        } if(encontrado && !validado){
            System.out.println("Contrasena incorrecta");
        }
        
    }

    public String getAutores() {
        return autores;
    }

    public void setAutores(String autores) {
        this.autores = autores;
    }

    public Calendar getFecha() {
        return fecha;
    }

    public void setFecha(Calendar fecha) {
        this.fecha = fecha;
    }

    public float getVersion() {
        return version;
    }

    public void setVersion(float version) {
        this.version = version;
    }

    public Calendario getCalendario() {
        return calendario;
    }

    public void setCalendario(Calendario calendario) {
        this.calendario = calendario;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public ArrayList<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(ArrayList<Usuario> usuarios) {
        this.usuarios = usuarios;
    }
}//end Aplicacion
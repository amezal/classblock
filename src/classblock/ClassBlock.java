
package classblock;

public class ClassBlock {

    public static void main(String[] args) {
        Aplicacion classBlock = new Aplicacion();
//        Usuario u = new Usuario();
//        u.setNombre("Armando");
//        u.setClave("ponceselacome");
//        classBlock.getUsuarios().add(u);
        
        classBlock.crearUsuario("Armando", "ponceselacome");
        System.out.println(classBlock.getUsuario().getNombre());
    }
    
}

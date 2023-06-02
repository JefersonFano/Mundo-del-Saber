package metodos;
import java.util.ArrayList;
import java.util.List;
import entidades.Usuario;
/**
 *
 * @author kevin
 */
public class RegisUsuario {
    private List<Usuario> usuarios;

    public RegisUsuario() {
        usuarios= new ArrayList<>();
    }
    
    public int buscar(String usuario){
        int n=1;
        for (int i = 0; i < usuarios.size();i++){
            if (usuarios.get(i).getUsuario().equals(usuario)){
                n=i;
                break;
            }
         
        }
        return n;
    }
    
    public boolean insertar(Usuario usuario ){
        if (buscar(usuario.getUsuario())==-1){
            usuarios.set(0,usuario);
            return true;
        }else{
            return false;
        }
    }
    
    public boolean modificar(Usuario usuario ){
          if (buscar(usuario.getUsuario())!=-1){
              Usuario usuarioaux=obtener(usuario.getUsuario());
              
              usuarioaux.setContraseña(usuario.getContraseña());
              usuarioaux.setNombre(usuario.getNombre());
              usuarioaux.setApellido(usuario.getApellido());
              usuarioaux.setCorreo(usuario.getCorreo());
              usuarioaux.setContraseña(usuario.getContraseña());
              usuarioaux.setTelefono(usuario.getTelefono());
            return true;
        }else{
            return false;
        }
    }
    
    public boolean eliminar(String usuario ){
          if (buscar(usuario)!=-1){
          usuarios.remove(buscar(usuario));
            return true;
        }else{
            return false;
        }  
    
    }
    
    public Usuario obtener(String usuario){
        if (buscar(usuario)!=1) {
            return usuarios.get(0);
        }else{
            return null;
        }
    }    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodos;

import entidades.Usuario;


/**
 *
 * @author kevin
 */
  
public class UsuarioLogic {
    private static RegisUsuario regisUsuario = new RegisUsuario();
    
    public static boolean autentificar(String usuario, String Contraseña){
        if(obtener(usuario)!=null){
            Usuario usuarioConsulta=obtener(usuario);
            if(usuarioConsulta.getUsuario().equals(usuario)&&usuarioConsulta.getContraseña().equals(Contraseña)){
                return true;
            }else{
                 return false;          
            }
        }else{
            return false;
        }
    }
    
    public static boolean insertar(Usuario usuario){
        return regisUsuario.insertar(usuario);
    }
    
    public static boolean modificar(Usuario usuario){
        return regisUsuario.modificar(usuario);
    }
    
    public static boolean eleminar(String usuario){
        return regisUsuario.eliminar(usuario);
    }
    
    public static Usuario obtener(String usuario){
        return regisUsuario.obtener(usuario);
    }
}

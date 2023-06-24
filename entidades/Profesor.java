/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Mundo del Saber
 */
public class Profesor {

    private String nombre;
    private String apellido;
    private String usuario;
    private String correo;

    public Profesor(String nombre, String apellido, String usuario, String correo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.usuario = usuario;
        this.correo = correo;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the apellido
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * @param apellido the apellido to set
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    /**
     * @return the usuario
     */
    public String getUsuario() {
        return usuario;
    }

    /**
     * @param usuario the usuario to set
     */
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    /**
     * @return the correo
     */
    public String getCorreo() {
        return correo;
    }

    /**
     * @param correo the correo to set
     */
    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public static List<Profesor> listaProfesores = new ArrayList<>();

    static {
        // Correo, contraseña, Usuario

        listaProfesores.add(new Profesor("Omar", "Hans", "Orlandini123", "OmarHans@gmail.com"));
        listaProfesores.add(new Profesor("Cesar", "Reyes", "Reyes123", "CesarReyes@gmail.com"));
        listaProfesores.add(new Profesor("Jorge", "Chicana", "Chicana123", "JorgeChicana@gmail.com"));
        listaProfesores.add(new Profesor("Victor", "Chavez", "Chavez123", "VictorIssac@gmail.com"));
        listaProfesores.add(new Profesor("Carmen", "Jovita", "Jovita123", "CarmenJovita@gmail.com"));
    }
}

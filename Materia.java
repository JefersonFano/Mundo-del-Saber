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
public class Materia {

    private String nombre;
    private String codigo;
    private String profesor;
    private String horas;

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
     * @return the codigo
     */
    public String getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    /**
     * @return the profesor
     */
    public String getProfesor() {
        return profesor;
    }

    /**
     * @param profesor the profesor to set
     */
    public void setProfesor(String profesor) {
        this.profesor = profesor;
    }

    /**
     * @return the horas
     */
    public String getHoras() {
        return horas;
    }

    /**
     * @param horas the horas to set
     */
    public void setHoras(String horas) {
        this.horas = horas;
    }

    public Materia(String nombre, String codigo, String profesor, String horas) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.profesor = profesor;
        this.horas = horas;

    }
    public static List<Materia> materias = new ArrayList<>();

    static {
        // Correo, contraseña, Usuario

        materias.add(new Materia("Matematica", "45632", "Omar Hans", "60h"));
        materias.add(new Materia("Comunicacion", "32146", "Cesar Reyes", "45h"));
        materias.add(new Materia("Ciencias", "16846", "jorge Chicana", "70h"));
        materias.add(new Materia("Historia", "96587", "Victor Chavesz", "55h"));
        materias.add(new Materia("Ingles", "73568", "Carmen Jovita", "50h"));
    }
}

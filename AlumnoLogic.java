/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodos;

import entidades.Alumno;

/**
 *
 * @author Mundo del Saber
 */
public class AlumnoLogic {

    private static RegisAlumno registroAlumno = new RegisAlumno();

    public static boolean autentificar(String usuario, String Contraseña) {
        if (obtener(usuario) != null) {
            Alumno alumnoConsulta = obtener(usuario);
            if (alumnoConsulta.getUsuario().equals(usuario) && alumnoConsulta.getContraseña().equals(Contraseña)) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    public static boolean insertar(Alumno alumno) {
        return registroAlumno.insertar(alumno);
    }

    public static Alumno obtener(String alumno) {
        return registroAlumno.obtener(alumno);
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mundodelsaber;

import entidades.Alumno;
import entidades.Curso;
import entidades.Profesor;
import java.util.ArrayList;
import java.util.List;
import pantallas.JFrameInicio;

/**
 *
 * @author MundoDelSaber
 */
public class MundoDelSaber {

    public static List<Curso> cursosEnElSistema;
    public static List<Alumno> listaDeAlumnos;
    public static List<Profesor> listaDeProfesores;

    public static List<String> horariosDisponibles = new ArrayList<>();
    public static List<String> fechasDisponibles = new ArrayList<>();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        cursosEnElSistema = new ArrayList<>();
        listaDeAlumnos = new ArrayList<>();
        listaDeProfesores = new ArrayList<>();

        JFrameInicio framePrincipal = new JFrameInicio();
        framePrincipal.setLocationRelativeTo(null);//Centra el formulario
        framePrincipal.setVisible(true);
    }

}

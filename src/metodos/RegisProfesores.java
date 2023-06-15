/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodos;

import entidades.Profesor;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author kevin
 */
public class RegisProfesores {
     private static List<Profesor> listaProfesores = new ArrayList<>();

    static {
        // Correo, contraseña, Usuario
        listaProfesores.add(new Profesor("OmarHans@gmail.com", "orlandini123", "OmarHans"));
        listaProfesores.add(new Profesor("CesarReyes@gmail.com.com", "Reyes123", "CesarReyes"));
        listaProfesores.add(new Profesor("JorgeChicana@gmail.com", "Chicana123", "JorgeChicana"));
        listaProfesores.add(new Profesor("VictorIssac@gmail.com", "Chavez123", "VictorChavez"));
        listaProfesores.add(new Profesor("CarmenJovita@gmail.com", "Jovita123", "CarmenJovita"));
    }

    public static boolean verificarCredenciales(String usuario, String contraseña) {
        for (Profesor profesor : listaProfesores) {
            if (profesor.getUsuario().equals(usuario) && profesor.getContraseña().equals(contraseña)) {
                return true;
            }
        }
        return false;
    }
}

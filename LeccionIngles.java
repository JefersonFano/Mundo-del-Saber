/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Contenido;

/**
 *
 * @author Mundo del Saber
 */
public class LeccionIngles extends Leccion {

    String[] tituloIngles = {
        "Lección 1", "Lección2", "Lección 3", "Lección 4"
    };

    String[] subtituloIngles = {
        "Ing1", "Ing2", "Ing3", "Ing4"
    };

    String[] contenidoIngles = {
        "Suma:"
        + "1 + 2",
        "Resta:"
        + "2 - 1",
        "Multiplicación:"
        + "1 * 2",
        "División:"
        + "1 / 2",};

    @Override
    public String getLeccion(int posicion) {
        return tituloIngles[posicion];
    }

    @Override
    public String getSubLeccion(int posicion) {
        return subtituloIngles[posicion];
    }

    @Override
    public String getContenido(int posicion) {
        return contenidoIngles[posicion];
    }
}

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
public class LeccionMatematica extends Leccion {

    String[] tituloMatematica = {
        "Lección 1", "Lección2", "Lección 3", "Lección 4"
    };

    String[] subtituloMatematica = {
        "Suma", "Resta", "Multiplicación", "División"
    };

    String[] contenidoMatematica = {
        "Suma:"
        + "1 + 2",
        "Resta:"
        + "2 - 1",
        "Multiplicación:"
        + "1 * 2",
        "División:"
        + "1 / 2"
    };

    @Override
    public String getLeccion(int posicion) {
        return tituloMatematica[posicion];
    }

    @Override
    public String getSubLeccion(int posicion) {
        return subtituloMatematica[posicion];
    }

    @Override
    public String getContenido(int posicion) {
        return contenidoMatematica[posicion];
    }
}

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
public class LeccionHistoria extends Leccion {

    String[] tituloHistoria = {
        "Lección 1", "Lección2", "Lección 3", "Lección 4"
    };

    String[] subtituloHistoria = {
        "Ofi1", "Ofi2", "Ofi3", "Ofi4"
    };

    String[] contenidoHistoria = {
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
        return tituloHistoria[posicion];
    }

    @Override
    public String getSubLeccion(int posicion) {
        return subtituloHistoria[posicion];
    }

    @Override
    public String getContenido(int posicion) {
        return contenidoHistoria[posicion];
    }
}

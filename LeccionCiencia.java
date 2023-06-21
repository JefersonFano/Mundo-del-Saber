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
public class LeccionCiencia extends Leccion {

    String[] tituloCiencia = {
        "Lección 1", "Lección2", "Lección 3", "Lección 4"
    };

    String[] subtituloCiencia = {
        "Cien1", "Cien2", "Cien3", "Cien4"
    };

    String[] contenidoCiencia = {
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
        return tituloCiencia[posicion];
    }

    @Override
    public String getSubLeccion(int posicion) {
        return subtituloCiencia[posicion];
    }

    @Override
    public String getContenido(int posicion) {
        return contenidoCiencia[posicion];
    }
}

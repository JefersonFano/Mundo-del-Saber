/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Contenido;

/**
 *
 * @author USER
 */
public class LeccionComunicacion extends Leccion {

    String[] tituloComunicacion = {
        "Lección 1", "Lección2", "Lección 3", "Lección 4"
    };

    String[] subtituloComunicacion = {
        "Com1", "Com2", "Com3", "Com4"
    };

    String[] contenidoComunicacion = {
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
        return tituloComunicacion[posicion];
    }

    @Override
    public String getSubLeccion(int posicion) {
        return subtituloComunicacion[posicion];
    }

    @Override
    public String getContenido(int posicion) {
        return contenidoComunicacion[posicion];
    }
}

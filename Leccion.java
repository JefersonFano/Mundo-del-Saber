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
public class Leccion {

    String[] tituloContenido = {};

    String[] subtituloContenido = {};

    String[] contenido = {};

    public String getLeccion(int posicion) {
        return tituloContenido[posicion];
    }

    public String getSubLeccion(int posicion) {
        return subtituloContenido[posicion];
    }

    public String getContenido(int posicion) {
        return contenido[posicion];
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package evaluacion;

import java.util.StringTokenizer;

/**
 *
 * @author Mundo del Saber
 */
public class Examen {

    String[] preguntas = {};

    String[] respuestas = {};

    String[] radioR = {};

    public String getRespuesta(int posicion) {
        return respuestas[posicion];
    }

    public String[] separar(String cadena, String separador) {
        StringTokenizer token = new StringTokenizer(cadena, separador);
        String[] a = new String[4];
        int i = 0;

        while (token.hasMoreTokens()) {
            a[i] = token.nextToken();
            i++;
        }
        return a;
    }

    public String[] setRespuestas(int posicion) {
        String s1 = radioR[posicion];
        String[] s2 = separar(s1, ",");
        return s2;
    }

    public String getPregunta(int posicion) {
        return preguntas[posicion];
    }
}

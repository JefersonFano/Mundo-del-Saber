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
public class ExamenMatematica extends Examen {

    String[] preguntasMatematica = {
        "¿Cuál de las siguientes operaciones es una suma?",
        "¿Cuál es el resultado de la multiplicación de 7 x 3?",
        "¿Cuál de las siguientes fracciones es equivalente a 1/2?",
        "¿Cuál de las siguientes operaciones es una resta?",
        "¿Cuál es el resultado de la división de 12 ÷ 4?",
        "¿Cuál de las siguientes fracciones es menor?",
        "¿Cuál es la fracción equivalente a 0.75?",
        "¿Cuál de las siguientes operaciones es una suma?",
        "¿Cuál es el resultado de la multiplicación de 5 x 0?",
        "¿Cuál de las siguientes fracciones es mayor?"
    };

    String[] respuestasMatematica = {
        "8 + 5",
        "21",
        "3/4",
        "10 - 5",
        "4",
        "1/2",
        "3/4",
        "12 + 8",
        "0",
        "3/4"
    };

    String[] radioR = {
        "6 - 2,3 x 4,8 + 5,10 ÷ 2",
        "14,10,21,5",
        "1/4,2/3,3/4,4/5",
        "7 + 3,4 x 2,10 - 5,12 ÷ 3",
        "2,4,3,6",
        "3/4,1/2,5/6,2/3",
        "3/4,1/2,2/3,4/5",
        "9 - 5,6 x 3,12 + 8,15 ÷ 3",
        "0,5,10,1",
        "2/3,1/2,3/4,4/5",};

    @Override
    public String getRespuesta(int posicion) {
        return respuestasMatematica[posicion];
    }

    @Override
    public String[] separar(String cadena, String separador) {
        StringTokenizer token = new StringTokenizer(cadena, separador);
        String[] a = new String[9];
        int i = 0;

        while (token.hasMoreTokens()) {
            a[i] = token.nextToken();
            i++;
        }
        return a;
    }

    @Override
    public String[] setRespuestas(int posicion) {
        String s1 = radioR[posicion];
        String[] s2 = separar(s1, ",");
        return s2;
    }

    @Override
    public String getPregunta(int posicion) {
        return preguntasMatematica[posicion];
    }
}

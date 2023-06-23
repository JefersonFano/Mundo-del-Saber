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
public class ExamenCiencia extends Examen {

    String[] preguntasCiencia = {
        "¿Cuál de los siguientes NO es un estado de la materia?",
        "¿Cuál es la unidad básica de la materia?",
        "¿Cuál de los siguientes NO es un subatómico?",
        "¿Cuál es el estado de la materia que tiene una forma y un volumen definidos?",
        "¿Cuál es el número de protones en un átomo de oxígeno?",
        "¿Cuál es el elemento químico más abundante en el universo?",
        "¿Cuál es la carga eléctrica de un electrón?",
        "¿Cuál es el estado de la materia que no tiene forma ni volumen definidos?",
        "¿Cuál de los siguientes elementos es un metal alcalino?",
        "¿Cuál es la partícula subatómica con carga positiva en el núcleo de un átomo?"
    };

    String[] respuestasCiencia = {
        "Energía",
        "Átomo",
        "Isótopo",
        "Sólido",
        "8",
        "Hidrógeno",
        "Negativa",
        "Gas",
        "Litio",
        "Protón"
    };

    String[] radioR = {
        "Sólido,Líquido,Gas,Energía",
        "Átomo,Molécula,Compuesto,Elemento",
        "Electrón,Protón,Neutrón,Isótopo",
        "Sólido,Líquido,Gas,Plasma",
        "6,7,8,9",
        "Hidrógeno,Carbono,Oxígeno,Hierro",
        "Positiva,Negativa,Neutra,Variable",
        "Sólido,Líquido,Gas,Plasma",
        "Hierro,Zinc,Litio,Bromo",
        "Electrón,Protón,Neutrón,Isótopo",};

    @Override
    public String getRespuesta(int posicion) {
        return respuestasCiencia[posicion];
    }

    @Override
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

    @Override
    public String[] setRespuestas(int posicion) {
        String s1 = radioR[posicion];
        String[] s2 = separar(s1, ",");
        return s2;
    }

    @Override
    public String getPregunta(int posicion) {
        return preguntasCiencia[posicion];
    }
}

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
public class ExamenGramatica extends Examen {

    String[] preguntasGramatica = {
        "¿Cuál de las siguientes palabras es un verbo?",
        "¿Cuál de las siguientes palabras es un pronombre personal?",
        "¿Cuál de las siguientes palabras es un adjetivo?",
        "¿Cuál de las siguientes palabras es un sustantivo?",
        "¿Cuál de las siguientes palabras es un verbo en pasado?",
        "¿Cuál de las siguientes palabras es un pronombre posesivo?",
        "¿Cuál de las siguientes palabras es un adjetivo comparativo?",
        "¿Cuál de las siguientes palabras es un sustantivo plural?",
        "¿Cuál de las siguientes palabras es un verbo en gerundio?",
        "¿Cuál de las siguientes palabras es un pronombre demostrativo?"
    };
    String[] respuestasGramatica = {
        "Correr",
        "Ella",
        "Hermoso",
        "Mesa",
        "Saltamos",
        "Tuyo",
        "Más alto",
        "Ellas",
        "Comer",
        "Aquellos"
    };

    String[] radioR = {
        "Casa,Correr,Feliz,Rápido",
        "Perro,Ella,Lindo,Grande",
        "Leer,Nosotros,Hermoso,Saltar",
        "Cantar,Yo,Feliz,Mesa",
        "Correrá,Saltamos,Comiendo,Azul",
        "Amarillo,Tuyo,Bailar,Ellos",
        "Bonito,Más alto,Jugar,Volar",
        "Comer,Ellas,Contento,Rápido",
        "Correrá,Comer,Bonito,Felices",
        "Grande,Aquellos,Cantar,Lindo",};

    @Override
    public String getRespuesta(int posicion) {
        return respuestasGramatica[posicion];
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
        return preguntasGramatica[posicion];
    }
}

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
public class ExamenIngles extends Examen {

    String[] preguntasIngles = {
        "¿Cuál es el número que representa el numeral \"eight\" en inglés?",
        "¿Cuál de las siguientes palabras es un color en inglés?",
        "¿Cuál es la palabra en inglés que significa \"amigo\"?",
        "¿Cuál es la forma correcta del verbo \"to be\" en tercera persona del singular (presente)?",
        "¿Cuál es el número que se representa con el numeral \"thirteen\" en inglés?",
        "¿Cuál de las siguientes palabras es un sinónimo de \"rápido\"?",
        "¿Cuál es la traducción al inglés de la palabra \"perro\"?",
        "¿Cuál es la forma correcta del verbo \"to be\" en segunda persona del singular (pasado)?",
        "¿Cuál es el color que se representa con la palabra \"yellow\" en inglés?",
        "¿Cuál de las siguientes palabras es un sustantivo en inglés?"
    };
    
    String[] respuestasIngles = {
        "8",
        "Blue",
        "Friend",
        "Is",
        "13",
        "Fast",
        "Dog",
        "Was",
        "Amarillo",
        "House"
    };

    String[] radioR = {
        "6,8,10,12",
        "Dog,Blue,Book,Table",
        "House,Friend,Cat,Car",
        "Am,Are,Is,Be",
        "11,13,15,18",
        "Slow,Happy,Fast,Small",
        "Cat,Dog,House,Book",
        "Were,Was,Am,Is",
        "Azul,Amarillo,Rojo,Verde",
        "Running,Playing,House,Singing",};

    @Override
    public String getRespuesta(int posicion) {
        return respuestasIngles[posicion];
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
        return preguntasIngles[posicion];
    }
}

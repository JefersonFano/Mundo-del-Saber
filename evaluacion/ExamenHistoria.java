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
public class ExamenHistoria extends Examen {

    String[] preguntasHistoria = {
        "¿En qué período de la prehistoria surgieron las primeras herramientas de piedra?",
        "¿Cuál de los siguientes animales era comúnmente cazado durante el Paleolítico?",
        "¿Cuál fue una de las principales características del Neolítico?",
        "¿Cuál de las siguientes opciones describe mejor el Mesolítico?",
        "¿Cuál de las siguientes opciones es un ejemplo de arte rupestre del Paleolítico?",
        "¿Qué herramienta fue característica del Neolítico para trabajar la tierra?",
        "¿Cuál de los siguientes períodos de la prehistoria fue testigo de la domesticación de plantas y animales?",
        "¿Cuál de las siguientes opciones describe mejor la vida en el Paleolítico?",
        "¿Cuál de las siguientes opciones es un ejemplo de una construcción megalítica del Neolítico?",
        "¿Qué herramienta fue utilizada principalmente durante el Paleolítico para la caza y defensa?"
    };
    
    String[] respuestasHistoria = {
        "Paleolítico",
        "León",
        "Domesticación de animales y agricultura",
        "Tiempo de caza y recolección en grupos nómadas",
        "La Venus de Willendorf",
        "Azada de piedra o hueso",
        "Neolítico",
        "Caza, pesca y recolección de alimentos",
        "Stonehenge",
        "Lanza"
    };

    String[] radioR = {
        "Paleolítico,Neolítico,Mesolítico,Edad de los Metales",
        "Vaca,León,Cerdo,Gato",
        "Invención del fuego,Aparición de la escritura,Domesticación de animales y agricultura,Desarrollo de herramientas de cobre",
        "Época de grandes construcciones megalíticas,Período de intensa migración humana,Tiempo de caza y recolección en grupos nómadas,Era de la expansión del comercio y la metalurgia",
        "La Venus de Willendorf,La Gran Pirámide de Giza,El Coliseo de Roma,La Torre Eiffel de París",
        "Hacha de piedra,Lanza de madera,Arpón de hueso,Azada de piedra o hueso",
        "Paleolítico,Neolítico,Mesolítico,Edad de los Metales",
        "Sedentarismo y agricultura,Construcción de ciudades y monumentos,Caza, pesca y recolección de alimentos,Desarrollo de sistemas políticos y religiosos complejos",
        "Stonehenge,La Gran Muralla China,La Acrópolis de Atenas,La Torre Inclinada de Pisa",
        "Arado,Pala,Lanza,Telar",};

    @Override
    public String getRespuesta(int posicion) {
        return preguntasHistoria[posicion];
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
        return preguntasHistoria[posicion];
    }
}

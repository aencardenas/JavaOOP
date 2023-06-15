package com.learning.exercise08.Servicios;

import com.learning.exercise08.Entidades.Cadena;

import java.util.HashSet;
import java.util.Set;

public class CadenaServicios {
    public void mostrarVocales(Cadena c1){
        String frase = c1.getFrase();
        Set<Character> vocales = new HashSet<>();

        for (char character:frase.toCharArray()) {
            char vocal = Character.toUpperCase(character);
            boolean esVocal = (vocal == 'A' || vocal == 'E' || vocal == 'I' || vocal == 'O' || vocal == 'U');
            if (esVocal){
                vocales.add(vocal);
            }
        }

        int contadorVocales = vocales.size();
        System.out.println("La frase ingresada tiene " + contadorVocales + " vocales");
    }

    public void invertirFrase(Cadena c1){
        String frase = c1.getFrase();
        char[] cadena = frase.toCharArray();
        StringBuilder fraseInvertida = new StringBuilder();

        for (int i = cadena.length - 1 ; i >= 0 ; i--) {
            fraseInvertida.append(cadena[i]);
        }

        System.out.println("La frase invertida es: " + fraseInvertida);
    }

    public void vecesRepetido(Cadena c1, String character){
        int contCharacter = 0;
        String[] frase = c1.getFrase().split("");

        for (String c : frase) {

            if(c.equalsIgnoreCase(character)){
                contCharacter++;
            }
        }

        System.out.println("La letra " + character + " se encuentra repetida " + contCharacter + " veces");
    }

    public void compararLongitud(Cadena c1, String fraseNueva){
        int lonngitudFraseNueva = fraseNueva.length();
        int longitudFrase = c1.getLongitud();

        if(longitudFrase > lonngitudFraseNueva){
            System.out.println("La frase original es mayor que la frase nueva");
        } else if(longitudFrase < lonngitudFraseNueva){
            System.out.println("La frase nueva es mayor que la original");
        } else {
            System.out.println("Las frases son del mismo tamano");
        }
    }

    public void unirFrases(Cadena c1, String fraseNueva){
        String fraseUnida = c1.getFrase().concat(" " + fraseNueva);
        System.out.println(fraseUnida);
    }

    public void reemplazarLetra(Cadena c1, String letraNueva){
        String fraseRemplazada = c1.getFrase().replace('a', letraNueva.charAt(0));
        System.out.println("La frase reemplazada es: " + fraseRemplazada);
    }

    public boolean contiene(Cadena c1,String letra){

        if(c1.getFrase().contains(letra)){
            return true;
        }

        return false;
    }


}

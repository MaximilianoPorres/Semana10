/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana10;

import java.util.Random;

/**
 *
 * @author Alumno
 */
public class Password {

    private int longitud;
    private String contrasenia = "";

    public Password() {
        longitud = 8;
    }

    public Password(int longitud) {
        this.longitud = longitud;

        generarPassword();
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    public boolean esFuerte() {

        int longitudContrasenia = contrasenia.length();
        int numero = 0;
        int mayuscula = 0;
        int minuscula = 0;

        for (int i = 0; i < longitudContrasenia; i++) {

            char aux = contrasenia.charAt(i);

            if (aux > 47 && aux < 58) {
                numero++;
            }

            if (aux > 64 && aux < 91) {
                mayuscula++;
            }

            if (aux > 96 && 123 > aux) {
                minuscula++;
            }
        }

        if (numero >= 5 && mayuscula >= 2 && minuscula >= 1) {
            return true;
        } else {
            return false;
        }

    }

    public void generarPassword() {

        int aux = 0;
        Random rand = new Random(System.nanoTime());

        for (int i = 0; i < longitud; i++) {
            int opcion = rand.nextInt(3);

            if (opcion == 0) {

                aux = rand.nextInt(10);
                contrasenia += Integer.toString(aux);
            }

            if (opcion == 1) {
                aux = rand.nextInt((90 - 65) + 1) + 65;
                contrasenia += (char) aux;
            }

            if (opcion == 2) {
                aux = rand.nextInt((122 - 97) + 1) + 97;
                contrasenia += (char) aux;
            }
        }
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana10;

import javax.swing.JOptionPane;

/**
 *
 * @author Alumno
 */
public class Semana10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int tamanio = Integer.parseInt(JOptionPane.showInputDialog("Ingresa la cantidad de contraseñas a generar"));
        Password[] contrasenia = new Password[tamanio];

        boolean[] esSegura = new boolean[tamanio];

        for (int i = 0; i < contrasenia.length; i++) {

            int longitudContr = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el valor en longitud de la contraseña"));
            contrasenia[i] = new Password(longitudContr);

            esSegura[i] = contrasenia[i].esFuerte();
            System.out.println("LA CONTRASEÑA " + (i + 1) + ": " + contrasenia[i].getContrasenia() + ". ¿ES SEGURA?: " + esSegura[i]);

        }
    }
}

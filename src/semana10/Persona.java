/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana10;

/**
 *
 * @author Alumno
 */
public class Persona {

    public static final char sexo;
    private String nombre;
    private int edad;
    private int dni;
    private double peso;
    private double altura;

    static {
        sexo = 'H';
    }

    public Persona() {
        nombre = null;
        edad = 0;
        peso = 0d;
        altura = 0d;
        generarDNI();
    }

    public Persona(String nombre, int edad, char sexo) {
        this.nombre = nombre = "";
        this.edad = edad = 0;
        comprobarSexo(sexo);
        generarDNI();
    }

    public Persona(String nombre, int edad, int dni, double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.dni = dni;
        this.peso = peso;
        this.altura = altura;
        generarDNI();
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public int getDni() {
        return dni;
    }

    public double getPeso() {
        return peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    //Metodos
    @Override
    public String toString() {
        return "Nombre: " + nombre + ", sexo: " + sexo + ", edad: " + edad + ", DNI: " + dni
                + ", peso: " + peso + "Kg, altura: " + altura + "mts";
    }

    public double calcularIMC(double peso, double altura) {

        double pesoIdeal = 0d;

        pesoIdeal = peso / (Math.pow(altura, 2d));

        if (pesoIdeal < 20) {
            return -1;
        } else if (19 < pesoIdeal && pesoIdeal < 26) {
            return 0;
        } else {
            return 1;
        }
    }

    public boolean esMayorDeEdad() {

        if (edad >= 18) {
            return true;
        }
        return false;
    }

    private void comprobarSexo(char sexo) {

        if (sexo != 'H' || sexo != 'M') {
            sexo = 'H';
        }
    }

    public int generarDNI() {

        int aux = (int) (Math.random() * (45000000 - 10000000) + 10000000);
        String sDni = String.format("%08d", aux);
        int dni = Integer.parseInt(sDni);

        System.out.println("DNI = " + dni);

        return dni;
    }

}

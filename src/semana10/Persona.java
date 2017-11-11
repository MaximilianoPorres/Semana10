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

    public static final char H = 'H';
    public static final char M = 'M';
    private String nombre;
    private int edad;
    private int dni;
    private double peso;
    private double altura;

    public Persona() {
    }

    public Persona(String nombre, int edad) {
        this.nombre = nombre = "";
        this.edad = edad = 0;
    }

    public Persona(String nombre, int edad, int dni, double peso, double altura) {
        this.nombre = nombre = "";
        this.edad = edad = 0;
        this.dni = dni = 0;
        this.peso = peso = 0d;
        this.altura = altura = 0d;
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

    public static char getH() {
        return H;
    }

    public static char getM() {
        return M;
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
        return "Persona{" + "nombre=" + nombre + ", edad=" + edad + ", dni=" + dni + ", peso=" + peso + ", altura=" + altura + '}';
    }

    public double calcularIMC(double peso, double altura) {

        double pesoIdeal = 0d;
    
        pesoIdeal = peso/ (Math.pow(altura, 2d));
        
        return 1;
    }

    public boolean esMayorDeEdad() {

        return false;
    }

    public String sexo(char sexo) {

        return null;
    }

    public int generarDNI() {

        int aux = (int) (Math.random() * (45000000 - 10000000) + 10000000);
        String sDni = String.format("%08d", aux);
        int dni = Integer.parseInt(sDni);

        System.out.println("DNI = " +  dni);

        return dni;
    }

}
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
public class Cuenta {
    
    private String titular;
    private double saldo;

    public Cuenta(String titular) {
        this.titular = titular;
    }

    public Cuenta(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }
}

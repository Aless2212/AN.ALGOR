/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.gasideal;

/**
 *
 * @author ALUMNO
 */
public class GasIdeal {
    
    private double Temperatura;
    private double numeroDeMoles;
    private double Volumen;
    
    public GasIdeal(double pTemperatura, double pnumeroDeMoles, double pVolumen) {
     this.Temperatura = pTemperatura;
     this.Volumen = pVolumen;
     this.numeroDeMoles = pnumeroDeMoles;
 }
    public static void main(String[] args) {
        GasIdeal EjemploGasIdeal = new GasIdeal(345.10,2.1,20.0);
        System.out.println("La presión es: ");
        System.out.println(EjemploGasIdeal.CalcularPresion());
    }
    public double CalcularPresion() {
        return (this.Temperatura * this.numeroDeMoles * 0.0821) / this.Volumen;
    }
 
    /**
     * @return the Temperatura
     */
    public double getTemperatura() {
        return this.Temperatura;
    }

    /**
     * @param pTemperatura the Temperatura to set
     */
    public void setTemperatura(double pTemperatura) {
        this.Temperatura = pTemperatura;
    }

    /**
     * @return the numeroDeMoles
     */
    public double getNumeroDeMoles() {
        return this.numeroDeMoles;
    }

    /**
     * @param pnumeroDeMoles the numeroDeMoles to set
     */
    public void setNumeroDeMoles(double pnumeroDeMoles) {
        this.numeroDeMoles = pnumeroDeMoles;
    }

    /**
     * @return the Volumen
     */
    public double getVolumen() {
        return this.Volumen;
    }

    /**
     * @param pVolumen the Volumen to set
     */
    public void setVolumen(double pVolumen) {
        this.Volumen = pVolumen;
    }
    
 }

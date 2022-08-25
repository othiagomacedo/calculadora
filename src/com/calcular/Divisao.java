/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.calcular;

/**
 *
 * @author thiag
 */
public class Divisao {
    
    public Divisao(String num1, String num2) {
        
    }
    
    double n1 = 0;
    double n2 = 0;
    
    public double dividir (String num1, String num2) {
        this.n1 = Double.parseDouble(num1);
        this.n2 = Double.parseDouble(num2);
        
        return n1+n2;
    }
    
}

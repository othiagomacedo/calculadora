/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.calcular;

/**
 *
 * @author Felipe, Hudson e Thiago
 */
public class Avancado {
    double num1 = 0;
    double num2 = 0;
    
    public Avancado () {
    }
    
    public double Raiz(String n1) throws Exception{
        this.num1 = Double.parseDouble(n1);
        
        if (num1 < 0 ) {
            throw new Exception("Número menor que zero são inválidos!");
        } else {
            num1 = Math.sqrt(num1);
            return num1;
        }
    }
    
    public double Pot(String n1) throws Exception{
        double res = 0;
        this.num1 = Double.parseDouble(n1);
        res = Math.pow(num1,2);
        return res;
    }
    
}

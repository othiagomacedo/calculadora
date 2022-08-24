/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.calcular;

/**
 *
 * @author thiag
 */
public class Soma {
    
    double n1 = 0;
    double n2 = 0;
    
    public Soma (String num1, String num2){
        
        this.n1 = Double.parseDouble(num1);
        this.n2 = Double.parseDouble(num2);        
        
        /*
        this.n1 = num1;
        this.n2 = num2;
        */
    }
    
    public double somar (String num1, String num2) throws Exception {
        this.n1 = Double.parseDouble(num1);
        this.n2 = Double.parseDouble(num2);
        return n1+n2;
    }

    public double getN1() {
        return n1;
    }

    public void setN1(double n1) {
        this.n1 = n1;
    }

    public double getN2() {
        return n2;
    }

    public void setN2(double n2) {
        this.n2 = n2;
    }
    
    
    
}

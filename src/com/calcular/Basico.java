/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.calcular;

/**
 *
 * @author Felipe, Hudson e Thiago
 */

public class Basico {
    double num1 = 0;
    double num2 = 0;
    double res = 0;
    
    //Construtor
    public Basico() {
    }

    
    //Metodos
    public double Somar(String n1, String n2) throws Exception {
        this.num1 = Double.parseDouble(n1);
        this.num2 = Double.parseDouble(n2);
        if (n1.equals("") || n2.equals("")) throw new Exception("Por favor digite um número!");
        res = num1+num2;
        return res;
    }
    
    public double Subt(String n1, String n2) throws Exception {
        this.num1 = Double.parseDouble(n1);
        this.num2 = Double.parseDouble(n2);
        res = num1-num2;
        return res;
    }
    
    public double Div(String n1, String n2) throws Exception {
        this.num1 = Double.parseDouble(n1);
        this.num2 = Double.parseDouble(n2);
        res = num1/num2;
        return res;
    }
    
    public double Multi(String n1, String n2) throws Exception {
        this.num1 = Double.parseDouble(n1);
        this.num2 = Double.parseDouble(n2);
        res = num1*num2;
        return res;
    }
    
    
    //GETTERS E SETTERS

    public double getNum1() {
        return num1;
    }

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public double getNum2() {
        return num2;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }
    
}

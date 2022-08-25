/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.calcular;

/**
 *
 * @author thiag
 */

import com.calcular.Multi;
import com.calcular.Divisao;
import com.calcular.Soma;
import com.calcular.Subtracao;


public class Intermediador {
    // O VETOR EXPRESSÃO IRÁ GUARDAR A FUNCAO RECEBIDA DA TELA 
    String []expressao = new String [200];
    
    // O VETOR EXPRESSÃO IRÁ GUARDAR O RESULTADO DOS CALCULOS
    double []result = new double [100];
    
    // O VETOR QUE ARMAZENARÁ A POSIÇÃO DA ORDEM DE PRIORIDADES DE CÁLCULO
    int []priori = new int [100];

    
    int p = 0; //posicao do vetor Expressao[]
    int r = 0; //posicao do vetor result[]
    int o = 0; //posicao do vetor opera[]
    
    String num1 = "";
    String op = "";
    
    Soma soma = new Soma("1","1");
    Divisao div = new Divisao("1","1");
    Subtracao sub = new Subtracao("1","1");
    Multi multi = new Multi("1","1");
    
    //Construtor
    public Intermediador (String num1, String op) {
        this.num1 = num1;
        this.op = op;
    }
    
    //Funcão apenas para popular o vetor Expressao
    public void popular(String num1, String op){
        
        if (p == 0) {
            expressao[0] = num1;
            expressao[1] = op;
            
            p = 2;
        } else
        
        if (p >= 2) {
            expressao[p] = num1;
            expressao[p+1] = op;
            
            p += 2;
        }
    }
    
    //Inicia a verificação de cada operacao dentro da funcao e ordena por ordem de prioridade;
    public double executOper () {
        
        double saida = 0;
        
        for (int i = 0; i < p; i++) {
            //VERIFICA A ORDEM DE PRIORIDADE E SALVA A POSICÃO DA PRIORIDADE NO VETOR
            if (expressao[i].equals("x") || expressao[i].equals("/") || expressao[i].equals("+") || expressao[i].equals("-")) {
                switch (expressao[i]) {
                    //popula o vetor priori[], priori[] recebe posicao de prioridade, popula o vetor res[] com resultado da operacao;
                    case "x" : priori[o+1] = priori[o]; priori[o] = i; result[r] = multi.multiplicar(expressao[i-1], expressao[i+1]); break;
                    case "/" : priori[o+1] = priori[o]; priori[o] = i; result[r] = div.dividir(expressao[i-1], expressao[i+1]); break;
                    case "+" : priori[o+1] = priori[o]; priori[o] = i; result[r] = soma.somar(expressao[i-1], expressao[i+1]); break;
                    case "-" : priori[o+1] = priori[o]; priori[o] = i; result[r] = sub.subtrair(expressao[i-1], expressao[i+1]); break;
                }
                
                o += 1;
                r += 1; 
            }          
        }      
        
        for (int i = 0; i < r; i++) {
            saida += result[r];
        }
        
        
        
        return saida;
    }
    
    /*
    // Estes dois if's define prioridade de calculo,  primeiro x e /, depois + e -
            if (expressao[i].equals("x")  || expressao[i].equals("/")) {
                switch (expressao[i]) {
                    case "x" : multi.multiplicar(expressao[i-1],expressao[i+1]); break;
                    case "/" : div.dividir(expressao[i-1],expressao[i+1]); break;
                }
                contarCarac += 1;
            }
            if (expressao[i].equals("+")  || expressao[i].equals("-")) {
                switch (expressao[i]) {
                    case "+" : soma.somar(expressao[i-1],expressao[i+1]); break;
                    case "-" : sub.subtrair(expressao[i-1],expressao[i+1]); break;
                }
                contarCarac += 1;
            }
    */
    
    /* ############################################
                    GETTERS E SETTERS
       ############################################ */ 
    
    public String getNum1() {
        return num1;
    }

    public void setNum1(String num1) {
        this.num1 = num1;
    }

    public String getOp() {
        return op;
    }

    public void setOp(String op) {
        this.op = op;
    }
    
    // ###########################################
    
    
    
}

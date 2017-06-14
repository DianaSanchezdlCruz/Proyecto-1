/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Random;

/**
 *
 * @author Sanchez de la Cruz
 */
public class NumeroSecreto {
    private int numero; 
    private int limiteinferior;
    private int limitesuperior;
    private Random generador; 
    private static final int LIM_INF_PREDET = 1;
    private static final int LIM_SUP_PREDET = 100;
    
    public void setRango (int limiteinferior, int limitesuperior){
        if (limiteinferior > limitesuperior){
            this.limiteinferior = LIM_INF_PREDET;
            this.limitesuperior = LIM_SUP_PREDET;
        }
        else {
            this.limiteinferior= limiteinferior;
            this.limitesuperior= limitesuperior;
        }
        
    }
    public final void generar (){
        this.numero=generador.nextInt(limitesuperior) + 1;
        
    }
    public NumeroSecreto (int limiteinferior, int limitesuperior){
        this.setRango(limiteinferior, limitesuperior);
        this.generador= new Random();
        this.generar();
    }
    public NumeroSecreto (){
        this (LIM_INF_PREDET, LIM_SUP_PREDET);
        
    }
    public int getNumeroSecreto (){
        return this.numero;
}
    public int getlimiteinferio (){
        return this.limiteinferior; 
    }
    public int getlimitesuperior (){
        return this.limitesuperior;
    }
    public boolean esMayor (int numero){
        boolean elNumeroSecretoesMayor;
        if (this.numero > numero){
            elNumeroSecretoesMayor = true;}
        else{
            elNumeroSecretoesMayor = false;
          
        }
        return elNumeroSecretoesMayor;
    }
    public boolean esMenor (int numero){
        boolean elNumeroSecretoesMenor = false;
        if (this.numero < numero){
            elNumeroSecretoesMenor =true;
        }
        return elNumeroSecretoesMenor;
        
    }
    public boolean esigual (int numero){
        return (this.numero == numero);
    }

    boolean esIgual(int numero) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
        
}

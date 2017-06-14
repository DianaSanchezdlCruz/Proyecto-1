/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Sanchez de la Cruz
 */
public class Juego {
    private NumeroSecreto numeroSecreto; 
    private int limiteInferior;
    private int limiteSuperior;
    private int numeroDeIntentos;
    private int intentosRealizados;
    private static final int LIM_INF_PREDET = 1;
    private static final int LIM_SUP_PREDET = 100;

    public Juego(int i, int i0, int i1) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
    
    public void setRangoDelNumeroSecreto(int limiteInfeerior, int limiteSuperior){
        this.limiteInferior = limiteInferior;
        this.limiteSuperior = limiteSuperior;
        numeroSecreto.setRango(this.limiteInferior, this.limiteSuperior);
        this.intentosRealizados = 0;
        
    }
    
    public void setNumeroDeIntentos (int intentos){
        this.numeroDeIntentos = intentos;
    }
    
    public boolean esElNumeroSecreto (int numero){
        this.intentosRealizados++;
        return numeroSecreto.esIgual(numero);
    }
    public boolean puedeIntentarDeNuevo() {
        boolean hayMasOportunidades = this.intentosRestantes() > 0;
        return hayMasOportunidades;
    }
    
    public int intentosRestantes() {
        int numeroDeIntentosRestantes = this.numeroDeIntentos - this.intentosRealizados;
        return (numeroDeIntentosRestantes);
    }
    
    public String getTextoDeAyuda(int numero) {
        String texto = null;
        if (this.numeroSecreto.esMayor(numero) == true) {
            texto = "mayor";
        }
        else if (this.numeroSecreto.esMenor(numero) == true) {
            texto = "menor";
        }
        return texto;
    }

    public int getNumeroSecreto() { 
     return this.numeroSecreto.getNumeroSecreto();
    }
    
    
}
 

    
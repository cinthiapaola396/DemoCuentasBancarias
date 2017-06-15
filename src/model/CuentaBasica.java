/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author pekep_000
 */
public class CuentaBasica {
    
    protected int numeroDeCuenta;
    protected String cliente;
    protected double saldo;
    private double cantidad;

    
    public CuentaBasica(int numeroDeCuenta, String cliente, double saldo){
        this.numeroDeCuenta = numeroDeCuenta;
        this.cliente = cliente;
        this.saldo = saldo;
    }
    
    public double getSaldo(){
        return saldo;
    }
    
    public int getNumeroDeCuenta(){
        return numeroDeCuenta;
    }
    
    public String getCliente(){
        return cliente;
    }
    
    
    public boolean depositar(double cantidad){
        boolean Saldo = true;
        if(cantidad >= 0){
            this.saldo = this.saldo + cantidad;
            Saldo = true;
            
        }else{
            Saldo = false;
        }
        
       
        return Saldo;
    }
    
    public boolean retirar(double cantidad){
        boolean retiro = true;
        if(cantidad <= this.saldo){
            this.saldo = this.saldo - cantidad;
            retiro = true;
        }else{
            if(cantidad > this.saldo){
                retiro = false;
            }
        }
        return retiro;
        
       
            
    
    }
    
}
    
    
    


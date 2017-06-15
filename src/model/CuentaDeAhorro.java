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
public class CuentaDeAhorro extends CuentaBasica {
    
    
    private double tasaDeInteres;
    private double comisionPorSaldo;
    private double cantidad;
    
    public CuentaDeAhorro(int numeroDeCuenta, String cliente, double saldo ){
        super(numeroDeCuenta, cliente,saldo);
        this.numeroDeCuenta = numeroDeCuenta;
        this.cliente = cliente;
        this.saldo = saldo;
        
    }
    
   public double CalcularInteres(){
       tasaDeInteres = (((4/ 360)* 30)* getSaldo()/100);
       return tasaDeInteres;
     }

    public double calcularComisionPorSaldo() {
        if(saldo < 1000){
            comisionPorSaldo =50;
        }else{
            
            if(saldo >= 1000){
            comisionPorSaldo = 0;
        }
        }
        return comisionPorSaldo;
    }
    
    public void realizarCorteMensual(){
        saldo = ((getSaldo()+ tasaDeInteres)- comisionPorSaldo);
    }
    
    
        
    }
  
        
     
   

   

   
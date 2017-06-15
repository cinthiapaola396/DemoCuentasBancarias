/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package democuentasbancarias;

import java.util.Scanner;
import model.CuentaBasica;
import model.CuentaDeAhorro;
import model.CuentaDeCheques;

/**
 *
 * @author pekep_000
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        CuentaBasica miCuenta = new CuentaBasica(16470267,"Cinthia Paola Cab Muñoz",50);
        
        System.out.println("Bienvenido cliente, para abrir una cuenta debe tener un mínimo de $50 pesos");
        System.out.println("Usted cuenta con la cantidad pedida");
        System.out.println("Para seguir, presione >>ENTER<<");
        
        System.out.println(" Cliente: " + miCuenta.getCliente());
        System.out.println("El número de cuenta es de: " + miCuenta.getNumeroDeCuenta());
        System.out.println("El saldo es de:" + miCuenta.getSaldo());
        
        
        
        System.out.println("Se realizó un depósito por el monto de: $1000");
        miCuenta.depositar(1000);
        System.out.println("El saldo actual es de:" + miCuenta.getSaldo());
        
        System.out.println("Se realizó un depósito por el monto de: $1500");
        miCuenta.depositar(1500);
        System.out.println("El saldo actual es de:" + miCuenta.getSaldo());
        
        System.out.println("Se realizó un retiro por el monto de: $200");
        miCuenta.retirar(200);
        System.out.println("El saldo actual es de: " + miCuenta.getSaldo());
        
        System.out.println("Se realizó un depósito por el monto de: $300");
        miCuenta.depositar(300);
        System.out.println("El saldo actual es de:" + miCuenta.getSaldo());
        
        System.out.println("Se realizó un retiro por el monto de: $1000");
        miCuenta.retirar(1000);
        System.out.println("El saldo actual es de: " + miCuenta.getSaldo());
        
        CuentaDeAhorro misAhorros = new CuentaDeAhorro(16470267,"Paola Muñoz",50);
        System.out.println("cliente:" + misAhorros.getCliente());
        System.out.println("El número de cuenta es de:" + misAhorros.getNumeroDeCuenta());
        System.out.println("El saldo es de:" + misAhorros.getSaldo());
        
        System.out.println("Se realizó un depósito en la cuenta de ahorro de $1000 ");
        misAhorros.depositar(1000);
        System.out.println("El saldo actual es de:" + misAhorros.getSaldo());
        
        System.out.println("Se realizó un depósito en la cuenta de ahorro de $1500 ");
        misAhorros.depositar(1500);
        System.out.println("El saldo actual es de:" + misAhorros.getSaldo());
        
        System.out.println("Se realizó un retiro en la cuenta de ahorro de $200 ");
        misAhorros.retirar(200);
        System.out.println("El saldo actual es de:" + misAhorros.getSaldo());
        
        System.out.println("Se realizó un depósito en la cuenta de ahorro de $300 ");
        misAhorros.depositar(300);
        System.out.println("El saldo actual es de:" + misAhorros.getSaldo());
        
        System.out.println("Se realizó un retiro en la cuenta de ahorro de $1000 ");
        misAhorros.retirar(1000);
        System.out.println("El saldo actual es de:" + misAhorros.getSaldo());
        
       misAhorros.realizarCorteMensual();
       System.out.println(misAhorros.getSaldo() + misAhorros.CalcularInteres() - 
              misAhorros.calcularComisionPorSaldo());
       
        CuentaDeCheques misCheques = new CuentaDeCheques(16470267,"Cinthia Paola Cab muñoz",200);
        System.out.println(" Cliente: " + misCheques.getCliente());
        System.out.println("El número de cuenta es de: " + misCheques.getNumeroDeCuenta());
        System.out.println("El saldo es de:" + misCheques.getSaldo());
        
        System.out.println("Depositar:");
        double cantidad;
        cantidad = entrada.nextInt();
        misCheques.depositar(cantidad);
        System.out.println("El saldo es de:" + misCheques.getSaldo());
        
        System.out.println("retirar:");
        cantidad = entrada.nextInt();
        misCheques.retirar(cantidad);
        
        System.out.println("Comisión por cheques:" + misCheques.calcularComisionPorChequesRebotados());
        System.out.println("El saldo es de:" + (misCheques.getSaldo()- cantidad));
        
       
                
    }
    
}

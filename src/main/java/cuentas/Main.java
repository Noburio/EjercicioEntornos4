/*
REFACTORIZACIÓN

Las clases deberán formar parte del paquete cuentas. DONE
Cambiar el nombre de la variable "cuenta1" por "cuenta1". DONE
Introducir el método operativa_cuenta, que englobe las sentencias de la clase Main que operan con el objeto cuenta1. DONE
Encapsular los atributos de la clase CCuenta. DONE
Añadir un nuevo parámetro al método operativa_cuenta, de nombre cantidad y de tipo float. DONE
*/


package cuentas;

public class Main {
    
    
    CCuenta cuenta1;
    double saldoActual;

    public CCuenta getCuenta1() {
        return cuenta1;
    }

    public void setCuenta1(CCuenta cuenta1) {
        this.cuenta1 = cuenta1;
    }

    public double getSaldoActual() {
        return saldoActual;
    }

    public void setSaldoActual(double saldoActual) {
        this.saldoActual = saldoActual;
    }
    
    public void operativa_cuenta(){   
        cuenta1 = new CCuenta("Antonio LÃ³pez","1000-2365-85-1230456789",2500,0);
        saldoActual = cuenta1.estado();
        System.out.println("El saldo actual es"+ saldoActual );
        
        float cantidad = 0;

        try {
            cuenta1.retirar(2300);
        } catch (Exception e) {
            System.out.print("Fallo al retirar");
        }
        try {
            System.out.println("Ingreso en cuenta");
            cuenta1.ingresar(695);
        } catch (Exception e) {
            System.out.print("Fallo al ingresar");
        }
        
    }
    
    
    
    
    
    
    

    public static void main(String[] args) {
        
        
        
        
        
       

     
    }
}

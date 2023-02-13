/*REFACTORIZACIÓN

Las clases deberán formar parte del paquete cuentas. DONE
Cambiar el nombre de la variable "miCuenta" por "cuenta1".
Introducir el método operativa_cuenta, que englobe las sentencias de la clase Main que operan con el objeto cuenta1.
Encapsular los atributos de la clase CCuenta.
Añadir un nuevo parámetro al método operativa_cuenta, de nombre cantidad y de tipo float.
*/


package cuentas;

public class CCuenta {


    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInteres = 0;

    public CCuenta()
    {
    }

    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }

    public double estado()
    {
        return saldo;
    }

    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        saldo = saldo + cantidad;
    }

    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        saldo = saldo - cantidad;
    }
}

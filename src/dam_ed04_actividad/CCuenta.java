
package dam_ed04_actividad;


public class CCuenta {

    
    public String getCuenta() {
        return cuenta;
    }

   
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

   
    public double getSaldo() {
        return saldo;
    }

 
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }


    public String nombre;
    public String cuenta;
    public double saldo;
    public double tipoInterés;


    public CCuenta()
    {
    }

    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }

    public void asignarNombre(String nom)
    {
        setNombre(nom);
    }

    public String obtenerNombre()
    {
        return getNombre();
    }


    public double estado()
    {
        return getSaldo();
    }


    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldo(getSaldo() + cantidad);
    }

    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        setSaldo(getSaldo() - cantidad);
    }


    public String obtenerCuenta()
    {
        return getCuenta();
    }


    public String getNombre() {
        return nombre;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public double getTipoInterés() {
        return tipoInterés;
    }


    public void setTipoInterés(double tipoInterés) {
        this.tipoInterés = tipoInterés;
    }
public static void main(String[] args) {
        CCuenta cuenta1;
        double saldoActual;

        operativa_cuenta();
    }

    public static void operativa_cuenta() {
        float cantidad;
        CCuenta cuenta1;
        double saldoActual;
        cuenta1 = new CCuenta("Antonio López","1000-2365-85-1230456789",2500,0);
        saldoActual = cuenta1.estado();
        System.out.println("El saldo actual es"+ saldoActual );
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
}

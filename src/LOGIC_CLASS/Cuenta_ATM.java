
package LOGIC_CLASS;


public class Cuenta_ATM {
    //Atributos
    private String NM_Cuenta;
    private String Pin_Cuenta;
    private double Saldo;
    private String Nombre;
    private String Apellido;
    
    
    //Metodo Constructor
    
    public Cuenta_ATM(){
        //Constructor usuario root (Predifinido)
        this.NM_Cuenta="";
        this.Pin_Cuenta="";
        this.Nombre="";
        this.Apellido="";
        this.Saldo=0;
    }
    
    //Metodos verificacion_fondos
    
    public boolean verificacion_fondos(double Cantidad){
        //Variables temporal
        boolean verified=false;
        //Condicion para verificar cantidad de fondos       
        if (Cantidad>this.Saldo||Cantidad<=0) {
            verified=false;
        } else{
            verified=true;
        }
        return verified;
    }
    
    //Metodos Getters and Setters

    public String getNM_Cuenta() {
        return NM_Cuenta;
    }

    public void setNM_Cuenta(String NM_Cuenta) {
        this.NM_Cuenta = NM_Cuenta;
    }

    public String getPin_Cuenta() {
        return Pin_Cuenta;
    }

    public void setPin_Cuenta(String Pin_Cuenta) {
        this.Pin_Cuenta = Pin_Cuenta;
    }

    public double getSaldo() {
        return Saldo;
    }

    public void setSaldo(double Saldo) {
        this.Saldo = Saldo;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }
    
}

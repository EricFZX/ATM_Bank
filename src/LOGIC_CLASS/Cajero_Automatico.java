
package LOGIC_CLASS;
//Importar Librerias para importar DATOS

import java.io.BufferedReader;
import java.io.FileReader;
import javax.swing.JOptionPane;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Cajero_Automatico extends Cuenta_ATM{
    //Atributos
    //Matriz Contenedor de Nombre,Apellido,Identidad,NmCuenta,PIN,SALDO.
    private String Cuentas_predefinidas[][];
    
    //Variable para almacenenar fila y posicion de mi cuenta_iniciada
    private int fila;
    private int columna[]= new int [3];
    
    //Constructor
    public Cajero_Automatico(){
        super();       
    }
    
    //Metodos_Funciones_Cajero
    public void Retirar(boolean verificacion,double Cantidad){
        //Variables desechables para hacer el cambio de tipos.
        
        double XTEMP=0;
        
        if (verificacion==true) {
            //Hacer el proceso tanto en mi matriz como en mi clase padre para facil acceso;
            XTEMP=Double.parseDouble(Cuentas_predefinidas[fila][columna[2]]);
            XTEMP=XTEMP-Cantidad;
            //Aplicar Mouth.round
            XTEMP=Math.round(XTEMP*100.00)/100.00;
            Cuentas_predefinidas[fila][columna[2]]=String.valueOf(XTEMP);
            setSaldo(XTEMP);
            
            //Metodo Guardar Datos TXT y BITACORA
            GUARDAR_TEXTO(1, String.valueOf(Cantidad),"");
            GUARDAR_DATOS();
            
        }        
    } 
    
    //Metodo Verificar_Usuario
    public boolean Verificar_Usuario(String NmCuenta,String PIN){
        for (int i = 0; i <Cuentas_predefinidas.length; i++) {
            for (int j = 0; j <1; j++) {
                if (NmCuenta.equals(Cuentas_predefinidas[i][j])&&PIN.equals(Cuentas_predefinidas[i][j+1])) {
                    //Ingresar Datos de Cuenta como Globales para facil acceso;
                    setNM_Cuenta(NmCuenta);
                    setPin_Cuenta(PIN);
                    setSaldo(Double.parseDouble(Cuentas_predefinidas[i][j+2]));
                    setNombre(Cuentas_predefinidas[i][j+3]);
                    setApellido(Cuentas_predefinidas[i][j+4]);
                    
                    //Almacenar Datos de Matriz para acceso facil
                    this.fila=i;
                    this.columna[0]=(j);
                    this.columna[1]=(j+1);
                    this.columna[2]=(j+2);
                    
                    //Retorna Valores Cierrra Ventana_LOGIN y abre Ventana_Cajero
                     return true;    
                } 
            }
        }
        return false;
    }
    
    //Metodo Transferir
    public void Transferir(boolean Acceso, double Cantidad,String NmCuenta){
        if (Acceso==true) {
            //For para buscar Nm Cuenta;
            for (int i = 0; i <Cuentas_predefinidas.length; i++) {
                for (int j = 0; j <1; j++) {
                    if (NmCuenta.equals(Cuentas_predefinidas[i][j])) {
                        //Variables
                        double Cantidad_Recibida;
                        double Cantidad_Restante;
                        
                        //Proceso Datos
                        Cantidad_Recibida=Double.parseDouble(Cuentas_predefinidas[i][2])+Cantidad;
                        Cantidad_Restante=Double.parseDouble(Cuentas_predefinidas[this.fila][2])-Cantidad;
                        
                        //Aplicar la funcion Math.Round
                        Cantidad_Recibida=Math.round(Cantidad_Recibida*100.00)/100.00;
                        Cantidad_Restante=Math.round(Cantidad_Restante*100.00)/100.00;                        
                        
                        //Setear valor a mi Padre
                        setSaldo(Cantidad_Restante);
                        
                        //Ingresar Datos a Matriz
                        //Cuenta que Recibe
                        this.Cuentas_predefinidas[i][2]=String.valueOf(Cantidad_Recibida);
                        //Cuenta que Envia
                        this.Cuentas_predefinidas[fila][2]=String.valueOf(Cantidad_Restante);
                        
                        //Metodo Guardar Datos TXT
                        GUARDAR_TEXTO(3, String.valueOf(Cantidad),NmCuenta);
                        GUARDAR_DATOS();
                        
                    }
                }
            }   
        }     
    }
    
    //Metodo Verificar Cuenta Existente
    public boolean CTA_EXISTE (String NmCuenta){
            
        boolean ctaexiste=false;
            //For para buscar Nm Cuenta;
            for (int i = 0; i <Cuentas_predefinidas.length; i++) {
                for (int j = 0; j == 0; j++) {
                    if (NmCuenta.equals(Cuentas_predefinidas[i][j])) {
                        //Variables
                            ctaexiste = true;
                           
                                    
                    }
                }
            }   
        return ctaexiste;
        }     
    

        public void DEPOSITOEFVO (double Cantidad, String NmCuenta){           
            //For para buscar Nm Cuenta;
            for (int i = 0; i <Cuentas_predefinidas.length; i++) {
                for (int j = 0; j == 0; j++) {
                    if (NmCuenta.equals(Cuentas_predefinidas[i][j])) {
                        //Variables

                        //Obtener Datos Matriz
                         double Cantidad_Recibida=Double.valueOf(Cuentas_predefinidas[i][2])+Cantidad;
                         
                        //Aplicar Math.Round
                         Cantidad_Recibida=Math.round(Cantidad_Recibida*100.00)/100.00;
                        
                        //Ingresar Datos a Matriz
                        this.Cuentas_predefinidas[i][2]=String.valueOf(Cantidad_Recibida);
                        this.setSaldo(Cantidad_Recibida);
                        
                        //Metodo Guardar Datos TXT
                        GUARDAR_TEXTO(2, String.valueOf(Cantidad),"");
                        GUARDAR_DATOS();
                        
                    }
                }
            }   

        }
        
        public void INGRESAR_MATRIZ_FILAS(String LOCATION){                  
                //Obtener Ubicacion de Archivo
                File FILE_MATRIZ = new File (LOCATION);
                //Try para errores
                try{
                    BufferedReader lector = new BufferedReader(new FileReader(FILE_MATRIZ));
                    String linea = lector.readLine();
                    
                    //Variables obtener FILAS
                    int Filas=0;
                    
                    //Obtener Datos de Fila
                    while(linea!=null){
                        Filas++;
                        linea=lector.readLine();
                        
                    }
                    Filas=Filas/5;
                    
                    //Creacion de MATRIZ CON DATOS NUEVOS
                    Cuentas_predefinidas= new String [Filas][5];                   
                    lector.close();
                    //Nuevo BUFFERED
                    BufferedReader lector_V2 = new BufferedReader(new FileReader(FILE_MATRIZ));
                    linea=lector_V2.readLine();
                    
                    //Meter Datos en Matriz
                    while(linea!=null){
                        for (int i = 0; i <Cuentas_predefinidas.length; i++) {
                         for (int j = 0; j <Cuentas_predefinidas[i].length; j++) {
                            Cuentas_predefinidas[i][j]=linea;
                            linea=lector_V2.readLine();
                          }
                       }
                    }
                    
                    lector_V2.close();
                    }catch(Exception E){
                        JOptionPane.showMessageDialog(null, E);
                }
                               
              
        }
        public void GUARDAR_TEXTO(int Tipo,String Cantidad,String NmCuenta){
            //GUARDAR DATOS EN TEXTO
            String PATH =System.getProperty("user.dir")+"\\src\\TEXT_FILES\\BITACORA.txt";
            File Archivo = new File(PATH);
             try{ 
                
                 //Creacion de Metodo Para que no sobrescriba los anteriores
                 FileWriter fw = new FileWriter(Archivo.getAbsoluteFile(), true);
                 BufferedWriter bw = new BufferedWriter(fw);
                 
                                  
                //Sintaxis de Codigo para guardar
                 
                 switch(Tipo){
                     case 1:
                         bw.write("El usuario"+" "+getNombre()+" "+getApellido()+" numero de cuenta: N."+getNM_Cuenta()+" retiro la cantidad de:"+Cantidad+"Lps.");
                         bw.newLine();
                         break;
                     case 2:
                         bw.write("El usuario"+" "+getNombre()+" "+getApellido()+" deposito la cantidad de:"+Cantidad+"Lps a su numero de cuenta N."+getNM_Cuenta());
                         bw.newLine();
                         break;
                     case 3:
                         bw.write("El usuario"+" "+getNombre()+" "+getApellido()+" transfirio la cantidad de:"+Cantidad+"Lps de su numero de cuenta N."+getNM_Cuenta()+" a la cuenta N."+NmCuenta);
                         bw.newLine();
                         break;
                     case 4:
                         
                         bw.write("El usuario"+" "+getNombre()+" "+getApellido()+" numero de cuenta:N."+getNM_Cuenta()+" consulto su saldo, cantidad disponible:"+Cantidad+"Lps");
                         bw.newLine();
                         break;              
                 }
                 bw.close();
             }catch (Exception E){
                 
                 
             }       
        }
        
        public void GUARDAR_DATOS(){
            //Instanciar el path del Archivo
            String PATH =System.getProperty("user.dir")+"\\src\\TEXT_FILES\\TXT_MATRIZ_FILAS.txt";
            //Instanciar el objeto
            File Archivo= new File(PATH);
            
            try{
                BufferedWriter escritor = new BufferedWriter(new FileWriter(Archivo));
                
                //Guardar valores en tiempo real en TXT
                for (int i = 0; i <Cuentas_predefinidas.length; i++) {
                    for (int j = 0; j <Cuentas_predefinidas[i].length; j++) {
                        escritor.write(Cuentas_predefinidas[i][j]);
                        escritor.newLine();
                    }
                }
                //Finalizar CODIGO
                escritor.close();
                           
            }catch(Exception E){
                
            }     
        }
        
        public List<String> leer_bitacora(){
            
            //Creacion de Arra, permite guardar valores cuantos desee
            List<String> Bitacora = new ArrayList<>();
            
            //Instanciar el path del Archivo
            String PATH =System.getProperty("user.dir")+"\\src\\TEXT_FILES\\BITACORA.txt";
            //Instanciar el objeto
            File Archivo= new File(PATH);
            
            try{
             BufferedReader lector = new BufferedReader(new FileReader(PATH));
             String Linea= lector.readLine();
             while(Linea!=null){
                 Bitacora.add(Linea);
                 Linea=lector.readLine();                         
             }
             //Cerrar Objeto
             lector.close();         
            }catch(Exception E){
                
            }
            //Regresar Array
            return Bitacora;
        }
        
        //Filtrar Lista
        public List<String> filtrar_bitacora(List<String> Bitacora, String NumeroCuenta){
            List <String> Filtro = new ArrayList<>();
            
            //Filtrar por tipo de accion
            Filtro.add("RETIROS");
            for (String Filtro_E:Bitacora) {
                if (Filtro_E.contains(NumeroCuenta)&&Filtro_E.contains("retiro")) {
                    Filtro.add(Filtro_E);
                }
            }
            Filtro.add("DEPOSITOS");
            for (String Filtro_E:Bitacora ) {
                if (Filtro_E.contains(NumeroCuenta)&&Filtro_E.contains("deposito")) {
                    Filtro.add(Filtro_E);
                }
            }
            Filtro.add("TRANSFERENCIAS");
            for (String Filtro_E:Bitacora ) {
                if (Filtro_E.contains(NumeroCuenta)&&Filtro_E.contains("transfirio")) {
                    Filtro.add(Filtro_E);
                }
            }
            Filtro.add("CONSULTAS");
            for (String Filtro_E:Bitacora ) {
                if (Filtro_E.contains(NumeroCuenta)&&Filtro_E.contains("consulto")) {
                    Filtro.add(Filtro_E);
                }
            }
            return Filtro;
        }
}

package atm_proyect;

import LOGIC_CLASS.Cajero_Automatico;

public class ATM_PROYECT {

    //Crear objetos GLOBAL y UNICO;
    static GUI_LOGIN LOGIN = new GUI_LOGIN();
    static Cajero_Automatico CAJERO = new Cajero_Automatico();
    
    
    
    public static void main(String[] args) {
        //Creacion de DIR
        String PATH =System.getProperty("user.dir")+"\\src\\TEXT_FILES\\TXT_MATRIZ_FILAS.txt";
        
        /*
            Otro metodo para obtener la direccion
         CAJERO.INGRESAR_MATRIZ_FILAS("TXT_MATRIZ_FILAS.txt");
        */
        
        //Inicializar archivo
        CAJERO.INGRESAR_MATRIZ_FILAS(PATH);
        LOGIN.setVisible(true);
    }
    
}

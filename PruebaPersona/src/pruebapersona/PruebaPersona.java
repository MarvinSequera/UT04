/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebapersona;

/**
 *
 * @author marvin
 */
public class PruebaPersona {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Persona peleador1 = new Persona("Mike Tyson",20,1.78f,102 );
        Persona peleador2 = new Persona("Muhammad Ali", 20, 1.91f, 95);
        System.out.println("En una esquina tenemos a " + peleador1.consulta_Nombre() 
                + " con " + peleador1.consutla_Edad() + " años, con "  
                + peleador1.consulta_Altura() + " metros de altura y con " 
                + peleador1.consulta_Peso() + " kilos");
        System.out.println("Y en la otra esquina tenemos a " + peleador2.consulta_Nombre() 
                + " con " + peleador2.consutla_Edad() + " anos, con " 
                + peleador2.consulta_Altura() + " metros de altura y con " 
                + peleador2.consulta_Peso() + " kilos");
    }
    
}

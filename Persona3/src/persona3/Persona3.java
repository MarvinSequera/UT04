/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persona3;

/**
 *
 * @author marvin
 */
public class Persona3 {

    /**
     * @param args the command line arguments
     */
    String nombre = "Luisa Perez";
    int edad = 22;
    float altura = 1.70f;
    String consulta_Nombre(){
        return nombre;
    }
    int consulta_Edad(){
        return edad;
    }
    float consulta_Altura(){
        return altura;
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Persona3 concursante = new Persona3();
        System.out.println("A continuación entra el concursante " + concursante.consulta_Nombre() 
                + " con unos " + concursante.consulta_Edad() + " años de edad y "  
                + concursante.consulta_Altura() + " de altura");
    }
    
}

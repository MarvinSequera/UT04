/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persona;
import java.util.Scanner;
/**
 *
 * @author marvin
 */
public class Persona {

    /**
     * @param args the command line arguments
     */
    String nombre;
    int edad;
    float altura;
    public Persona() {}
    String consult_Nombre(){
        return nombre;
    }
    void cambia_Nombre(String nom){
        nombre = nom;
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Persona forastero = new Persona();
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Hola forastero, por favor introduce tu nombre");
        String nom = myScanner.nextLine();
        forastero.cambia_Nombre(nom);
        System.out.println("Bienvenido a nuestro pueblo " + forastero.consult_Nombre());
    }
    
}

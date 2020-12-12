/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persona2;
import java.util.Scanner;
/**
 *
 * @author marvin
 */
public class Persona2 {

    /**
     * @param args the command line arguments
     */
    String nombre;
    int edad;
    float altura;
    public Persona2() {}
    String consulta_Nombre(){
        return nombre;
    }
    int consulta_Edad() {
        return edad;
    }
    float consulta_Altura(){
        return altura;
    }
    void cambia_Nombre(String nom){
        nombre = nom;
    }
    void cambia_Edad(int nuevaEdad){
        edad = nuevaEdad;
    }
    void cambia_Altura(float altu){
        altura = altu;
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Persona2 forastero = new Persona2();
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Hola forastero, vamos a necesitar datos tuyos");
        System.out.println("Dame tu nombre");
        String nom = myScanner.nextLine();
        System.out.println("Dame tu edad");
        int nuevaEdad = myScanner.nextInt();
        System.out.println("y por ultimo dime tu altura por favor de la siguiente manera si mides 1 metro con 75 cm lo introduces así 1.75");
        float altu = myScanner.nextFloat();
        forastero.cambia_Nombre(nom);
        forastero.cambia_Edad(nuevaEdad);
        forastero.cambia_Altura(altu);
        System.out.println("Gracias por la información");
        System.out.println("Vamos a verificarla " + forastero.consulta_Nombre() + " tienes " + forastero.consulta_Edad() + " y mides " + forastero.consulta_Altura());
        System.out.println("Perfecto que tengas un buen dia.");
        // Un poco de historia no le hace daño a Nadie
    }
    
}

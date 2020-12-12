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
public class Persona {
    String nombre;
    int edad;
    float altura;
    int peso;
    
    public Persona(String nom, int eda, float altu, int pes){
        this.nombre = nom;
        this.edad = eda;
        this.altura = altu;
        this.peso = pes;
    }
    String consulta_Nombre(){
        return nombre;
    }
    int consutla_Edad(){
        return edad;
    }
    float consulta_Altura(){
        return altura;
    }
    int consulta_Peso(){
        return peso;
    }
}

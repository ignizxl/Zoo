/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.exerciciozoo;

/**
 *
 * @author João Igor
 */
public class Principal {

    public static void main(String[] args) {
        Zoologico zoo = new Zoologico(10);
        
        Cachorro cachorro = new Cachorro();
        Animal galinha = new Galinha();        
        Gato gato = new Gato();
        Animal papagaio = new Papagaio();      
        
        zoo.adicionar(cachorro);
        zoo.adicionar(galinha);
        zoo.adicionar(gato);
        zoo.adicionar(papagaio);
        
        zoo.animarBicharada();

        zoo.dormirAll();
        
    }
}


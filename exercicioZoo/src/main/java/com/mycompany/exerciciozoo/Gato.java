/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exerciciozoo;

/**
 *
 * @author João Igor
 */
public class Gato extends Animal {

    @Override
    public void andar() {
        System.out.println("Andando igual a um gato");
    }

    @Override
    public void emitirSom() {
        System.out.println("Miau, miau! Miau...");
                
    }    
    @Override
    public void dormir(){
      System.out.println("zzzz");
    }
}

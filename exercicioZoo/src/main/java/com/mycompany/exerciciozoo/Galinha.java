/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exerciciozoo;

/**
 *
 * @author João Igor
 */
public class Galinha extends Animal {
    
    @Override
    public void andar(){
        System.out.println("Algoritmo que imita uma galinha andando....");
    }
    
    
    @Override
    public void emitirSom(){
        System.out.println("Cocoricó....");
    }

    
    public void dormir(){
      System.out.println("zzzz");
    }
}

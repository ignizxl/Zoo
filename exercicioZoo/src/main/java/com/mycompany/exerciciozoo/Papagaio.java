/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exerciciozoo;

/**
 *
 * @author João Igor
 */
public class Papagaio extends Animal{
    
    @Override
    public void andar(){
        System.out.println("Andando igual a um papagaio!");
    }
    
    
    @Override
    public void emitirSom(){
        System.out.println("Som do papagaio falante...");
    }

    
    @Override
    public void dormir(){
      System.out.println("zzzz");
    }
}


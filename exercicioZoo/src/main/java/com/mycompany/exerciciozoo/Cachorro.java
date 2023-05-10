/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exerciciozoo;

/**
 *
 * @author João Igor
 */
public class Cachorro extends Animal{
    
    @Override
    public void andar() {
        System.out.println("Cachorro andando igual a cachorro");
    }

    @Override
    public void emitirSom() {
       System.out.println("Au, au! Au, au...");
    }

    @Override
    public void dormir(){
      System.out.println("zzzz");
    }
}


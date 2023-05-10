/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exerciciozoo;

/**
 *
 * @author João Igor
 */
import java.util.ArrayList;

public class Zoologico {
    private ArrayList<Animal> animais;
    private int capcidade;
            
    public Zoologico(int capacidade){
        this.animais = new ArrayList<>();
        this.capcidade=capacidade;
    }   
    
    public void adicionar(Animal animal){
        animais.add(animal);
    }
    
   

    public void dormirAll(){
      for(Animal animal:animais){
          animal.dormir();
      }
    }
    
    public  void animarBicharada(){
        for (Animal animal : animais){
            animal.andar(); // Cada um faz do seu jeito
            animal.emitirSom(); //Polimorfismo
        }
    }

}
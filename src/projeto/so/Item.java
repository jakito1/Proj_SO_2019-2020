/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto.so;

/**
 *
 * @author tidag
 */
public class Item {
    
    private int value;
    private int weight;
    
    public Item(int value, int weight){
        if(value > 0){
            this.value = value;
        }
        
        if(weight > 0){
            this.weight = weight;
        }
    }
    
    
    public int getValue(){
        return value;
    }
    
    public int getWeight(){
        return weight;
    }
    
}

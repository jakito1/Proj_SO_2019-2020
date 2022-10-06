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
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Knapsack sack = new Knapsack(3);

        System.out.println(sack);

    //Knapsack {level=0, items=[0, 0, 0]}
        System.out.println(sack.getChildren());

    //{Knapsack {level=1, items=[0, 0, 0]}, Knapsack {level=1, items=[1, 0, 0]}}
        sack.setItems(new int[] {1, 1, 0});
        sack.level = 2;
        System.out.println(sack.getChildren());
    
    //{Knapsack {level=3, items=[1, 1, 0]}, Knapsack {level=1, items=[1, 1, 1]}}
        sack.setItems(new int[] {1, 1, 0});
        sack.level = 3;
        System.out.println(sack.getChildren());
        
    }
    
}

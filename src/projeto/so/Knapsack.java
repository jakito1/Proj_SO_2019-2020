/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto.so;

import java.util.ArrayList;

/**
 *
 * @author tidag
 */
public class Knapsack {
    
    int[] items;
    int level;
    int n;

    public Knapsack(int n) {
        this.items = new int[n];
        this.level = 0;
        this.n = n;
    }

    // Updates the internal sack
    public void setItems(int[] items) {
        for (int i=0; i<n; i++) {
        this.items[i] = items[i];
    }
}
    
    // Returns a deep copy
    public Knapsack clone() {
        Knapsack sack = new Knapsack(n);
        sack.setItems(this.items);
        sack.level = this.level;
        return sack;
    }


    // Returns the knapsack children
    public ArrayList<Knapsack> getChildren() {
        ArrayList<Knapsack> res = new ArrayList<>();
        if (this.level < this.n) {
        
        // Child with 0
        Knapsack v0 = this.clone();
        v0.items[level] = 0;
        v0.level += 1;
        res.add(v0);
        
        // Child with 1
        Knapsack v1 = this.clone();
        v1.items[level] = 1;
        v1.level += 1;
        res.add(v1);
    }
        return res;
}

    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project2.holdem;

/**
 *
 * @author omara
 */
public class Results implements Comparable<Results>{
    int index;
    int rank;
    
    public Results(int rank, int index) {
        this.index = index;
        this.rank = rank;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }
    
    @Override
    public int compareTo(Results result) {
        int compareRank = result.getRank();
        return compareRank-this.rank;
    }
    
    @Override
    public String toString() {
        return " " + rank + "   " + index;
    }
}

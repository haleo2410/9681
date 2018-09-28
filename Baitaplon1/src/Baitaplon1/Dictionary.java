/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Baitaplon1;
import java.util.ArrayList;
/**
 *
 * @author Nguyen Ba Duc
 */
public class Dictionary {
    private  ArrayList<Word> word = new ArrayList<>();
    
    //public void Init(){
     //   word = new ArrayList<>();
    //}
    
    
    public ArrayList<Word> getWord() {
        return word;
    }

    public void setWord(ArrayList<Word> word) {
        this.word = word;
    }   
}

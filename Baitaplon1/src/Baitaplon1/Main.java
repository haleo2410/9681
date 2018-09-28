/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Baitaplon1;

/**
 *
 * @author Nguyen Ba Duc
 */
public class Main {
    public static void main(String[] args){
        Dictionary d = new Dictionary();
        //d.Init();
        DictionaryManagement dm = new DictionaryManagement();
        DictionaryCommandline dc = new DictionaryCommandline();
        dm.insertFromCommandline(d);
        //Word w = new Word("Dog","Cho");
        //w.setWord("Dog","Cho");
        //d.getWord().add(w);
        
        dc.showAllWords(d);
        System.out.printf("%n");
    }
}

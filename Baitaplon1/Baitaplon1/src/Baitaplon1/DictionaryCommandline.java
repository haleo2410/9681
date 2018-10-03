/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Baitaplon1;

import java.io.FileNotFoundException;
import java.io.IOException;

/**
 *
 * @author Nguyen Ba Duc
 */
public class DictionaryCommandline {
    
    
    
    public void dictionaryBasic(Dictionary d) throws IOException, FileNotFoundException, ClassNotFoundException{
        DictionaryManagement dm = new DictionaryManagement();
        dm.insertFromFile(d);
        //dm.insertFromCommandline(d);
        this.showAllWords(d);
    }
    
    public void showAllWords(Dictionary d){
        System.out.printf("%-5s|%-20s|%-20s","No","English","Vietnamese");
        System.out.printf("%n");
        for(int i = 0;i < d.getWord().size();i++){
        System.out.printf("%-5s|%-30s|%-30s",i+1,d.getWord().get(i).getWord_target(),d.getWord().get(i).getWord_explain());
        System.out.printf("%n");
        }
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Baitaplon1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
/**
 *
 * @author Nguyen Ba Duc
 */
public class DictionaryManagement {
    public void insertFromFile(Dictionary dictionary){                     
        try {
            File InFile = new File("eng_viet.txt");
            FileReader fr
             = new FileReader(InFile);
            try (BufferedReader reader = new BufferedReader(fr)) {
                    String line;        
                    int i;
                while(( i = reader.read()) != -1) {
                    String[] words = reader.readLine().split("\\t");
                    Word word = new Word(words[0],words[1]);
                    dictionary.getWord().add(word);
                }
                reader.close();

            }
        } catch (IOException e) {  
            System.out.println("File rong!");
        }

    }
    
    
    public void insertFromCommandline(Dictionary dictionary){
            Scanner input = new Scanner(System.in);
            int n = input.nextInt();
            for(int i = 0; i < n;i++){
                String s_wordtarget = input.next();
                String s_wordexplain = input.next();
                Word w = new Word(s_wordtarget,s_wordexplain);
                dictionary.getWord().add(w);
            }
    }
    
    public void dictionaryLookup(Dictionary dictionary){
        
    }

}

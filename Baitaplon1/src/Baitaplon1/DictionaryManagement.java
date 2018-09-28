/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Baitaplon1;
import java.util.Scanner;
/**
 *
 * @author Nguyen Ba Duc
 */
public class DictionaryManagement {
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
}

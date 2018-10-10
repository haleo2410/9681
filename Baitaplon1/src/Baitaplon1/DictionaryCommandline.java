/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Baitaplon1;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Nguyen Ba Duc
 */
public class DictionaryCommandline {
    
    Scanner input = new Scanner(System.in);
    
    // Hàm in ra tất cả các từ trong từ điển
    public void showAllWords(Dictionary d){
        System.out.printf("%-3s|%-30s|%-30s","No","English","Vietnamese");
        System.out.printf("%n");
        for(int i = 0;i < d.getWord().size();i++){
        System.out.printf("%-3s|%-30s|%-30s",i+1,d.getWord().get(i).getWord_target(),d.getWord().get(i).getWord_explain());
        System.out.printf("%n");
        }
    }
    
    // Hàm cơ bản thêm từ bằng cách nhập từ bàn phím và in kết quả ra màn hình
     public void dictionaryBasic(Dictionary d) throws IOException, FileNotFoundException, ClassNotFoundException{
        DictionaryManagement dm = new DictionaryManagement();
        dm.insertFromCommandline(d);
        this.showAllWords(d);
    }
    
     // Hàm đọc dữ liệu từ file và in ra tất cả các từ trong từ điển; Nhập từ cần tìm và in ra nghĩa của từ
    public void dictionaryAdvanced(Dictionary d) throws IOException, FileNotFoundException, ClassNotFoundException{
        DictionaryManagement dm = new DictionaryManagement();
        dm.insertFromFile(d);
        this.showAllWords(d);
        String a = input.nextLine();
        System.out.println(dm.dictionaryLookup(d,a));
        
    }
    
    // Hàm thêm một từ vào danh sách
    public void dictionaryAdd(Dictionary d) throws IOException{
        DictionaryManagement dm = new DictionaryManagement();
        dm.insertFromFile(d);
        this.showAllWords(d);
        dm.addWord(d);
        dm.insertFromFile(d);
        this.showAllWords(d);
    }
    
    public void delete(Dictionary d) throws IOException{
        DictionaryManagement dm = new DictionaryManagement();
        dm.insertFromFile(d);
        this.showAllWords(d);
        dm.deleteWord(d);
    }
    
}

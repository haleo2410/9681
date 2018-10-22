/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Baitaplon1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import static java.nio.charset.StandardCharsets.*;
import java.util.Scanner;
/**
 *
 * @author Nguyen Ba Duc
 */
public class DictionaryManagement {
    private Dictionary dict = new Dictionary();
    Scanner input = new Scanner(System.in);

    public Dictionary getDict() {
        return dict;
    }

    public void setDict(Dictionary dict) {
        this.dict = dict;
    }
    
    // Hàm nhập n từ mới và thêm vào danh sách (Nhập từ mới và nghĩa của nó)
    public void insertFromCommandline(){
            
            int n = input.nextInt();
            for(int i = 0; i < n;i++){
                System.out.println("Nhap tu can them: ");
                String s_wordtarget = input.nextLine();
                System.out.println("Nhap nghia tuong ung: ");
                String s_wordexplain = input.nextLine();
                Word w = new Word(s_wordtarget,s_wordexplain);
                dict.getWord().add(w);
            }
    }
    
    // Đọc dữ liệu từ file
    public void insertFromFile(){                     
        String line;
        try {
            File InFile = new File("dictionaries.txt");
            BufferedReader reader = new BufferedReader(new FileReader(InFile));
            if(!reader.ready()){
                throw new IOException();
            }             
            while((line = reader.readLine()) != null) {
                    String[] word = line.split("\t");
                    Word w = new Word(word[0],word[1]);
                    dict.getWord().add(w);
                }
           reader.close();
        } catch (Exception e) {  
            System.out.println(e);
        }

    }
    
     // Hàm xuất danh sách ra file
    public void dictionaryExportToFile() throws IOException{
        File outFile = new File("dictionaries.txt","utf-8");
        FileWriter fw = new FileWriter(outFile,false);
        try (BufferedWriter bfw = new BufferedWriter(fw)) {
            for (Word word : dict.getWord()) {
                {
                    bfw.write(word.toString() + "\r\n");
                }  
            }
        }
    }
    
    
    
    // Tìm một từ có trong từ điển và trả về nghĩa của nó
    public String dictionaryLookup(String word_lookup){
       for(int i = 0; i < dict.getWord().size(); i++){
           if(dict.getWord().get(i).getWord_target().equals(word_lookup)) {
              return dict.getWord().get(i).getWord_explain();
            }
        }
        return "Khong tim thay!";
    }
    
    // Thêm một từ nhập vào từ bàn phím (thêm vào file)
    public void addWord() throws IOException{
        System.out.println("Nhap tu can them: ");
        String s_wordtarget = input.nextLine();
        System.out.println("Nhap nghia tuong ung: ");
        String s_wordexplain = input.nextLine();
        Word w = new Word(s_wordtarget,s_wordexplain);
        File outFile = new File("dictionaries.txt");
        FileWriter fw = new FileWriter(outFile,true);
        try (BufferedWriter bfw = new BufferedWriter(fw)) {
            bfw.write ("\r\n" + w.toString());
            bfw.close();
        }    
    }
    
    // Xóa một từ khỏi danh sách
    public void deleteWord() throws IOException {
        System.out.println("Nhap tu can xoa: ");
        String s = input.nextLine();
        for(int i = 0;i < dict.getWord().size();i++){
            if(s.equals(dict.getWord().get(i).getWord_target())){
                dict.getWord().remove(i);
            }
        }
        this.dictionaryExportToFile();
    }
    
    
     public void sortWord(){
        for (int i = 0;i < dict.getWord().size();i++){
            for(int j = i+1;j < dict.getWord().size();j++){
                if(dict.getWord().get(j).getWord_target().compareTo(dict.getWord().get(i).getWord_target()) < 0){
                    Word temp = dict.getWord().get(i);
                    dict.getWord().set(i,dict.getWord().get(j));
                    dict.getWord().set(j,temp);
                }
            }
        }
    }
     
    
}

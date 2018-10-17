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
import java.util.Scanner;
/**
 *
 * @author Nguyen Ba Duc
 */
public class DictionaryManagement {
    
    Scanner input = new Scanner(System.in);
    
    // Hàm nhập n từ mới và thêm vào danh sách (Nhập từ mới và nghĩa của nó)
    public void insertFromCommandline(Dictionary dictionary){
            
            int n = input.nextInt();
            for(int i = 0; i < n;i++){
                System.out.println("Nhap tu can them: ");
                String s_wordtarget = input.nextLine();
                System.out.println("Nhap nghia tuong ung: ");
                String s_wordexplain = input.nextLine();
                Word w = new Word(s_wordtarget,s_wordexplain);
                dictionary.getWord().add(w);
            }
    }
    
    // Đọc dữ liệu từ file
    public void insertFromFile(Dictionary dictionary){                     
        try {
            File InFile = new File("dictionaries.txt");
            FileReader fr
             = new FileReader(InFile);
            try (BufferedReader reader = new BufferedReader(fr)) {
                    String line;        
                while((line = reader.readLine()) != null) {
                    String[] words = line.split("\\t");
                    Word word = new Word(words[0],words[1]);
                    dictionary.getWord().add(word);
                }
                reader.close();

            }
        } catch (IOException e) {  
            System.out.println("File rong!");
        }

    }
    
     // Hàm xuất danh sách ra file
    public void dictionaryExportToFile(Dictionary dictionary) throws IOException{
        File outFile = new File("dictionaries.txt");
        FileWriter fw = new FileWriter(outFile,false);
        try (BufferedWriter bfw = new BufferedWriter(fw)) {
            for (Word word : dictionary.getWord()) {
                {
                    bfw.write(word.toString() + "\r\n");
                }  
            }
        }
    }
    
    
    
    // Tìm một từ có trong từ điển và trả về nghĩa của nó
    public String dictionaryLookup(Dictionary dictionary,String word_lookup){
       for(int i = 0; i < dictionary.getWord().size(); i++){
           if(dictionary.getWord().get(i).getWord_target().equals(word_lookup)) {
              return dictionary.getWord().get(i).getWord_explain();
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
    public void deleteWord(Dictionary dictionary) throws IOException {
        System.out.println("Nhap tu can xoa: ");
        String s = input.nextLine();
        for(int i = 0;i < dictionary.getWord().size();i++){
            if(s.equals(dictionary.getWord().get(i).getWord_target())){
                dictionary.getWord().remove(i);
            }
        }
        this.dictionaryExportToFile(dictionary);
    }
    
    
     public void sortWord(Dictionary dictionary){
        for (int i = 0;i < dictionary.getWord().size();i++){
            for(int j = i+1;j < dictionary.getWord().size();j++){
                if(dictionary.getWord().get(j).getWord_target().compareTo(dictionary.getWord().get(i).getWord_target()) < 0){
                    Word temp = dictionary.getWord().get(i);
                    dictionary.getWord().set(i,dictionary.getWord().get(j));
                    dictionary.getWord().set(j,temp);
                }
            }
        }
    }
     
    
}

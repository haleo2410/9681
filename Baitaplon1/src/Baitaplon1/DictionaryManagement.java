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
    // Đọc dữ liệu từ file
    public void insertFromFile(Dictionary dictionary){                     
        try {
            File InFile = new File("test.txt");
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
    
    // Hàm nhập n từ mới và thêm vào danh sách (Nhập từ mới và nghĩa của nó)
    public void insertFromCommandline(Dictionary dictionary){
            
            int n = input.nextInt();
            for(int i = 0; i < n;i++){
                String s_wordtarget = input.next();
                String s_wordexplain = input.next();
                Word w = new Word(s_wordtarget,s_wordexplain);
                dictionary.getWord().add(w);
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
    public void addWord(Dictionary dictionary) throws IOException{
        String s_wordtarget = input.nextLine();
        String s_wordexplain = input.nextLine();
        Word w = new Word(s_wordtarget,s_wordexplain);
        File outFile = new File("test.txt");
        FileWriter fw = new FileWriter(outFile,true);
        try (BufferedWriter bfw = new BufferedWriter(fw)) {
            bfw.write("\r\n" + w.toString());
            bfw.close();
        }    
    }
    
    
    // Xóa một từ khỏi danh sách
    public void deleteWord(Dictionary dictionary) throws IOException{
        String s = input.nextLine();
        for(int i = 0;i < dictionary.getWord().size();i++){
            if(s.equals(dictionary.getWord().get(i).getWord_target())){
                dictionary.getWord().remove(i);
            }
        }
        File outFile = new File("test.txt");
        FileWriter fw = new FileWriter(outFile,false);
        try (BufferedWriter bfw = new BufferedWriter(fw)) {
            for (Word word : dictionary.getWord()) {
                {
                    bfw.write(word.toString() + "\r\n");
                }  
            }
        }
    }   
}

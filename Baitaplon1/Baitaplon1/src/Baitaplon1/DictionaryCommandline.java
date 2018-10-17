package Baitaplon1;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

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
        this.showAllWords(d);
    }
    
     // Hàm đọc dữ liệu từ file và in ra tất cả các từ trong từ điển; Nhập từ cần tìm và in ra nghĩa của từ
    public void dictionaryAdvanced(Dictionary d) throws IOException, FileNotFoundException, ClassNotFoundException{
        DictionaryManagement dm = new DictionaryManagement();
        dm.sortWord(d);
        this.showAllWords(d);
        System.out.println("Nhap tu can tim kiem: ");
        String a = input.nextLine();
        System.out.println(dm.dictionaryLookup(d,a));
    }
    
    // Hàm thêm một từ vào danh sách
    public void dictionaryAdd(Dictionary d) throws IOException{
        DictionaryManagement dm = new DictionaryManagement();
        dm.sortWord(d);
        this.showAllWords(d);
        dm.addWord();
    }
    
    // Hàm xóa từ khỏi danh sách
    public void delete(Dictionary d) throws IOException{
        DictionaryManagement dm = new DictionaryManagement();
        dm.sortWord(d);
        this.showAllWords(d);
        dm.deleteWord(d);
    }
    
   
    /*public void dictionarySearcher(Dictionary dictionary){
        Dictionary d = new Dictionary(); 
        
        while(true){
            char a = input.next().charAt(0);
            if(a == '\0'){
                break;
            }
            else{
                for(int i = 0; i < dictionary.getWord().size();i++){
                    if(dictionary.getWord().get(i).getWord_target().charAt(i) == a){
                        d.getWord().add(dictionary.getWord().get(i));
                    }
                }
            }
        }
    }*/
}

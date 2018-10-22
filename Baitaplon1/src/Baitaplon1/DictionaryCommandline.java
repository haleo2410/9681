package Baitaplon1;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class DictionaryCommandline {
    private DictionaryManagement dm = new DictionaryManagement();
    
    Scanner input = new Scanner(System.in);
    
    // Hàm in ra tất cả các từ trong từ điển
    public void showAllWords(){
        Dictionary dict = dm.getDict();
        System.out.printf("%-3s|%-30s|%-30s","No","English","Vietnamese");
        System.out.println();
        for(int i = 0;i < dict.getWord().size();i++){
        System.out.printf("%-3s|%-30s|%-30s",i+1,dict.getWord().get(i).getWord_target(),dict.getWord().get(i).getWord_explain());
        System.out.println();
        }
    }
    
    // Hàm cơ bản thêm từ bằng cách nhập từ bàn phím và in kết quả ra màn hình
     public void dictionaryBasic() throws IOException, FileNotFoundException, ClassNotFoundException{
        dm.insertFromFile();
        this.showAllWords();
    }
    
     // Hàm đọc dữ liệu từ file và in ra tất cả các từ trong từ điển; Nhập từ cần tìm và in ra nghĩa của từ
    public void dictionaryAdvanced() throws IOException, FileNotFoundException, ClassNotFoundException{
        dm.insertFromFile();
        dm.sortWord();
        this.showAllWords();
        System.out.println("Nhap tu can tim kiem: ");
        String a = input.nextLine();
        System.out.println(dm.dictionaryLookup(a));
    }
    
    // Hàm thêm một từ vào danh sách
    public void dictionaryAdd() throws IOException{
        dm.insertFromFile();
        dm.sortWord();
        this.showAllWords();
        dm.addWord();
    }
    
    // Hàm xóa từ khỏi danh sách
    public void delete() throws IOException{
        dm.insertFromFile();
        dm.sortWord();
        this.showAllWords();
        dm.deleteWord();
    }
    
}

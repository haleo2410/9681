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
public class Main {
    public static void main(String[] args) throws IOException, FileNotFoundException, ClassNotFoundException{
        DictionaryCommandline dc = new DictionaryCommandline();
        //dc.showAllWords();
      
        dc.dictionaryAdvanced();
    }
}
//        System.out.println("-----------------");
//        System.out.println("Dictionary");
//        System.out.println("1. Hien thi tu dien");
//        System.out.println("2. Tim tu");
//        System.out.println("3. Them tu");
//        System.out.println("4. Xoa tu");
//        System.out.println("5. Thoat");
//        System.out.println("----------------");
//        
//        int a;
//                
//        Scanner input = new Scanner(System.in);
//        System.out.println("Moi ban nhap lenh: ");
//        a = input.nextInt();
//            switch(a){
//                case 1:
//                    dc.showAllWords(d);
//                    break;
//                case 2:
//                    dc.dictionaryAdvanced(d);
//                    break;
//                case 3:
//                    dc.dictionaryAdd(d);
//                    break;
//                case 4:
//                    dc.delete(d);
//                    break;
//                case 5:
//                    break;
//                case 6:
//                    System.out.printf("Xin loi khong co lenh nay!");
//                    break;
//                            
//        }
//        
//        
//       
//        
//        //dc.dictionarySearcher(d);
//    }


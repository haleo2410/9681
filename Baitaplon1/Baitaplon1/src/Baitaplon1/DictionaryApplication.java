/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Baitaplon1;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
/**
 *
 * @author Nguyen Ba Duc
 */
public class DictionaryApplication {
        public static void main(String[] args){
          SwingUtilities.invokeLater(new Runnable(){
            
              public void run(){
                JFrame giaodien = new JFrame("DICTIONARY");
                giaodien.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                giaodien.setVisible(true);
                giaodien.setSize(800,600);
            }
        
        });
    }   
}

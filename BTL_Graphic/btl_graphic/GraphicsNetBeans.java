/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package btl_graphic;
/**
 *
 * @author Ha
 */

import com.sun.glass.events.KeyEvent;
import com.sun.speech.freetts.Voice;
import com.sun.speech.freetts.VoiceManager;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

import java.io.PrintWriter;
import javax.swing.JList;
import javax.swing.ListSelectionModel;


public class GraphicsNetBeans extends javax.swing.JFrame {
    public GraphicsNetBeans() {
      
        initComponents();
        
       
     
    }
    
    /*
    private void bindData(){
        //foreach with functinal operation
        readFile().stream().forEach((Object words) -> {
            listmodel.addElement(words);
        });
        ListDS.setModel(listmodel);
        ListDS.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
    } 
    */
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ManHinh = new javax.swing.JPanel(){
            ImageIcon icon = new ImageIcon("C:\\Users\\Ha\\Documents\\GitHub\\No_Name_OOP\\Baitaplon1\\image\\coverimage.jpg");

            public void paintComponent(Graphics g){
                Dimension d = getSize();
                g.drawImage(icon.getImage(), 0, 0, d.width, d.height, null);
                setOpaque(false);
                super.paintComponent(g);
            }
        };
        DICTIONARY = new javax.swing.JLabel();
        TimKiem = new javax.swing.JButton();
        DELETE = new javax.swing.JButton();
        ADD = new javax.swing.JButton();
        EXIT = new javax.swing.JButton();
        RESET = new javax.swing.JButton();
        REPAIR = new javax.swing.JButton();
        AmThanh = new javax.swing.JButton();
        VietEng = new javax.swing.JRadioButton();
        InputSearch = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        ListDS = new javax.swing.JList<>();
        JMenuBar = new javax.swing.JMenuBar();
        File = new javax.swing.JMenu();
        Add = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        Edit = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("DICTIONARY");
        setBackground(new java.awt.Color(153, 0, 153));
        setName("DICTIONARY"); // NOI18N

        ManHinh.setBackground(new java.awt.Color(204, 204, 255));

        DICTIONARY.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        DICTIONARY.setForeground(new java.awt.Color(51, 51, 0));
        DICTIONARY.setText("DICTIONARY");

        TimKiem.setBackground(new java.awt.Color(255, 255, 255));
        TimKiem.setIcon(new javax.swing.ImageIcon("C:\\Users\\Ha\\Documents\\GitHub\\No_Name_OOP\\Baitaplon1\\image\\search.jpg")); // NOI18N
        TimKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TimKiemActionPerformed(evt);
            }
        });

        DELETE.setBackground(new java.awt.Color(255, 255, 255));
        DELETE.setFont(new java.awt.Font("Times New Roman", 1, 13)); // NOI18N
        DELETE.setForeground(new java.awt.Color(51, 0, 51));
        DELETE.setIcon(new javax.swing.ImageIcon("C:\\Users\\Ha\\Documents\\GitHub\\No_Name_OOP\\Baitaplon1\\image\\delete.png")); // NOI18N
        DELETE.setText("DELETE");
        DELETE.setToolTipText("Click vào nút này hoặc ấn Alt+Delete để Xóa từ");
        DELETE.setMnemonic(KeyEvent.VK_DELETE);
        DELETE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DELETEActionPerformed(evt);
            }
        });

        ADD.setBackground(new java.awt.Color(255, 255, 255));
        ADD.setFont(new java.awt.Font("Times New Roman", 1, 13)); // NOI18N
        ADD.setForeground(new java.awt.Color(51, 0, 51));
        ADD.setIcon(new javax.swing.ImageIcon("C:\\Users\\Ha\\Documents\\GitHub\\No_Name_OOP\\Baitaplon1\\image\\add.jpg")); // NOI18N
        ADD.setText(" ADD");
        ADD.setToolTipText("Click vào nút này hoặc nhấn Alt+A để Thêm Từ Mới");
        ADD.setMnemonic(KeyEvent.VK_A);
        ADD.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ADDMouseClicked(evt);
            }
        });
        ADD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ADDActionPerformed(evt);
            }
        });

        EXIT.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        EXIT.setForeground(new java.awt.Color(51, 0, 51));
        EXIT.setToolTipText("Click vào nút này hoặc ấn Alt+End để thoát khỏi chương trình");
        EXIT.setIcon(new javax.swing.ImageIcon("C:\\Users\\Ha\\Documents\\GitHub\\No_Name_OOP\\Baitaplon1\\image\\exit.png")); // NOI18N
        EXIT.setMnemonic(KeyEvent.VK_END);
        EXIT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EXITActionPerformed(evt);
            }
        });

        RESET.setBackground(new java.awt.Color(255, 255, 255));
        RESET.setFont(new java.awt.Font("Times New Roman", 1, 13)); // NOI18N
        RESET.setForeground(new java.awt.Color(51, 0, 51));
        RESET.setIcon(new javax.swing.ImageIcon("C:\\Users\\Ha\\Documents\\GitHub\\No_Name_OOP\\Baitaplon1\\image\\reset.png")); // NOI18N
        RESET.setText(" RESET");
        RESET.setToolTipText("Click vào nút này hoặc ấn Alt+F5 để làm mới");
        RESET.setMnemonic(KeyEvent.VK_F5);
        RESET.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RESETActionPerformed(evt);
            }
        });

        REPAIR.setBackground(new java.awt.Color(255, 255, 255));
        REPAIR.setFont(new java.awt.Font("Times New Roman", 1, 13)); // NOI18N
        REPAIR.setForeground(new java.awt.Color(51, 0, 51));
        REPAIR.setIcon(new javax.swing.ImageIcon("C:\\Users\\Ha\\Documents\\GitHub\\No_Name_OOP\\Baitaplon1\\image\\repair.png")); // NOI18N
        REPAIR.setText(" REPAIR");
        REPAIR.setToolTipText("Click vào nút này hoặc ấn Alt+R để Sửa từ");
        REPAIR.setMnemonic(KeyEvent.VK_R);
        REPAIR.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                REPAIRMouseClicked(evt);
            }
        });
        REPAIR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                REPAIRActionPerformed(evt);
            }
        });

        AmThanh.setIcon(new javax.swing.ImageIcon("C:\\Users\\Ha\\Documents\\GitHub\\No_Name_OOP\\Baitaplon1\\image\\volum.png")); // NOI18N
        AmThanh.setToolTipText("Click vào nút này để Nghe");
        AmThanh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AmThanhActionPerformed(evt);
            }
        });

        VietEng.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        VietEng.setForeground(new java.awt.Color(51, 51, 0));
        VietEng.setText("Việt - Anh");
        VietEng.setToolTipText("Click nút này để chuyển từ Việt - Anh");
        VietEng.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VietEngActionPerformed(evt);
            }
        });

        InputSearch.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        InputSearch.setForeground(new java.awt.Color(153, 153, 153));
        InputSearch.setText("Tra từ Anh-Việt...");
        InputSearch.setToolTipText("Click để Nhập từ cần tra ");
        InputSearch.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        InputSearch.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                InputSearchFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                InputSearchFocusLost(evt);
            }
        });
        InputSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InputSearchActionPerformed(evt);
            }
        });
        InputSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                InputSearchKeyReleased(evt);
            }
        });

        jTextArea1.setBackground(new java.awt.Color(255, 255, 204));
        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        ListDS.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        ListDS.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                ListDSAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        ListDS.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ListDSMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(ListDS);

        javax.swing.GroupLayout ManHinhLayout = new javax.swing.GroupLayout(ManHinh);
        ManHinh.setLayout(ManHinhLayout);
        ManHinhLayout.setHorizontalGroup(
            ManHinhLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ManHinhLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ManHinhLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 247, Short.MAX_VALUE)
                    .addComponent(InputSearch))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ManHinhLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ManHinhLayout.createSequentialGroup()
                        .addComponent(DICTIONARY, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(ManHinhLayout.createSequentialGroup()
                        .addGroup(ManHinhLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(ManHinhLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(DELETE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(RESET, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(REPAIR, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(ADD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(ManHinhLayout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addComponent(EXIT, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(TimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(ManHinhLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addGroup(ManHinhLayout.createSequentialGroup()
                                .addComponent(VietEng, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 145, Short.MAX_VALUE)
                                .addComponent(AmThanh, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))))))
        );
        ManHinhLayout.setVerticalGroup(
            ManHinhLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ManHinhLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(DICTIONARY, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(ManHinhLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(ManHinhLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(ManHinhLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(TimKiem)
                            .addComponent(InputSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(AmThanh, javax.swing.GroupLayout.Alignment.TRAILING))
                    .addComponent(VietEng))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(ManHinhLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(ManHinhLayout.createSequentialGroup()
                        .addComponent(RESET, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(REPAIR, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(DELETE, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(ADD)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 261, Short.MAX_VALUE)
                        .addComponent(EXIT, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2)
                    .addComponent(jScrollPane1))
                .addGap(59, 59, 59))
        );

        File.setText("File");
        File.setMnemonic(KeyEvent.VK_F);

        Add.setText("Add");
        ADD.setMnemonic(KeyEvent.VK_A);
        File.add(Add);

        jMenuItem1.setText("New");
        File.add(jMenuItem1);

        JMenuBar.add(File);

        Edit.setText("Help");
        JMenuBar.add(Edit);

        setJMenuBar(JMenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ManHinh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ManHinh, javax.swing.GroupLayout.PREFERRED_SIZE, 616, Short.MAX_VALUE)
        );

        ManHinh.getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void DELETEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DELETEActionPerformed
        
        // TODO add your handling code here:
    }//GEN-LAST:event_DELETEActionPerformed

    private void ADDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ADDActionPerformed
     /*
     
// add word to listds
String add = InputSearch.getText();
    if(add.equals("")||add.equalsIgnoreCase("Type here")){
    InputSearch.setText("Type here");
    }
    else {
    listmodel.addElemenListDS.setModel(listmodel);
    InputSearch.setText("");
    }

    //  writing to text file
    int addfile = ListDS.getModel().getSize();
    PrintWriter writer = null;
    try {
    writer = new PrintWriter("C:\\Users\\Ha\\Documents\\GitHub\\ListWord.txt");
    writer.println(addfile);t(add);
    
    for(int i=0; i< addfile; i++) {
    writer.println(ListDS.getModel().getElementAt(i));
    }


    }catch(Exception e) {
    System.out.println(""+e);
    }finally{
    writer.close();
}

// Thêm một từ nhập vào từ bàn phím (thêm vào file)
        */
   
    }//GEN-LAST:event_ADDActionPerformed

    private void REPAIRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_REPAIRActionPerformed
        
       // TODO add your handling code here:
    }//GEN-LAST:event_REPAIRActionPerformed

    private void EXITActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EXITActionPerformed
        Icon icon = null;
        int exit =  JOptionPane.showConfirmDialog(rootPane, "bạn có muốn thoát không? ","Thông báo!",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE, icon);
        if(exit == JOptionPane.YES_OPTION){  
            System.exit(0);
        }
    }//GEN-LAST:event_EXITActionPerformed

    private void RESETActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RESETActionPerformed
        
        // TODO add your handling code here:
    }//GEN-LAST:event_RESETActionPerformed

    private void VietEngActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VietEngActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_VietEngActionPerformed

    private void TimKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TimKiemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TimKiemActionPerformed

    private void InputSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InputSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_InputSearchActionPerformed

    private void InputSearchFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_InputSearchFocusGained
        if(InputSearch.getText().equals("Tra từ Anh-Việt..."))
          {
             InputSearch.setText("");
         }
         InputSearch.setForeground(Color.black);
        
    }//GEN-LAST:event_InputSearchFocusGained

    private void InputSearchFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_InputSearchFocusLost
         if(InputSearch.getText().equals(""))
         {
             InputSearch.setText("Tra từ Anh-Việt...");
         }
         
         InputSearch.setForeground(new Color(153,153,153));
        
    }//GEN-LAST:event_InputSearchFocusLost

    private void REPAIRMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_REPAIRMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_REPAIRMouseClicked

    private void ADDMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ADDMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_ADDMouseClicked

    private void ListDSAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_ListDSAncestorAdded

    // TODO add your handling code here:
    }//GEN-LAST:event_ListDSAncestorAdded

    private void InputSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_InputSearchKeyReleased
   
        
    }//GEN-LAST:event_InputSearchKeyReleased

    private void ListDSMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ListDSMouseClicked
        
        // TODO add your handling code here:
    }//GEN-LAST:event_ListDSMouseClicked

    private void AmThanhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AmThanhActionPerformed
       Voice voice ;
        VoiceManager vm = VoiceManager.getInstance();
        voice = vm.getVoice("kevin16");
        voice.allocate();
        voice.speak(InputSearch.getText());
        
    }//GEN-LAST:event_AmThanhActionPerformed


    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Graphics.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        
        //</editor-fold>
        //</editor-fold>
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new GraphicsNetBeans().setVisible(true);
        });
        
    }
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ADD;
    private javax.swing.JMenuItem Add;
    private javax.swing.JButton AmThanh;
    private javax.swing.JButton DELETE;
    private javax.swing.JLabel DICTIONARY;
    private javax.swing.JButton EXIT;
    private javax.swing.JMenu Edit;
    private javax.swing.JMenu File;
    private javax.swing.JTextField InputSearch;
    private javax.swing.JMenuBar JMenuBar;
    private javax.swing.JList<String> ListDS;
    private javax.swing.JPanel ManHinh;
    private javax.swing.JButton REPAIR;
    private javax.swing.JButton RESET;
    private javax.swing.JButton TimKiem;
    private javax.swing.JRadioButton VietEng;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables

}

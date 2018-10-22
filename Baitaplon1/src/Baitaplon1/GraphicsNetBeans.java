/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Baitaplon1;
/**
 *
 * @author Ha
 */

import com.sun.glass.events.KeyEvent;
import com.sun.xml.internal.ws.api.streaming.XMLStreamReaderFactory;
//import com.sun.speech.freetts.Voice;
//import com.sun.speech.freetts.VoiceManager;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.io.IOException;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import java.util.Scanner;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.ListSelectionModel;
import javax.swing.text.Position;


public class GraphicsNetBeans extends javax.swing.JFrame {
    public GraphicsNetBeans() {
      
        initComponents();
    }
    
    public GraphicsNetBeans(String wordtarget,String wordexplain){
        initComponents();
        if(wordtarget.equals("") || wordexplain.equals("")){
            new thongbao("Vui lòng nhập đầy đủ thông tin vào 2 bảng.").setVisible(true);
        }
        else{
            for(int i = 0;i < model.size();i++){
                if(wordtarget.equals(model.get(i).toString())){
                    new thongbao("Từ đã có trong từ điển vui lòng nhập lại.").setVisible(true);
                    break;
                }
                
            }
            model.addElement(wordtarget);
            model1.addElement(wordexplain);

            this.setVisible(true);
        }
        
      
    }
   
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
        LISTENOutputSearch = new javax.swing.JButton();
        VietEng = new javax.swing.JRadioButton();
        InputSearch = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        ListDS = new javax.swing.JList<>();
        LISTENSearch = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        JMenuBar = new javax.swing.JMenuBar();
        File = new javax.swing.JMenu();
        Add = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        Edit = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("DICTIONARY");
        setBackground(new java.awt.Color(153, 0, 153));
        setName("DICTIONARY"); // NOI18N

        setLocationRelativeTo(null);
        ManHinh.setBackground(new java.awt.Color(204, 204, 255));

        DICTIONARY.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        DICTIONARY.setForeground(new java.awt.Color(51, 51, 0));
        DICTIONARY.setText("DICTIONARY");

        TimKiem.setBackground(new java.awt.Color(255, 255, 255));
        TimKiem.setFont(new java.awt.Font("Times New Roman", 1, 13)); // NOI18N
        TimKiem.setText("Search");
        TimKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TimKiemActionPerformed(evt);
            }
        });

        DELETE.setBackground(new java.awt.Color(255, 255, 255));
        DELETE.setFont(new java.awt.Font("Times New Roman", 1, 13)); // NOI18N
        DELETE.setForeground(new java.awt.Color(51, 0, 51));
        DELETE.setText("DELETE");
        DELETE.setToolTipText("Click vào nút này hoặc ấn Alt+Delete để Xóa từ");
        DELETE.setMnemonic(KeyEvent.VK_DELETE);
        DELETE.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DELETEMouseClicked(evt);
            }
        });
        DELETE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DELETEActionPerformed(evt);
            }
        });

        ADD.setBackground(new java.awt.Color(255, 255, 255));
        ADD.setFont(new java.awt.Font("Times New Roman", 1, 13)); // NOI18N
        ADD.setForeground(new java.awt.Color(51, 0, 51));
        ADD.setMnemonic('A');
        ADD.setText(" ADD");
        ADD.setToolTipText("Click vào nút này hoặc nhấn Alt+A để Thêm Từ Mới");
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
        EXIT.setMnemonic(KeyEvent.VK_END);
        EXIT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EXITActionPerformed(evt);
            }
        });

        RESET.setBackground(new java.awt.Color(255, 255, 255));
        RESET.setFont(new java.awt.Font("Times New Roman", 1, 13)); // NOI18N
        RESET.setForeground(new java.awt.Color(51, 0, 51));
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

        LISTENOutputSearch.setBackground(new java.awt.Color(255, 255, 255));
        LISTENOutputSearch.setToolTipText("Nghe");
        LISTENOutputSearch.setToolTipText("Click vào nút này để Nghe");
        LISTENOutputSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LISTENOutputSearchActionPerformed(evt);
            }
        });

        VietEng.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        VietEng.setForeground(new java.awt.Color(51, 51, 0));
        VietEng.setText("Vietnamese - English");
        VietEng.setToolTipText("Click nút này để chuyển từ Việt - Anh");
        VietEng.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VietEngActionPerformed(evt);
            }
        });

        InputSearch.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        InputSearch.setForeground(new java.awt.Color(153, 153, 153));
        InputSearch.setText(" Tra từ Anh-Việt...");
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

        LISTENSearch.setBackground(new java.awt.Color(255, 255, 255));
        LISTENSearch.setFont(new java.awt.Font("Times New Roman", 1, 13)); // NOI18N
        LISTENSearch.setMnemonic('L');
        LISTENSearch.setText("LISTEN");
        LISTENSearch.setToolTipText("Nghe");
        LISTENSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LISTENSearchActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 2, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 0, 204));
        jLabel1.setText("By No_Name Team");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane3.setViewportView(jTextArea1);

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
                .addGroup(ManHinhLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, ManHinhLayout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(EXIT, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(TimKiem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(LISTENSearch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ADD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(RESET, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(REPAIR, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(DELETE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ManHinhLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ManHinhLayout.createSequentialGroup()
                        .addComponent(VietEng, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(LISTENOutputSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(ManHinhLayout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 446, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(ManHinhLayout.createSequentialGroup()
                .addGap(223, 223, 223)
                .addComponent(DICTIONARY, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(258, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ManHinhLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(45, 45, 45))
        );
        ManHinhLayout.setVerticalGroup(
            ManHinhLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ManHinhLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(DICTIONARY, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(ManHinhLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ManHinhLayout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(ManHinhLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TimKiem)
                            .addComponent(InputSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(ManHinhLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1)
                        .addGap(3, 3, 3)
                        .addGroup(ManHinhLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(LISTENOutputSearch)
                            .addComponent(VietEng))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ManHinhLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ManHinhLayout.createSequentialGroup()
                        .addComponent(LISTENSearch)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ADD)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(RESET, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(DELETE, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(REPAIR, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 217, Short.MAX_VALUE)
                        .addComponent(EXIT, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2)
                    .addComponent(jScrollPane3))
                .addContainerGap())
        );

        File.setText("File");
        File.setMnemonic(KeyEvent.VK_F);

        Add.setMnemonic('A');
        Add.setText("Add");
        ADD.setMnemonic(KeyEvent.VK_A);
        Add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddActionPerformed(evt);
            }
        });
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
            .addComponent(ManHinh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        ManHinh.getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void DELETEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DELETEActionPerformed
        int delete =  JOptionPane.showConfirmDialog(rootPane, "Bạn có chắc muốn xóa không? ","Thông báo!",JOptionPane.YES_NO_CANCEL_OPTION);
        if(delete == JOptionPane.YES_OPTION){
           int index = ListDS.getSelectedIndex(); 
           model.remove(index);
           model1.remove(index);
        }
        
    }//GEN-LAST:event_DELETEActionPerformed

    private void ADDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ADDActionPerformed
        new add_frame().setVisible(true);
        this.setVisible(false);
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
        for(int i = 0;i < model.size();i++){
            if(InputSearch.getText().equals(model.get(i).toString())){
                jTextArea1.setText(model1.get(i).toString());
                ListDS.setSelectedIndex(i);
                break;
            }
            if(i == model.size()-1){
                jTextArea1.setText("Không tìm thấy từ bạn cần tìm!\nVui lòng nhập lại...");
            }

        }
        
    }//GEN-LAST:event_TimKiemActionPerformed

    private void InputSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InputSearchActionPerformed

            String a = InputSearch.getText();
        
        //InputSearch.selectAll();
        
        
        // TODO add your handling code here:
    }//GEN-LAST:event_InputSearchActionPerformed

    private void InputSearchFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_InputSearchFocusGained
        if(InputSearch.getText().equals(" Tra từ Anh-Việt..."))
        {
             InputSearch.setText(" ");
        }
         InputSearch.setForeground(Color.black);
        
    }//GEN-LAST:event_InputSearchFocusGained

    private void InputSearchFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_InputSearchFocusLost
         if(InputSearch.getText().equals(""))
         {
             InputSearch.setText(" Tra từ Anh-Việt...");
         }
         
         InputSearch.setForeground(new Color(153,153,153));
        
    }//GEN-LAST:event_InputSearchFocusLost

    private void REPAIRMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_REPAIRMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_REPAIRMouseClicked

    private void ADDMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ADDMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_ADDMouseClicked
    DefaultListModel model = new DefaultListModel();
    DefaultListModel model1 = new DefaultListModel();
    private void ListDSAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_ListDSAncestorAdded

        try {
            Dictionary d = this.addFile();
            for(int i = 0;i < d.getWord().size();i++){
               model.addElement(d.getWord().get(i).getWord_target());
               model1.addElement(d.getWord().get(i).getWord_explain());
           }
           ListDS.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
           ListDS.setModel(model);
           ListDS.setSelectedIndex(0);
        } catch (IOException ex) {
            Logger.getLogger(GraphicsNetBeans.class.getName()).log(Level.SEVERE, null, ex);
        }
               // TODO add your handling code here:
    }//GEN-LAST:event_ListDSAncestorAdded

    private void InputSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_InputSearchKeyReleased
        seachFilter(InputSearch.getText());
           //Search(InputSearch.getText());
        
    }//GEN-LAST:event_InputSearchKeyReleased

    private void ListDSMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ListDSMouseClicked

        ListDS = (JList)evt.getSource();
        if (evt.getClickCount() == 2) {
            int index = ListDS.locationToIndex(evt.getPoint());
            if (index >= 0) {
                String a = model1.get(index).toString();
                jTextArea1.setText(a);
            }
        }
        
    }//GEN-LAST:event_ListDSMouseClicked

    private void LISTENOutputSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LISTENOutputSearchActionPerformed
        System.setProperty("mbrola.base", "C:\\Users\\Ha\\Documents\\GitHub\\No_Name_OOP\\BTL_Graphic\\mbrola");
        Voice voice ;
        VoiceManager vm = VoiceManager.getInstance();
        voice = vm.getVoice("mbrola_us1");
        voice.allocate();
        voice.speak(InputSearch.getText());
        
    }//GEN-LAST:event_LISTENOutputSearchActionPerformed

    private void LISTENSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LISTENSearchActionPerformed
        System.setProperty("mbrola.base", "C:\\Users\\Ha\\Documents\\GitHub\\No_Name_OOP\\BTL_Graphic\\mbrola");
        Voice voice ;
        VoiceManager vm = VoiceManager.getInstance();
        voice = vm.getVoice("mbrola_us1");
        voice.allocate();
        voice.speak(InputSearch.getText());
    }//GEN-LAST:event_LISTENSearchActionPerformed

    private void AddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddActionPerformed
        new add_frame().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_AddActionPerformed

    private void DELETEMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DELETEMouseClicked
        
        ListDS = (JList)evt.getSource();
        if (evt.getClickCount() == 1) {
            int index = ListDS.locationToIndex(evt.getPoint()); 
            model.remove(index);
            model1.remove(index);
        }
    }//GEN-LAST:event_DELETEMouseClicked
    
    public void seachFilter(String searchTerm){
       DefaultListModel model2 = new DefaultListModel();
       ArrayList<String> a = new ArrayList();
       for(int i = 0;i < model.size();i++){
           a.add(model.get(i).toString());
       }
       a.stream().forEach((word)->{
           String startName = word.toLowerCase();
           if(startName.contains(searchTerm.toLowerCase())){
               model2.addElement(word);
           }
       });
        ListDS.setModel(model2);
    }
    
    public Dictionary addFile() throws IOException{
        DictionaryManagement dm = new DictionaryManagement();
        dm.insertFromFile();
        dm.sortWord();
        return dm.getDict();
    }
    
    public void Search(String input){
        DefaultListModel model2 = new DefaultListModel();
       
       for(int i = 0;i < input.length();i++){
           for(int j = 0;j < model.size();j++){
               if(input.charAt(i) == model.get(i).toString().charAt(i)){
                   model2.addElement(model.get(j));
               }
           }
       }
       ListDS.setModel(model2);
    }
  
    
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
    private javax.swing.JButton DELETE;
    private javax.swing.JLabel DICTIONARY;
    private javax.swing.JButton EXIT;
    private javax.swing.JMenu Edit;
    private javax.swing.JMenu File;
    private javax.swing.JTextField InputSearch;
    private javax.swing.JMenuBar JMenuBar;
    private javax.swing.JButton LISTENOutputSearch;
    private javax.swing.JButton LISTENSearch;
    private javax.swing.JList<String> ListDS;
    private javax.swing.JPanel ManHinh;
    private javax.swing.JButton REPAIR;
    private javax.swing.JButton RESET;
    private javax.swing.JButton TimKiem;
    private javax.swing.JRadioButton VietEng;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables

}

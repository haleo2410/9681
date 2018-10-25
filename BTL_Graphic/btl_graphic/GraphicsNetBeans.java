/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package btl;
/**
 *
 * @author Ha
 */

import com.sun.glass.events.KeyEvent;
import com.sun.speech.freetts.Voice;
import com.sun.speech.freetts.VoiceManager;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.Timer;


public class GraphicsNetBeans extends javax.swing.JFrame {

    public DefaultListModel model = new DefaultListModel();
    public DefaultListModel model1 = new DefaultListModel();
    
    private static DictionaryManagement dm = new DictionaryManagement();
    public static DictionaryManagement getDict(){
        return dm;
    }
    
    public GraphicsNetBeans() {
        initComponents();    
        showDate();
        showTime();  
        
    }
    
    public GraphicsNetBeans(String wordtarget,String wordexplain){
        initComponents();
        //thongbao tb = new thongbao();
        if(wordtarget.equals("") || wordexplain.equals("")){// neu nhap khoang trang thi hien ra thong bao
            int thongbao =  JOptionPane.showConfirmDialog(rootPane, "Vui lòng nhập đầy đủ thông tin vào 2 bảng.","Thông báo!",JOptionPane.YES_NO_CANCEL_OPTION);
            if(thongbao == JOptionPane.YES_OPTION){ 
                // neu bam Yes thi quay lai add_frame de nhap
                new add_frame_1().setVisible(true);
                this.setVisible(false);
            }
            else{
                //ngc lai thi thoat chuong trinh, quay lai trang ban dau
                new GraphicsNetBeans().setVisible(true);
                this.setVisible(false);
            }
            //new thongbao("Vui lòng nhập đầy đủ thông tin vào 2 bảng.").setVisible(true);
        }
        else{ // ngc lai thuc hien vong for xet danh sach
            for(int i = 0;i < model.size();i++){
                if(wordtarget.equals(model.get(i).toString())){ // neu tu da co trong tu dien thi in ra thong bao
                    int thongbao =  JOptionPane.showConfirmDialog(rootPane, "Từ đã có trong từ điển vui lòng nhập lại.","Thông báo!",JOptionPane.YES_NO_CANCEL_OPTION);
                    if(thongbao == JOptionPane.YES_OPTION){  // neu nhan Yes thi quay lai add_frame de nhap 
                        new add_frame_1().setVisible(true);
                        this.setVisible(false);
                    }
                    else { // ngc lai thoat khoi chuong trinh, quay lai trang ban dau
                        new GraphicsNetBeans().setVisible(true);
                        this.setVisible(false);
                    } 
                    //new thongbao("Từ đã có trong từ điển vui lòng nhập lại.").setVisible(true);
                    //break;
                }
                model.addElement(wordtarget);
                model1.addElement(wordexplain);
                this.setVisible(true);
                
            }
            model.addElement(wordtarget);
            model1.addElement(wordexplain);

            this.setVisible(true);
        }
        
    }
    
    void showDate(){
        Date d = new Date();
        SimpleDateFormat s = new SimpleDateFormat("dd/MM/yyyy");
        datetoday.setText("Today: " + s.format(d));
    }
    
    void showTime() {
        new Timer(0, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Date d = new Date();
                SimpleDateFormat s = new SimpleDateFormat("hh:mm:ss a");
                timetoday.setText("Time: " +s.format(d));
            }
        }
        ).start();
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        MouseMenu = new javax.swing.JPopupMenu();
        DeleteMouseMenu = new javax.swing.JMenuItem();
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
        Search = new javax.swing.JButton();
        DELETE = new javax.swing.JButton();
        ADD = new javax.swing.JButton();
        EXIT = new javax.swing.JButton();
        REPAIR = new javax.swing.JButton();
        InputSearch = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        OutputSearch = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        ListDS = new javax.swing.JList<>();
        ListenSearch = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        EngViet = new javax.swing.JComboBox<>();
        ListenOut = new javax.swing.JButton();
        Google = new javax.swing.JButton();
        RESET = new javax.swing.JButton();
        datetoday = new javax.swing.JLabel();
        timetoday = new javax.swing.JLabel();
        FromYour = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        ListFromYour = new javax.swing.JList<>();
        jLabel2 = new javax.swing.JLabel();
        Menu = new javax.swing.JMenuBar();
        File = new javax.swing.JMenu();
        ExitMenu = new javax.swing.JMenuItem();
        Edit = new javax.swing.JMenu();
        AddMenu = new javax.swing.JMenuItem();
        DeleteMenu = new javax.swing.JMenuItem();
        History = new javax.swing.JMenuItem();
        RepairMenu = new javax.swing.JMenuItem();
        Help = new javax.swing.JMenu();

        DeleteMouseMenu.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        DeleteMouseMenu.setText("Delete");
        DeleteMouseMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteMouseMenuActionPerformed(evt);
            }
        });
        MouseMenu.add(DeleteMouseMenu);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("DICTIONARY");
        setBackground(new java.awt.Color(153, 0, 153));
        setName("DICTIONARY"); // NOI18N

        setLocationRelativeTo(null);
        ManHinh.setBackground(new java.awt.Color(204, 204, 255));

        DICTIONARY.setFont(new java.awt.Font("Times New Roman", 1, 50)); // NOI18N
        DICTIONARY.setForeground(new java.awt.Color(255, 0, 0));
        DICTIONARY.setText("DICTIONARY");
        DICTIONARY.setToolTipText("Chào mừng bạn đến với DICTIONARY được thực hiện bởi No_Name team");

        Search.setBackground(new java.awt.Color(255, 255, 255));
        Search.setFont(new java.awt.Font("Times New Roman", 1, 13)); // NOI18N
        Search.setIcon(new javax.swing.ImageIcon("C:\\Users\\Ha\\Documents\\GitHub\\No_Name_OOP\\Baitaplon1\\image\\search.jpg")); // NOI18N
        Search.setToolTipText("Click vào nút này để Tìm kiếm");
        Search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchActionPerformed(evt);
            }
        });

        DELETE.setBackground(new java.awt.Color(255, 255, 255));
        DELETE.setFont(new java.awt.Font("Times New Roman", 1, 13)); // NOI18N
        DELETE.setForeground(new java.awt.Color(51, 0, 51));
        DELETE.setIcon(new javax.swing.ImageIcon("C:\\Users\\Ha\\Documents\\GitHub\\No_Name_OOP\\BTL_Graphic\\image\\delete2.png")); // NOI18N
        DELETE.setToolTipText("");
        DELETE.setToolTipText("Click vào nút này hoặc ấn Ctrl+X để Xóa từ");
        DELETE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DELETEActionPerformed(evt);
            }
        });

        ADD.setBackground(new java.awt.Color(255, 255, 255));
        ADD.setFont(new java.awt.Font("Times New Roman", 1, 13)); // NOI18N
        ADD.setForeground(new java.awt.Color(51, 0, 51));
        ADD.setIcon(new javax.swing.ImageIcon("C:\\Users\\Ha\\Documents\\GitHub\\No_Name_OOP\\Baitaplon1\\image\\add.jpg")); // NOI18N
        ADD.setToolTipText("Click vào nút này hoặc nhấn Ctrl+A để Thêm Từ Mới");
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
        EXIT.setToolTipText("Click vào nút này hoặc ấn Shift+E để thoát khỏi chương trình");
        EXIT.setIcon(new javax.swing.ImageIcon("C:\\Users\\Ha\\Documents\\GitHub\\No_Name_OOP\\Baitaplon1\\image\\exit.png")); // NOI18N
        EXIT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EXITActionPerformed(evt);
            }
        });

        REPAIR.setBackground(new java.awt.Color(255, 255, 255));
        REPAIR.setFont(new java.awt.Font("Times New Roman", 1, 13)); // NOI18N
        REPAIR.setForeground(new java.awt.Color(51, 0, 51));
        REPAIR.setIcon(new javax.swing.ImageIcon("C:\\Users\\Ha\\Documents\\GitHub\\No_Name_OOP\\Baitaplon1\\image\\repair.png")); // NOI18N
        REPAIR.setToolTipText("Click vào nút này hoặc ấn Ctrl+R để Sửa từ");
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
        InputSearch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                InputSearchMouseClicked(evt);
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

        OutputSearch.setBackground(new java.awt.Color(255, 255, 204));
        OutputSearch.setColumns(20);
        OutputSearch.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        OutputSearch.setRows(5);
        jScrollPane1.setViewportView(OutputSearch);

        ListDS.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        ListDS.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, MouseMenu, org.jdesktop.beansbinding.ObjectProperty.create(), ListDS, org.jdesktop.beansbinding.BeanProperty.create("componentPopupMenu"));
        bindingGroup.addBinding(binding);

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

        ListenSearch.setBackground(new java.awt.Color(255, 255, 255));
        ListenSearch.setFont(new java.awt.Font("Times New Roman", 1, 13)); // NOI18N
        ListenSearch.setIcon(new javax.swing.ImageIcon("C:\\Users\\Ha\\Documents\\GitHub\\No_Name_OOP\\BTL_Graphic\\image\\volum.png")); // NOI18N
        ListenSearch.setMnemonic('1');
        ListenSearch.setToolTipText("Click hoặc ấn Alt+1 để Nghe");
        ListenSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ListenSearchActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 2, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 0, 204));
        jLabel1.setText("By No_Name Team");

        jButton2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Ha\\Documents\\GitHub\\No_Name_OOP\\BTL_Graphic\\image\\book.jpg")); // NOI18N

        EngViet.setBackground(new java.awt.Color(255, 255, 204));
        EngViet.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        EngViet.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " English - Vietnamese" , " Vietnamese - English" }));
        EngViet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EngVietActionPerformed(evt);
            }
        });

        ListenOut.setIcon(new javax.swing.ImageIcon("C:\\Users\\Ha\\Documents\\GitHub\\No_Name_OOP\\BTL_Graphic\\image\\volum - Copy.png")); // NOI18N
        ListenOut.setMnemonic('2');
        ListenOut.setToolTipText("Click hoặc ấn Alt+2 để Nghe");
        ListenOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ListenOutActionPerformed(evt);
            }
        });

        Google.setBackground(new java.awt.Color(255, 255, 255));
        Google.setIcon(new javax.swing.ImageIcon("C:\\Users\\Ha\\Documents\\GitHub\\No_Name_OOP\\BTL_Graphic\\image\\google.jpg")); // NOI18N
        Google.setMnemonic('G');
        Google.setToolTipText("Click hoặc ấn Alt+G để Dịch Online trên Google  Translate");
        Google.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GoogleActionPerformed(evt);
            }
        });

        RESET.setBackground(new java.awt.Color(255, 255, 255));
        RESET.setIcon(new javax.swing.ImageIcon("C:\\Users\\Ha\\Documents\\GitHub\\No_Name_OOP\\BTL_Graphic\\image\\reset.png")); // NOI18N
        RESET.setMnemonic('S');
        RESET.setToolTipText("Click hoặc ấn Alt+S để Làm mới");
        RESET.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RESETActionPerformed(evt);
            }
        });

        datetoday.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        datetoday.setForeground(new java.awt.Color(0, 0, 153));
        datetoday.setText("day");

        timetoday.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        timetoday.setForeground(new java.awt.Color(0, 0, 153));
        timetoday.setText("time");

        FromYour.setBackground(new java.awt.Color(255, 255, 255));
        FromYour.setIcon(new javax.swing.ImageIcon("C:\\Users\\Ha\\Documents\\GitHub\\No_Name_OOP\\BTL_Graphic\\image\\sao.jpg")); // NOI18N
        FromYour.setMnemonic('Y');
        FromYour.setToolTipText("Click hoặc ấn Alt+Y để lưu Từ của bạn");

        ListFromYour.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        ListFromYour.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                ListFromYourAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jScrollPane3.setViewportView(ListFromYour);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setText("From your:");

        javax.swing.GroupLayout ManHinhLayout = new javax.swing.GroupLayout(ManHinh);
        ManHinh.setLayout(ManHinhLayout);
        ManHinhLayout.setHorizontalGroup(
            ManHinhLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ManHinhLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ManHinhLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ManHinhLayout.createSequentialGroup()
                        .addGroup(ManHinhLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(ManHinhLayout.createSequentialGroup()
                                .addComponent(ListenSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(2, 2, 2)
                                .addComponent(InputSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Search, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(ManHinhLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 338, Short.MAX_VALUE))
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                        .addGroup(ManHinhLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(ManHinhLayout.createSequentialGroup()
                                .addComponent(ListenOut, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Google, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ADD, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(DELETE, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(FromYour, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(RESET, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(REPAIR, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(EngViet, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(EXIT, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 538, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(ManHinhLayout.createSequentialGroup()
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(ManHinhLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(ManHinhLayout.createSequentialGroup()
                                .addGap(54, 54, 54)
                                .addComponent(DICTIONARY, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ManHinhLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel1)
                                .addGap(28, 28, 28)))
                        .addGroup(ManHinhLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(timetoday, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)
                            .addComponent(datetoday, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        ManHinhLayout.setVerticalGroup(
            ManHinhLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ManHinhLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ManHinhLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(ManHinhLayout.createSequentialGroup()
                        .addComponent(datetoday, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(timetoday, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(ManHinhLayout.createSequentialGroup()
                        .addComponent(DICTIONARY, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1)))
                .addGap(16, 16, 16)
                .addGroup(ManHinhLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Search, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ListenSearch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(DELETE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(EngViet)
                    .addComponent(EXIT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(REPAIR, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ListenOut, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Google, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ADD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(InputSearch)
                    .addComponent(RESET, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(FromYour, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ManHinhLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 509, Short.MAX_VALUE)
                    .addGroup(ManHinhLayout.createSequentialGroup()
                        .addComponent(jScrollPane2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        File.setText("File");
        File.setMnemonic(KeyEvent.VK_F);

        ExitMenu.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.SHIFT_MASK));
        ExitMenu.setText("Exit");
        ExitMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitMenuActionPerformed(evt);
            }
        });
        File.add(ExitMenu);

        Menu.add(File);

        Edit.setMnemonic('E');
        Edit.setText("Edit");

        AddMenu.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        AddMenu.setText("Add");
        AddMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddMenuActionPerformed(evt);
            }
        });
        Edit.add(AddMenu);

        DeleteMenu.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.CTRL_MASK));
        DeleteMenu.setText("Delete");
        DeleteMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteMenuActionPerformed(evt);
            }
        });
        Edit.add(DeleteMenu);

        History.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_H, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        History.setText("Search History");
        Edit.add(History);

        RepairMenu.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.CTRL_MASK));
        RepairMenu.setText("Repair");
        Edit.add(RepairMenu);

        Menu.add(Edit);

        Help.setText("Help");
        Menu.add(Help);

        setJMenuBar(Menu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ManHinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ManHinh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        ManHinh.getAccessibleContext().setAccessibleName("");

        bindingGroup.bind();

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void DELETEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DELETEActionPerformed
        int delete =  JOptionPane.showConfirmDialog(rootPane, "Bạn có chac muon Xoa không? ","Thông báo!",JOptionPane.YES_NO_CANCEL_OPTION);
        if(delete == JOptionPane.YES_OPTION){  
            int index = ListDS.getSelectedIndex(); 
            model.remove(index);
            model1.remove(index);
        }
    }//GEN-LAST:event_DELETEActionPerformed

    private void ADDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ADDActionPerformed
        new add_frame_1().setVisible(true);
        this.setVisible(false);
        
        
    }//GEN-LAST:event_ADDActionPerformed

    private void REPAIRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_REPAIRActionPerformed
        
       // TODO add your handling code here:
    }//GEN-LAST:event_REPAIRActionPerformed

    private void EXITActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EXITActionPerformed
        Icon icon = null;
        int exit =  JOptionPane.showConfirmDialog(rootPane, "Bạn có muốn thoát không? ","Thông báo!",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE, icon);
        if(exit == JOptionPane.YES_OPTION){  
            System.exit(0);
        }
    }//GEN-LAST:event_EXITActionPerformed

    private void SearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchActionPerformed
        for(int i = 0;i < model.size();i++){
            if((InputSearch.getText()).equals(model.get(i).toString())){
                OutputSearch.setText(model1.get(i).toString());
                ListDS.setSelectedIndex(i);
                break;
            }
            if(i == model.size()-1){
                OutputSearch.setText("Không có từ này trong từ điển.\nVui lòng nhập lại từ khác!");
            }
        }
    }//GEN-LAST:event_SearchActionPerformed

    private void InputSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InputSearchActionPerformed
        InputSearch.getText();
    }//GEN-LAST:event_InputSearchActionPerformed

    private void InputSearchFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_InputSearchFocusGained

        if((InputSearch.getText().equals(" Tra từ Anh-Việt...")) || (InputSearch.getText().equals(" Tra từ Việt-Anh...") ) ){
             InputSearch.setText(" ");
        }
        InputSearch.setForeground(Color.black);       
    }//GEN-LAST:event_InputSearchFocusGained

    private void InputSearchFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_InputSearchFocusLost
        if(InputSearch.getText().equals(" ")){
            if(EngViet.getSelectedItem().equals(" English - Vietnamese")) {
                InputSearch.setText(" Tra từ Anh-Việt... ");
            }
            else {
                InputSearch.setText(" Tra từ Việt-Anh...");
            }
        }
         
        InputSearch.setForeground(new Color(153,153,153));
        
    }//GEN-LAST:event_InputSearchFocusLost

    private void REPAIRMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_REPAIRMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_REPAIRMouseClicked

    private void ADDMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ADDMouseClicked
       add_frame af = new add_frame();
       af.setVisible(true);
      
        // TODO add your handling code here:
    }//GEN-LAST:event_ADDMouseClicked

    private void ListDSAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_ListDSAncestorAdded
       
        try {
            Dictionary dict;
            dict = this.addFile();
            for(int i = 0;i < dict.getWord().size();i++){
               model.addElement(dict.getWord().get(i).getWord_target());
               model1.addElement(dict.getWord().get(i).getWord_explain());
           }
      
           ListDS.setModel(model);
           ListDS.setSelectedIndex(0);
        } catch (IOException ex) {
            Logger.getLogger(GraphicsNetBeans.class.getName()).log(Level.SEVERE, null, ex);
        }
           
    }//GEN-LAST:event_ListDSAncestorAdded

    private void InputSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_InputSearchKeyReleased
        try {
            seachFilter(InputSearch.getText());
        } catch (IOException ex) {
            Logger.getLogger(GraphicsNetBeans.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_InputSearchKeyReleased

    private void ListDSMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ListDSMouseClicked
        ListDS = (JList)evt.getSource();
        if (evt.getClickCount() == 2) {
            int index = ListDS.locationToIndex(evt.getPoint());
            if (index >= 0) {
                String a = model1.get(index).toString();
                OutputSearch.setText(a);
                /*
                for(int i = 0; i < model1.size();i++){
                    if(model2.get(index).toString().eq
                }*/
                
            }            
        }
    }//GEN-LAST:event_ListDSMouseClicked

    private void ListenSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ListenSearchActionPerformed
        System.setProperty("mbrola.base", "C:\\Users\\Ha\\Documents\\GitHub\\No_Name_OOP\\BTL_Graphic\\mbrola");
        Voice voice ;
        VoiceManager vm = VoiceManager.getInstance();
        voice = vm.getVoice("mbrola_us1");
        voice.allocate();
        voice.speak(InputSearch.getText()); 
    }//GEN-LAST:event_ListenSearchActionPerformed

    private void DeleteMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteMenuActionPerformed
        //Xoa khi click menu 
        
        int delete =  JOptionPane.showConfirmDialog(rootPane, "Bạn có chắc muốn xóa không? ","Thông báo!",JOptionPane.YES_NO_CANCEL_OPTION);
        if(delete == JOptionPane.YES_OPTION){
            int index = ListDS.getSelectedIndex();
            model.remove(index);
            model1.remove(index);
        }
    }//GEN-LAST:event_DeleteMenuActionPerformed

    private void InputSearchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_InputSearchMouseClicked
        InputSearch.setText("");
    }//GEN-LAST:event_InputSearchMouseClicked

    private void ExitMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitMenuActionPerformed
        Icon icon = null;
        int exit =  JOptionPane.showConfirmDialog(rootPane, "Bạn có muốn thoát không? ","Thông báo!",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE, icon);
        if(exit == JOptionPane.YES_OPTION){
            System.exit(0);
        }
    }//GEN-LAST:event_ExitMenuActionPerformed

    private void EngVietActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EngVietActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EngVietActionPerformed

    private void DeleteMouseMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteMouseMenuActionPerformed
        //Xoa khi click menu chuot phai
        int delete =  JOptionPane.showConfirmDialog(rootPane, "Bạn có chắc muốn xóa không? ","Thông báo!",JOptionPane.YES_NO_CANCEL_OPTION);
        if(delete == JOptionPane.YES_OPTION){
            int index = ListDS.getSelectedIndex();
            model.remove(index);
            model1.remove(index);
            
        }
    }//GEN-LAST:event_DeleteMouseMenuActionPerformed

    private void ListenOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ListenOutActionPerformed
        System.setProperty("mbrola.base", "C:\\Users\\Ha\\Documents\\GitHub\\No_Name_OOP\\BTL_Graphic\\mbrola");
        Voice voice ;
        VoiceManager vm = VoiceManager.getInstance();
        voice = vm.getVoice("mbrola_us2");
        voice.allocate();
        voice.speak(OutputSearch.getText()); 
    }//GEN-LAST:event_ListenOutActionPerformed

    private void GoogleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GoogleActionPerformed
        String g = InputSearch.getText().replace(" ", "");
        try{
            if(EngViet.getSelectedItem().equals(" English - Vietnamese")){
                java.awt.Desktop.getDesktop().browse(java.net.URI.create("https://translate.google.com/?hl=vi#en/vi/"+g));
            }
            java.awt.Desktop.getDesktop().browse(java.net.URI.create("https://translate.google.com/?hl=vi#vi/en/"+g));
        }catch (Exception e){
            
        }
    }//GEN-LAST:event_GoogleActionPerformed

    private void RESETActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RESETActionPerformed
        
        // TODO add your handling code here:
    }//GEN-LAST:event_RESETActionPerformed

    private void ListFromYourAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_ListFromYourAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_ListFromYourAncestorAdded

    private void AddMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddMenuActionPerformed
        new add_frame_1().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_AddMenuActionPerformed

    public Dictionary addFile() throws IOException{
        dm.insertFromFile();
        return dm.getDictionary();
    }
    
    
    
    public Dictionary addFileYour() throws IOException{
        dm.insertFromFile();
        return dm.getDictionary();
    }
    public void seachFilter(String searchTerm) throws IOException{
       DefaultListModel model2 = new DefaultListModel();
       DefaultListModel model3 = new DefaultListModel();
       ArrayList<Word> a = new ArrayList();
       for(int i = 0;i < model.size();i++){
           Word word = new Word();
           word.setWord_target(model.get(i).toString());
           word.setWord_explain(model1.get(i).toString());
           a.add(word);
       }
       a.stream().forEach((word)->{
           String startName = word.getWord_target().toLowerCase();
           if(startName.contains(searchTerm.toLowerCase())){
             model2.addElement(word.getWord_target());
           }
       });
        ListDS.setModel(model2);
//        Dictionary d = this.addFile();
//        DefaultListModel model2 = new DefaultListModel();
//        DefaultListModel model3 = new DefaultListModel();
//        d.getWord().stream().forEach((word)->{
//            String startname = word.getWord_target().toLowerCase();
//            if(startname.contains(searchTerm)){
//                model2.addElement(word.getWord_target());
//                model3.addElement(word.getWord_explain());
//            }
//        });
//        ListDS.setModel(model2);
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
    private javax.swing.JMenuItem AddMenu;
    private javax.swing.JButton DELETE;
    private javax.swing.JLabel DICTIONARY;
    private javax.swing.JMenuItem DeleteMenu;
    private javax.swing.JMenuItem DeleteMouseMenu;
    private javax.swing.JButton EXIT;
    private javax.swing.JMenu Edit;
    private javax.swing.JComboBox<String> EngViet;
    private javax.swing.JMenuItem ExitMenu;
    private javax.swing.JMenu File;
    private javax.swing.JButton FromYour;
    private javax.swing.JButton Google;
    private javax.swing.JMenu Help;
    private javax.swing.JMenuItem History;
    private javax.swing.JTextField InputSearch;
    private javax.swing.JList<String> ListDS;
    private javax.swing.JList<String> ListFromYour;
    private javax.swing.JButton ListenOut;
    private javax.swing.JButton ListenSearch;
    private javax.swing.JPanel ManHinh;
    private javax.swing.JMenuBar Menu;
    private javax.swing.JPopupMenu MouseMenu;
    private javax.swing.JTextArea OutputSearch;
    private javax.swing.JButton REPAIR;
    private javax.swing.JButton RESET;
    private javax.swing.JMenuItem RepairMenu;
    private javax.swing.JButton Search;
    private javax.swing.JLabel datetoday;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel timetoday;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables

}

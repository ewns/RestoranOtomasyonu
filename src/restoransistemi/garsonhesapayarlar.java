/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package restoransistemi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ewnS
 */
public class garsonhesapayarlar extends javax.swing.JFrame {

   int mouseX;
   int mouseY;
    public garsonhesapayarlar() {
        initComponents();
        show_hesap();
    }

      sqlsettings sqlayar=new sqlsettings();
    
    
      public ArrayList<Hesap> hesapList(){
        ArrayList<Hesap> usersList= new ArrayList<>();
         try{
            Class.forName(sqlayar.Driver);
            Connection con=DriverManager.getConnection(sqlayar.url, sqlayar.user, sqlayar.pass);
            String sqlsorgu="Select * from userlogin ";  
          
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery(sqlsorgu);
         
            Hesap hesap;
          
            while(rs.next()){
                hesap=new Hesap(rs.getString("ad"),rs.getString("sifre"));
           usersList.add(hesap);
            }

        }catch(Exception e){
             JOptionPane.showMessageDialog(this,e.getMessage());
        }
         return usersList;
    }
    public void show_hesap(){
        ArrayList<Hesap> list= hesapList();
        DefaultTableModel model= (DefaultTableModel)hesapbilgitbl.getModel();
        Object[] row= new Object[2];
        for(int i=0;i<list.size();i++){
            row[0]=list.get(i).getkadi();
            row[1]=list.get(i).getsifre();
            model.addRow(row);
        }
    }
    
    
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        kayıtbtn = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        kayittxt = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        kayitsifretxt = new javax.swing.JPasswordField();
        jPanel4 = new javax.swing.JPanel();
        sifrebtn = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        degiskaditxt = new javax.swing.JTextField();
        sifredegistxt = new javax.swing.JPasswordField();
        jPanel5 = new javax.swing.JPanel();
        silbtn = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        silkaditxt = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        hesapbilgitbl = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        cikismasa = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Masalar");
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel3.setBackground(new java.awt.Color(204, 59, 16));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Yeni Garson Kayıt Et", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(255, 255, 255))); // NOI18N

        kayıtbtn.setBackground(new java.awt.Color(255, 255, 255));
        kayıtbtn.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        kayıtbtn.setForeground(new java.awt.Color(204, 59, 16));
        kayıtbtn.setText("Kayıt Ol");
        kayıtbtn.setBorder(null);
        kayıtbtn.setBorderPainted(false);
        kayıtbtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        kayıtbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kayıtbtnActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Kullanıcı Adı:");

        kayittxt.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        kayittxt.setForeground(new java.awt.Color(51, 51, 51));
        kayittxt.setBorder(null);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Sifre:");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(kayıtbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(kayittxt, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(kayitsifretxt, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 297, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(kayittxt, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(kayitsifretxt, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(kayıtbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(204, 59, 16));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Şifre Değiştir", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(255, 255, 255))); // NOI18N

        sifrebtn.setBackground(new java.awt.Color(255, 255, 255));
        sifrebtn.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        sifrebtn.setForeground(new java.awt.Color(204, 59, 16));
        sifrebtn.setText("Şifre Değiştir");
        sifrebtn.setBorder(null);
        sifrebtn.setBorderPainted(false);
        sifrebtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        sifrebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sifrebtnActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Yeni Şifre:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Kullanıcı Adı:");

        degiskaditxt.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        degiskaditxt.setForeground(new java.awt.Color(51, 51, 51));
        degiskaditxt.setBorder(null);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(sifredegistxt, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 297, Short.MAX_VALUE)
                    .addComponent(sifrebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(degiskaditxt, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(degiskaditxt, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sifredegistxt, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(sifrebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new java.awt.Color(204, 59, 16));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Hesabı Sil", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(255, 255, 255))); // NOI18N

        silbtn.setBackground(new java.awt.Color(255, 255, 255));
        silbtn.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        silbtn.setForeground(new java.awt.Color(204, 59, 16));
        silbtn.setText("Hesabı Sil");
        silbtn.setBorder(null);
        silbtn.setBorderPainted(false);
        silbtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        silbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                silbtnActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Kullanıcı Adı:");

        silkaditxt.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        silkaditxt.setForeground(new java.awt.Color(51, 51, 51));
        silkaditxt.setBorder(null);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(silbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(silkaditxt, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 16, Short.MAX_VALUE))))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(silkaditxt, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(silbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        hesapbilgitbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Kullanıcı Adı", "Şifre"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(hesapbilgitbl);
        if (hesapbilgitbl.getColumnModel().getColumnCount() > 0) {
            hesapbilgitbl.getColumnModel().getColumn(0).setMinWidth(170);
            hesapbilgitbl.getColumnModel().getColumn(0).setMaxWidth(170);
        }

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(27, 27, 27))
        );

        jPanel2.setBackground(new java.awt.Color(204, 59, 16));
        jPanel2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel2MouseDragged(evt);
            }
        });
        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel2MousePressed(evt);
            }
        });

        cikismasa.setBackground(new java.awt.Color(204, 59, 16));
        cikismasa.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        cikismasa.setForeground(new java.awt.Color(255, 255, 255));
        cikismasa.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cikismasa.setText("x");
        cikismasa.setOpaque(true);
        cikismasa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cikismasaMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cikismasa, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(cikismasa, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(751, 599));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cikismasaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cikismasaMouseClicked

            this.setVisible(false);
        
    }//GEN-LAST:event_cikismasaMouseClicked

    private void jPanel2MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseDragged
        // TODO add your handling code here:
        int kordinatX=evt.getXOnScreen();
        int kordinatY=evt.getYOnScreen();
        
        this.setLocation(kordinatX-mouseX,kordinatY-mouseY);
    }//GEN-LAST:event_jPanel2MouseDragged

    private void jPanel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MousePressed
       mouseX=evt.getX();
       mouseY=evt.getY();
    }//GEN-LAST:event_jPanel2MousePressed

    private void kayıtbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kayıtbtnActionPerformed
 
        char[] sifretxt=kayitsifretxt.getPassword();
         String password=new String(sifretxt);
         
        try{
            Class.forName(sqlayar.Driver);
            Connection con=DriverManager.getConnection(sqlayar.url, sqlayar.user, sqlayar.pass);
            String sql="insert into userlogin"+"(ad,sifre)"+"values(?,?)";//mssql sorgu
            
            PreparedStatement pst=con.prepareStatement(sql);
       
             pst.setString(1,kayittxt.getText());
              pst.setString(2,password);
            
              
              String name=kayittxt.getText();
              if(name.equals("") || password.equals("")){
                   JOptionPane.showMessageDialog(this,"Kullanıcı adını yada Şifre'yi boş bırakamazsın. ");
              }
              else{
                  pst.executeUpdate();//sorguyu calıştırmak icin.
                  
                  //tabloyu anında güncellemek icin.
                  DefaultTableModel model= (DefaultTableModel)hesapbilgitbl.getModel();
              model.setNumRows(0);
              show_hesap();
              
              
              //işlem bittikten sonra text field'i temizlemek icin.
              kayittxt.setText("");
              kayitsifretxt.setText("");
              JOptionPane.showMessageDialog(this,"Yeni Hesap oluşturuldu.");}
        }catch(Exception e){
             JOptionPane.showMessageDialog(this,e.getMessage());
        }
        
    }//GEN-LAST:event_kayıtbtnActionPerformed

    private void sifrebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sifrebtnActionPerformed
       
        
        char[] sifretxt=sifredegistxt.getPassword();
         String password=new String(sifretxt);
       
        try{
            Class.forName(sqlayar.Driver);
            Connection con=DriverManager.getConnection(sqlayar.url, sqlayar.user, sqlayar.pass);
            String sql="update userlogin set sifre=? where ad=?";
            
            PreparedStatement pst=con.prepareStatement(sql);
             pst.setString(2,degiskaditxt.getText());
              pst.setString(1,password);
            
             String name=degiskaditxt.getText();
              if(name.equals("") || password.equals("")){
                   JOptionPane.showMessageDialog(this,"Kullanıcı adı yada şifre boş bırakılamaz. ");
              }
              else{
              pst.executeUpdate();
                DefaultTableModel model= (DefaultTableModel)hesapbilgitbl.getModel();
              model.setNumRows(0);
              show_hesap();
              degiskaditxt.setText("");
              sifredegistxt.setText("");
              
              JOptionPane.showMessageDialog(this,"Şifre başarılı bir şekilde değiştirildi. ");
              }
        }catch(Exception e){
             JOptionPane.showMessageDialog(this,e.getMessage());
        }
        
    }//GEN-LAST:event_sifrebtnActionPerformed

    private void silbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_silbtnActionPerformed
        try{
            Class.forName(sqlayar.Driver);
            Connection con=DriverManager.getConnection(sqlayar.url, sqlayar.user, sqlayar.pass);
            String sql="Delete from userlogin where ad=?";
            
            PreparedStatement pst=con.prepareStatement(sql);
             pst.setString(1,silkaditxt.getText());
            
            
            
              pst.executeUpdate();
                DefaultTableModel model= (DefaultTableModel)hesapbilgitbl.getModel();
             model.setNumRows(0);
             
              show_hesap();
              silkaditxt.setText("");
              JOptionPane.showMessageDialog(this,"Hesap başarılı bir şekilde silindi. ");
        }catch(Exception e){
             JOptionPane.showMessageDialog(this,e.getMessage());
        }
        
    }//GEN-LAST:event_silbtnActionPerformed

    /**
     * @param args the command line arguments
     */
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
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(garsonhesapayarlar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(garsonhesapayarlar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(garsonhesapayarlar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(garsonhesapayarlar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new garsonhesapayarlar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel cikismasa;
    private javax.swing.JTextField degiskaditxt;
    private javax.swing.JTable hesapbilgitbl;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPasswordField kayitsifretxt;
    private javax.swing.JTextField kayittxt;
    private javax.swing.JButton kayıtbtn;
    private javax.swing.JButton sifrebtn;
    private javax.swing.JPasswordField sifredegistxt;
    private javax.swing.JButton silbtn;
    private javax.swing.JTextField silkaditxt;
    // End of variables declaration//GEN-END:variables

}

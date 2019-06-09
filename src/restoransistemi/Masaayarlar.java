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
public class Masaayarlar extends javax.swing.JFrame {

   int mouseX;
   int mouseY;
    public Masaayarlar() {
        initComponents();
        show_masa();
    }

    sqlsettings sqlayar=new sqlsettings();
    
    
     public ArrayList<Masa> masaList(){
        ArrayList<Masa> usersList= new ArrayList<>();
         try{
            Class.forName(sqlayar.Driver);
            Connection con=DriverManager.getConnection(sqlayar.url, sqlayar.user, sqlayar.pass);
            String sqlsorgu="Select * from Masalar ";  
          
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery(sqlsorgu);
         
            Masa masa;
          
            while(rs.next()){
                masa=new Masa(rs.getString("Masano"),rs.getInt("fiyat"));
           usersList.add(masa);
            }

        }catch(Exception e){
             JOptionPane.showMessageDialog(this,e.getMessage());
        }
         return usersList;
    }
    public void show_masa(){
        ArrayList<Masa> list= masaList();
        DefaultTableModel model= (DefaultTableModel)masabilgitbl.getModel();
        Object[] row= new Object[1];
        for(int i=0;i<list.size();i++){
            row[0]=list.get(i).getname();
           
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
        jLabel1 = new javax.swing.JLabel();
        masatxt = new javax.swing.JTextField();
        eklebtn = new javax.swing.JButton();
        silbtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        masabilgitbl = new javax.swing.JTable();
        guncellebtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        guncelletxt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        cikismasa = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Masalar");
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("Yeni isim:");

        masatxt.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        masatxt.setForeground(new java.awt.Color(51, 51, 51));
        masatxt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));

        eklebtn.setBackground(new java.awt.Color(204, 59, 16));
        eklebtn.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        eklebtn.setForeground(new java.awt.Color(255, 255, 255));
        eklebtn.setText("Ekle");
        eklebtn.setBorder(null);
        eklebtn.setBorderPainted(false);
        eklebtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        eklebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eklebtnActionPerformed(evt);
            }
        });

        silbtn.setBackground(new java.awt.Color(204, 59, 16));
        silbtn.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        silbtn.setForeground(new java.awt.Color(255, 255, 255));
        silbtn.setText("Sil");
        silbtn.setBorder(null);
        silbtn.setBorderPainted(false);
        silbtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        silbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                silbtnActionPerformed(evt);
            }
        });

        masabilgitbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Masa ismi"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(masabilgitbl);

        guncellebtn.setBackground(new java.awt.Color(204, 59, 16));
        guncellebtn.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        guncellebtn.setForeground(new java.awt.Color(255, 255, 255));
        guncellebtn.setText("İsmi Güncelle");
        guncellebtn.setBorder(null);
        guncellebtn.setBorderPainted(false);
        guncellebtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        guncellebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guncellebtnActionPerformed(evt);
            }
        });

        jLabel2.setText("İsmi güncelliyeceğiniz zaman burayı kullanınız.");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("Masa İsmi yada numarası Giriniz:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(masatxt, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(eklebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(silbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(guncellebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(guncelletxt, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(38, 38, 38)
                    .addComponent(jLabel3)
                    .addContainerGap(270, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(masatxt, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(eklebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(silbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(guncellebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(guncelletxt, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(23, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(34, 34, 34)
                    .addComponent(jLabel3)
                    .addContainerGap(381, Short.MAX_VALUE)))
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

        setSize(new java.awt.Dimension(559, 312));
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

    private void eklebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eklebtnActionPerformed
 try{
            Class.forName(sqlayar.Driver);
            Connection con=DriverManager.getConnection(sqlayar.url, sqlayar.user, sqlayar.pass);
            String sql="insert into Masalar"+"(Masano,fiyat)"+"values(?,?)";
            
            PreparedStatement pst=con.prepareStatement(sql);
       
             pst.setString(1,masatxt.getText());
              pst.setString(2,"0");
            
              
              String name=masatxt.getText();
              if(name.equals("")){
                   JOptionPane.showMessageDialog(this,"Masa adını boş bırakılamaz. ");
              }
              else{
                  pst.executeUpdate();
                    DefaultTableModel model= (DefaultTableModel)masabilgitbl.getModel();
            
             model.setNumRows(0);
             
              show_masa();
              JOptionPane.showMessageDialog(this,"Yeni Masa oluşturuldu.");}
        }catch(Exception e){
             JOptionPane.showMessageDialog(this,e.getMessage());
        }
        
    }//GEN-LAST:event_eklebtnActionPerformed

    private void silbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_silbtnActionPerformed
       try{
            Class.forName(sqlayar.Driver);
            Connection con=DriverManager.getConnection(sqlayar.url, sqlayar.user, sqlayar.pass);
            String sql="Delete from Masalar where Masano=?";
            
            PreparedStatement pst=con.prepareStatement(sql);
             pst.setString(1,masatxt.getText());
            
            
            
              pst.executeUpdate();
                DefaultTableModel model= (DefaultTableModel)masabilgitbl.getModel();
             model.setNumRows(0);
             
              show_masa();
              JOptionPane.showMessageDialog(this,"Masa başarılı bir şekilde silindi. ");
        }catch(Exception e){
             JOptionPane.showMessageDialog(this,e.getMessage());
        }
        
    }//GEN-LAST:event_silbtnActionPerformed

    private void guncellebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guncellebtnActionPerformed
         try{
            Class.forName(sqlayar.Driver);
            Connection con=DriverManager.getConnection(sqlayar.url,sqlayar.user, sqlayar.pass);
            String sql="update Masalar set Masano=? where Masano=?";
            
            PreparedStatement pst=con.prepareStatement(sql);
             pst.setString(2,masatxt.getText());
              pst.setString(1,guncelletxt.getText());
            
             String name=masatxt.getText();
              if(name.equals("")){
                   JOptionPane.showMessageDialog(this,"Masa adı boş bırakılamaz. ");
              }
              else{
              pst.executeUpdate();
              DefaultTableModel model= (DefaultTableModel)masabilgitbl.getModel();
              model.setNumRows(0);
              show_masa();
              masatxt.setText("");
              guncelletxt.setText("");
              JOptionPane.showMessageDialog(this,"Masa ismi başarılı bir şekilde değiştirildi. ");
              }
        }catch(Exception e){
             JOptionPane.showMessageDialog(this,e.getMessage());
        }
    }//GEN-LAST:event_guncellebtnActionPerformed

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
            java.util.logging.Logger.getLogger(Masaayarlar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Masaayarlar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Masaayarlar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Masaayarlar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Masaayarlar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel cikismasa;
    private javax.swing.JButton eklebtn;
    private javax.swing.JButton guncellebtn;
    private javax.swing.JTextField guncelletxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable masabilgitbl;
    private javax.swing.JTextField masatxt;
    private javax.swing.JButton silbtn;
    // End of variables declaration//GEN-END:variables

}

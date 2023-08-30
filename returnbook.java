/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package SLibrary;

import java.awt.event.KeyEvent;
import java.sql.ResultSetMetaData;
import java.sql.ResultSet;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author Shruti
 */
public final class returnbook extends javax.swing.JFrame {

    /**
     * Creates new form Category
     * @throws java.lang.ClassNotFoundException
     * @throws java.sql.SQLException
     */
    public returnbook() throws ClassNotFoundException, SQLException {
        initComponents();
        Connect();
        Returnbook_Load();
        
        
    }
   
    Connection con;
    PreparedStatement pst;
    ResultSet rs;
    
    
    public void Connect() throws ClassNotFoundException, SQLException
    {
      
          Class.forName("com.mysql.jdbc.Driver");
          con = DriverManager.getConnection("jdbc:mysql://localhost/SLibrary","root","");
          
    }
    
    
    
    public void Returnbook_Load()
    {
        int c ;
        try {
            pst = con.prepareStatement("select*from returnbook");
            rs = pst.executeQuery();
            
            ResultSetMetaData rsd = rs.getMetaData();
            c= rsd.getColumnCount();
            
            DefaultTableModel d1 = (DefaultTableModel)jTable1.getModel();
            d1.setRowCount(0);
            
            while(rs.next())
            {
                Vector v2 = new Vector();
                
                for(int i =1;i<=c;i++){
                    v2.add(rs.getString("id"));
                    v2.add(rs.getString("mid"));
                    v2.add(rs.getString("mname"));
                    v2.add(rs.getString("bname"));
                    v2.add(rs.getString("returndate"));
                    v2.add(rs.getString("elp"));
                    v2.add(rs.getString("fine"));
                    
                    
                    
                }
                d1.addRow(v2);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(returnbook.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtrdate = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtmid = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtmname = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtelp = new javax.swing.JTextField();
        txtfine = new javax.swing.JTextField();
        txtbook = new javax.swing.JLabel();
        txtrrdate = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtrdate.setBackground(new java.awt.Color(0, 153, 153));
        txtrdate.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setForeground(java.awt.SystemColor.controlHighlight);
        jLabel1.setText("Return Book");
        txtrdate.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(186, 28, -1, -1));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Member ID");
        txtrdate.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 106, 140, 29));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Book");
        txtrdate.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 217, 91, 27));

        txtmid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtmidActionPerformed(evt);
            }
        });
        txtmid.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtmidKeyPressed(evt);
            }
        });
        txtrdate.add(txtmid, new org.netbeans.lib.awtextra.AbsoluteConstraints(208, 110, 194, -1));

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SLibrary/return-book-1-560407.png"))); // NOI18N
        jButton1.setText("ADD");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        txtrdate.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 465, 130, 60));

        jButton4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SLibrary/red-x-mark-transparent-background-3.png"))); // NOI18N
        jButton4.setText("CANCEL");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        txtrdate.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(282, 464, 130, 60));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Member ID", "Member Name", "Book", "Return Date", "DaysElap", "Fine"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        txtrdate.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 20, 611, 508));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Member Name");
        txtrdate.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 159, 160, 27));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Day Elap");
        txtrdate.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 356, 115, 27));

        txtmname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtmnameActionPerformed(evt);
            }
        });
        txtrdate.add(txtmname, new org.netbeans.lib.awtextra.AbsoluteConstraints(208, 162, 194, -1));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Return Date");
        txtrdate.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 287, 140, 27));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Fine");
        txtrdate.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 401, 115, 27));

        txtelp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtelpActionPerformed(evt);
            }
        });
        txtrdate.add(txtelp, new org.netbeans.lib.awtextra.AbsoluteConstraints(208, 359, 195, -1));
        txtrdate.add(txtfine, new org.netbeans.lib.awtextra.AbsoluteConstraints(208, 404, 195, -1));

        txtbook.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtbook.setForeground(new java.awt.Color(255, 255, 255));
        txtbook.setText("jLabel10");
        txtrdate.add(txtbook, new org.netbeans.lib.awtextra.AbsoluteConstraints(208, 216, 194, -1));

        txtrrdate.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtrrdate.setForeground(new java.awt.Color(255, 255, 255));
        txtrrdate.setText("jLabel7");
        txtrdate.add(txtrrdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(208, 286, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SLibrary/Library_Book_532388_1366x768.jpg"))); // NOI18N
        jLabel7.setText("jLabel7");
        txtrdate.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(txtrdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(txtrdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 6, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtmidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtmidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtmidActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
       String mid = txtmid.getText();
       String membername = txtmname.getText();
       String bookname = txtbook.getText();
       String returndate = txtrrdate.getText();
       String elpdays = txtelp.getText();
       String fine = txtfine.getText();
       
       
       
       
       
        try {
            pst = con.prepareStatement("insert into returnbook(mid,mname,bname,returndate,elp,fine)values(?,?,?,?,?,?)");
            pst.setString(1,mid);
            pst.setString(2,membername);
             pst.setString(3,bookname);
            pst.setString(4,returndate);
            pst.setString(5,elpdays);
            pst.setString(6,fine);
            
             int k = pst.executeUpdate();
             
             pst = con.prepareStatement("delete from issuebook where memberid = ?");
             pst.setString(1,mid);
             pst.executeUpdate();
             
             if(k==1){
                    JOptionPane.showMessageDialog(this, "Book Returned");
                 
                txtmid.setText("");
                txtmname.setText("");
                txtbook.setText("");
                txtrrdate.setText("");
                txtelp.setText("");
                txtfine.setText("");
                txtmid.requestFocus();
                Returnbook_Load();
                
             }
             else
                 JOptionPane.showMessageDialog(this, "ERROR");
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(returnbook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        
        this.setVisible(false);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void txtmnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtmnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtmnameActionPerformed

    private void txtmidKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtmidKeyPressed
        // TODO add your handling code here:
         if(evt.getKeyCode()==KeyEvent.VK_ENTER)
        {
        String id = txtmid.getText();
        try {
            pst = con.prepareStatement("select m.name,b.bname,i.returndate,DATEDIFF(now(),i.returndate)as elap from issuebook i JOIN member m ON i.memberid = m.id JOIN book b ON i.bookid = b.id and i.memberid = ?");
        
            pst.setString(1,id);
            rs = pst.executeQuery();
            
            if(rs.next()==false){
                JOptionPane.showMessageDialog(this,"Member ID not Found");
            }
            else
                {
                    String mname = rs.getString("m.name");
                    String bname = rs.getString("b.bname");
                    txtmname.setText(mname.trim());
                    txtbook.setText(bname.trim());
                    
                    String issuedate = rs.getString("i.returndate");
                    txtrrdate.setText(issuedate);
                    
                    
                    String elp = rs.getString("elap");
                    int elaped = Integer.parseInt(elp);
                    
                    if(elaped>0){
                        txtelp.setText(elp);
                        int fine = elaped*100;
                        txtfine.setText(String.valueOf(fine));
                        
                    }
                    else{
                        txtelp.setText("0");
                        txtfine.setText("0");
                    }
        
                }
        } catch (SQLException ex) {
            Logger.getLogger(returnbook.class.getName()).log(Level.SEVERE, null, ex);
        }
            
            
            
        }
        
    }//GEN-LAST:event_txtmidKeyPressed

    private void txtelpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtelpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtelpActionPerformed

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
            java.util.logging.Logger.getLogger(returnbook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(returnbook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(returnbook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(returnbook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
        java.awt.EventQueue.invokeLater(() -> {
            try {
                new returnbook().setVisible(true);
            } catch (ClassNotFoundException | SQLException ex) {
                Logger.getLogger(returnbook.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel txtbook;
    private javax.swing.JTextField txtelp;
    private javax.swing.JTextField txtfine;
    private javax.swing.JTextField txtmid;
    private javax.swing.JTextField txtmname;
    private javax.swing.JPanel txtrdate;
    private javax.swing.JLabel txtrrdate;
    // End of variables declaration//GEN-END:variables
}

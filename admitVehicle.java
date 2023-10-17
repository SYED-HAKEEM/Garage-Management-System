/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package garagemanagementsystem;

import java.text.SimpleDateFormat;
import java.util.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.swing.*;

/**
 *
 * @author syedh
 */
public class admitVehicle extends javax.swing.JFrame implements Runnable {
    int hours, minutes, seconds;

    /**
     * Creates new form admitVehicle
     */
    public admitVehicle() {
        initComponents();
        showDate();
        Thread t=new Thread(this);
        t.start();
    }
    
    void showDate(){
        Date d=new Date();
        SimpleDateFormat sd=new SimpleDateFormat("dd-MM-yyyy");
        ad.setText(sd.format(d));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        vtp = new javax.swing.JTextField();
        vn = new javax.swing.JTextField();
        vpb = new javax.swing.JTextField();
        ad = new javax.swing.JTextField();
        at = new javax.swing.JTextField();
        cd = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        cid = new javax.swing.JTextField();
        cn = new javax.swing.JTextField();
        cno = new javax.swing.JTextField();
        ca = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Allow Vehicle");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 100, 210, 40));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 0));
        jLabel2.setText("Vehicle Type :");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 180, 100, 30));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 0, 0));
        jLabel3.setText("Customer Due :");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 380, 140, 30));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 0, 0));
        jLabel4.setText("Problem :");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 280, 100, 30));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 0, 0));
        jLabel5.setText("Admit Date :");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 330, 100, 30));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 0, 0));
        jLabel6.setText("Admit Time :");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 380, 110, 30));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 0, 0));
        jLabel7.setText("Contract ID :");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 180, 100, 30));

        jButton5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton5.setText("Back");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 600, -1, -1));

        jButton7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton7.setForeground(new java.awt.Color(255, 0, 0));
        jButton7.setText("Logout");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(1150, 600, -1, -1));

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 153));
        jButton1.setText("Allow");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 490, -1, -1));

        vtp.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        vtp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vtpActionPerformed(evt);
            }
        });
        getContentPane().add(vtp, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 180, 350, 30));

        vn.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        vn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vnActionPerformed(evt);
            }
        });
        getContentPane().add(vn, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 230, 350, 30));

        vpb.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        vpb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vpbActionPerformed(evt);
            }
        });
        getContentPane().add(vpb, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 280, 350, 30));

        ad.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        ad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adActionPerformed(evt);
            }
        });
        getContentPane().add(ad, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 330, 350, 30));

        at.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        at.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atActionPerformed(evt);
            }
        });
        getContentPane().add(at, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 380, 350, 30));

        cd.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        cd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cdActionPerformed(evt);
            }
        });
        getContentPane().add(cd, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 380, 350, 30));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 0, 0));
        jLabel8.setText("Vehicle Name :");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 230, 100, 30));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 0, 0));
        jLabel9.setText("Customer Name :");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 230, 120, 30));

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 0, 0));
        jLabel10.setText("Customer Number :");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 280, 140, 30));

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 0, 0));
        jLabel11.setText("Customer Address :");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 330, 140, 30));

        cid.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        cid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cidActionPerformed(evt);
            }
        });
        getContentPane().add(cid, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 180, 350, 30));

        cn.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        cn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cnActionPerformed(evt);
            }
        });
        getContentPane().add(cn, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 230, 350, 30));

        cno.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        cno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cnoActionPerformed(evt);
            }
        });
        getContentPane().add(cno, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 280, 350, 30));

        ca.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        ca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                caActionPerformed(evt);
            }
        });
        getContentPane().add(ca, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 330, 350, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        Customers obj=new Customers();
        obj.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        LoginPage obj=new LoginPage();
        obj.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3333/garage","root","");
            String sql1="insert into vehicle_info values (?,?,?,?,?,?)";
            PreparedStatement ps1=conn.prepareStatement(sql1);
            String sql2="insert into customer_info values (?,?,?,?,?)";
            PreparedStatement ps2=conn.prepareStatement(sql2);
            if(cid.getText().length()!=0 && cn.getText().length()!=0 && cno.getText().length()!=0 && ca.getText().length()!=0 && cd.getText().length()!=0 && vtp.getText().length()!=0 && vn.getText().length()!=0 && vpb.getText().length()!=0 && ad.getText().length()!=0 && at.getText().length()!=0){
                ps1.setString(1,cid.getText());
                ps1.setString(2,vtp.getText());
                ps1.setString(3,vn.getText());
                ps1.setString(4,vpb.getText());
                ps1.setString(5,ad.getText());
                ps1.setString(6,at.getText());
                ps2.setString(1,cid.getText());
                ps2.setString(2,cn.getText());
                ps2.setString(3,ca.getText());
                ps2.setString(4,cno.getText());
                ps2.setString(5,cd.getText());
                ps1.executeUpdate();
                ps2.executeUpdate();
                JOptionPane.showMessageDialog(null,"Data Inserted Successfully");
            }else{
                JOptionPane.showMessageDialog(null,"Insert Sufficient Data");
            }
            conn.close();
            cid.setText("");
            cn.setText("");
            ca.setText("");
            cno.setText("");
            cd.setText("");
            vtp.setText("");
            vn.setText("");
            vpb.setText("");

        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void vtpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vtpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_vtpActionPerformed

    private void vnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_vnActionPerformed

    private void vpbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vpbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_vpbActionPerformed

    private void adActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_adActionPerformed

    private void atActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_atActionPerformed

    private void cdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cdActionPerformed

    private void cidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cidActionPerformed

    private void cnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cnActionPerformed

    private void cnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cnoActionPerformed

    private void caActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_caActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_caActionPerformed

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
            java.util.logging.Logger.getLogger(admitVehicle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(admitVehicle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(admitVehicle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(admitVehicle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new admitVehicle().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ad;
    private javax.swing.JTextField at;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JTextField ca;
    private javax.swing.JTextField cd;
    private javax.swing.JTextField cid;
    private javax.swing.JTextField cn;
    private javax.swing.JTextField cno;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField vn;
    private javax.swing.JTextField vpb;
    private javax.swing.JTextField vtp;
    // End of variables declaration//GEN-END:variables
    
    @Override
    public void run() {
        while(true){
            Calendar cal=Calendar.getInstance();
            hours=cal.get(Calendar.HOUR_OF_DAY);
            minutes=cal.get(Calendar.MINUTE);
            seconds=cal.get(Calendar.SECOND);
            
            SimpleDateFormat sdf=new SimpleDateFormat("HH:mm:ss:aa");
            Date dt=cal.getTime();
            String tm=sdf.format(dt);
            at.setText(tm);
        }
    }
}
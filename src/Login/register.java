/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Login;

import java.awt.HeadlessException;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Asus
 */
public class register extends javax.swing.JFrame {

    /**
     * Creates new form register
     */
    public register() {
        initComponents();
       this.setExtendedState(JFrame.MAXIMIZED_BOTH);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
     private void GetData(){
        try {
            Connection conn= (Connection) Login.koneksi.koneksiDB();
            Statement stm = conn.createStatement();
            ResultSet sql = stm.executeQuery("select * from tbregister");
            
        } catch (Exception e) {
        }
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        syarat1 = new javax.swing.JLabel();
        syarat2 = new javax.swing.JLabel();
        syarat3 = new javax.swing.JLabel();
        syarat4 = new javax.swing.JLabel();
        syarat5 = new javax.swing.JLabel();
        syarat6 = new javax.swing.JLabel();
        syarat7 = new javax.swing.JLabel();
        signup = new javax.swing.JLabel();
        nama = new javax.swing.JLabel();
        tfNama = new javax.swing.JTextField();
        email = new javax.swing.JLabel();
        tfEmail = new javax.swing.JTextField();
        password = new javax.swing.JLabel();
        tfPassword = new javax.swing.JTextField();
        jeniskelamin = new javax.swing.JLabel();
        tfJenisKelamin = new javax.swing.JTextField();
        alamat = new javax.swing.JLabel();
        tfAlamat = new javax.swing.JTextField();
        notelepon = new javax.swing.JLabel();
        tfNoTelepon = new javax.swing.JTextField();
        image = new javax.swing.JLabel();
        cbApakah = new javax.swing.JCheckBox();
        btSignUp2 = new javax.swing.JButton();
        bg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        syarat1.setBackground(new java.awt.Color(29, 46, 66));
        syarat1.setFont(new java.awt.Font("Montserrat", 1, 24)); // NOI18N
        syarat1.setForeground(new java.awt.Color(29, 46, 66));
        syarat1.setText("Syarat dan kententuan");
        getContentPane().add(syarat1);
        syarat1.setBounds(60, 50, 410, 51);

        syarat2.setBackground(new java.awt.Color(29, 46, 66));
        syarat2.setFont(new java.awt.Font("Montserrat", 1, 24)); // NOI18N
        syarat2.setForeground(new java.awt.Color(29, 46, 66));
        syarat2.setText("mendaftar aplikasi ANJIM :");
        getContentPane().add(syarat2);
        syarat2.setBounds(60, 80, 490, 60);

        syarat3.setBackground(new java.awt.Color(29, 46, 66));
        syarat3.setFont(new java.awt.Font("Montserrat", 1, 24)); // NOI18N
        syarat3.setForeground(new java.awt.Color(29, 46, 66));
        syarat3.setText("1. Email aktif");
        getContentPane().add(syarat3);
        syarat3.setBounds(60, 140, 204, 51);

        syarat4.setBackground(new java.awt.Color(29, 46, 66));
        syarat4.setFont(new java.awt.Font("Montserrat", 1, 24)); // NOI18N
        syarat4.setForeground(new java.awt.Color(29, 46, 66));
        syarat4.setText("2. Kata sandi merupakan kombinasi  ");
        getContentPane().add(syarat4);
        syarat4.setBounds(60, 190, 500, 51);

        syarat5.setBackground(new java.awt.Color(29, 46, 66));
        syarat5.setFont(new java.awt.Font("Montserrat", 1, 24)); // NOI18N
        syarat5.setForeground(new java.awt.Color(29, 46, 66));
        syarat5.setText(" huruf dan angka");
        getContentPane().add(syarat5);
        syarat5.setBounds(80, 220, 250, 51);

        syarat6.setBackground(new java.awt.Color(29, 46, 66));
        syarat6.setFont(new java.awt.Font("Montserrat", 1, 24)); // NOI18N
        syarat6.setForeground(new java.awt.Color(29, 46, 66));
        syarat6.setText("3. Pastikan nomor hp/telepon anda aktif");
        getContentPane().add(syarat6);
        syarat6.setBounds(60, 260, 550, 51);

        syarat7.setBackground(new java.awt.Color(29, 46, 66));
        syarat7.setFont(new java.awt.Font("Montserrat", 1, 24)); // NOI18N
        syarat7.setForeground(new java.awt.Color(29, 46, 66));
        syarat7.setText("4. Sertakan alamat sesuai KTP");
        getContentPane().add(syarat7);
        syarat7.setBounds(60, 310, 430, 51);

        signup.setBackground(new java.awt.Color(29, 46, 66));
        signup.setFont(new java.awt.Font("Tahoma", 1, 50)); // NOI18N
        signup.setForeground(new java.awt.Color(29, 46, 66));
        signup.setText("Sign Up");
        getContentPane().add(signup);
        signup.setBounds(780, 2, 204, 90);

        nama.setBackground(new java.awt.Color(29, 46, 66));
        nama.setFont(new java.awt.Font("Montserrat", 1, 24)); // NOI18N
        nama.setForeground(new java.awt.Color(29, 46, 66));
        nama.setText("Nama");
        getContentPane().add(nama);
        nama.setBounds(680, 80, 102, 40);

        tfNama.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        getContentPane().add(tfNama);
        tfNama.setBounds(680, 120, 408, 40);

        email.setBackground(new java.awt.Color(29, 46, 66));
        email.setFont(new java.awt.Font("Montserrat", 1, 24)); // NOI18N
        email.setForeground(new java.awt.Color(29, 46, 66));
        email.setText("Email");
        getContentPane().add(email);
        email.setBounds(680, 160, 90, 40);

        tfEmail.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        getContentPane().add(tfEmail);
        tfEmail.setBounds(680, 200, 408, 40);

        password.setBackground(new java.awt.Color(29, 46, 66));
        password.setFont(new java.awt.Font("Montserrat", 1, 24)); // NOI18N
        password.setForeground(new java.awt.Color(29, 46, 66));
        password.setText("Password");
        getContentPane().add(password);
        password.setBounds(680, 240, 130, 40);

        tfPassword.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        getContentPane().add(tfPassword);
        tfPassword.setBounds(680, 280, 408, 40);

        jeniskelamin.setBackground(new java.awt.Color(29, 46, 66));
        jeniskelamin.setFont(new java.awt.Font("Montserrat", 1, 24)); // NOI18N
        jeniskelamin.setForeground(new java.awt.Color(29, 46, 66));
        jeniskelamin.setText("Jenis Kelamin");
        getContentPane().add(jeniskelamin);
        jeniskelamin.setBounds(680, 320, 190, 40);

        tfJenisKelamin.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        getContentPane().add(tfJenisKelamin);
        tfJenisKelamin.setBounds(680, 360, 408, 40);

        alamat.setBackground(new java.awt.Color(29, 46, 66));
        alamat.setFont(new java.awt.Font("Montserrat", 1, 24)); // NOI18N
        alamat.setForeground(new java.awt.Color(29, 46, 66));
        alamat.setText("Alamat");
        getContentPane().add(alamat);
        alamat.setBounds(680, 400, 110, 40);

        tfAlamat.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        getContentPane().add(tfAlamat);
        tfAlamat.setBounds(680, 440, 408, 40);

        notelepon.setBackground(new java.awt.Color(29, 46, 66));
        notelepon.setFont(new java.awt.Font("Montserrat", 1, 24)); // NOI18N
        notelepon.setForeground(new java.awt.Color(29, 46, 66));
        notelepon.setText("No Telepon");
        getContentPane().add(notelepon);
        notelepon.setBounds(680, 480, 160, 40);

        tfNoTelepon.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        getContentPane().add(tfNoTelepon);
        tfNoTelepon.setBounds(680, 520, 408, 40);

        image.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Login/1.png"))); // NOI18N
        image.setText("jLabel17");
        getContentPane().add(image);
        image.setBounds(30, 360, 420, 290);

        cbApakah.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        cbApakah.setForeground(new java.awt.Color(29, 46, 66));
        cbApakah.setText("Apakah data yang anda masukan sudah benar?");
        cbApakah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbApakahActionPerformed(evt);
            }
        });
        getContentPane().add(cbApakah);
        cbApakah.setBounds(680, 560, 420, 40);

        btSignUp2.setBackground(new java.awt.Color(84, 173, 186));
        btSignUp2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btSignUp2.setForeground(new java.awt.Color(29, 46, 66));
        btSignUp2.setText("Sign Up");
        btSignUp2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSignUp2ActionPerformed(evt);
            }
        });
        getContentPane().add(btSignUp2);
        btSignUp2.setBounds(790, 620, 153, 51);

        bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Login/bg1.png"))); // NOI18N
        bg.setText("jLabel15");
        getContentPane().add(bg);
        bg.setBounds(0, 0, 1150, 700);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btSignUp2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSignUp2ActionPerformed
        // TODO add your handling code here:
        login register1= new login();
        register1.setVisible(true);
        this.dispose();
        
        String hasil;
        if(cbApakah.isSelected()){
            hasil = "Benar";
        } else{
        }
        
            try {
            String sql ="insert into tbregister values('"+tfNama.getText()+"',"
                    + "'"+tfEmail.getText()+"',"
                    + "'"+tfPassword.getText()+"',"
                    + "'"+tfJenisKelamin.getText()+"',"
                    + "'"+tfAlamat.getText()+"',"
                    + "'"+ tfNoTelepon.getText()+" ', "
                    + "'"+cbApakah.getSelectedObjects()+"')";
            
            Connection conn = Login.koneksi.koneksiDB();
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.execute();
            
        tfEmail.setText("");    
        tfNama.setText("");
        tfAlamat.setText("");
        tfPassword.setText("");
        tfJenisKelamin.setText("");
        tfNoTelepon.setText("");
        cbApakah.setSelected(rootPaneCheckingEnabled);
       

        
        JOptionPane.showMessageDialog(null, "Berhasil Menyimpan");
        } catch (SQLException | HeadlessException e) {
             JOptionPane.showMessageDialog(null,"Gagal Menyimpan "+e.getMessage());
        }
    }                                        

    private void btKeluarActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
        if(JOptionPane.showConfirmDialog(null, "Apakah Anda Ingin Keluar?","Yakin?",JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION){
            System.exit(0);
        }
    }//GEN-LAST:event_btSignUp2ActionPerformed

    private void cbApakahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbApakahActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbApakahActionPerformed

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
            java.util.logging.Logger.getLogger(register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new register().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel alamat;
    private javax.swing.JLabel bg;
    private javax.swing.JButton btSignUp2;
    private javax.swing.JCheckBox cbApakah;
    private javax.swing.JLabel email;
    private javax.swing.JLabel image;
    private javax.swing.JLabel jeniskelamin;
    private javax.swing.JLabel nama;
    private javax.swing.JLabel notelepon;
    private javax.swing.JLabel password;
    private javax.swing.JLabel signup;
    private javax.swing.JLabel syarat1;
    private javax.swing.JLabel syarat2;
    private javax.swing.JLabel syarat3;
    private javax.swing.JLabel syarat4;
    private javax.swing.JLabel syarat5;
    private javax.swing.JLabel syarat6;
    private javax.swing.JLabel syarat7;
    private javax.swing.JTextField tfAlamat;
    private javax.swing.JTextField tfEmail;
    private javax.swing.JTextField tfJenisKelamin;
    private javax.swing.JTextField tfNama;
    private javax.swing.JTextField tfNoTelepon;
    private javax.swing.JTextField tfPassword;
    // End of variables declaration//GEN-END:variables
}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MenuAdmin;

import Login.menu_user;
import Login.wakaf_uang;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Asus
 */
public class LoginAdmin extends javax.swing.JFrame {

    /**
     * Creates new form LoginAdmin
     */
    public LoginAdmin() {
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
            Connection conn= (Connection) MenuAdmin.koneksi.koneksiDB();
            Statement stm = conn.createStatement();
            ResultSet sql = stm.executeQuery("select * from tbregister");
            
        } catch (Exception e) {
        }
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desc4 = new javax.swing.JLabel();
        signin = new javax.swing.JLabel();
        selamatdatang = new javax.swing.JLabel();
        desc1 = new javax.swing.JLabel();
        desc2 = new javax.swing.JLabel();
        desc3 = new javax.swing.JLabel();
        desc5 = new javax.swing.JLabel();
        desc6 = new javax.swing.JLabel();
        desc7 = new javax.swing.JLabel();
        signin1 = new javax.swing.JLabel();
        email = new javax.swing.JLabel();
        password = new javax.swing.JLabel();
        tfEmail = new javax.swing.JTextField();
        jCheckBox1 = new javax.swing.JCheckBox();
        jButton1 = new javax.swing.JButton();
        tfPassword = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();

        desc4.setBackground(new java.awt.Color(29, 46, 66));
        desc4.setFont(new java.awt.Font("Montserrat", 1, 24)); // NOI18N
        desc4.setForeground(new java.awt.Color(29, 46, 66));
        desc4.setText("Aplikasi ini dibuat untuk mempermudah");

        signin.setBackground(new java.awt.Color(29, 46, 66));
        signin.setFont(new java.awt.Font("Tahoma", 1, 50)); // NOI18N
        signin.setForeground(new java.awt.Color(29, 46, 66));
        signin.setText("Sign In");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        selamatdatang.setBackground(new java.awt.Color(29, 46, 66));
        selamatdatang.setFont(new java.awt.Font("Tahoma", 1, 50)); // NOI18N
        selamatdatang.setForeground(new java.awt.Color(29, 46, 66));
        selamatdatang.setText("Selamat Datang");
        getContentPane().add(selamatdatang);
        selamatdatang.setBounds(40, 70, 440, 61);

        desc1.setBackground(new java.awt.Color(29, 46, 66));
        desc1.setFont(new java.awt.Font("Montserrat", 1, 24)); // NOI18N
        desc1.setForeground(new java.awt.Color(29, 46, 66));
        desc1.setText("ANJIM singkatan dari Amalan Jariah Itu");
        getContentPane().add(desc1);
        desc1.setBounds(40, 160, 663, 51);

        desc2.setBackground(new java.awt.Color(29, 46, 66));
        desc2.setFont(new java.awt.Font("Montserrat", 1, 24)); // NOI18N
        desc2.setForeground(new java.awt.Color(29, 46, 66));
        desc2.setText("Mulia merupakan salah satu aplikasi   ");
        getContentPane().add(desc2);
        desc2.setBounds(40, 210, 561, 51);

        desc3.setBackground(new java.awt.Color(29, 46, 66));
        desc3.setFont(new java.awt.Font("Montserrat", 1, 24)); // NOI18N
        desc3.setForeground(new java.awt.Color(29, 46, 66));
        desc3.setText("wakaf berbasis digital.");
        getContentPane().add(desc3);
        desc3.setBounds(40, 260, 510, 50);

        desc5.setBackground(new java.awt.Color(29, 46, 66));
        desc5.setFont(new java.awt.Font("Montserrat", 1, 24)); // NOI18N
        desc5.setForeground(new java.awt.Color(29, 46, 66));
        desc5.setText("Aplikasi ini dibuat untuk mempermudah");
        getContentPane().add(desc5);
        desc5.setBounds(40, 370, 550, 32);

        desc6.setBackground(new java.awt.Color(29, 46, 66));
        desc6.setFont(new java.awt.Font("Montserrat", 1, 24)); // NOI18N
        desc6.setForeground(new java.awt.Color(29, 46, 66));
        desc6.setText("masyarakat untuk membayar waqaf");
        getContentPane().add(desc6);
        desc6.setBounds(40, 410, 490, 40);

        desc7.setBackground(new java.awt.Color(29, 46, 66));
        desc7.setFont(new java.awt.Font("Montserrat", 1, 24)); // NOI18N
        desc7.setForeground(new java.awt.Color(29, 46, 66));
        desc7.setText("lewat gadget pribadinya");
        getContentPane().add(desc7);
        desc7.setBounds(40, 450, 340, 50);

        signin1.setBackground(new java.awt.Color(29, 46, 66));
        signin1.setFont(new java.awt.Font("Tahoma", 1, 50)); // NOI18N
        signin1.setForeground(new java.awt.Color(29, 46, 66));
        signin1.setText("Sign In");
        getContentPane().add(signin1);
        signin1.setBounds(918, 75, 181, 61);

        email.setBackground(new java.awt.Color(29, 46, 66));
        email.setFont(new java.awt.Font("Montserrat", 1, 24)); // NOI18N
        email.setForeground(new java.awt.Color(29, 46, 66));
        email.setText("Email");
        getContentPane().add(email);
        email.setBounds(855, 175, 102, 51);

        password.setBackground(new java.awt.Color(29, 46, 66));
        password.setFont(new java.awt.Font("Montserrat", 1, 24)); // NOI18N
        password.setForeground(new java.awt.Color(29, 46, 66));
        password.setText("Password");
        getContentPane().add(password);
        password.setBounds(855, 290, 150, 51);

        tfEmail.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        tfEmail.setText("jTextField1");
        getContentPane().add(tfEmail);
        tfEmail.setBounds(855, 235, 357, 50);

        jCheckBox1.setText("Apakah Anda Sudah Yakin?");
        getContentPane().add(jCheckBox1);
        jCheckBox1.setBounds(855, 400, 255, 29);

        jButton1.setBackground(new java.awt.Color(84, 172, 183));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 27)); // NOI18N
        jButton1.setText("Sing In");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(969, 459, 153, 51);

        tfPassword.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        tfPassword.setText("jPasswordField1");
        getContentPane().add(tfPassword);
        tfPassword.setBounds(855, 340, 357, 50);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MenuAdmin/bg1.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 1275, 663);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        try{
            Connection conn = (Connection) MenuAdmin.koneksi.koneksiDB();
            Statement s = conn.createStatement();
            
            String sql = "SELECT * FROM tbregister WHERE email='" + tfEmail.getText()
                    +"' and password='"+ tfPassword.getText() + "'";
            ResultSet r = s.executeQuery(sql);
            
            if (r.next()){
                JOptionPane.showMessageDialog(null, "Login Berhasil");
                menu_admin admin= new menu_admin ();
                admin.setVisible(true);
                this.dispose(); 
            
            }else{
                JOptionPane.showMessageDialog(null, "Email atau Password Salah");
                tfPassword.requestFocus();
                
            }
        }catch(SQLException e){
            System.out.println("error");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(LoginAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel desc1;
    private javax.swing.JLabel desc2;
    private javax.swing.JLabel desc3;
    private javax.swing.JLabel desc4;
    private javax.swing.JLabel desc5;
    private javax.swing.JLabel desc6;
    private javax.swing.JLabel desc7;
    private javax.swing.JLabel email;
    private javax.swing.JButton jButton1;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel password;
    private javax.swing.JLabel selamatdatang;
    private javax.swing.JLabel signin;
    private javax.swing.JLabel signin1;
    private javax.swing.JTextField tfEmail;
    private javax.swing.JPasswordField tfPassword;
    // End of variables declaration//GEN-END:variables
}

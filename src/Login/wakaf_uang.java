/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Login;

import java.awt.HeadlessException;
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
public class wakaf_uang extends javax.swing.JFrame {

    /**
     * Creates new form wakaf_uang
     */
    public wakaf_uang() {
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
            ResultSet sql = stm.executeQuery("select * from tbwakafuang");
            
        } catch (Exception e) {
        }
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        silahkan = new javax.swing.JLabel();
        nik = new javax.swing.JLabel();
        tfNIK = new javax.swing.JTextField();
        nama = new javax.swing.JLabel();
        tfNama = new javax.swing.JTextField();
        alamat = new javax.swing.JLabel();
        tfAlamat = new javax.swing.JTextField();
        jeniskelamin = new javax.swing.JLabel();
        rbP = new javax.swing.JRadioButton();
        rbL = new javax.swing.JRadioButton();
        nominal = new javax.swing.JLabel();
        tfNominal = new javax.swing.JTextField();
        tfTanggal = new javax.swing.JLabel();
        atasnama = new javax.swing.JLabel();
        tfAN = new javax.swing.JTextField();
        title = new javax.swing.JLabel();
        btSimpan = new javax.swing.JButton();
        btKembali = new javax.swing.JButton();
        btKeluar = new javax.swing.JButton();
        image = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        silahkan.setBackground(new java.awt.Color(29, 46, 66));
        silahkan.setFont(new java.awt.Font("Tahoma", 1, 50)); // NOI18N
        silahkan.setForeground(new java.awt.Color(29, 46, 66));
        silahkan.setText("Silahkan Isi Data Anda");
        getContentPane().add(silahkan);
        silahkan.setBounds(50, 20, 590, 61);

        nik.setBackground(new java.awt.Color(29, 46, 66));
        nik.setFont(new java.awt.Font("Montserrat", 1, 24)); // NOI18N
        nik.setForeground(new java.awt.Color(29, 46, 66));
        nik.setText("NIK");
        getContentPane().add(nik);
        nik.setBounds(50, 90, 60, 50);

        tfNIK.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        tfNIK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfNIKActionPerformed(evt);
            }
        });
        getContentPane().add(tfNIK);
        tfNIK.setBounds(50, 130, 420, 40);

        nama.setBackground(new java.awt.Color(29, 46, 66));
        nama.setFont(new java.awt.Font("Montserrat", 1, 24)); // NOI18N
        nama.setForeground(new java.awt.Color(29, 46, 66));
        nama.setText("Nama Lengkap");
        getContentPane().add(nama);
        nama.setBounds(50, 170, 210, 40);

        tfNama.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        getContentPane().add(tfNama);
        tfNama.setBounds(50, 210, 420, 40);

        alamat.setBackground(new java.awt.Color(29, 46, 66));
        alamat.setFont(new java.awt.Font("Montserrat", 1, 24)); // NOI18N
        alamat.setForeground(new java.awt.Color(29, 46, 66));
        alamat.setText("Alamat");
        getContentPane().add(alamat);
        alamat.setBounds(50, 250, 110, 40);

        tfAlamat.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        getContentPane().add(tfAlamat);
        tfAlamat.setBounds(50, 290, 420, 40);

        jeniskelamin.setBackground(new java.awt.Color(29, 46, 66));
        jeniskelamin.setFont(new java.awt.Font("Montserrat", 1, 24)); // NOI18N
        jeniskelamin.setForeground(new java.awt.Color(29, 46, 66));
        jeniskelamin.setText("Jenis Kelamin");
        getContentPane().add(jeniskelamin);
        jeniskelamin.setBounds(50, 330, 180, 40);

        buttonGroup1.add(rbP);
        rbP.setFont(new java.awt.Font("Montserrat", 1, 20)); // NOI18N
        rbP.setForeground(new java.awt.Color(29, 46, 66));
        rbP.setText("P");
        rbP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbPActionPerformed(evt);
            }
        });
        getContentPane().add(rbP);
        rbP.setBounds(50, 370, 51, 40);

        buttonGroup1.add(rbL);
        rbL.setFont(new java.awt.Font("Montserrat", 1, 20)); // NOI18N
        rbL.setForeground(new java.awt.Color(29, 46, 66));
        rbL.setText("L");
        getContentPane().add(rbL);
        rbL.setBounds(120, 370, 50, 40);

        nominal.setBackground(new java.awt.Color(29, 46, 66));
        nominal.setFont(new java.awt.Font("Montserrat", 1, 24)); // NOI18N
        nominal.setForeground(new java.awt.Color(29, 46, 66));
        nominal.setText("Nominal");
        getContentPane().add(nominal);
        nominal.setBounds(50, 410, 120, 40);

        tfNominal.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        tfNominal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfNominalActionPerformed(evt);
            }
        });
        getContentPane().add(tfNominal);
        tfNominal.setBounds(50, 450, 430, 40);

        tfTanggal.setBackground(new java.awt.Color(29, 46, 66));
        tfTanggal.setFont(new java.awt.Font("Montserrat", 1, 24)); // NOI18N
        tfTanggal.setForeground(new java.awt.Color(29, 46, 66));
        tfTanggal.setText("Tanggal Wakaf (ex: 25-12-2021)");
        getContentPane().add(tfTanggal);
        tfTanggal.setBounds(50, 490, 357, 50);

        atasnama.setBackground(new java.awt.Color(29, 46, 66));
        atasnama.setFont(new java.awt.Font("Montserrat", 1, 24)); // NOI18N
        atasnama.setForeground(new java.awt.Color(29, 46, 66));
        atasnama.setText("Wakaf Atas Nama");
        getContentPane().add(atasnama);
        atasnama.setBounds(50, 570, 250, 40);

        tfAN.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        getContentPane().add(tfAN);
        tfAN.setBounds(50, 610, 430, 40);

        title.setBackground(new java.awt.Color(232, 248, 247));
        title.setFont(new java.awt.Font("Tahoma", 1, 50)); // NOI18N
        title.setForeground(new java.awt.Color(232, 248, 247));
        title.setText("Wakaf Uang");
        getContentPane().add(title);
        title.setBounds(740, 50, 320, 102);

        btSimpan.setBackground(new java.awt.Color(84, 173, 186));
        btSimpan.setFont(new java.awt.Font("Montserrat", 1, 24)); // NOI18N
        btSimpan.setForeground(new java.awt.Color(29, 46, 66));
        btSimpan.setText("Simpan");
        btSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSimpanActionPerformed(evt);
            }
        });
        getContentPane().add(btSimpan);
        btSimpan.setBounds(670, 610, 140, 47);

        btKembali.setBackground(new java.awt.Color(84, 173, 186));
        btKembali.setFont(new java.awt.Font("Montserrat", 1, 24)); // NOI18N
        btKembali.setForeground(new java.awt.Color(29, 46, 66));
        btKembali.setText("Kembali");
        btKembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btKembaliActionPerformed(evt);
            }
        });
        getContentPane().add(btKembali);
        btKembali.setBounds(820, 610, 150, 47);

        btKeluar.setBackground(new java.awt.Color(84, 173, 186));
        btKeluar.setFont(new java.awt.Font("Montserrat", 1, 24)); // NOI18N
        btKeluar.setForeground(new java.awt.Color(29, 46, 66));
        btKeluar.setText("Keluar");
        btKeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btKeluarActionPerformed(evt);
            }
        });
        getContentPane().add(btKeluar);
        btKeluar.setBounds(980, 610, 130, 47);

        image.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Login/4.png"))); // NOI18N
        getContentPane().add(image);
        image.setBounds(670, 60, 411, 510);

        jTextField1.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1);
        jTextField1.setBounds(51, 535, 430, 40);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Login/bg2.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 1173, 714);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rbPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbPActionPerformed

    private void btKembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btKembaliActionPerformed
        // TODO add your handling code here:
        menu_user menuuser= new menu_user ();
        menuuser.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btKembaliActionPerformed

    private void btSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSimpanActionPerformed
        // TODO add your handling code here:
        buttonGroup1.add(rbP);
        buttonGroup1.add(rbL);
   
        
        rbP.setActionCommand("Perempuan");
        rbL.setActionCommand("Laki-Laki");
       

        try {
            String sql ="insert into tbwakafuang values('"+tfNIK.getText()+"',"
                    + "'"+tfNama.getText()+"',"
                    + "'"+tfAlamat.getText()+"',"
                    + "'"+buttonGroup1.getSelection().getActionCommand()+"',"
                    + "'"+tfNominal.getText()+"',"
                    + "'"+tfTanggal.getText()+"',"
                    + "'"+tfAN.getText()+"')";
            Connection conn = Login.koneksi.koneksiDB();
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.execute();
            
        tfNIK.setText("");
        tfNama.setText("");
        tfAlamat.setText("");
        buttonGroup1.clearSelection();
        tfNominal.setText("");
        tfTanggal.setText("");
        tfAN.setText("");
       
        
        JOptionPane.showMessageDialog(null, "Berhasil Menyimpan");
        } catch (SQLException | HeadlessException e) {
             JOptionPane.showMessageDialog(null,"Gagal Menyimpan "+e.getMessage());
        }
    }//GEN-LAST:event_btSimpanActionPerformed

    private void btKeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btKeluarActionPerformed
        // TODO add your handling code here:
        if(JOptionPane.showConfirmDialog(null, "Apakah Anda Ingin Keluar?","Keluar?",JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION){
            System.exit(0);
        }
    }//GEN-LAST:event_btKeluarActionPerformed

    private void tfNominalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfNominalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfNominalActionPerformed

    private void tfNIKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfNIKActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfNIKActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

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
            java.util.logging.Logger.getLogger(wakaf_uang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(wakaf_uang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(wakaf_uang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(wakaf_uang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new wakaf_uang().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel alamat;
    private javax.swing.JLabel atasnama;
    private javax.swing.JButton btKeluar;
    private javax.swing.JButton btKembali;
    private javax.swing.JButton btSimpan;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel image;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel jeniskelamin;
    private javax.swing.JLabel nama;
    private javax.swing.JLabel nik;
    private javax.swing.JLabel nominal;
    private javax.swing.JRadioButton rbL;
    private javax.swing.JRadioButton rbP;
    private javax.swing.JLabel silahkan;
    private javax.swing.JTextField tfAN;
    private javax.swing.JTextField tfAlamat;
    private javax.swing.JTextField tfNIK;
    private javax.swing.JTextField tfNama;
    private javax.swing.JTextField tfNominal;
    private javax.swing.JLabel tfTanggal;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables
}

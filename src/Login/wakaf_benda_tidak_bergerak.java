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
public class wakaf_benda_tidak_bergerak extends javax.swing.JFrame {

    /**
     * Creates new form wakaf_benda_tidak_bergerak
     */
    public wakaf_benda_tidak_bergerak() {
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
            ResultSet sql = stm.executeQuery("select * from tbwakafbendatidakbergerak");
            
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
        bendadiwakafkan = new javax.swing.JLabel();
        tfBenda = new javax.swing.JTextField();
        pll = new javax.swing.JLabel();
        tfPanjang = new javax.swing.JTextField();
        tfLebar = new javax.swing.JTextField();
        tfLuas = new javax.swing.JTextField();
        tanggal = new javax.swing.JLabel();
        atasnama = new javax.swing.JLabel();
        tfAN = new javax.swing.JTextField();
        title1 = new javax.swing.JLabel();
        title2 = new javax.swing.JLabel();
        btSimpan = new javax.swing.JButton();
        btKembali = new javax.swing.JButton();
        btKeluar = new javax.swing.JButton();
        image = new javax.swing.JLabel();
        tfTanggal = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        silahkan.setBackground(new java.awt.Color(29, 46, 66));
        silahkan.setFont(new java.awt.Font("Tahoma", 1, 50)); // NOI18N
        silahkan.setForeground(new java.awt.Color(29, 46, 66));
        silahkan.setText("Silahkan Isi Data Anda");
        getContentPane().add(silahkan);
        silahkan.setBounds(50, 0, 579, 102);

        nik.setBackground(new java.awt.Color(29, 46, 66));
        nik.setFont(new java.awt.Font("Montserrat", 1, 24)); // NOI18N
        nik.setForeground(new java.awt.Color(29, 46, 66));
        nik.setText("NIK");
        getContentPane().add(nik);
        nik.setBounds(50, 90, 60, 40);

        tfNIK.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        getContentPane().add(tfNIK);
        tfNIK.setBounds(50, 130, 440, 40);

        nama.setBackground(new java.awt.Color(29, 46, 66));
        nama.setFont(new java.awt.Font("Montserrat", 1, 24)); // NOI18N
        nama.setForeground(new java.awt.Color(29, 46, 66));
        nama.setText("Nama Lengkap");
        getContentPane().add(nama);
        nama.setBounds(50, 170, 210, 40);

        tfNama.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        getContentPane().add(tfNama);
        tfNama.setBounds(50, 210, 440, 40);

        alamat.setBackground(new java.awt.Color(29, 46, 66));
        alamat.setFont(new java.awt.Font("Montserrat", 1, 24)); // NOI18N
        alamat.setForeground(new java.awt.Color(29, 46, 66));
        alamat.setText("Alamat");
        getContentPane().add(alamat);
        alamat.setBounds(50, 250, 110, 30);

        tfAlamat.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        getContentPane().add(tfAlamat);
        tfAlamat.setBounds(50, 280, 440, 40);

        jeniskelamin.setBackground(new java.awt.Color(29, 46, 66));
        jeniskelamin.setFont(new java.awt.Font("Montserrat", 1, 24)); // NOI18N
        jeniskelamin.setForeground(new java.awt.Color(29, 46, 66));
        jeniskelamin.setText("Jenis Kelamin");
        getContentPane().add(jeniskelamin);
        jeniskelamin.setBounds(50, 320, 190, 40);

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
        rbP.setBounds(50, 350, 50, 35);

        buttonGroup1.add(rbL);
        rbL.setFont(new java.awt.Font("Montserrat", 1, 20)); // NOI18N
        rbL.setForeground(new java.awt.Color(29, 46, 66));
        rbL.setText("L");
        getContentPane().add(rbL);
        rbL.setBounds(110, 350, 50, 35);

        bendadiwakafkan.setBackground(new java.awt.Color(29, 46, 66));
        bendadiwakafkan.setFont(new java.awt.Font("Montserrat", 1, 24)); // NOI18N
        bendadiwakafkan.setForeground(new java.awt.Color(29, 46, 66));
        bendadiwakafkan.setText("Benda Yang Diwakafkan");
        getContentPane().add(bendadiwakafkan);
        bendadiwakafkan.setBounds(50, 380, 320, 40);

        tfBenda.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        getContentPane().add(tfBenda);
        tfBenda.setBounds(50, 420, 450, 40);

        pll.setBackground(new java.awt.Color(29, 46, 66));
        pll.setFont(new java.awt.Font("Montserrat", 1, 24)); // NOI18N
        pll.setForeground(new java.awt.Color(29, 46, 66));
        pll.setText("Panjang (m) /   Lebar (m)  /   Luas (m2)");
        getContentPane().add(pll);
        pll.setBounds(50, 460, 500, 40);

        tfPanjang.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        tfPanjang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfPanjangActionPerformed(evt);
            }
        });
        getContentPane().add(tfPanjang);
        tfPanjang.setBounds(50, 500, 140, 40);

        tfLebar.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        getContentPane().add(tfLebar);
        tfLebar.setBounds(200, 500, 140, 40);

        tfLuas.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        tfLuas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfLuasActionPerformed(evt);
            }
        });
        getContentPane().add(tfLuas);
        tfLuas.setBounds(350, 500, 150, 40);

        tanggal.setBackground(new java.awt.Color(29, 46, 66));
        tanggal.setFont(new java.awt.Font("Montserrat", 1, 24)); // NOI18N
        tanggal.setForeground(new java.awt.Color(29, 46, 66));
        tanggal.setText("Tanggal Wakaf (ex: 25-12-2021)");
        getContentPane().add(tanggal);
        tanggal.setBounds(50, 540, 357, 40);

        atasnama.setBackground(new java.awt.Color(29, 46, 66));
        atasnama.setFont(new java.awt.Font("Montserrat", 1, 24)); // NOI18N
        atasnama.setForeground(new java.awt.Color(29, 46, 66));
        atasnama.setText("Wakaf Atas Nama");
        getContentPane().add(atasnama);
        atasnama.setBounds(50, 610, 250, 40);

        tfAN.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        getContentPane().add(tfAN);
        tfAN.setBounds(50, 650, 450, 40);

        title1.setBackground(new java.awt.Color(232, 248, 247));
        title1.setFont(new java.awt.Font("Tahoma", 1, 50)); // NOI18N
        title1.setForeground(new java.awt.Color(232, 248, 247));
        title1.setText("Wakaf Benda ");
        getContentPane().add(title1);
        title1.setBounds(730, 70, 347, 61);

        title2.setBackground(new java.awt.Color(232, 248, 247));
        title2.setFont(new java.awt.Font("Tahoma", 1, 50)); // NOI18N
        title2.setForeground(new java.awt.Color(232, 248, 247));
        title2.setText("Tidak Bergerak");
        getContentPane().add(title2);
        title2.setBounds(710, 130, 390, 61);

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
        btSimpan.setBounds(670, 620, 140, 50);

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
        btKembali.setBounds(820, 620, 160, 50);

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
        btKeluar.setBounds(990, 620, 130, 50);

        image.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Login/5.png"))); // NOI18N
        getContentPane().add(image);
        image.setBounds(663, 102, 459, 612);

        tfTanggal.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        tfTanggal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfTanggalActionPerformed(evt);
            }
        });
        getContentPane().add(tfTanggal);
        tfTanggal.setBounds(51, 577, 450, 40);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Login/bg2.png"))); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 1173, 714);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rbPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbPActionPerformed

    private void tfPanjangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfPanjangActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfPanjangActionPerformed

    private void btSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSimpanActionPerformed
        // TODO add your handling code here:
        buttonGroup1.add(rbP);
        buttonGroup1.add(rbL);
   
        
        rbP.setActionCommand("Perempuan");
        rbL.setActionCommand("Laki-Laki");
       

        try {
            String sql ="insert into tbwakafbendatidakbergerak values('"+tfNIK.getText()+"',"
                    + "'"+tfNama.getText()+"',"
                    + "'"+tfAlamat.getText()+"',"
                    + "'"+buttonGroup1.getSelection().getActionCommand()+"',"
                    + "'"+tfBenda.getText()+"',"
                    + "'"+tfPanjang.getText()+"',"
                    + "'"+tfLebar.getText()+"',"
                    + "'"+tfLuas.getText()+"',"
                    + "'"+tfTanggal.getText()+"',"
                    + "'"+tfAN.getText()+"')";
            Connection conn = Login.koneksi.koneksiDB();
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.execute();
            
        tfNIK.setText("");
        tfNama.setText("");
        tfAlamat.setText("");
        buttonGroup1.clearSelection();
        tfBenda.setText("");
        tfPanjang.setText("");
        tfLebar.setText("");
        tfLuas.setText("");
        tfTanggal.setText("");
        tfAN.setText("");
       
        
        JOptionPane.showMessageDialog(null, "Berhasil Menyimpan");
        } catch (SQLException | HeadlessException e) {
             JOptionPane.showMessageDialog(null,"Gagal Menyimpan "+e.getMessage());
        }
    }//GEN-LAST:event_btSimpanActionPerformed

    private void btKembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btKembaliActionPerformed
        // TODO add your handling code here:
        menu_user menuuser= new menu_user ();
        menuuser.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btKembaliActionPerformed

    private void btKeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btKeluarActionPerformed
        // TODO add your handling code here:
        if(JOptionPane.showConfirmDialog(null, "Apakah Anda Ingin Keluar?","Keluar?",JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION){
            System.exit(0);
        }
    }//GEN-LAST:event_btKeluarActionPerformed
String p ="";
String l = "";
String luas="";
long pjg,lbr,hasil;
    private void tfLuasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfLuasActionPerformed
        // TODO add your handling code here:
        p=tfPanjang.getText();
        l=tfLebar.getText();
        
        pjg= Long.parseLong(p);
        lbr=Long.parseLong(l);
        
        hasil= pjg*lbr;
        luas= String.valueOf(hasil);
        tfLuas.setText(luas);
     
    }//GEN-LAST:event_tfLuasActionPerformed

    private void tfTanggalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfTanggalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfTanggalActionPerformed

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
            java.util.logging.Logger.getLogger(wakaf_benda_tidak_bergerak.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(wakaf_benda_tidak_bergerak.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(wakaf_benda_tidak_bergerak.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(wakaf_benda_tidak_bergerak.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new wakaf_benda_tidak_bergerak().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel alamat;
    private javax.swing.JLabel atasnama;
    private javax.swing.JLabel bendadiwakafkan;
    private javax.swing.JButton btKeluar;
    private javax.swing.JButton btKembali;
    private javax.swing.JButton btSimpan;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel image;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jeniskelamin;
    private javax.swing.JLabel nama;
    private javax.swing.JLabel nik;
    private javax.swing.JLabel pll;
    private javax.swing.JRadioButton rbL;
    private javax.swing.JRadioButton rbP;
    private javax.swing.JLabel silahkan;
    private javax.swing.JLabel tanggal;
    private javax.swing.JTextField tfAN;
    private javax.swing.JTextField tfAlamat;
    private javax.swing.JTextField tfBenda;
    private javax.swing.JTextField tfLebar;
    private javax.swing.JTextField tfLuas;
    private javax.swing.JTextField tfNIK;
    private javax.swing.JTextField tfNama;
    private javax.swing.JTextField tfPanjang;
    private javax.swing.JTextField tfTanggal;
    private javax.swing.JLabel title1;
    private javax.swing.JLabel title2;
    // End of variables declaration//GEN-END:variables
}
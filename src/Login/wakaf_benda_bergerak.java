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
public class wakaf_benda_bergerak extends javax.swing.JFrame {

    /**
     * Creates new form wakaf_benda_bergerak
     */
    public wakaf_benda_bergerak() {
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
            ResultSet sql = stm.executeQuery("select * from tbwakafbendabergerak");
            
        } catch (Exception e) {
        }
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        silahkan = new javax.swing.JLabel();
        nik = new javax.swing.JLabel();
        tfNIK = new javax.swing.JTextField();
        nama = new javax.swing.JLabel();
        tfNama = new javax.swing.JTextField();
        alamat = new javax.swing.JLabel();
        tfAlamat = new javax.swing.JTextField();
        jeniskelamin = new javax.swing.JLabel();
        tfBenda = new javax.swing.JTextField();
        rbP = new javax.swing.JRadioButton();
        rbL = new javax.swing.JRadioButton();
        bendadiwaqafkan = new javax.swing.JLabel();
        tanggal = new javax.swing.JLabel();
        atasnama = new javax.swing.JLabel();
        tfAN = new javax.swing.JTextField();
        apakah1 = new javax.swing.JLabel();
        apakah2 = new javax.swing.JLabel();
        rbTidakBersedia = new javax.swing.JRadioButton();
        rbBersedia = new javax.swing.JRadioButton();
        tidakbersedia = new javax.swing.JLabel();
        title1 = new javax.swing.JLabel();
        title2 = new javax.swing.JLabel();
        btSimpan = new javax.swing.JButton();
        btKembali = new javax.swing.JButton();
        btKeluar = new javax.swing.JButton();
        image = new javax.swing.JLabel();
        tfTanggal = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        silahkan.setBackground(new java.awt.Color(29, 46, 66));
        silahkan.setFont(new java.awt.Font("Tahoma", 1, 50)); // NOI18N
        silahkan.setForeground(new java.awt.Color(29, 46, 66));
        silahkan.setText("Silahkan Isi Data Anda");
        getContentPane().add(silahkan);
        silahkan.setBounds(50, -10, 590, 102);

        nik.setBackground(new java.awt.Color(29, 46, 66));
        nik.setFont(new java.awt.Font("Montserrat", 1, 24)); // NOI18N
        nik.setForeground(new java.awt.Color(29, 46, 66));
        nik.setText("NIK");
        getContentPane().add(nik);
        nik.setBounds(50, 70, 70, 40);

        tfNIK.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        getContentPane().add(tfNIK);
        tfNIK.setBounds(50, 110, 440, 40);

        nama.setBackground(new java.awt.Color(29, 46, 66));
        nama.setFont(new java.awt.Font("Montserrat", 1, 24)); // NOI18N
        nama.setForeground(new java.awt.Color(29, 46, 66));
        nama.setText("Nama Lengkap");
        getContentPane().add(nama);
        nama.setBounds(50, 150, 210, 40);

        tfNama.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        getContentPane().add(tfNama);
        tfNama.setBounds(50, 190, 440, 40);

        alamat.setBackground(new java.awt.Color(29, 46, 66));
        alamat.setFont(new java.awt.Font("Montserrat", 1, 24)); // NOI18N
        alamat.setForeground(new java.awt.Color(29, 46, 66));
        alamat.setText("Alamat");
        getContentPane().add(alamat);
        alamat.setBounds(50, 230, 130, 40);

        tfAlamat.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        tfAlamat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfAlamatActionPerformed(evt);
            }
        });
        getContentPane().add(tfAlamat);
        tfAlamat.setBounds(50, 270, 440, 40);

        jeniskelamin.setBackground(new java.awt.Color(29, 46, 66));
        jeniskelamin.setFont(new java.awt.Font("Montserrat", 1, 24)); // NOI18N
        jeniskelamin.setForeground(new java.awt.Color(29, 46, 66));
        jeniskelamin.setText("Jenis Kelamin");
        getContentPane().add(jeniskelamin);
        jeniskelamin.setBounds(50, 310, 190, 30);

        tfBenda.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        getContentPane().add(tfBenda);
        tfBenda.setBounds(50, 400, 450, 40);

        rbP.setBackground(new java.awt.Color(29, 46, 66));
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
        rbP.setBounds(50, 340, 50, 30);

        rbL.setBackground(new java.awt.Color(29, 46, 66));
        buttonGroup1.add(rbL);
        rbL.setFont(new java.awt.Font("Montserrat", 1, 20)); // NOI18N
        rbL.setForeground(new java.awt.Color(29, 46, 66));
        rbL.setText("L");
        rbL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbLActionPerformed(evt);
            }
        });
        getContentPane().add(rbL);
        rbL.setBounds(110, 340, 50, 30);

        bendadiwaqafkan.setBackground(new java.awt.Color(29, 46, 66));
        bendadiwaqafkan.setFont(new java.awt.Font("Montserrat", 1, 24)); // NOI18N
        bendadiwaqafkan.setForeground(new java.awt.Color(29, 46, 66));
        bendadiwaqafkan.setText("Benda Yang Diwakafkan");
        getContentPane().add(bendadiwaqafkan);
        bendadiwaqafkan.setBounds(50, 360, 330, 40);

        tanggal.setBackground(new java.awt.Color(29, 46, 66));
        tanggal.setFont(new java.awt.Font("Montserrat", 1, 24)); // NOI18N
        tanggal.setForeground(new java.awt.Color(29, 46, 66));
        tanggal.setText("Tanggal Wakaf (ex: 25-12-2021)");
        getContentPane().add(tanggal);
        tanggal.setBounds(50, 440, 408, 30);

        atasnama.setBackground(new java.awt.Color(29, 46, 66));
        atasnama.setFont(new java.awt.Font("Montserrat", 1, 24)); // NOI18N
        atasnama.setForeground(new java.awt.Color(29, 46, 66));
        atasnama.setText("Wakaf Atas Nama");
        getContentPane().add(atasnama);
        atasnama.setBounds(50, 510, 250, 30);

        tfAN.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        getContentPane().add(tfAN);
        tfAN.setBounds(50, 540, 459, 40);

        apakah1.setFont(new java.awt.Font("Montserrat", 1, 18)); // NOI18N
        apakah1.setForeground(new java.awt.Color(29, 46, 66));
        apakah1.setText("Apakah anda bersedia mengantarkan");
        getContentPane().add(apakah1);
        apakah1.setBounds(50, 580, 410, 30);

        apakah2.setBackground(new java.awt.Color(29, 46, 66));
        apakah2.setFont(new java.awt.Font("Montserrat", 1, 18)); // NOI18N
        apakah2.setForeground(new java.awt.Color(29, 46, 66));
        apakah2.setText("barang anda ke alamat kami?");
        getContentPane().add(apakah2);
        apakah2.setBounds(50, 610, 310, 20);

        buttonGroup2.add(rbTidakBersedia);
        rbTidakBersedia.setFont(new java.awt.Font("Montserrat", 1, 20)); // NOI18N
        rbTidakBersedia.setForeground(new java.awt.Color(29, 46, 66));
        rbTidakBersedia.setText("Tidak bersedia dan menginzinkan petugas");
        rbTidakBersedia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbTidakBersediaActionPerformed(evt);
            }
        });
        getContentPane().add(rbTidakBersedia);
        rbTidakBersedia.setBounds(170, 630, 510, 51);

        buttonGroup2.add(rbBersedia);
        rbBersedia.setFont(new java.awt.Font("Montserrat", 1, 20)); // NOI18N
        rbBersedia.setForeground(new java.awt.Color(29, 46, 66));
        rbBersedia.setText("Bersedia");
        rbBersedia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbBersediaActionPerformed(evt);
            }
        });
        getContentPane().add(rbBersedia);
        rbBersedia.setBounds(50, 630, 130, 51);

        tidakbersedia.setBackground(new java.awt.Color(29, 46, 66));
        tidakbersedia.setFont(new java.awt.Font("Montserrat", 1, 20)); // NOI18N
        tidakbersedia.setForeground(new java.awt.Color(29, 46, 66));
        tidakbersedia.setText("waqaf mengambil barang sesuai domisili");
        getContentPane().add(tidakbersedia);
        tidakbersedia.setBounds(190, 660, 480, 50);

        title1.setBackground(new java.awt.Color(232, 248, 247));
        title1.setFont(new java.awt.Font("Tahoma", 1, 50)); // NOI18N
        title1.setForeground(new java.awt.Color(232, 248, 247));
        title1.setText("Wakaf Benda");
        getContentPane().add(title1);
        title1.setBounds(740, 80, 332, 61);

        title2.setBackground(new java.awt.Color(232, 248, 247));
        title2.setFont(new java.awt.Font("Tahoma", 1, 50)); // NOI18N
        title2.setForeground(new java.awt.Color(232, 248, 247));
        title2.setText("Bergerak");
        getContentPane().add(title2);
        title2.setBounds(790, 140, 229, 61);

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
        btSimpan.setBounds(670, 631, 140, 41);

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
        btKembali.setBounds(820, 631, 160, 41);

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
        btKeluar.setBounds(990, 631, 130, 41);

        image.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Login/6_1.png"))); // NOI18N
        getContentPane().add(image);
        image.setBounds(690, -30, 400, 663);

        tfTanggal.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        getContentPane().add(tfTanggal);
        tfTanggal.setBounds(50, 473, 450, 40);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Login/bg2.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 1173, 714);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfAlamatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfAlamatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfAlamatActionPerformed

    private void rbPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbPActionPerformed

    private void rbLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbLActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbLActionPerformed

    private void rbBersediaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbBersediaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbBersediaActionPerformed

    private void rbTidakBersediaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbTidakBersediaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbTidakBersediaActionPerformed

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

    private void btSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSimpanActionPerformed
        // TODO add your handling code here:
        buttonGroup1.add(rbP);
        buttonGroup1.add(rbL);
   
        rbP.setActionCommand("Perempuan");
        rbL.setActionCommand("Laki-Laki");
        
        buttonGroup2.add(rbBersedia);
        buttonGroup2.add(rbTidakBersedia);
        
        rbBersedia.setActionCommand("Bersedia");
        rbTidakBersedia.setActionCommand("Tidak Bersedia");
       

        try {
            String sql ="insert into tbwakafbendabergerak values('"+tfNIK.getText()+"',"
                    + "'"+tfNama.getText()+"',"
                    + "'"+tfAlamat.getText()+"',"
                    + "'"+buttonGroup1.getSelection().getActionCommand()+"',"
                    + "'"+tfBenda.getText()+"',"
                   + "'"+tfTanggal.getText()+"',"
                   + "'"+tfAN.getText()+"',"
                    + "'"+buttonGroup2.getSelection().getActionCommand()+"')";
            Connection conn = Login.koneksi.koneksiDB();
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.execute();
            
        tfNIK.setText("");
        tfNama.setText("");
        tfAlamat.setText("");
        buttonGroup1.clearSelection();
        tfBenda.setText("");
        tfTanggal.setText("");
        tfAN.setText("");
        buttonGroup2.clearSelection();
     
        
        JOptionPane.showMessageDialog(null, "Berhasil Menyimpan");
        } catch (SQLException | HeadlessException e) {
             JOptionPane.showMessageDialog(null,"Gagal Menyimpan "+e.getMessage());
        }
    }//GEN-LAST:event_btSimpanActionPerformed

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
            java.util.logging.Logger.getLogger(wakaf_benda_bergerak.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(wakaf_benda_bergerak.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(wakaf_benda_bergerak.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(wakaf_benda_bergerak.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new wakaf_benda_bergerak().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel alamat;
    private javax.swing.JLabel apakah1;
    private javax.swing.JLabel apakah2;
    private javax.swing.JLabel atasnama;
    private javax.swing.JLabel bendadiwaqafkan;
    private javax.swing.JButton btKeluar;
    private javax.swing.JButton btKembali;
    private javax.swing.JButton btSimpan;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JLabel image;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jeniskelamin;
    private javax.swing.JLabel nama;
    private javax.swing.JLabel nik;
    private javax.swing.JRadioButton rbBersedia;
    private javax.swing.JRadioButton rbL;
    private javax.swing.JRadioButton rbP;
    private javax.swing.JRadioButton rbTidakBersedia;
    private javax.swing.JLabel silahkan;
    private javax.swing.JLabel tanggal;
    private javax.swing.JTextField tfAN;
    private javax.swing.JTextField tfAlamat;
    private javax.swing.JTextField tfBenda;
    private javax.swing.JTextField tfNIK;
    private javax.swing.JTextField tfNama;
    private javax.swing.JTextField tfTanggal;
    private javax.swing.JLabel tidakbersedia;
    private javax.swing.JLabel title1;
    private javax.swing.JLabel title2;
    // End of variables declaration//GEN-END:variables
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MenuAdmin;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Asus
 */
public class Wakaf_Benda_TidakBergerak extends javax.swing.JFrame {
    
    private void tampilankosong(){
        txnik.setText(null);
        txnama.setText(null);
        txalamat.setText(null);
        txgender.setText(null);
        txbenda.setText(null);   
        txluas.setText(null);   
        txtanggal.setText(null);   
        txatasnama.setText(null);   
    }

    /**
     * Creates new form Wakaf_Benda_TidakBergerak
     */
    public Wakaf_Benda_TidakBergerak() {
        initComponents();
        tampilantabelbtb();
        btCari.setVisible(false);
         this.setExtendedState(JFrame.MAXIMIZED_BOTH);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        title = new javax.swing.JLabel();
        masukkannik = new javax.swing.JLabel();
        tfNIK = new javax.swing.JTextField();
        btCari = new javax.swing.JButton();
        btHapus = new javax.swing.JButton();
        btEdit = new javax.swing.JButton();
        btKembali = new javax.swing.JButton();
        btKeluar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txnik = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txbenda = new javax.swing.JTextField();
        txtanggal = new javax.swing.JTextField();
        txatasnama = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txnama = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txalamat = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txluas = new javax.swing.JTextField();
        txgender = new javax.swing.JTextField();
        bg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "NIK", "Nama", "Alamat", "Jenis Kelamin", "Benda Wakaf", "Luas", "Tanggal", "Atas Nama"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(7).setResizable(false);
        }

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(60, 150, 1030, 170);

        title.setBackground(new java.awt.Color(29, 46, 66));
        title.setFont(new java.awt.Font("Tahoma", 1, 50)); // NOI18N
        title.setForeground(new java.awt.Color(29, 46, 66));
        title.setText("Data Wakaf Benda Tidak Bergerak");
        getContentPane().add(title);
        title.setBounds(140, 0, 890, 102);

        masukkannik.setBackground(new java.awt.Color(29, 46, 66));
        masukkannik.setFont(new java.awt.Font("Montserrat", 1, 24)); // NOI18N
        masukkannik.setForeground(new java.awt.Color(29, 46, 66));
        masukkannik.setText("Cari/Edit NIK     :");
        getContentPane().add(masukkannik);
        masukkannik.setBounds(50, 560, 250, 40);

        tfNIK.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        tfNIK.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfNIKKeyTyped(evt);
            }
        });
        getContentPane().add(tfNIK);
        tfNIK.setBounds(300, 560, 390, 40);

        btCari.setBackground(new java.awt.Color(84, 173, 186));
        btCari.setFont(new java.awt.Font("Montserrat", 1, 24)); // NOI18N
        btCari.setForeground(new java.awt.Color(29, 46, 66));
        btCari.setText("Cari");
        getContentPane().add(btCari);
        btCari.setBounds(40, 620, 197, 50);

        btHapus.setBackground(new java.awt.Color(84, 173, 186));
        btHapus.setFont(new java.awt.Font("Montserrat", 1, 24)); // NOI18N
        btHapus.setForeground(new java.awt.Color(29, 46, 66));
        btHapus.setText("Hapus");
        btHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btHapusActionPerformed(evt);
            }
        });
        getContentPane().add(btHapus);
        btHapus.setBounds(270, 620, 197, 50);

        btEdit.setBackground(new java.awt.Color(84, 173, 186));
        btEdit.setFont(new java.awt.Font("Montserrat", 1, 24)); // NOI18N
        btEdit.setForeground(new java.awt.Color(29, 46, 66));
        btEdit.setText("Edit");
        btEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEditActionPerformed(evt);
            }
        });
        getContentPane().add(btEdit);
        btEdit.setBounds(500, 620, 197, 50);

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
        btKembali.setBounds(730, 620, 180, 50);

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
        btKeluar.setBounds(940, 620, 180, 50);

        jLabel1.setFont(new java.awt.Font("Montserrat", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(29, 46, 66));
        jLabel1.setText("NIK:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(130, 340, 100, 40);

        txnik.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txnik.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txnikActionPerformed(evt);
            }
        });
        getContentPane().add(txnik);
        txnik.setBounds(270, 340, 240, 40);

        jLabel5.setFont(new java.awt.Font("Montserrat", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(29, 46, 66));
        jLabel5.setText("Benda:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(590, 340, 130, 40);

        txbenda.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txbenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txbendaActionPerformed(evt);
            }
        });
        getContentPane().add(txbenda);
        txbenda.setBounds(750, 340, 240, 40);

        txtanggal.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtanggal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtanggalActionPerformed(evt);
            }
        });
        getContentPane().add(txtanggal);
        txtanggal.setBounds(750, 440, 240, 40);

        txatasnama.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txatasnama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txatasnamaActionPerformed(evt);
            }
        });
        getContentPane().add(txatasnama);
        txatasnama.setBounds(750, 490, 240, 40);

        jLabel7.setFont(new java.awt.Font("Montserrat", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(29, 46, 66));
        jLabel7.setText("Atas Nama:");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(590, 490, 150, 30);

        jLabel6.setFont(new java.awt.Font("Montserrat", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(29, 46, 66));
        jLabel6.setText("Tanggal:");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(590, 440, 130, 30);

        txnama.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txnama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txnamaActionPerformed(evt);
            }
        });
        getContentPane().add(txnama);
        txnama.setBounds(270, 390, 240, 40);

        jLabel2.setFont(new java.awt.Font("Montserrat", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(29, 46, 66));
        jLabel2.setText("Nama:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(130, 390, 100, 40);

        jLabel3.setFont(new java.awt.Font("Montserrat", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(29, 46, 66));
        jLabel3.setText("Alamat:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(130, 440, 150, 40);

        txalamat.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txalamat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txalamatActionPerformed(evt);
            }
        });
        getContentPane().add(txalamat);
        txalamat.setBounds(270, 440, 240, 40);

        jLabel4.setFont(new java.awt.Font("Montserrat", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(29, 46, 66));
        jLabel4.setText("Gender:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(130, 490, 120, 40);

        jLabel8.setFont(new java.awt.Font("Montserrat", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(29, 46, 66));
        jLabel8.setText("Luas:");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(590, 390, 130, 40);

        txluas.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txluas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txluasActionPerformed(evt);
            }
        });
        getContentPane().add(txluas);
        txluas.setBounds(750, 390, 240, 40);

        txgender.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txgender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txgenderActionPerformed(evt);
            }
        });
        getContentPane().add(txgender);
        txgender.setBounds(270, 490, 240, 40);

        bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Login/bg3.png"))); // NOI18N
        bg.setText("jLabel3");
        getContentPane().add(bg);
        bg.setBounds(0, 0, 1150, 700);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void GetData(){
        try {
            Connection con = (Connection) Login.koneksi.koneksiDB();
            Statement stm = con.createStatement();
            ResultSet sql = stm.executeQuery("select * from tbwakafbendatidakbergerak");
            
        } catch (Exception e) {}
    }
    
    private void tampilantabelbtb(){
        DefaultTableModel tb = new DefaultTableModel();
        tb.addColumn("               NIK");
        tb.addColumn("              Nama");
        tb.addColumn("              Alamat");
        tb.addColumn("       Jenis Kelamin");
        tb.addColumn("       Benda Wakaf");
        tb.addColumn("              Luas");
        tb.addColumn("            Tanggal");
        tb.addColumn("         Atas Nama");
        
        jTable1.setModel(tb);
        
        try {
            Connection conn = (Connection) Login.koneksi.koneksiDB();
            Statement ppt =  conn.createStatement();
            ResultSet sql = ppt.executeQuery("select * from tbwakafbendatidakbergerak");
            
            while (sql.next()) {
                GetData();
                tb.addRow(new Object[]{
                    sql.getString("nik"),
                    sql.getString("nama"),
                    sql.getString("alamat"),
                    sql.getString("gender"),
                    sql.getString("bendawakaf"),
                    sql.getString("luas"),
                    sql.getString("tanggal"),
                    sql.getString("atasnama")                    
                });
            }
            
        } catch (Exception e) {
        }
    }
    
    private void btHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btHapusActionPerformed
        // TODO add your handling code here:
        try {
            String sql = "DELETE FROM tbwakafbendatidakbergerak WHERE nik='" + txnik.getText() + "'";
            java.sql.Connection conn = (Connection) Login.koneksi.koneksiDB();
            java.sql.PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.execute();
            JOptionPane.showMessageDialog(null, "Hapus Data Berhasil...");
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
        tampilantabelbtb();
        tampilankosong();
    }//GEN-LAST:event_btHapusActionPerformed

    private void btKeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btKeluarActionPerformed
        // TODO add your handling code here:
          if(JOptionPane.showConfirmDialog(null, "Apakah Anda Ingin Keluar?","Yakin?",JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION){
            System.exit(0);
          }
    }//GEN-LAST:event_btKeluarActionPerformed

    private void btKembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btKembaliActionPerformed
        // TODO add your handling code here:
         menu_admin menuadmin= new menu_admin ();
        menuadmin.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btKembaliActionPerformed

    private void tfNIKKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfNIKKeyTyped
        // TODO add your handling code here:
        DefaultTableModel tb = new DefaultTableModel();
        tb.addColumn("               NIK");
        tb.addColumn("              Nama");
        tb.addColumn("              Alamat");
        tb.addColumn("       Jenis Kelamin");
        tb.addColumn("       Benda Wakaf");
        tb.addColumn("              Luas");
        tb.addColumn("            Tanggal");
        tb.addColumn("         Atas Nama");
        
        try{
            Connection conn = (Connection) Login.koneksi.koneksiDB();
            String sql = "Select * from tbwakafbendatidakbergerak where nik like '%" + tfNIK.getText() + "%'";
            Statement stat = conn.createStatement();
            ResultSet rs = stat.executeQuery(sql);
            while(rs.next()){
                tb.addRow(new Object[]{
                    rs.getString(1),
                    rs.getString(2),
                    rs.getString(3),
                    rs.getString(4),
                    rs.getString(5),
                    rs.getString(8),
                    rs.getString(9),
                    rs.getString(10)
                });
            }
            jTable1.setModel(tb);
            GetData();
        }catch(Exception e){
           System.out.println("Cari Data Error");
        }finally{
        }
    }//GEN-LAST:event_tfNIKKeyTyped

    private void btEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEditActionPerformed
        // TODO add your handling code here:
        try{
            String sql = "UPDATE tbwakafbendatidakbergerak SET nik='" + txnik.getText() 
                    + "',nama='" + txnama.getText() 
                    + "',alamat='" + txalamat.getText()
                    + "',gender='" + txgender.getText() 
                    + "',bendawakaf='" + txbenda.getText() 
                    + "',luas='" + txluas.getText() 
                    + "',tanggal='" + txtanggal.getText() 
                    + "',atasnama='" + txatasnama.getText() 
                    + "' WHERE nik = '" + txnik.getText() + "'";
            java.sql.Connection conn = (Connection)Login.koneksi.koneksiDB();
            java.sql.PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.execute();
            JOptionPane.showMessageDialog(null, "Edit Data Berhasil...");
        }catch(HeadlessException | SQLException e){
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
        tampilantabelbtb();
        tampilankosong();
    }//GEN-LAST:event_btEditActionPerformed

    private void txnikActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txnikActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txnikActionPerformed

    private void txbendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txbendaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txbendaActionPerformed

    private void txtanggalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtanggalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtanggalActionPerformed

    private void txatasnamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txatasnamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txatasnamaActionPerformed

    private void txnamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txnamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txnamaActionPerformed

    private void txalamatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txalamatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txalamatActionPerformed

    private void txluasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txluasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txluasActionPerformed

    private void txgenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txgenderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txgenderActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        int baris = jTable1.rowAtPoint(evt.getPoint());
        String nik = jTable1.getValueAt(baris, 0).toString();
        txnik.setText(nik);
        
        String nama = jTable1.getValueAt(baris, 1).toString();
        txnama.setText(nama);
        
        String alamat = jTable1.getValueAt(baris, 2).toString();
        txalamat.setText(alamat);
        
        String gender = jTable1.getValueAt(baris, 3).toString();
        txgender.setText(gender);
        
        String bendawakaf = jTable1.getValueAt(baris, 4).toString();
        txbenda.setText(bendawakaf);
        
        String luas = jTable1.getValueAt(baris, 5).toString();
        txluas.setText(luas);
        
        String tanggal = jTable1.getValueAt(baris, 6).toString();
        txtanggal.setText(tanggal);
        
        String atasnama = jTable1.getValueAt(baris, 7).toString();
        txatasnama.setText(atasnama);
    }//GEN-LAST:event_jTable1MouseClicked

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
            java.util.logging.Logger.getLogger(Wakaf_Benda_TidakBergerak.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Wakaf_Benda_TidakBergerak.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Wakaf_Benda_TidakBergerak.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Wakaf_Benda_TidakBergerak.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Wakaf_Benda_TidakBergerak().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bg;
    private javax.swing.JButton btCari;
    private javax.swing.JButton btEdit;
    private javax.swing.JButton btHapus;
    private javax.swing.JButton btKeluar;
    private javax.swing.JButton btKembali;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel masukkannik;
    private javax.swing.JTextField tfNIK;
    private javax.swing.JLabel title;
    private javax.swing.JTextField txalamat;
    private javax.swing.JTextField txatasnama;
    private javax.swing.JTextField txbenda;
    private javax.swing.JTextField txgender;
    private javax.swing.JTextField txluas;
    private javax.swing.JTextField txnama;
    private javax.swing.JTextField txnik;
    private javax.swing.JTextField txtanggal;
    // End of variables declaration//GEN-END:variables
}

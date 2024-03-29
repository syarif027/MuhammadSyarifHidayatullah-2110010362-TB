
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class transaksi extends javax.swing.JFrame {

    /**
     * Creates new form transaksi
     */
DefaultTableModel model;

    public transaksi() {
          initComponents();
    String[] judul = {"No Pembayaran", "NIK", "Nama Pendaftar", "Pembayaran", "Transaksi" };
    model = new DefaultTableModel(judul, 0);
    tdata.setModel(model);
    tampilkan();

    tdata.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            tabelMouseClicked(evt);
        }
              private void tabelMouseClicked(MouseEvent evt) {
                  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
              }
          });
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        tnama = new javax.swing.JTextField();
        tnopembayaran = new javax.swing.JTextField();
        tnik = new javax.swing.JTextField();
        jcpembayaran = new javax.swing.JComboBox<>();
        ttransaksi = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        bsimpan = new javax.swing.JButton();
        bedit = new javax.swing.JButton();
        bhapus = new javax.swing.JButton();
        butama = new javax.swing.JButton();
        bkeluar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tdata = new javax.swing.JTable();
        bbersihkan = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 204, 255));
        jLabel1.setText("Pendaftaran Siswa Baru");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Data Transaksi");

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("NIK");

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Nama Pendaftar");

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("No Pembayaran");

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Pembayaran");

        tnama.setBackground(new java.awt.Color(51, 51, 51));
        tnama.setForeground(new java.awt.Color(255, 255, 255));
        tnama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tnamaActionPerformed(evt);
            }
        });

        tnopembayaran.setBackground(new java.awt.Color(51, 51, 51));
        tnopembayaran.setForeground(new java.awt.Color(255, 255, 255));
        tnopembayaran.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tnopembayaranActionPerformed(evt);
            }
        });

        tnik.setBackground(new java.awt.Color(51, 51, 51));
        tnik.setForeground(new java.awt.Color(255, 255, 255));
        tnik.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tnikActionPerformed(evt);
            }
        });

        jcpembayaran.setBackground(new java.awt.Color(102, 102, 102));
        jcpembayaran.setForeground(new java.awt.Color(255, 255, 255));
        jcpembayaran.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Bank Kalsel", "BNI", "BRI", "BCA", "Mandiri" }));
        jcpembayaran.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcpembayaranActionPerformed(evt);
            }
        });

        ttransaksi.setBackground(new java.awt.Color(51, 51, 51));
        ttransaksi.setForeground(new java.awt.Color(255, 255, 255));
        ttransaksi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ttransaksiActionPerformed(evt);
            }
        });

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Transaksi");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(362, 362, 362)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jLabel4)
                    .addComponent(jLabel6)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5))
                .addGap(114, 114, 114)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ttransaksi, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tnama, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcpembayaran, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(tnik, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
                        .addComponent(tnopembayaran)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tnopembayaran, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(26, 26, 26)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tnik, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(20, 20, 20)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jcpembayaran, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(tnama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4)))
                .addGap(27, 27, 27)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ttransaksi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(163, 163, 163))
        );

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));

        bsimpan.setBackground(new java.awt.Color(153, 204, 255));
        bsimpan.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        bsimpan.setText("Simpan");
        bsimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bsimpanActionPerformed(evt);
            }
        });

        bedit.setBackground(new java.awt.Color(153, 204, 255));
        bedit.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        bedit.setText("Edit");
        bedit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                beditActionPerformed(evt);
            }
        });

        bhapus.setBackground(new java.awt.Color(153, 204, 255));
        bhapus.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        bhapus.setText("Hapus");
        bhapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bhapusActionPerformed(evt);
            }
        });

        butama.setBackground(new java.awt.Color(153, 204, 255));
        butama.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        butama.setText("Halaman Utama");
        butama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butamaActionPerformed(evt);
            }
        });

        bkeluar.setBackground(new java.awt.Color(51, 51, 51));
        bkeluar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        bkeluar.setForeground(new java.awt.Color(255, 255, 255));
        bkeluar.setText("Keluar");
        bkeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bkeluarActionPerformed(evt);
            }
        });

        tdata.setBackground(new java.awt.Color(51, 51, 51));
        tdata.setForeground(new java.awt.Color(255, 255, 255));
        tdata.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "No Pembayaran", "NIK", "Nama", "Pembayaran", "Transaksi"
            }
        ));
        jScrollPane1.setViewportView(tdata);

        bbersihkan.setBackground(new java.awt.Color(153, 204, 255));
        bbersihkan.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        bbersihkan.setText("Bersihkan");
        bbersihkan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bbersihkanActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(bsimpan)
                .addGap(55, 55, 55)
                .addComponent(bedit)
                .addGap(50, 50, 50)
                .addComponent(bhapus)
                .addGap(64, 64, 64)
                .addComponent(bbersihkan)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 329, Short.MAX_VALUE)
                .addComponent(butama)
                .addGap(54, 54, 54)
                .addComponent(bkeluar)
                .addGap(81, 81, 81))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bbersihkan)
                    .addComponent(bhapus)
                    .addComponent(bedit)
                    .addComponent(bsimpan)
                    .addComponent(butama)
                    .addComponent(bkeluar))
                .addGap(24, 24, 24))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(446, 446, 446))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(518, 518, 518))))
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addGap(38, 38, 38)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(333, 333, 333))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 574, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ttransaksiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ttransaksiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ttransaksiActionPerformed

    private void tnamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tnamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tnamaActionPerformed

    private void tnopembayaranActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tnopembayaranActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tnopembayaranActionPerformed

    private void tnikActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tnikActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tnikActionPerformed

    private void jcpembayaranActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcpembayaranActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcpembayaranActionPerformed

    private void bsimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bsimpanActionPerformed
        String no_transaksi = tnopembayaran.getText();
        String nik = tnik.getText();
        String nama = tnama.getText();
        String pembayaran = jcpembayaran.getSelectedItem().toString();
        String transaksi = ttransaksi.getText();

        // Tambahkan data ke tabel GUI
        String[] data = {no_transaksi, nik, nama, pembayaran, transaksi};
        model.addRow(data);

        // Simpan data ke database
        try {
            try (Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/ppdb_", "root", "")) {
                String query = "INSERT INTO transaksi (no_transaksi, nik, nama, pembayaran, transaksi) VALUES (?, ?, ?, ?, ?)";
                try (PreparedStatement pst = cn.prepareStatement(query)) {
                    pst.setString(1, no_transaksi);
                    pst.setString(2, nik);
                    pst.setString(3, nama);
                    pst.setString(4, pembayaran);
                    pst.setString(5, transaksi);
                    int rowsAffected = pst.executeUpdate();

                    if (rowsAffected > 0) {
                        JOptionPane.showMessageDialog(this, "Data berhasil disimpan");
                    } else {
                        JOptionPane.showMessageDialog(this, "Data gagal disimpan");
                    }
                }
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Error menyimpan data ke database: " + ex.getMessage());
            Logger.getLogger(transaksi.class.getName()).log(Level.SEVERE, null, ex);
        }
          // TODO add your handling code here:
    }//GEN-LAST:event_bsimpanActionPerformed

    private void beditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_beditActionPerformed
         int selectedRow = tdata.getSelectedRow();
        if (selectedRow != -1) {
        String nik = (String) tdata.getValueAt(selectedRow, 0);
        // Ambil data dari inputan
        String no_transaksi = tnopembayaran.getText();
        String nama = tnama.getText();
        String pembayaran = jcpembayaran.getSelectedItem().toString();
        String transaksi = ttransaksi.getText();

        // Update data di tabel GUI
        tdata.setValueAt(no_transaksi, selectedRow, 0);
        tdata.setValueAt(nik, selectedRow, 1);
        tdata.setValueAt(nama, selectedRow, 2);
        tdata.setValueAt(pembayaran, selectedRow, 3);
        tdata.setValueAt(transaksi, selectedRow, 4);

        // Update data di database
        try {
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/ppdb_", "root", "");
            String query = "UPDATE transaksi SET no_transaksi=?, nama=?, pembayaran=?, transaksi=? WHERE nik=?";
            PreparedStatement pst = cn.prepareStatement(query);
            pst.setString(1, no_transaksi);
            pst.setString(2, nama);
            pst.setString(3, pembayaran);
            pst.setString(4, transaksi);
            pst.setString(5, nik);
            pst.executeUpdate();
            JOptionPane.showMessageDialog(this, "Data berhasil diupdate");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Error mengupdate data di database: " + ex.getMessage());
            Logger.getLogger(transaksi.class.getName()).log(Level.SEVERE, null, ex);
        }
    } else {
        JOptionPane.showMessageDialog(this, "Pilih baris yang akan diupdate");
    }        // TODO add your handling code here:
    }//GEN-LAST:event_beditActionPerformed

    private void bhapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bhapusActionPerformed
    int selectedRow = tdata.getSelectedRow();
    if (selectedRow != -1) {
        int konfirmasi = JOptionPane.showConfirmDialog(this, "Apakah Anda yakin ingin menghapus data?", "Konfirmasi Hapus", JOptionPane.YES_NO_OPTION);
        if (konfirmasi == JOptionPane.YES_OPTION) {
            // Ambil nilai NIK dari baris terpilih
            String nik = (String) tdata.getValueAt(selectedRow, 0);

            // Hapus baris terpilih dari tabel
            model.removeRow(selectedRow);

            // Hapus data dari database
            try {
                Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/ppdb_", "root", "");
                String query = "DELETE FROM transaksi WHERE NIK=?";
                PreparedStatement pst = cn.prepareStatement(query);
                pst.setString(1, nik);
                pst.executeUpdate();
                JOptionPane.showMessageDialog(this, "Data berhasil dihapus");
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this, "Error menghapus data dari database: " + ex.getMessage());
                Logger.getLogger(transaksi.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    } else {
        JOptionPane.showMessageDialog(this, "Pilih baris yang akan dihapus");
    }        // TODO add your handling code here:
    }//GEN-LAST:event_bhapusActionPerformed

    private void butamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butamaActionPerformed
    utama Formutama = new utama();
               Formutama.setVisible(true);
               dispose();        
               //berpindah ke halaman utama
// TODO add your handling code here:
    }//GEN-LAST:event_butamaActionPerformed

    private void bkeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bkeluarActionPerformed
    int konfirmasi = JOptionPane.showConfirmDialog(this, "Apakah Anda yakin ingin Keluar?", "Konfirmasi Keluar", JOptionPane.YES_NO_OPTION);
    if (konfirmasi == JOptionPane.YES_OPTION) {
    System.exit(0);}
        // Menampilkan konfirmasi yang menanyakan pengguna apakah ingin keluar dari aplikasi atau tidak        // TODO add your handling code here:
    }//GEN-LAST:event_bkeluarActionPerformed

    private void bbersihkanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bbersihkanActionPerformed
        tnopembayaran.setText("");
        tnik.setText("");
        tnama.setText("");
        jcpembayaran.setSelectedItem("");
        ttransaksi.setText("");
        //membersihkan text yang ada di kolom pengisisan
               // TODO add your handling code here:
    }//GEN-LAST:event_bbersihkanActionPerformed

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
            java.util.logging.Logger.getLogger(utama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(utama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(utama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(utama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new transaksi().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bbersihkan;
    private javax.swing.JButton bedit;
    private javax.swing.JButton bhapus;
    private javax.swing.JButton bkeluar;
    private javax.swing.JButton bsimpan;
    private javax.swing.JButton butama;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> jcpembayaran;
    private javax.swing.JTable tdata;
    private javax.swing.JTextField tnama;
    private javax.swing.JTextField tnik;
    private javax.swing.JTextField tnopembayaran;
    private javax.swing.JTextField ttransaksi;
    // End of variables declaration//GEN-END:variables
    
    private void tampilkan() {
        int row = model.getRowCount();
        for (int a = row - 1; a >= 0; a--) {
            model.removeRow(a);
        }

        try {
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/ppdb_", "root", "");
            ResultSet rs = cn.createStatement().executeQuery("SELECT * FROM transaksi");

            while (rs.next()) {
                String data[] = {rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5) };
                model.addRow(data);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Koneksi ke database gagal: " + ex.getMessage());
            Logger.getLogger(transaksi.class.getName()).log(Level.SEVERE, null, ex);
        }
    
         catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error initializing components: " + e.getMessage());
            Logger.getLogger(transaksi.class.getName()).log(Level.SEVERE, null, e);
        }
    }
}


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
public class siswa extends javax.swing.JFrame {

    /**
     * Creates new form siswa
     */
        DefaultTableModel model;
    public siswa() {
        initComponents();
    String[] judul = {"NIK", "Nama Pendaftar", "Jenis Kelamin", "Tempat", "Tanggal Lahir", "Agama", "Alamat", "Asal Sekolah" };
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
        jPanel2 = new javax.swing.JPanel();
        bsimpan = new javax.swing.JButton();
        bedit = new javax.swing.JButton();
        bhapus = new javax.swing.JButton();
        butama = new javax.swing.JButton();
        bkeluar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tdata = new javax.swing.JTable();
        bbersihkan = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        tnama = new javax.swing.JTextField();
        tnik = new javax.swing.JTextField();
        talamat = new javax.swing.JTextField();
        tasalsekolah = new javax.swing.JTextField();
        ttgllahir = new javax.swing.JTextField();
        ttempatlahir = new javax.swing.JTextField();
        jckelamin = new javax.swing.JComboBox<>();
        jcagama = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 204, 255));
        jLabel1.setText("Pendaftaran Siswa Baru");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Data Siswa");

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
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "NIS", "Nama", "Jenis Kelamin", "Tempat", "Tanggal Lahir", "Agama", "Alamat", "Asal Sekolah"
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
                .addGap(78, 78, 78)
                .addComponent(bsimpan)
                .addGap(50, 50, 50)
                .addComponent(bedit)
                .addGap(59, 59, 59)
                .addComponent(bhapus)
                .addGap(66, 66, 66)
                .addComponent(bbersihkan)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(butama)
                .addGap(66, 66, 66)
                .addComponent(bkeluar)
                .addGap(81, 81, 81))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bbersihkan)
                    .addComponent(bhapus)
                    .addComponent(bedit)
                    .addComponent(bsimpan)
                    .addComponent(butama)
                    .addComponent(bkeluar))
                .addGap(31, 31, 31))
        );

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("NIK");

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Nama Pendaftar");

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Jenis Kelamin");

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Tempat Lahir");

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Agama");

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Tanggal Lahir");

        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Alamat");

        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Asal Sekolah");

        tnama.setBackground(new java.awt.Color(51, 51, 51));
        tnama.setForeground(new java.awt.Color(255, 255, 255));
        tnama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tnamaActionPerformed(evt);
            }
        });

        tnik.setBackground(new java.awt.Color(51, 51, 51));
        tnik.setForeground(new java.awt.Color(255, 255, 255));
        tnik.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tnikActionPerformed(evt);
            }
        });

        talamat.setBackground(new java.awt.Color(51, 51, 51));
        talamat.setForeground(new java.awt.Color(255, 255, 255));
        talamat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                talamatActionPerformed(evt);
            }
        });

        tasalsekolah.setBackground(new java.awt.Color(51, 51, 51));
        tasalsekolah.setForeground(new java.awt.Color(255, 255, 255));
        tasalsekolah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tasalsekolahActionPerformed(evt);
            }
        });

        ttgllahir.setBackground(new java.awt.Color(51, 51, 51));
        ttgllahir.setForeground(new java.awt.Color(255, 255, 255));
        ttgllahir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ttgllahirActionPerformed(evt);
            }
        });

        ttempatlahir.setBackground(new java.awt.Color(51, 51, 51));
        ttempatlahir.setForeground(new java.awt.Color(255, 255, 255));
        ttempatlahir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ttempatlahirActionPerformed(evt);
            }
        });

        jckelamin.setBackground(new java.awt.Color(102, 102, 102));
        jckelamin.setForeground(new java.awt.Color(255, 255, 255));
        jckelamin.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Laki-Laki", "Perempuan" }));
        jckelamin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jckelaminActionPerformed(evt);
            }
        });

        jcagama.setBackground(new java.awt.Color(102, 102, 102));
        jcagama.setForeground(new java.awt.Color(255, 255, 255));
        jcagama.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Islam", "Kristen", "Hindu", "Budha", "Konghocu" }));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                            .addComponent(jLabel3)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tnik, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel6)
                                .addComponent(jLabel5))
                            .addGap(74, 74, 74)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jckelamin, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(tnama, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(ttempatlahir, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 111, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10))
                .addGap(71, 71, 71)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jcagama, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ttgllahir, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(talamat, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tasalsekolah, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(115, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tnik, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ttgllahir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcagama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(tnama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(talamat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(jckelamin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(85, 85, 85))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel6)
                    .addComponent(ttempatlahir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tasalsekolah, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(434, 434, 434)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(525, 525, 525)
                        .addComponent(jLabel2)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bsimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bsimpanActionPerformed
    String nik = tnik.getText();
    String nama = tnama.getText();
    String jeniskelamin = jckelamin.getSelectedItem().toString();
    String tempatlahir = ttempatlahir.getText();
    String tanggallahir = ttgllahir.getText();
    String agama = jcagama.getSelectedItem().toString();
    String alamat = talamat.getText();
    String asalsekolah = tasalsekolah.getText();

    // Tambahkan data ke tabel GUI
    String[] data = {nik, nama, jeniskelamin, tempatlahir, tanggallahir, agama, alamat, asalsekolah};
    model.addRow(data);

    // Simpan data ke database
    try {
        Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/ppdb_", "root", "");
        String query = "INSERT INTO siswa (nik, nama, jenis_kelamin, tempat_lahir, tanggal_lahir, agama, alamat, asal_sekolah) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
        PreparedStatement pst = cn.prepareStatement(query);
        pst.setString(1, nik);
        pst.setString(2, nama);
        pst.setString(3, jeniskelamin);
        pst.setString(4, tempatlahir);
        pst.setString(5, tanggallahir);
        pst.setString(6, agama);
        pst.setString(7, alamat);
        pst.setString(8, asalsekolah);
        pst.executeUpdate();
        JOptionPane.showMessageDialog(this, "Data berhasil disimpan");
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(this, "Error menyimpan data ke database: " + ex.getMessage());
        Logger.getLogger(siswa.class.getName()).log(Level.SEVERE, null, ex);
    }    // TODO add your handling code here:
    }//GEN-LAST:event_bsimpanActionPerformed

    private void beditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_beditActionPerformed
         int selectedRow = tdata.getSelectedRow();
         if (selectedRow != -1) {
    String nik = tnik.getText();
    String nama = tnama.getText();
    String jeniskelamin = jckelamin.getSelectedItem().toString();
    String tempatlahir = ttempatlahir.getText();
    String tanggallahir = ttgllahir.getText();
    String agama = jcagama.getSelectedItem().toString();
    String alamat = talamat.getText();
    String asalsekolah = tasalsekolah.getText();

        // Update data di tabel GUI
        tdata.setValueAt(nik, selectedRow, 0);
        tdata.setValueAt(nama, selectedRow, 1);
        tdata.setValueAt(jeniskelamin, selectedRow, 2);
        tdata.setValueAt(tempatlahir, selectedRow, 3);
        tdata.setValueAt(tanggallahir, selectedRow, 4);
        tdata.setValueAt(agama, selectedRow, 5);
        tdata.setValueAt(alamat, selectedRow, 6);
        tdata.setValueAt(asalsekolah, selectedRow, 7);

        // Update data di database
        try {
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/ppdb_", "root", "");
            String query = "UPDATE siswa SET nama=?, jenis_kelamin=?, tempat_lahir=?, tanggal_lahir=?, agama=?, alamat=?, asal_sekolah=? WHERE nik=?";
            PreparedStatement pst = cn.prepareStatement(query);
            pst.setString(1, nik);
            pst.setString(2, nama);
            pst.setString(3, jeniskelamin);
            pst.setString(4, tempatlahir);
            pst.setString(5, tanggallahir);
            pst.setString(6, agama);
            pst.setString(7, alamat);
            pst.setString(8, asalsekolah);
            pst.executeUpdate();
            JOptionPane.showMessageDialog(this, "Data berhasil diupdate");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Error mengupdate data di database: " + ex.getMessage());
            Logger.getLogger(siswa.class.getName()).log(Level.SEVERE, null, ex);
        }
    } else {
        JOptionPane.showMessageDialog(this, "Pilih baris yang akan diupdate");
    }         // TODO add your handling code here:
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
                String query = "DELETE FROM siswa WHERE NIK=?";
                PreparedStatement pst = cn.prepareStatement(query);
                pst.setString(1, nik);
                pst.executeUpdate();
                JOptionPane.showMessageDialog(this, "Data berhasil dihapus");
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this, "Error menghapus data dari database: " + ex.getMessage());
                Logger.getLogger(siswa.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    } else {
        JOptionPane.showMessageDialog(this, "Pilih baris yang akan dihapus");
    }        // TODO add your handling code here:
    }//GEN-LAST:event_bhapusActionPerformed

    private void butamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butamaActionPerformed
    utama Formutama = new utama();
               Formutama.setVisible(true);
               dispose();    // TODO add your handling code here:
    }//GEN-LAST:event_butamaActionPerformed

    private void bkeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bkeluarActionPerformed
    int konfirmasi = JOptionPane.showConfirmDialog(this, "Apakah Anda yakin ingin Keluar?", "Konfirmasi Keluar", JOptionPane.YES_NO_OPTION);
    if (konfirmasi == JOptionPane.YES_OPTION) {
    System.exit(0);}
        // Menampilkan konfirmasi yang menanyakan pengguna apakah ingin keluar dari aplikasi atau tidak        // TODO add your handling code here:
    }//GEN-LAST:event_bkeluarActionPerformed

    private void bbersihkanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bbersihkanActionPerformed
        tnik.setText("");
        tnama.setText("");
        jckelamin.setSelectedItem("");
        ttempatlahir.setText("");
        ttgllahir.setText(""); 
        jcagama.setSelectedItem("");
        talamat.setText("");
        tasalsekolah.setText("");
        //membersihkan text yang ada di kolom pengisisan
// TODO add your handling code here:
    }//GEN-LAST:event_bbersihkanActionPerformed

    private void jckelaminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jckelaminActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jckelaminActionPerformed

    private void ttempatlahirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ttempatlahirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ttempatlahirActionPerformed

    private void ttgllahirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ttgllahirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ttgllahirActionPerformed

    private void tasalsekolahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tasalsekolahActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tasalsekolahActionPerformed

    private void talamatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_talamatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_talamatActionPerformed

    private void tnikActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tnikActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tnikActionPerformed

    private void tnamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tnamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tnamaActionPerformed

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
                new siswa().setVisible(true);
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
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> jcagama;
    private javax.swing.JComboBox<String> jckelamin;
    private javax.swing.JTextField talamat;
    private javax.swing.JTextField tasalsekolah;
    private javax.swing.JTable tdata;
    private javax.swing.JTextField tnama;
    private javax.swing.JTextField tnik;
    private javax.swing.JTextField ttempatlahir;
    private javax.swing.JTextField ttgllahir;
    // End of variables declaration//GEN-END:variables

    private void tampilkan() {
    int row = model.getRowCount();
        for (int a = row - 1; a >= 0; a--) {
            model.removeRow(a);
        }

        try {
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/ppdb_", "root", "");
            ResultSet rs = cn.createStatement().executeQuery("SELECT * FROM siswa");

            while (rs.next()) {
                String data[] = {rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8) };
                model.addRow(data);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Koneksi ke database gagal: " + ex.getMessage());
            Logger.getLogger(siswa.class.getName()).log(Level.SEVERE, null, ex);
        }
    
         catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error initializing components: " + e.getMessage());
            Logger.getLogger(siswa.class.getName()).log(Level.SEVERE, null, e);
        } 
        //To change body of generated methods, choose Tools | Templates.
    }
}

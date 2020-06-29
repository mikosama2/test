/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import aksesdata.AksesDataPembayaran;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Alexander Pratama
 */
public class Pembayaran extends javax.swing.JFrame {

    private final int idKasir;
    private final AksesDataPembayaran aksesDataPembayaran;

    /**
     * Creates new form Pembayaran
     */
    public Pembayaran(int idKasir) throws SQLException {
        initComponents();
        this.idKasir = idKasir;
        this.aksesDataPembayaran = new AksesDataPembayaran();
        this.setTextIdPembayaran();
        this.setTextIdKasir();
        this.texttotal.setEnabled(false);
        this.texthargatix.setEnabled(false);
        this.setVisible(true);
    }

    private void setTextIdKasir() throws SQLException {
        this.textidkasirpemb.setEditable(false);
        this.textidkasirpemb.setEnabled(false);
        this.textidkasirpemb.setText(String.valueOf(this.idKasir));
    }

    private void setTextIdPembayaran() throws SQLException {
        this.textidpemb.setEditable(false);
        this.textidpemb.setEnabled(false);
        int idPembayaranOtomatis = this.aksesDataPembayaran.getSequenceIdPembayaran();
        this.textidpemb.setText(String.valueOf(idPembayaranOtomatis));
    }

    private boolean cekSemuaTextKosong() {
        return this.textidpemb.getText().isEmpty()
                || this.textidkasirpemb.getText().isEmpty()
                || this.texttanggalpemb.getText().isEmpty()
                || this.textidmempemb.getText().isEmpty()
                || this.textbanyaktix.getText().isEmpty()
                || this.texttotal.getText().isEmpty();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labeljudulpemb = new javax.swing.JLabel();
        labelidpemb = new javax.swing.JLabel();
        labelidkasirpemb = new javax.swing.JLabel();
        labeltanggal = new javax.swing.JLabel();
        labelidmempemb = new javax.swing.JLabel();
        labelbanyaktix = new javax.swing.JLabel();
        labeltotal = new javax.swing.JLabel();
        textidpemb = new javax.swing.JTextField();
        textidkasirpemb = new javax.swing.JTextField();
        texttanggalpemb = new javax.swing.JTextField();
        textidmempemb = new javax.swing.JTextField();
        textbanyaktix = new javax.swing.JTextField();
        texttotal = new javax.swing.JTextField();
        texthargatix = new javax.swing.JTextField();
        buttoninsertpemb = new javax.swing.JButton();
        buttonbackpemb = new javax.swing.JButton();
        labelx = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        labeljudulpemb.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        labeljudulpemb.setText("Transaksi Pembayaran");

        labelidpemb.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        labelidpemb.setText("ID Pembayaran");

        labelidkasirpemb.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        labelidkasirpemb.setText("ID Kasir");

        labeltanggal.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        labeltanggal.setText("Tanggal");

        labelidmempemb.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        labelidmempemb.setText("ID Member");

        labelbanyaktix.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        labelbanyaktix.setText("Banyak Tiket");

        labeltotal.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        labeltotal.setText("Total");

        texttanggalpemb.setText("DD/MM/YYYY");

        textbanyaktix.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                textbanyaktixKeyReleased(evt);
            }
        });

        texthargatix.setText("20000");

        buttoninsertpemb.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        buttoninsertpemb.setText("Insert");
        buttoninsertpemb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttoninsertpembActionPerformed(evt);
            }
        });

        buttonbackpemb.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        buttonbackpemb.setText("Back");
        buttonbackpemb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonbackpembActionPerformed(evt);
            }
        });

        labelx.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        labelx.setText("X");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelidpemb)
                    .addComponent(labelidkasirpemb)
                    .addComponent(labeltanggal)
                    .addComponent(labelidmempemb)
                    .addComponent(labelbanyaktix)
                    .addComponent(labeltotal))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(textbanyaktix, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(labelx, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(texthargatix, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(20, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(buttonbackpemb, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(texttotal, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(textidkasirpemb, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(textidpemb, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(texttanggalpemb, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(textidmempemb, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(buttoninsertpemb, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(labeljudulpemb, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labeljudulpemb)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelidpemb)
                    .addComponent(textidpemb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelidkasirpemb)
                    .addComponent(textidkasirpemb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labeltanggal)
                    .addComponent(texttanggalpemb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelidmempemb)
                    .addComponent(textidmempemb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelbanyaktix)
                    .addComponent(textbanyaktix, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(texthargatix, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelx))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labeltotal)
                    .addComponent(texttotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttoninsertpemb, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                    .addComponent(buttonbackpemb, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonbackpembActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonbackpembActionPerformed
        Menu menu = new Menu(this.idKasir);
        menu.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_buttonbackpembActionPerformed

    private void buttoninsertpembActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttoninsertpembActionPerformed
        if (cekSemuaTextKosong()) {
            JOptionPane.showMessageDialog(null, "Isi semua data terlebih dahulu");
        } else {
            try {
                int idKasir = Integer.parseInt(textidkasirpemb.getText());
                int idMember = Integer.parseInt(textidmempemb.getText());
                String tanggalPembayaran = texttanggalpemb.getText();
                int hargaTiket = Integer.parseInt(texthargatix.getText());
                int banyakTiket = Integer.parseInt(textbanyaktix.getText());
                int total = hargaTiket * banyakTiket;
                this.aksesDataPembayaran.create(idKasir, idMember, tanggalPembayaran, hargaTiket,
                        banyakTiket, total);
                this.setTextIdPembayaran();
                this.setTextIdKasir();
                JOptionPane.showMessageDialog(null, "Data berhasil diinsert");
            } catch (SQLException ex) {
                Logger.getLogger(Pembayaran.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }//GEN-LAST:event_buttoninsertpembActionPerformed

    private void textbanyaktixKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textbanyaktixKeyReleased
        if (textbanyaktix.getText().isEmpty()) {
            texttotal.setText(null);
        } else {
            int total = Integer.parseInt(textbanyaktix.getText()) * Integer.parseInt(texthargatix.getText());
            texttotal.setText(String.valueOf(total));
        }
    }//GEN-LAST:event_textbanyaktixKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonbackpemb;
    private javax.swing.JButton buttoninsertpemb;
    private javax.swing.JLabel labelbanyaktix;
    private javax.swing.JLabel labelidkasirpemb;
    private javax.swing.JLabel labelidmempemb;
    private javax.swing.JLabel labelidpemb;
    private javax.swing.JLabel labeljudulpemb;
    private javax.swing.JLabel labeltanggal;
    private javax.swing.JLabel labeltotal;
    private javax.swing.JLabel labelx;
    private javax.swing.JTextField textbanyaktix;
    private javax.swing.JTextField texthargatix;
    private javax.swing.JTextField textidkasirpemb;
    private javax.swing.JTextField textidmempemb;
    private javax.swing.JTextField textidpemb;
    private javax.swing.JTextField texttanggalpemb;
    private javax.swing.JTextField texttotal;
    // End of variables declaration//GEN-END:variables
}

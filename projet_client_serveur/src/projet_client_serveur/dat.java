/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package  projet_client_serveur;

import BDD.Parameter;
import BDD.ResultSetTableModel;
import BDD.db_connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author liamsi
 */
public class dat extends javax.swing.JFrame {

    /**
     * Creates new form cachier
     */
    
    ResultSet rs;
    db_connection db;
    int old, dec, now;
    
    
    public dat() {
        db = new db_connection(new Parameter().HOST_DB, new Parameter().USERNAME_DB, new Parameter().PASSWORD_DB, new Parameter().IPHOST, new Parameter().PORT);
        
        initComponents();
        table();
        jam();
        txtdat.setEnabled(false);
        date();
        
    }

    public void table() {
        String colon[] = {"code_produit","reference","Famile","prix","stock"};
        rs = db.querySelect(colon, "produit");
        tbl_res.setModel(new ResultSetTableModel(rs));
    }

    public void importer() {
        String colon[] = {"num_facture","code_produit","reference","prix_vente","stock_sortie","subtotal","date"};
        rs = db.fcSelectCommand(colon, "vente", "num_facture='" + txtfac.getText() + "'");
        tbl_ven.setModel(new ResultSetTableModel(rs));
    }
     public void jam() {
        Date s = new Date();
        SimpleDateFormat tgl = new SimpleDateFormat("EEEE-dd-MMM-yyyy");
        SimpleDateFormat jam = new SimpleDateFormat("HH:mm");
        lbl1.setText(jam.format(s));
        lbl2.setText(tgl.format(s));}
     
      public void date() {
        Date s = new Date();
        SimpleDateFormat tgl = new SimpleDateFormat("dd/MM/yyyy");
        txtdat.setText(tgl.format(s));}
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_res = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        txtid = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtcod = new javax.swing.JTextField();
        txtref = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtdes = new javax.swing.JTextField();
        txtnou = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtsto = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        lbltot1 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl_ven = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        lbl1 = new javax.swing.JLabel();
        lbl2 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        lbltot2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        txtfac = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        txtdat = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(java.awt.SystemColor.activeCaption);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setLocation(new java.awt.Point(160, 10));
        getContentPane().setLayout(null);

        jPanel1.setBackground(java.awt.SystemColor.activeCaption);
        jPanel1.setLayout(null);

        tbl_res.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "code_produit", "reference", "deseignation", "rangement", "fournisseur", "remise", "prix", "stock "
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tbl_res.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_resMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_res);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(0, 150, 990, 130);

        jLabel6.setFont(new java.awt.Font("Times New Roman", 3, 36)); // NOI18N
        jLabel6.setText("Panier");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(490, 10, 100, 42);

        jButton3.setFont(new java.awt.Font("Times New Roman", 3, 15)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projet_client_serveur/rechercher.png"))); // NOI18N
        jButton3.setText("Chercher");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel7.setText("Référence Du Produit   :");

        txtid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtidActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel7);
        jPanel7.setBounds(180, 80, 580, 60);

        jButton1.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projet_client_serveur/precedent.png"))); // NOI18N
        jButton1.setText(" Retour");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(490, 350, 140, 40);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1000, 290);

        jPanel2.setBackground(java.awt.SystemColor.activeCaption);
        jPanel2.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel2.setText("Code Produit :");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(30, 20, 100, 17);

        txtcod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcodActionPerformed(evt);
            }
        });
        jPanel2.add(txtcod);
        txtcod.setBounds(180, 10, 160, 30);

        txtref.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtrefActionPerformed(evt);
            }
        });
        jPanel2.add(txtref);
        txtref.setBounds(180, 50, 160, 30);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel3.setText("Référence   :");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(30, 60, 100, 17);

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel8.setText("Famile Produit     :");
        jPanel2.add(jLabel8);
        jLabel8.setBounds(30, 100, 110, 17);

        txtdes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdesActionPerformed(evt);
            }
        });
        jPanel2.add(txtdes);
        txtdes.setBounds(180, 90, 160, 30);

        txtnou.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnouActionPerformed(evt);
            }
        });
        jPanel2.add(txtnou);
        txtnou.setBounds(180, 130, 160, 30);

        jLabel9.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel9.setText("Prix  :");
        jPanel2.add(jLabel9);
        jLabel9.setBounds(30, 140, 100, 17);

        txtsto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtstoActionPerformed(evt);
            }
        });
        txtsto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtstoKeyReleased(evt);
            }
        });
        jPanel2.add(txtsto);
        txtsto.setBounds(180, 170, 160, 30);

        jLabel10.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel10.setText("Nombre D'article  :");
        jPanel2.add(jLabel10);
        jLabel10.setBounds(30, 180, 120, 17);

        jButton2.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projet_client_serveur/32360.png"))); // NOI18N
        jButton2.setText(" Ajouter au vente");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2);
        jButton2.setBounds(60, 300, 220, 40);

        lbltot1.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        lbltot1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbltot1.setText("0");
        jPanel2.add(lbltot1);
        lbltot1.setBounds(200, 240, 150, 30);

        jLabel11.setFont(new java.awt.Font("Tahoma", 3, 15)); // NOI18N
        jLabel11.setText("Nombre D'article*Prix :");
        jPanel2.add(jLabel11);
        jLabel11.setBounds(10, 240, 180, 30);

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 350, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel8);
        jPanel8.setBounds(10, 230, 350, 50);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 290, 360, 360);

        jPanel3.setBackground(java.awt.SystemColor.activeCaption);
        jPanel3.setLayout(null);

        tbl_ven.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "num_facture", "code_produit", "reference", "Prix de vente", "Stock sortire", "total "
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tbl_ven);

        jPanel3.add(jScrollPane2);
        jScrollPane2.setBounds(10, 90, 610, 130);

        jPanel4.setBackground(new java.awt.Color(253, 230, 250));

        lbl1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbl1.setText("jLabel12");

        lbl2.setText("jLabel17");

        jLabel15.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel15.setText("Date");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addComponent(lbl2, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lbl2))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel15)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbl1)
                .addContainerGap())
        );

        jPanel3.add(jPanel4);
        jPanel4.setBounds(370, 10, 260, 70);

        jPanel5.setBackground(javax.swing.UIManager.getDefaults().getColor("FormattedTextField.selectionBackground"));

        lbltot2.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        lbltot2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbltot2.setText("0");

        jLabel5.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel5.setText("TOTAL:");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56)
                .addComponent(lbltot2, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(37, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbltot2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.add(jPanel5);
        jPanel5.setBounds(330, 230, 290, 50);

        txtfac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfacActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel14.setText("Numéro De Facture");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtfac, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtfac, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14))
                .addContainerGap())
        );

        jPanel3.add(jPanel6);
        jPanel6.setBounds(20, 20, 340, 50);

        jButton4.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projet_client_serveur/25403.png"))); // NOI18N
        jButton4.setText("  Payer");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton4);
        jButton4.setBounds(480, 300, 140, 40);

        jButton5.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projet_client_serveur/precedent.png"))); // NOI18N
        jButton5.setText(" Retour");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton5);
        jButton5.setBounds(340, 300, 130, 40);

        txtdat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdatActionPerformed(evt);
            }
        });
        txtdat.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtdatKeyReleased(evt);
            }
        });
        jPanel3.add(txtdat);
        txtdat.setBounds(30, 250, 160, 30);

        getContentPane().add(jPanel3);
        jPanel3.setBounds(360, 290, 640, 360);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tbl_resMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_resMouseClicked
        txtcod.setText(String.valueOf(tbl_res.getValueAt(tbl_res.getSelectedRow(), 0)));
        txtref.setText(String.valueOf(tbl_res.getValueAt(tbl_res.getSelectedRow(), 1)));
        txtdes.setText(String.valueOf(tbl_res.getValueAt(tbl_res.getSelectedRow(), 2)));
        //txtpri.setText(String.valueOf(tbl_res.getValueAt(tbl_res.getSelectedRow(), 3)));
        txtnou.setText(String.valueOf(tbl_res.getValueAt(tbl_res.getSelectedRow(), 3)));
       
    }//GEN-LAST:event_tbl_resMouseClicked

    private void txtrefActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtrefActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtrefActionPerformed

    private void txtnouActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnouActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnouActionPerformed

    private void txtstoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtstoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtstoActionPerformed

    private void txtfacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfacActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtfacActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if (txtcod.getText().equals("") || txtref.getText().equals("") || txtnou.getText().equals("")|| txtsto.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "SVP entrer vos donneé");
        } else if (txtfac.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "SVP entrer le num de facture");
        } else {
            String[] colon = {"num_facture","code_produit", "reference", "prix_vente", "stock_sortie", "subtotal","date"};
            String[] isi = {txtfac.getText(), txtcod.getText(), txtref.getText(), txtnou.getText(), txtsto.getText(), lbltot1.getText(), txtdat.getText()};
            System.out.println(db.queryInsert("vente", colon, isi));
            try {
                if (!test_stock()) { 
                    JOptionPane.showMessageDialog(this, "le stock est Limiter");
                } else {
                    def(); //true
                    table(); //true
                }
            } catch (SQLException ex) {
                Logger.getLogger(cachier.class.getName()).log(Level.SEVERE, null, ex);
                System.err.println("\n"+ex);
            }
            subtotal();
            importer();
            total();
          
            table();
        }

    }//GEN-LAST:event_jButton2ActionPerformed

    private void txtstoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtstoKeyReleased
       subtotal();        // TODO add your handling code here:
    }//GEN-LAST:event_txtstoKeyReleased

    private void txtdesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdesActionPerformed

    private void txtcodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcodActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcodActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       if (txtid.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "SVP complete le champ de recherche");
        } else {
           
                String colon[] = {"code_produit","reference","Famile","prix","stock"};
                rs = db.fcSelectCommand(colon, "produit", "reference LIKE '" + txtid.getText() + "' ");
                tbl_res.setModel(new ResultSetTableModel(rs));
            
        }
       
       
    }//GEN-LAST:event_jButton3ActionPerformed

    private void txtidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtidActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
         rs = db.exécutionQuery("SELECT SUM(subtotal) as subtotal FROM vente WHERE num_facture = '" + txtfac.getText() + "'");
        try {
            rs.next();
            lbltot2.setText(rs.getString("subtotal"));
        } catch (SQLException ex) {
            Logger.getLogger(cachier.class.getName()).log(Level.SEVERE, null, ex);
        }
       int a = Integer.parseInt(lbltot2.getText());
        if(a !=0)
          {
          Recu1  p=new Recu1();
           p.setVisible(true);
        this.dispose();
          }
            
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        cachier s = new cachier();
        s.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        Principale s = new Principale();
        s.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void txtdatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdatActionPerformed

    private void txtdatKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtdatKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdatKeyReleased

    /**
     * @param args the command line arguments
     */
    
   
     public void subtotal() {
        double a = Double.parseDouble(txtnou.getText());
        double b = Double.parseDouble(txtsto.getText());
        double c = a * b;
        lbltot1.setText(String.valueOf(c));}
     
      public void total() {
        rs = db.exécutionQuery("SELECT SUM(subtotal) as subtotal FROM vente WHERE num_facture = '" + txtfac.getText() + "'");
        try {
            rs.next();
            lbltot2.setText(rs.getString("subtotal"));
        } catch (SQLException ex) {
            Logger.getLogger(cachier.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
       public boolean test_stock() throws SQLException {
        boolean teststock;
        rs = db.querySelectAll("produit","code_produit='" + txtcod.getText() + "'");
        while (rs.next()) {
            old = rs.getInt("stock");
        }
        dec = Integer.parseInt(txtsto.getText());
        if (old < dec) {
            teststock = false;
        } else {
            teststock = true;
        }
        return teststock;
    }

    public void def() throws SQLException {
        rs = db.querySelectAll("produit", "code_produit='" + txtcod.getText() + "'");
        while (rs.next()) {
            old = rs.getInt("stock");
        }
        dec = Integer.parseInt(txtsto.getText());
        now = old - dec;
         String nvstock = Integer.toString(now);

        String a = String.valueOf(nvstock);
        String[] colon = {"stock"};
        String[] isi = {a};
        System.out.println(db.queryUpdate("produit", colon, isi, "code_produit='" + txtcod.getText() + "'"));
    }

   
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
            java.util.logging.Logger.getLogger(cachier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(cachier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(cachier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(cachier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new cachier().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    public static javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    public static javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    public static javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    public static javax.swing.JLabel jLabel14;
    public static javax.swing.JLabel jLabel15;
    public static javax.swing.JLabel jLabel2;
    public static javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    public static javax.swing.JLabel jLabel8;
    public static javax.swing.JLabel jLabel9;
    public static javax.swing.JPanel jPanel1;
    public static javax.swing.JPanel jPanel2;
    public static javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    public static javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    public static javax.swing.JLabel lbl1;
    public static javax.swing.JLabel lbl2;
    public static javax.swing.JLabel lbltot1;
    public static javax.swing.JLabel lbltot2;
    public static javax.swing.JTable tbl_res;
    public static javax.swing.JTable tbl_ven;
    public static javax.swing.JTextField txtcod;
    public static javax.swing.JTextField txtdat;
    public static javax.swing.JTextField txtdes;
    public static javax.swing.JTextField txtfac;
    private javax.swing.JTextField txtid;
    public static javax.swing.JTextField txtnou;
    public static javax.swing.JTextField txtref;
    public static javax.swing.JTextField txtsto;
    // End of variables declaration//GEN-END:variables
}

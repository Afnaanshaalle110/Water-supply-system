package water_supply;

import javax.swing.JOptionPane;

public class Address extends javax.swing.JFrame {

    codes co = new codes();
    String id;

    public Address() {
        initComponents();
        this.setLocationRelativeTo(this);
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
        rSButtonIconTwo2 = new RSMaterialComponent.RSButtonIconTwo();
        jPanel2 = new javax.swing.JPanel();
        txtser = new RSMaterialComponent.RSTextFieldMaterial();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txt2 = new RSMaterialComponent.RSTextFieldMaterial();
        txt3 = new RSMaterialComponent.RSTextFieldMaterial();
        jLabel3 = new javax.swing.JLabel();
        rSButtonMaterialIconOne1 = new RSMaterialComponent.RSButtonMaterialIconOne();
        rSButtonMaterialIconOne2 = new RSMaterialComponent.RSButtonMaterialIconOne();
        rSButtonMaterialIconOne3 = new RSMaterialComponent.RSButtonMaterialIconOne();
        rSButtonMaterialIconOne4 = new RSMaterialComponent.RSButtonMaterialIconOne();
        txt1 = new RSMaterialComponent.RSTextFieldMaterial();
        rSButtonIconTwo1 = new RSMaterialComponent.RSButtonIconTwo();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 153, 153));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3), "Address", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 24), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        rSButtonIconTwo2.setBackground(new java.awt.Color(255, 153, 153));
        rSButtonIconTwo2.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.CANCEL);
        rSButtonIconTwo2.setSizeIcon(40.0F);
        rSButtonIconTwo2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonIconTwo2ActionPerformed(evt);
            }
        });
        jPanel1.add(rSButtonIconTwo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 40, 40, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 630, 100));

        jPanel2.setBackground(new java.awt.Color(102, 51, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtser.setBackground(new java.awt.Color(102, 51, 255));
        txtser.setColorMaterial(new java.awt.Color(255, 102, 102));
        txtser.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        txtser.setPhColor(new java.awt.Color(255, 255, 255));
        txtser.setPlaceholder("Search...");
        jPanel2.add(txtser, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 20, 250, -1));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Destrict: ");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 120, -1, 30));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Village:");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 190, -1, 30));

        txt2.setBackground(new java.awt.Color(102, 51, 255));
        txt2.setColorMaterial(new java.awt.Color(255, 102, 102));
        txt2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        txt2.setPhColor(new java.awt.Color(255, 255, 255));
        txt2.setPlaceholder("Village");
        jPanel2.add(txt2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 180, -1, -1));

        txt3.setBackground(new java.awt.Color(102, 51, 255));
        txt3.setColorMaterial(new java.awt.Color(255, 102, 102));
        txt3.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        txt3.setPhColor(new java.awt.Color(255, 255, 255));
        txt3.setPlaceholder("Area");
        jPanel2.add(txt3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 260, -1, -1));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Area:");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 270, -1, 30));

        rSButtonMaterialIconOne1.setBackground(new java.awt.Color(102, 51, 255));
        rSButtonMaterialIconOne1.setText("Clear");
        rSButtonMaterialIconOne1.setBackgroundHover(new java.awt.Color(51, 204, 0));
        rSButtonMaterialIconOne1.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.CLEAR);
        jPanel2.add(rSButtonMaterialIconOne1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 350, 140, 40));

        rSButtonMaterialIconOne2.setBackground(new java.awt.Color(102, 51, 255));
        rSButtonMaterialIconOne2.setText("Save");
        rSButtonMaterialIconOne2.setBackgroundHover(new java.awt.Color(51, 204, 0));
        rSButtonMaterialIconOne2.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.SAVE);
        rSButtonMaterialIconOne2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonMaterialIconOne2ActionPerformed(evt);
            }
        });
        jPanel2.add(rSButtonMaterialIconOne2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, 120, 40));

        rSButtonMaterialIconOne3.setBackground(new java.awt.Color(102, 51, 255));
        rSButtonMaterialIconOne3.setText("Update");
        rSButtonMaterialIconOne3.setBackgroundHover(new java.awt.Color(51, 204, 0));
        rSButtonMaterialIconOne3.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.UPDATE);
        rSButtonMaterialIconOne3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonMaterialIconOne3ActionPerformed(evt);
            }
        });
        jPanel2.add(rSButtonMaterialIconOne3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 350, 120, 40));

        rSButtonMaterialIconOne4.setBackground(new java.awt.Color(102, 51, 255));
        rSButtonMaterialIconOne4.setText("Delete");
        rSButtonMaterialIconOne4.setBackgroundHover(new java.awt.Color(51, 204, 0));
        rSButtonMaterialIconOne4.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.DELETE);
        rSButtonMaterialIconOne4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonMaterialIconOne4ActionPerformed(evt);
            }
        });
        jPanel2.add(rSButtonMaterialIconOne4, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 350, 130, 40));

        txt1.setBackground(new java.awt.Color(102, 51, 255));
        txt1.setColorMaterial(new java.awt.Color(255, 102, 102));
        txt1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        txt1.setPhColor(new java.awt.Color(255, 255, 255));
        txt1.setPlaceholder("Destrict");
        jPanel2.add(txt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 110, -1, -1));

        rSButtonIconTwo1.setBackground(new java.awt.Color(102, 51, 255));
        rSButtonIconTwo1.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.SEARCH);
        rSButtonIconTwo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonIconTwo1ActionPerformed(evt);
            }
        });
        jPanel2.add(rSButtonIconTwo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 20, 50, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 630, 420));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rSButtonMaterialIconOne2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonMaterialIconOne2ActionPerformed
        // TODO add your handling code here:
        String oper = "insert";
        String sql = "call address_pr('" + txt1.getText() + "','" + txt2.getText() + "','" + txt3.getText() + "','" + oper + "',null)";
        co.setSql(sql);
    }//GEN-LAST:event_rSButtonMaterialIconOne2ActionPerformed

    private void rSButtonIconTwo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonIconTwo1ActionPerformed
        // TODO add your handling code here:
        co.search("select add_no,district,village,zone from address where add_no='" + txtser.getText() + "'");
        try {
            if (co.rs.next()) {
                id = co.rs.getString("add_no");
                txt1.setText(co.rs.getString("district"));
                txt2.setText(co.rs.getString("village"));
                txt3.setText(co.rs.getString("zone"));
            }else{
                 JOptionPane.showMessageDialog(null, txtser.getText() + "not found");

            }
        } 
            
         catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());

        }
    }//GEN-LAST:event_rSButtonIconTwo1ActionPerformed

    private void rSButtonIconTwo2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonIconTwo2ActionPerformed
        this.hide();
    }//GEN-LAST:event_rSButtonIconTwo2ActionPerformed

    private void rSButtonMaterialIconOne3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonMaterialIconOne3ActionPerformed
        String oper = "update";
        String sql = "call address_pr('" + txt1.getText() + "','" + txt2.getText() + "','" + txt3.getText() + "','" + oper + "','" + id + "')";
        co.setSql(sql);
    }//GEN-LAST:event_rSButtonMaterialIconOne3ActionPerformed

    private void rSButtonMaterialIconOne4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonMaterialIconOne4ActionPerformed
        if (JOptionPane.showConfirmDialog(null, "ma huptaa") == JOptionPane.YES_OPTION) {
            String oper = "delete";
            String sql = "call address_pr('" + txt1.getText() + "','" + txt2.getText() + "','" + txt3.getText() + "','" + oper + "','" + id + "')";
            co.setSql(sql);
        }
    }//GEN-LAST:event_rSButtonMaterialIconOne4ActionPerformed

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
            java.util.logging.Logger.getLogger(Address.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Address.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Address.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Address.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Address().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private RSMaterialComponent.RSButtonIconTwo rSButtonIconTwo1;
    private RSMaterialComponent.RSButtonIconTwo rSButtonIconTwo2;
    private RSMaterialComponent.RSButtonMaterialIconOne rSButtonMaterialIconOne1;
    private RSMaterialComponent.RSButtonMaterialIconOne rSButtonMaterialIconOne2;
    private RSMaterialComponent.RSButtonMaterialIconOne rSButtonMaterialIconOne3;
    private RSMaterialComponent.RSButtonMaterialIconOne rSButtonMaterialIconOne4;
    private RSMaterialComponent.RSTextFieldMaterial txt1;
    private RSMaterialComponent.RSTextFieldMaterial txt2;
    private RSMaterialComponent.RSTextFieldMaterial txt3;
    private RSMaterialComponent.RSTextFieldMaterial txtser;
    // End of variables declaration//GEN-END:variables
}

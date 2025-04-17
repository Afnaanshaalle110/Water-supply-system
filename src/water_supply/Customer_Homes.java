package water_supply;
import java.awt.HeadlessException;
import java.sql.Date;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
public class Customer_Homes extends javax.swing.JFrame {

    codes co = new codes();
    String id;
    String h_n;
    String c_n;
    String s_n;
    

    public Customer_Homes() {
        initComponents();
        this.setLocationRelativeTo(null);
         this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        co.fillComboBox(cm1, "select concat(h_no) guryo from homes", "guryo");
        co.fillComboBox(cm2, "select concat(p.people_no,',',p.name) dad  from people p", "dad");
        co.fillComboBox(cm3, "SELECT concat(ser_no,',',ser_name) adeg from services","adeg");

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
        dt1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        cm1 = new RSMaterialComponent.RSComboBox();
        jLabel3 = new javax.swing.JLabel();
        dt = new com.toedter.calendar.JDateChooser();
        jLabel1 = new javax.swing.JLabel();
        txt2 = new RSMaterialComponent.RSTextFieldMaterial();
        txt1 = new RSMaterialComponent.RSTextFieldMaterial();
        jLabel2 = new javax.swing.JLabel();
        rSButtonMaterialIconOne3 = new RSMaterialComponent.RSButtonMaterialIconOne();
        rSButtonMaterialIconOne4 = new RSMaterialComponent.RSButtonMaterialIconOne();
        rSButtonMaterialIconOne1 = new RSMaterialComponent.RSButtonMaterialIconOne();
        rSButtonIconTwo1 = new RSMaterialComponent.RSButtonIconTwo();
        txtsear = new RSMaterialComponent.RSTextFieldMaterial();
        rSButtonMaterialIconOne2 = new RSMaterialComponent.RSButtonMaterialIconOne();
        cm3 = new RSMaterialComponent.RSComboBox();
        jLabel6 = new javax.swing.JLabel();
        cm2 = new RSMaterialComponent.RSComboBox();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(153, 0, 0));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Customer_Homes", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 24), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 878, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 63, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 890, 100));

        dt1.setBackground(new java.awt.Color(102, 102, 0));
        dt1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Home_number: ");
        dt1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 80, 170, 40));

        cm1.setBackground(new java.awt.Color(102, 102, 0));
        cm1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Enter house number" }));
        cm1.setColorArrow(new java.awt.Color(102, 102, 0));
        cm1.setColorBorde(new java.awt.Color(102, 255, 0));
        cm1.setColorFondo(new java.awt.Color(102, 102, 0));
        cm1.setFocusable(false);
        cm1.setFont(new java.awt.Font("Roboto Bold", 1, 18)); // NOI18N
        cm1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cm1ActionPerformed(evt);
            }
        });
        dt1.add(cm1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 70, 320, 50));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Reg_Date: ");
        dt1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 240, 130, 50));
        dt1.add(dt, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 250, 350, 40));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("W_starts: ");
        dt1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 420, 110, 50));

        txt2.setBackground(new java.awt.Color(102, 102, 0));
        txt2.setForeground(new java.awt.Color(255, 255, 255));
        txt2.setPhColor(new java.awt.Color(255, 255, 255));
        txt2.setPlaceholder("Enter W_starts");
        txt2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt2ActionPerformed(evt);
            }
        });
        dt1.add(txt2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 410, 340, -1));

        txt1.setBackground(new java.awt.Color(102, 102, 0));
        txt1.setForeground(new java.awt.Color(255, 255, 255));
        txt1.setPhColor(new java.awt.Color(255, 255, 255));
        txt1.setPlaceholder("Enter Watch");
        txt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt1ActionPerformed(evt);
            }
        });
        dt1.add(txt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 320, 340, -1));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Watch:");
        dt1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 330, 110, 50));

        rSButtonMaterialIconOne3.setBackground(new java.awt.Color(102, 102, 0));
        rSButtonMaterialIconOne3.setText("Update");
        rSButtonMaterialIconOne3.setBackgroundHover(new java.awt.Color(153, 153, 153));
        rSButtonMaterialIconOne3.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.UPDATE);
        rSButtonMaterialIconOne3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonMaterialIconOne3ActionPerformed(evt);
            }
        });
        dt1.add(rSButtonMaterialIconOne3, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 600, 120, 50));

        rSButtonMaterialIconOne4.setBackground(new java.awt.Color(102, 102, 0));
        rSButtonMaterialIconOne4.setText("Delete");
        rSButtonMaterialIconOne4.setBackgroundHover(new java.awt.Color(153, 153, 153));
        rSButtonMaterialIconOne4.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.DELETE);
        rSButtonMaterialIconOne4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonMaterialIconOne4ActionPerformed(evt);
            }
        });
        dt1.add(rSButtonMaterialIconOne4, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 600, 130, 50));

        rSButtonMaterialIconOne1.setBackground(new java.awt.Color(102, 102, 0));
        rSButtonMaterialIconOne1.setText("Clear");
        rSButtonMaterialIconOne1.setBackgroundHover(new java.awt.Color(153, 153, 153));
        rSButtonMaterialIconOne1.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.CLEAR);
        rSButtonMaterialIconOne1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonMaterialIconOne1ActionPerformed(evt);
            }
        });
        dt1.add(rSButtonMaterialIconOne1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 600, 120, 50));

        rSButtonIconTwo1.setBackground(new java.awt.Color(102, 102, 0));
        rSButtonIconTwo1.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.SEARCH);
        rSButtonIconTwo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonIconTwo1ActionPerformed(evt);
            }
        });
        dt1.add(rSButtonIconTwo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 10, -1, -1));

        txtsear.setBackground(new java.awt.Color(102, 102, 0));
        txtsear.setForeground(new java.awt.Color(255, 255, 255));
        txtsear.setPhColor(new java.awt.Color(255, 255, 255));
        txtsear.setPlaceholder("Search..");
        txtsear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtsearActionPerformed(evt);
            }
        });
        dt1.add(txtsear, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 10, 210, 40));

        rSButtonMaterialIconOne2.setBackground(new java.awt.Color(102, 102, 0));
        rSButtonMaterialIconOne2.setText("Save");
        rSButtonMaterialIconOne2.setBackgroundHover(new java.awt.Color(153, 153, 153));
        rSButtonMaterialIconOne2.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.SAVE);
        rSButtonMaterialIconOne2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonMaterialIconOne2ActionPerformed(evt);
            }
        });
        dt1.add(rSButtonMaterialIconOne2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 610, 120, 40));

        cm3.setBackground(new java.awt.Color(102, 102, 0));
        cm3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Enter service number" }));
        cm3.setColorArrow(new java.awt.Color(102, 102, 0));
        cm3.setColorBorde(new java.awt.Color(102, 255, 0));
        cm3.setColorFondo(new java.awt.Color(102, 102, 0));
        cm3.setFocusable(false);
        cm3.setFont(new java.awt.Font("Roboto Bold", 1, 18)); // NOI18N
        cm3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cm3ActionPerformed(evt);
            }
        });
        dt1.add(cm3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 500, 330, 50));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Service_No:");
        dt1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 500, 140, 40));

        cm2.setBackground(new java.awt.Color(102, 102, 0));
        cm2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Enter cus number" }));
        cm2.setColorArrow(new java.awt.Color(102, 102, 0));
        cm2.setColorBorde(new java.awt.Color(102, 255, 0));
        cm2.setColorFondo(new java.awt.Color(102, 102, 0));
        cm2.setFocusable(false);
        cm2.setFont(new java.awt.Font("Roboto Bold", 1, 18)); // NOI18N
        cm2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cm2ActionPerformed(evt);
            }
        });
        dt1.add(cm2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 150, 310, 50));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Cus_Number:");
        dt1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 160, 170, 40));

        getContentPane().add(dt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 890, 690));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cm1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cm1ActionPerformed
        // TODO add your handling code here:
        String array[] = cm1.getSelectedItem().toString().split(",");
        h_n = array[0];
    }//GEN-LAST:event_cm1ActionPerformed

    private void txt2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt2ActionPerformed

    private void txt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt1ActionPerformed

    private void rSButtonIconTwo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonIconTwo1ActionPerformed
        co.search("select c.cus_h_no , h.h_no ,concat(p.people_no,',',p.name) as p, c.reg_date ,c.watch,c.W_starts , concat(s.ser_no,',',s.ser_name) as s from homes h , customer_homes c, people p, services s where c.h_no = h.h_no  and c.cus_no=p.people_no and c.ser_no=s.ser_no='" + txtsear.getText()+ "'");
        try {
            if (co.rs.next()) {
                id = co.rs.getString("cus_h_no");
                cm1.setSelectedItem(co.rs.getString("h_no"));
                cm2.setSelectedItem(co.rs.getString("p"));
                dt.setDate(co.rs.getDate("reg_date"));
                txt1.setText(co.rs.getString("watch"));
                txt2.setText(co.rs.getString("W_starts"));
                cm3.setSelectedItem(co.rs.getString("s"));
            } else {
                JOptionPane.showMessageDialog(null, "Xogta raadinta ee " + txtsear.getText() + " lama helin.");
            }
        } catch (HeadlessException | SQLException ex) {
            JOptionPane.showMessageDialog(null, "Qalad ayaa dhacay: " + ex.getMessage());
        }
    }//GEN-LAST:event_rSButtonIconTwo1ActionPerformed

    private void txtsearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtsearActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtsearActionPerformed

    private void rSButtonMaterialIconOne2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonMaterialIconOne2ActionPerformed
        // TODO add your handling code here:
        Date d1 = new Date(dt.getDate().getTime());
        String oper = "insert";
        String sql = "call customer_homes_sp('"+h_n+"', '"+c_n+ "', '" + d1 + "', '" + txt1.getText() + "', '" + txt2.getText() + "', '" +s_n+ "', '"+ oper + "',null)";
        co.setSql(sql);
    }//GEN-LAST:event_rSButtonMaterialIconOne2ActionPerformed

    private void rSButtonMaterialIconOne3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonMaterialIconOne3ActionPerformed
        // TODO add your handling code here:
        Date d1 = new Date(dt.getDate().getTime());
        String oper = "update";
        String sql = "call customer_homes_sp('" + h_n + "', '"+c_n+ "', '" + d1 + "', '" + txt1.getText() + "', '" + txt2.getText() + "', '"+s_n+ "', '" + oper + "','" + id + "')";
        co.setSql(sql);
    }//GEN-LAST:event_rSButtonMaterialIconOne3ActionPerformed

    private void rSButtonMaterialIconOne4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonMaterialIconOne4ActionPerformed
        // TODO add your handling code here:
        Date d1 = new Date(dt.getDate().getTime());
        if (JOptionPane.showConfirmDialog(null, "ma huptaa") == JOptionPane.YES_OPTION) {
            String oper = "delete";
            String sql = "call customer_homes_sp('" + h_n + "','" +c_n+ "', '"+ d1 + "','" + txt1.getText()+"','" + txt2.getText() + "','"+s_n+"', '"+oper + "','" + id+"')";
            co.setSql(sql);
        }
    }//GEN-LAST:event_rSButtonMaterialIconOne4ActionPerformed

    private void rSButtonMaterialIconOne1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonMaterialIconOne1ActionPerformed
        // TODO add your handling code here:

        txt1.setText(" ");
        txt2.setText(" ");


    }//GEN-LAST:event_rSButtonMaterialIconOne1ActionPerformed

    private void cm3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cm3ActionPerformed
        // TODO add your handling code here:
        String array[] = cm3.getSelectedItem().toString().split(",");
        s_n = array[0];
        
    }//GEN-LAST:event_cm3ActionPerformed

    private void cm2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cm2ActionPerformed
        // TODO add your handling code here:
        String array[] = cm2.getSelectedItem().toString().split(",");
        c_n = array[0];

    }//GEN-LAST:event_cm2ActionPerformed

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
            java.util.logging.Logger.getLogger(Customer_Homes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Customer_Homes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Customer_Homes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Customer_Homes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Customer_Homes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private RSMaterialComponent.RSComboBox cm1;
    private RSMaterialComponent.RSComboBox cm2;
    private RSMaterialComponent.RSComboBox cm3;
    private com.toedter.calendar.JDateChooser dt;
    private javax.swing.JPanel dt1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private RSMaterialComponent.RSButtonIconTwo rSButtonIconTwo1;
    private RSMaterialComponent.RSButtonMaterialIconOne rSButtonMaterialIconOne1;
    private RSMaterialComponent.RSButtonMaterialIconOne rSButtonMaterialIconOne2;
    private RSMaterialComponent.RSButtonMaterialIconOne rSButtonMaterialIconOne3;
    private RSMaterialComponent.RSButtonMaterialIconOne rSButtonMaterialIconOne4;
    private RSMaterialComponent.RSTextFieldMaterial txt1;
    private RSMaterialComponent.RSTextFieldMaterial txt2;
    private RSMaterialComponent.RSTextFieldMaterial txtsear;
    // End of variables declaration//GEN-END:variables
}

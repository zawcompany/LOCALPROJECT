/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author ASUS
 */
public class PROV_SUM extends javax.swing.JFrame {

    /**
     * Creates new form PROVINCE
     */
    public PROV_SUM() {
        initComponents();
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
        jPanel2 = new javax.swing.JPanel();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jTextArea2 = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 248, 240));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(123, 96, 89));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 590, -1));

        jTextArea1.setBackground(new java.awt.Color(255, 248, 240));
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Cambria", 2, 14)); // NOI18N
        jTextArea1.setRows(5);
        jTextArea1.setText("Select your destination province in Sumatera Island");
        jTextArea1.setWrapStyleWord(true);
        jTextArea1.setBorder(null);
        jPanel1.add(jTextArea1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 360, -1, 30));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI_COMPONENT/SUMATERA_ILUS.png"))); // NOI18N
        jLabel2.setText("jLabel2");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 50, 249, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI_COMPONENT/BATIK_SUM.png"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 330, 190, 40));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI_COMPONENT/BATIK_SUM - Copy.png"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 330, 210, 40));

        jButton2.setBackground(new java.awt.Color(255, 248, 240));
        jButton2.setFont(new java.awt.Font("Mistral", 0, 20)); // NOI18N
        jButton2.setForeground(new java.awt.Color(119, 51, 6));
        jButton2.setText("Riau Island");
        jButton2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.lightGray, new java.awt.Color(204, 204, 204), java.awt.Color.lightGray));
        jButton2.setName("aceh_nama"); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 600, 130, -1));

        jButton5.setBackground(new java.awt.Color(255, 248, 240));
        jButton5.setFont(new java.awt.Font("Mistral", 0, 20)); // NOI18N
        jButton5.setForeground(new java.awt.Color(119, 51, 6));
        jButton5.setText("Lampung");
        jButton5.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.lightGray, new java.awt.Color(204, 204, 204), java.awt.Color.lightGray));
        jButton5.setName("aceh_nama"); // NOI18N
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 600, 130, -1));

        jButton6.setBackground(new java.awt.Color(255, 248, 240));
        jButton6.setFont(new java.awt.Font("Mistral", 0, 20)); // NOI18N
        jButton6.setForeground(new java.awt.Color(119, 51, 6));
        jButton6.setText("North Sumatera");
        jButton6.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.lightGray, new java.awt.Color(204, 204, 204), java.awt.Color.lightGray));
        jButton6.setName("aceh_nama"); // NOI18N
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 450, 130, -1));

        jButton7.setBackground(new java.awt.Color(255, 248, 240));
        jButton7.setFont(new java.awt.Font("Mistral", 0, 20)); // NOI18N
        jButton7.setForeground(new java.awt.Color(119, 51, 6));
        jButton7.setText("Riau ");
        jButton7.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.lightGray, new java.awt.Color(204, 204, 204), java.awt.Color.lightGray));
        jButton7.setName("aceh_nama"); // NOI18N
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 400, 130, -1));

        jButton8.setBackground(new java.awt.Color(255, 248, 240));
        jButton8.setFont(new java.awt.Font("Mistral", 0, 20)); // NOI18N
        jButton8.setForeground(new java.awt.Color(119, 51, 6));
        jButton8.setText("South Sumatera");
        jButton8.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.lightGray, new java.awt.Color(204, 204, 204), java.awt.Color.lightGray));
        jButton8.setName("aceh_nama"); // NOI18N
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 500, 130, -1));

        jButton9.setBackground(new java.awt.Color(255, 248, 240));
        jButton9.setFont(new java.awt.Font("Mistral", 0, 20)); // NOI18N
        jButton9.setForeground(new java.awt.Color(119, 51, 6));
        jButton9.setText("Bangka Belitung");
        jButton9.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.lightGray, new java.awt.Color(204, 204, 204), java.awt.Color.lightGray));
        jButton9.setName("aceh_nama"); // NOI18N
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 550, 130, -1));

        jButton10.setBackground(new java.awt.Color(255, 248, 240));
        jButton10.setFont(new java.awt.Font("Mistral", 0, 20)); // NOI18N
        jButton10.setForeground(new java.awt.Color(119, 51, 6));
        jButton10.setText("West Sumatera");
        jButton10.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.lightGray, new java.awt.Color(204, 204, 204), java.awt.Color.lightGray));
        jButton10.setName("aceh_nama"); // NOI18N
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 450, 130, -1));

        jButton11.setBackground(new java.awt.Color(255, 248, 240));
        jButton11.setFont(new java.awt.Font("Mistral", 0, 20)); // NOI18N
        jButton11.setForeground(new java.awt.Color(119, 51, 6));
        jButton11.setText("Aceh");
        jButton11.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.lightGray, new java.awt.Color(204, 204, 204), java.awt.Color.lightGray));
        jButton11.setName("aceh_nama"); // NOI18N
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 400, 130, -1));

        jButton12.setBackground(new java.awt.Color(255, 248, 240));
        jButton12.setFont(new java.awt.Font("Mistral", 0, 20)); // NOI18N
        jButton12.setForeground(new java.awt.Color(119, 51, 6));
        jButton12.setText("Jambi");
        jButton12.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.lightGray, new java.awt.Color(204, 204, 204), java.awt.Color.lightGray));
        jButton12.setName("aceh_nama"); // NOI18N
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton12, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 500, 130, -1));

        jButton13.setBackground(new java.awt.Color(255, 248, 240));
        jButton13.setFont(new java.awt.Font("Mistral", 0, 20)); // NOI18N
        jButton13.setForeground(new java.awt.Color(119, 51, 6));
        jButton13.setText("Bengkulu");
        jButton13.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.lightGray, new java.awt.Color(204, 204, 204), java.awt.Color.lightGray));
        jButton13.setName("aceh_nama"); // NOI18N
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton13, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 550, 130, -1));

        jTextArea2.setBackground(new java.awt.Color(255, 248, 240));
        jTextArea2.setColumns(20);
        jTextArea2.setFont(new java.awt.Font("Cambria", 2, 14)); // NOI18N
        jTextArea2.setRows(5);
        jTextArea2.setText("The island of Sumatra, one of the gems of the archipelago, offers\n    natural, cultural and culinary beauty like no other. From the \nmajestic expanse of Lake Toba, the lush tropical forests of Bukit \n  Barisan, to the rich traces of Malay and Minangkabau culture, \n\tSumatra is a must-explore destination.");
        jTextArea2.setWrapStyleWord(true);
        jTextArea2.setBorder(null);
        jPanel1.add(jTextArea2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, -1, -1));

        jButton1.setBackground(new java.awt.Color(255, 248, 240));
        jButton1.setForeground(new java.awt.Color(123, 96, 89));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI_COMPONENT/KEMBALICOKLATFIX.png"))); // NOI18N
        jButton1.setBorder(null);
        jButton1.setBorderPainted(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 38, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI_COMPONENT/BATIKSUMATERA.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI_COMPONENT/BATIKSUMATERA2.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 480, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 660));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Pagesementr tempPage = new Pagesementr();
        tempPage.setVisible(true);
        this.setVisible(false); 

        new javax.swing.Timer(3000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // 5000ms = 5 detik
                PROV_SUM.this.setVisible(true);
                tempPage.dispose();
            }
        }).start();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        Pagesementr tempPage = new Pagesementr();
        tempPage.setVisible(true);
        this.setVisible(false); 

        new javax.swing.Timer(3000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // 5000ms = 5 detik
                PROV_SUM.this.setVisible(true);
                tempPage.dispose();
            }
        }).start();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        Pagesementr tempPage = new Pagesementr();
        tempPage.setVisible(true);
        this.setVisible(false); 

        new javax.swing.Timer(3000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // 5000ms = 5 detik
                PROV_SUM.this.setVisible(true);
                tempPage.dispose();
            }
        }).start();

    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        Detail_riauc keriau = new Detail_riauc();
        keriau.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        Pagesementr tempPage = new Pagesementr();
        tempPage.setVisible(true);
        this.setVisible(false); 

        new javax.swing.Timer(3000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // 5000ms = 5 detik
                PROV_SUM.this.setVisible(true);
                tempPage.dispose();
            }
        }).start();
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        Pagesementr tempPage = new Pagesementr();
        tempPage.setVisible(true);
        this.setVisible(false); 

        new javax.swing.Timer(3000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // 5000ms = 5 detik
                PROV_SUM.this.setVisible(true);
                tempPage.dispose();
            }
        }).start();
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        Pagesementr tempPage = new Pagesementr();
        tempPage.setVisible(true);
        this.setVisible(false); 

        new javax.swing.Timer(3000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // 5000ms = 5 detik
                PROV_SUM.this.setVisible(true);
                tempPage.dispose();
            }
        }).start();
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        // TODO add your handling code here:
        Detail_Aceh_C detailAceh = new Detail_Aceh_C(); // Buat instance frame HOME
        detailAceh.setVisible(true); // Tampilkan halaman HOME
        this.dispose(); // Tutup frame yang sedang aktif (opsional)
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        Pagesementr tempPage = new Pagesementr();
        tempPage.setVisible(true);
        this.setVisible(false); 

        new javax.swing.Timer(3000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // 5000ms = 5 detik
                PROV_SUM.this.setVisible(true);
                tempPage.dispose();
            }
        }).start();
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        Pagesementr tempPage = new Pagesementr();
        tempPage.setVisible(true);
        this.setVisible(false); 

        new javax.swing.Timer(3000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // 5000ms = 5 detik
                PROV_SUM.this.setVisible(true);
                tempPage.dispose();
            }
        }).start();
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        BERRANDAFIX homePage = new BERRANDAFIX(); // Buat instance frame HOME
        homePage.setVisible(true); // Tampilkan halaman HOME
        this.dispose(); // Tutup frame yang sedang aktif (opsional)
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(PROV_SUM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PROV_SUM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PROV_SUM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PROV_SUM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PROV_SUM().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    // End of variables declaration//GEN-END:variables
}

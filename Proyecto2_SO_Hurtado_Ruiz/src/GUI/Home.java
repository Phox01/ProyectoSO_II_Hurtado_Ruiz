/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

/**
 *
 * @author josep
 */
public class Home extends javax.swing.JFrame {

    /**
     * Creates new form Home
     */
    public Home() {
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
        starwarsLogo = new javax.swing.JLabel();
        medal1 = new javax.swing.JLabel();
        Winner = new javax.swing.JLabel();
        medal2 = new javax.swing.JLabel();
        starTrekLogo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        queueSW4 = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        queueSW1 = new javax.swing.JList<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        queueSW2 = new javax.swing.JList<>();
        jScrollPane4 = new javax.swing.JScrollPane();
        queueSW3 = new javax.swing.JList<>();
        jScrollPane5 = new javax.swing.JScrollPane();
        queueST1 = new javax.swing.JList<>();
        jScrollPane6 = new javax.swing.JScrollPane();
        queueST2 = new javax.swing.JList<>();
        jScrollPane7 = new javax.swing.JScrollPane();
        queueST4 = new javax.swing.JList<>();
        jScrollPane8 = new javax.swing.JScrollPane();
        queueST3 = new javax.swing.JList<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        victoriesST = new javax.swing.JLabel();
        aiImage1 = new javax.swing.JLabel();
        aiState1 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        fieldDaysMS = new javax.swing.JTextField();
        victoriesSW1 = new javax.swing.JLabel();
        vs = new javax.swing.JLabel();
        speedSim = new javax.swing.JLabel();
        victoriesST1 = new javax.swing.JLabel();
        vs1 = new javax.swing.JLabel();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(14, 38, 99));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setToolTipText("");
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        starwarsLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/dg7eops-ddf01d9a-a419-42c8-9698-0fa0d6527e6b (2).png"))); // NOI18N
        jPanel1.add(starwarsLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 20, 150, 80));

        medal1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/badge-outline-filled (1).png"))); // NOI18N
        medal1.setText("jLabel4");
        jPanel1.add(medal1, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 120, 50, 50));

        Winner.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        Winner.setForeground(javax.swing.UIManager.getDefaults().getColor("Button.borderColor"));
        Winner.setText("Winner!!");
        jPanel1.add(Winner, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 490, 80, -1));

        medal2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/badge-outline-filled (1).png"))); // NOI18N
        medal2.setText("jLabel4");
        jPanel1.add(medal2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 120, 50, -1));

        starTrekLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/image_2024-10-22_185537482-removebg-preview (1).png"))); // NOI18N
        jPanel1.add(starTrekLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 20, -1, 80));

        jLabel1.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setText("Cola P1");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 200, -1, -1));

        jLabel2.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setText("Cola P2");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 200, -1, -1));

        jLabel3.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setText("Cola P1");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, -1, -1));

        jLabel4.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setText("Cola P2");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 200, -1, -1));

        queueSW4.setBackground(new java.awt.Color(50, 48, 157));
        queueSW4.setForeground(new java.awt.Color(255, 255, 255));
        queueSW4.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(queueSW4);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 390, 120, 100));

        queueSW1.setBackground(new java.awt.Color(50, 48, 157));
        queueSW1.setForeground(new java.awt.Color(255, 255, 255));
        queueSW1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(queueSW1);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 230, 120, 100));

        queueSW2.setBackground(new java.awt.Color(50, 48, 157));
        queueSW2.setForeground(new java.awt.Color(255, 255, 255));
        queueSW2.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane3.setViewportView(queueSW2);

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 230, 120, 100));

        queueSW3.setBackground(new java.awt.Color(50, 48, 157));
        queueSW3.setForeground(new java.awt.Color(255, 255, 255));
        queueSW3.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane4.setViewportView(queueSW3);

        jPanel1.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 390, 120, 100));

        queueST1.setBackground(new java.awt.Color(50, 48, 157));
        queueST1.setForeground(new java.awt.Color(255, 255, 255));
        queueST1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane5.setViewportView(queueST1);

        jPanel1.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 120, 100));

        queueST2.setBackground(new java.awt.Color(50, 48, 157));
        queueST2.setForeground(new java.awt.Color(255, 255, 255));
        queueST2.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane6.setViewportView(queueST2);

        jPanel1.add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 230, 120, 100));

        queueST4.setBackground(new java.awt.Color(50, 48, 157));
        queueST4.setForeground(new java.awt.Color(255, 255, 255));
        queueST4.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane7.setViewportView(queueST4);

        jPanel1.add(jScrollPane7, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 390, 120, 100));

        queueST3.setBackground(new java.awt.Color(50, 48, 157));
        queueST3.setForeground(new java.awt.Color(255, 255, 255));
        queueST3.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane8.setViewportView(queueST3);

        jPanel1.add(jScrollPane8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 390, 120, 100));

        jLabel5.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 204, 204));
        jLabel5.setText("Cola P3");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 360, -1, -1));

        jLabel6.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 204, 204));
        jLabel6.setText("Refuerzo");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 360, -1, -1));

        jLabel7.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 204, 204));
        jLabel7.setText("Refuerzo");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 360, -1, -1));

        jLabel8.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(204, 204, 204));
        jLabel8.setText("Cola P3");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 360, -1, -1));

        victoriesST.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        victoriesST.setForeground(new java.awt.Color(255, 255, 255));
        victoriesST.setText("Ganador");
        jPanel1.add(victoriesST, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 510, 160, 50));

        aiImage1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/1f916 (1).png"))); // NOI18N
        aiImage1.setText("jLabel2");
        jPanel1.add(aiImage1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 70, 90, 110));

        aiState1.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        aiState1.setForeground(javax.swing.UIManager.getDefaults().getColor("Button.borderColor"));
        aiState1.setText("Waiting");
        jPanel1.add(aiState1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 180, 70, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(220, 223, 219));
        jLabel9.setText("Made by Hurtado, José & Ruiz, Joseph ");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 540, -1, -1));

        fieldDaysMS.setBackground(new java.awt.Color(50, 48, 157));
        fieldDaysMS.setForeground(new java.awt.Color(255, 255, 255));
        fieldDaysMS.setText("1000");
        fieldDaysMS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldDaysMSActionPerformed(evt);
            }
        });
        jPanel1.add(fieldDaysMS, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 240, 70, 30));

        victoriesSW1.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        victoriesSW1.setForeground(new java.awt.Color(255, 255, 255));
        victoriesSW1.setText("0");
        jPanel1.add(victoriesSW1, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 120, 30, 50));

        vs.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/png-clipart-vs-match-vs-game-thumbnail-removebg-preview (1)_1.png"))); // NOI18N
        jPanel1.add(vs, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 330, 100, 80));

        speedSim.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        speedSim.setForeground(javax.swing.UIManager.getDefaults().getColor("Button.borderColor"));
        speedSim.setText("Velocidad");
        jPanel1.add(speedSim, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 240, 90, -1));

        victoriesST1.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        victoriesST1.setForeground(new java.awt.Color(255, 255, 255));
        victoriesST1.setText("0");
        jPanel1.add(victoriesST1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 120, 30, 50));

        vs1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/png-clipart-vs-match-vs-game-thumbnail-removebg-preview (1)_1.png"))); // NOI18N
        jPanel1.add(vs1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 20, 150, 80));

        background.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        background.setForeground(new java.awt.Color(255, 255, 255));
        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/146610-large-star-wars-star-background-1920x1080 (2).jpg"))); // NOI18N
        background.setText("0");
        jPanel1.add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1060, 580));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void fieldDaysMSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldDaysMSActionPerformed
        //dayMS=Integer.parseInt(fieldDaysMS.getText());
    }//GEN-LAST:event_fieldDaysMSActionPerformed

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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Winner;
    private javax.swing.JLabel aiImage1;
    private javax.swing.JLabel aiState1;
    private javax.swing.JLabel background;
    private javax.swing.JTextField fieldDaysMS;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JLabel medal1;
    private javax.swing.JLabel medal2;
    private javax.swing.JList<String> queueST1;
    private javax.swing.JList<String> queueST2;
    private javax.swing.JList<String> queueST3;
    private javax.swing.JList<String> queueST4;
    private javax.swing.JList<String> queueSW1;
    private javax.swing.JList<String> queueSW2;
    private javax.swing.JList<String> queueSW3;
    private javax.swing.JList<String> queueSW4;
    private javax.swing.JLabel speedSim;
    private javax.swing.JLabel starTrekLogo;
    private javax.swing.JLabel starwarsLogo;
    private javax.swing.JLabel victoriesST;
    private javax.swing.JLabel victoriesST1;
    private javax.swing.JLabel victoriesSW1;
    private javax.swing.JLabel vs;
    private javax.swing.JLabel vs1;
    // End of variables declaration//GEN-END:variables
}
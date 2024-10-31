/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import javax.swing.JLabel;
import static GUI.Home.charSW;
import static GUI.Home.charST;
import javax.swing.Timer;
import java.awt.event.*;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author José Hurtado y Joseph Ruiz
 */
public class Game extends JFrame implements KeyListener {
    private int player1Score = 0; // Counter for Player 1 pressing "a"
    private int player2Score = 0; // Counter for Player 2 pressing "l"
    private Timer timer; // Timer for the 5 second countdown
    private boolean value;
    /**
     * Creates new form Game
     */
    public Game() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.addKeyListener(this);
        warriorST.setText(charST.getText());
        warriorSW.setText(charSW.getText());
        startTimer();
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
        warriorSW = new javax.swing.JLabel();
        key2 = new javax.swing.JLabel();
        starTrekLogo = new javax.swing.JLabel();
        starwarsLogo2 = new javax.swing.JLabel();
        vs = new javax.swing.JLabel();
        key1 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        warriorST = new javax.swing.JLabel();
        instructions1 = new javax.swing.JLabel();
        smashbutton1 = new javax.swing.JLabel();
        smashbutton = new javax.swing.JLabel();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(14, 38, 99));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        warriorSW.setBackground(new java.awt.Color(255, 153, 255));
        warriorSW.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        warriorSW.setForeground(new java.awt.Color(255, 255, 255));
        warriorSW.setText("WarriorSW");
        jPanel1.add(warriorSW, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 210, 100, 50));

        key2.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        key2.setForeground(new java.awt.Color(255, 255, 255));
        key2.setText("L");
        jPanel1.add(key2, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 370, 30, 50));

        starTrekLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/image_2024-10-22_185537482-removebg-preview (1).png"))); // NOI18N
        jPanel1.add(starTrekLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 30, -1, 80));

        starwarsLogo2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/dg7eops-ddf01d9a-a419-42c8-9698-0fa0d6527e6b (2).png"))); // NOI18N
        jPanel1.add(starwarsLogo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 30, 150, 80));

        vs.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/png-clipart-vs-match-vs-game-thumbnail-removebg-preview (1)_1.png"))); // NOI18N
        jPanel1.add(vs, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 30, 150, 80));

        key1.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        key1.setForeground(new java.awt.Color(255, 255, 255));
        key1.setText("A");
        jPanel1.add(key1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 370, 30, 50));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(220, 223, 219));
        jLabel9.setText("Made by Hurtado, José & Ruiz, Joseph ");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 440, -1, -1));

        warriorST.setBackground(new java.awt.Color(255, 153, 255));
        warriorST.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        warriorST.setForeground(new java.awt.Color(255, 255, 255));
        warriorST.setText("WarriorST");
        jPanel1.add(warriorST, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 210, 100, 50));

        instructions1.setBackground(new java.awt.Color(255, 153, 255));
        instructions1.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        instructions1.setForeground(new java.awt.Color(255, 255, 255));
        instructions1.setText("Presiona repetidamente la tecla");
        jPanel1.add(instructions1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 150, 270, 50));

        smashbutton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/button-press-the-button.gif"))); // NOI18N
        jPanel1.add(smashbutton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 270, 200, 170));

        smashbutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/button-press-the-button.gif"))); // NOI18N
        jPanel1.add(smashbutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, 200, 170));

        background.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        background.setForeground(new java.awt.Color(255, 255, 255));
        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/1320395.png"))); // NOI18N
        background.setText("0");
        jPanel1.add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(-820, -50, 1600, 540));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 650, 470));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void startTimer() {
        timer = new Timer(10000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                timer.stop();
                showResults();
                dispose(); // Close the game window after the timer ends
            }
        });
        timer.setRepeats(false); // Ensures the timer runs only once for 10 seconds
        timer.start();
    }
    
    private void showResults() {
        JOptionPane.showMessageDialog(this, "Player 1 Score (A presses): " + player1Score + "\n" +
                                            "Player 2 Score (B presses): " + player2Score, 
                                            "Game Over", JOptionPane.INFORMATION_MESSAGE);
        
    }
    
    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyChar() == 'a') {
            player1Score++;
        } else if (e.getKeyChar() == 'l') {
            player2Score++;
        }
    }

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
            java.util.logging.Logger.getLogger(Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Game().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    private javax.swing.JLabel instructions1;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel key1;
    private javax.swing.JLabel key2;
    private javax.swing.JLabel smashbutton;
    private javax.swing.JLabel smashbutton1;
    private javax.swing.JLabel starTrekLogo;
    private javax.swing.JLabel starwarsLogo2;
    private javax.swing.JLabel vs;
    private javax.swing.JLabel warriorST;
    private javax.swing.JLabel warriorSW;
    // End of variables declaration//GEN-END:variables

    @Override
    public void keyTyped(KeyEvent e) {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void keyReleased(KeyEvent e) {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}

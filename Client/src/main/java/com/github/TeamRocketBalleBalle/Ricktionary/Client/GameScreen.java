package com.github.TeamRocketBalleBalle.Ricktionary.Client;

import com.github.TeamRocketBalleBalle.Ricktionary.Client.Networking.PlayerNetworking;
import com.github.TeamRocketBalleBalle.Ricktionary.Resources.Comms.Reply;
import com.github.TeamRocketBalleBalle.Ricktionary.Resources.Constants.PacketType;

import javax.swing.*;
import javax.swing.text.DefaultCaret;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Map;

/**
 * @author Yash
 */
public class GameScreen extends javax.swing.JPanel implements ActionListener {

    // Variables declaration - do not modify
    public static javax.swing.JLabel Name;
    private javax.swing.JLabel Score;
    public static javax.swing.JLabel topThree;
    private static javax.swing.JTextArea display;
    private javax.swing.JTextField input;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel nameLabel;
    public static javax.swing.JLabel picture;
    private javax.swing.JLabel scoreLabel;
    private javax.swing.JButton send;
    private javax.swing.JLabel bg;

    /**
     * Creates new form NewJFrame
     */
    public GameScreen() {
        initComponents();
    }

    /**
     * @param args the command line arguments
     */
    // Main Method
    public static void main(String[] args) {
        /* Set the Nimbus look and feel */
        // <editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info :
                    javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException
                | InstantiationException
                | IllegalAccessException
                | UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GameScreen.class.getName())
                    .log(java.util.logging.Level.SEVERE, null, ex);
        }
        // </editor-fold>
        // </editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(GameScreen::new);
    }

    public static JTextArea getDisplay() {
        return display;
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT
     * modify this code. The content of this method is always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {
        nameLabel = new javax.swing.JLabel();
        scoreLabel = new javax.swing.JLabel();

        Name = new javax.swing.JLabel();
        Score = new javax.swing.JLabel();
        topThree = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        picture = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        display = new javax.swing.JTextArea();
        input = new javax.swing.JTextField();
        send = new javax.swing.JButton();
        bg = new javax.swing.JLabel();
        JLabel jLabel3 = new JLabel();
        //        backGround = new javax.swing.JPanel();
        nameLabel.setForeground(Color.WHITE);
        scoreLabel.setForeground(Color.white);
        Name.setForeground(Color.white);
        Score.setForeground(Color.white);
        topThree.setForeground(Color.yellow);

        // setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        nameLabel.setText("Name: -");
        nameLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        nameLabel.setFocusTraversalPolicyProvider(true);
        send.setText("Submit");
        display.setLineWrap(true);

        scoreLabel.setText("Score: -");

        Name.setText(welcomescreen.clientname);

        display.setLineWrap(true);

        jScrollPane1.setViewportView(display);
        display.setEditable(false);
        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout
                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(
                                jPanel1Layout
                                        .createSequentialGroup()
                                        .addContainerGap()
                                        .addComponent(
                                                picture,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                416,
                                                Short.MAX_VALUE)
                                        .addContainerGap()));
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout
                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(
                                jPanel1Layout
                                        .createSequentialGroup()
                                        .addContainerGap()
                                        .addComponent(
                                                picture,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                594,
                                                Short.MAX_VALUE)
                                        .addContainerGap()));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(
                                layout.createSequentialGroup()
                                        .addGap(450, 450, 450)
                                        .addComponent(
                                                jLabel3,
                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                250,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(
                                layout.createSequentialGroup()
                                        .addGap(29, 29, 29)
                                        .addComponent(nameLabel)
                                        .addGap(37, 37, 37)
                                        .addComponent(Name)
                                        .addGap(295, 295, 295)
                                        .addComponent(
                                                topThree,
                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                550,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(
                                layout.createSequentialGroup()
                                        .addGap(29, 29, 29)
                                        .addComponent(scoreLabel)
                                        .addGap(37, 37, 37)
                                        .addComponent(Score))
                        .addGroup(
                                layout.createSequentialGroup()
                                        .addGap(50, 50, 50)
                                        .addComponent(
                                                jPanel1,
                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(90, 90, 90)
                                        .addComponent(send)
                                        .addGap(29, 29, 29)
                                        .addGroup(
                                                layout.createParallelGroup(
                                                                javax.swing.GroupLayout.Alignment
                                                                        .LEADING)
                                                        .addComponent(
                                                                jScrollPane1,
                                                                javax.swing.GroupLayout
                                                                        .PREFERRED_SIZE,
                                                                330,
                                                                javax.swing.GroupLayout
                                                                        .PREFERRED_SIZE)
                                                        .addComponent(
                                                                input,
                                                                javax.swing.GroupLayout
                                                                        .PREFERRED_SIZE,
                                                                330,
                                                                javax.swing.GroupLayout
                                                                        .PREFERRED_SIZE))));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(
                                layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(
                                                jLabel3,
                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                100,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(
                                layout.createSequentialGroup()
                                        .addGap(26, 26, 26)
                                        .addGroup(
                                                layout.createParallelGroup(
                                                                javax.swing.GroupLayout.Alignment
                                                                        .LEADING)
                                                        .addComponent(nameLabel)
                                                        .addComponent(Name)
                                                        .addGroup(
                                                                layout.createSequentialGroup()
                                                                        .addGap(10, 10, 10)
                                                                        .addComponent(
                                                                                topThree,
                                                                                javax.swing
                                                                                        .GroupLayout
                                                                                        .PREFERRED_SIZE,
                                                                                60,
                                                                                javax.swing
                                                                                        .GroupLayout
                                                                                        .PREFERRED_SIZE)))
                                        .addGroup(
                                                layout.createParallelGroup(
                                                                javax.swing.GroupLayout.Alignment
                                                                        .LEADING)
                                                        .addComponent(scoreLabel)
                                                        .addComponent(Score))
                                        .addGap(58, 58, 58)
                                        .addGroup(
                                                layout.createParallelGroup(
                                                                javax.swing.GroupLayout.Alignment
                                                                        .LEADING)
                                                        .addComponent(
                                                                jPanel1,
                                                                javax.swing.GroupLayout
                                                                        .PREFERRED_SIZE,
                                                                javax.swing.GroupLayout
                                                                        .DEFAULT_SIZE,
                                                                javax.swing.GroupLayout
                                                                        .PREFERRED_SIZE)
                                                        .addGroup(
                                                                layout.createSequentialGroup()
                                                                        .addGap(540, 540, 540)
                                                                        .addComponent(send))
                                                        .addGroup(
                                                                layout.createSequentialGroup()
                                                                        .addGap(20, 20, 20)
                                                                        .addComponent(
                                                                                jScrollPane1,
                                                                                javax.swing
                                                                                        .GroupLayout
                                                                                        .PREFERRED_SIZE,
                                                                                510,
                                                                                javax.swing
                                                                                        .GroupLayout
                                                                                        .PREFERRED_SIZE)
                                                                        .addGap(40, 40, 40)
                                                                        .addComponent(
                                                                                input,
                                                                                javax.swing
                                                                                        .GroupLayout
                                                                                        .PREFERRED_SIZE,
                                                                                javax.swing
                                                                                        .GroupLayout
                                                                                        .DEFAULT_SIZE,
                                                                                javax.swing
                                                                                        .GroupLayout
                                                                                        .PREFERRED_SIZE)))));
        Rectangle rectangle = new Rectangle(1077, 767);
        nameLabel.getAccessibleContext().setAccessibleDescription("");
        ImageIcon i1;
        i1 = new ImageIcon(("Client/src/main/resources/bggame2.gif"));

        // resize an image
        //        backGround.setBounds(rectangle);
        Image i2;
        i2 = i1.getImage().getScaledInstance(1077, 767, Image.SCALE_DEFAULT);
        ImageIcon resizedImage = new ImageIcon(i2);
        bg.setIcon(resizedImage);
        bg.setBounds(rectangle);
        DefaultCaret caret = (DefaultCaret) display.getCaret();
        caret.setUpdatePolicy(DefaultCaret.OUT_BOTTOM);
        //        backGround.add(bg);
        //        add(backGround);

        add(bg);

        send.addActionListener(this);
        input.addKeyListener(
                new KeyAdapter() {
                    public void keyPressed(KeyEvent e) {
                        if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                            sendChatMessage();
                        }
                    }
                });

        //        pack();
        //                setVisible(true);
    } // </editor-fold>

    @Override
    public void actionPerformed(ActionEvent e) {
        sendChatMessage();
    }

    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_ENTER) {
            System.out.println("ENTER key pressed");
        }
    }

    private void sendChatMessage() {
        String inputText = input.getText();
        //        display.setText(display.getText()+"\n\n"+inputText);
        // code spicer proofing
        if (inputText.length() <= 32 && !inputText.isBlank() && !inputText.isEmpty()) {
            PlayerNetworking.send(PacketType.GAME_INPUT, null, new Reply<>(inputText));
        }
        input.setText("");
        input.requestFocus();
    }

    public static String displayTopThree(ArrayList<Map.Entry<String, Integer>> players) {
        StringBuilder displayPlayers = new StringBuilder("<html>");
        for (int i = 0; i < players.size() && i <= 3; i++) {
            Map.Entry<String, Integer> player = players.get(i);
            displayPlayers
                    .append(player.getKey())
                    .append(" : ")
                    .append(player.getValue())
                    .append("<br/>");
        }
        displayPlayers.append("</html>");
        topThree.setText(displayPlayers.toString());
        return displayPlayers.toString();
    }

    public static JLabel getPicture() {
        return picture;
    }

    public static void changeName(String name) {
        Name.setText(name);
    }
}

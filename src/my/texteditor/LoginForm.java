/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package my.texteditor;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.Icon;
import javax.swing.ImageIcon;



/**
 *
 * @author User
 */
public class LoginForm extends JFrame implements ActionListener {
    private JLabel usernameLabel, passwordLabel;
    private JTextField usernameField;
    private JPasswordField passwordField;
    private JButton loginButton;
    
    public LoginForm() {
        setTitle("Login Page");
        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        setResizable(false);
        
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                // Do nothing to prevent closing the login frame
            }
        });
        
        //Icon kittysad = new ImageIcon(getClass().getResource("hellokittycry.png"));
        //Icon kittyhappy = new ImageIcon(getClass().getResource("hellokittyceleb.png"));
        
        usernameLabel = new JLabel("Username:");
        passwordLabel = new JLabel("Password:");
        
        usernameField = new JTextField(20);
        passwordField = new JPasswordField(20);
        
        loginButton = new JButton("Login");
        loginButton.addActionListener(this);
        
        JPanel panel = new JPanel(new GridLayout(3, 2));
        panel.add(usernameLabel);
        panel.add(usernameField);
        panel.add(passwordLabel);
        panel.add(passwordField);
        panel.add(loginButton);
        
        add(panel);
        pack();
        setLocationRelativeTo(null);
    }
    
    public void actionPerformed(ActionEvent e) {
        String username = usernameField.getText();
        char[] password = passwordField.getPassword();
        
        // Perform your authentication logic here
        // For example, check if username and password are valid
        
        if (username.equals("hellokitty") && String.valueOf(password).equals("hellokitty")) {
            Icon kittyhappy = new ImageIcon(getClass().getResource("hellokittyceleb.png"));
            JOptionPane.showMessageDialog(this, "Login successful!", null, JOptionPane.INFORMATION_MESSAGE, kittyhappy);
            dispose(); // Close the login frame
            new TextEditorUI().setVisible(true);
        } 
        else {
            Icon kittysad = new ImageIcon(getClass().getResource("hellokittycry.png"));
            JOptionPane.showMessageDialog(this, "Invalid username or password. Please try again.\n Clue: Sanrio character", null, JOptionPane.INFORMATION_MESSAGE, kittysad);
        }
    }

    
    
}

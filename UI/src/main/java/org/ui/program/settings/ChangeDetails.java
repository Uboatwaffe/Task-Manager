package org.ui.program.settings;

import org.properties.UI_Properties;
import org.ui.program.Tasks;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.io.FileInputStream;

/**
 * @author
 */
public class ChangeDetails extends JFrame {
    private JPanel panel;
    private JTextField textField1;
    private JPasswordField passwordField1;
    private JPasswordField passwordField2;
    private JPasswordField passwordField3;
    private JButton changeButton;
    private JButton closeButton;
    private JLabel new_login;
    private JLabel new_password;
    private JLabel repeat_passsord;
    private JLabel old_password;

    public ChangeDetails() {
        setContentPane(panel);
        setTitle("Task Manager");
        setSize(530, 300);
        setDefaultCloseOperation(HIDE_ON_CLOSE);
        setVisible(true);
        setResizable(UI_Properties.getScalable());

        try {
            FileInputStream fis = new FileInputStream(UI_Properties.getLanguagePath());
            java.util.Properties prop = new java.util.Properties();
            prop.load(fis);

            new_login.setText(prop.getProperty("new_login"));
            new_password.setText(prop.getProperty("new_password"));
            repeat_passsord.setText(prop.getProperty("repeat_password"));
            old_password.setText(prop.getProperty("old_password"));
            changeButton.setText(prop.getProperty("changeButton"));
            closeButton.setText(prop.getProperty("close"));
        } catch (Exception ignore) {
        }
        closeButton.addActionListener(new ActionListener() {
            /**
             * Invoked when an action occurs.
             *
             * @param e the event to be processed
             */
            @Override
            public void actionPerformed(ActionEvent e) {
                dispatchEvent(new WindowEvent(ChangeDetails.this, WindowEvent.WINDOW_CLOSING));
                SwingUtilities.invokeLater(Tasks::new);
            }
        });
    }
}

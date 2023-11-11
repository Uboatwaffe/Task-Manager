package org.ui.program;

import org.properties.UI_Properties;
import org.ui.Main;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;

/**
 * @author
 */
public class Logging_in extends JFrame {
    private JPanel panel;
    private JTextField login_field;
    private JPasswordField password_field;
    private JButton logInButton;
    private JButton closeButton;
    private JButton signUpButton;
    private JLabel login_label;
    private JLabel password_label;
    private JLabel signup_label;

    public Logging_in() {
        setContentPane(panel);
        setTitle("Task Manager");
        setSize(600, 270);
        setDefaultCloseOperation(HIDE_ON_CLOSE);
        setVisible(true);
        setResizable(UI_Properties.getScalable());
        closeButton.addActionListener(new ActionListener() {
            /**
             * Invoked when an action occurs.
             *
             * @param e the event to be processed
             */
            @Override
            public void actionPerformed(ActionEvent e) {
                dispatchEvent(new WindowEvent(Logging_in.this, WindowEvent.WINDOW_CLOSING));
                SwingUtilities.invokeLater(Main::new);
            }
        });
    }
}

package org.ui.program.settings;

import org.properties.Properties;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * @author
 */
public class Info extends JFrame {
    private JPanel panel;
    private JButton closeButton;
    private JLabel info_label;
    private JLabel info_exams_label;
    private JLabel info_homework_label;
    private JLabel info_unassigend_label;

    public Info() throws IOException {
        setContentPane(panel);
        setTitle("Task Manager");
        setSize(450, 270);
        setDefaultCloseOperation(HIDE_ON_CLOSE);
        setVisible(true);
        setResizable(Properties.getScalable());

        FileInputStream fis = new FileInputStream("UI\\src\\main\\java\\org\\ui\\program\\settings\\Polish.properties");

        java.util.Properties prop = new java.util.Properties();
        prop.load(fis);

        closeButton.setText(prop.getProperty("close"));


        /*
        ResourceBundle rb = ResourceBundle.getBundle("Polish");

        System.out.println(rb.getString("close"));

         */


        closeButton.addActionListener(new ActionListener() {
            /**
             * Invoked when an action occurs.
             *
             * @param e the event to be processed
             */
            @Override
            public void actionPerformed(ActionEvent e) {
                dispatchEvent(new WindowEvent(Info.this, WindowEvent.WINDOW_CLOSING));
            }
        });
    }
}

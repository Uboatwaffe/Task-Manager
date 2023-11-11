package org.ui.program.settings;

import org.properties.UI_Properties;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.io.FileInputStream;

/**
 * @author
 */
public class Tutorial extends JFrame {
    private JPanel panel;
    private JLabel welcome;
    private JLabel how_to_add;
    private JLabel how_to_add_2;
    private JLabel how_to_add_intro;
    private JLabel how_to_delete_intro;
    private JLabel how_to_delete;
    private JLabel additional_info;
    private JButton closeButton;

    public Tutorial() {
        setContentPane(panel);
        setTitle("Task Manager");
        setSize(530, 250);
        setDefaultCloseOperation(HIDE_ON_CLOSE);
        setVisible(true);
        setResizable(UI_Properties.getScalable());

        try {
            FileInputStream fis = new FileInputStream(UI_Properties.getLanguagePath());
            java.util.Properties prop = new java.util.Properties();
            prop.load(fis);

            welcome.setText(prop.getProperty("welcome"));
            how_to_add_intro.setText(prop.getProperty("how_to_add_intro"));
            how_to_add.setText(prop.getProperty("how_to_add"));
            how_to_add_2.setText(prop.getProperty("how_to_add_2"));
            how_to_delete_intro.setText(prop.getProperty("how_to_delete_intro"));
            how_to_delete.setText(prop.getProperty("how_to_delete"));
            additional_info.setText(prop.getProperty("additional_info"));
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
                dispatchEvent(new WindowEvent(Tutorial.this, WindowEvent.WINDOW_CLOSING));
            }
        });
    }
}

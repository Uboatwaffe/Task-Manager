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
public class Credit extends JFrame {
    private JPanel panel;
    private JButton closeButton;
    private JLabel credits;
    private JLabel start_of_realisation;
    private JLabel end_of_realisation;
    private JLabel who_made_it;
    private JLabel company;

    public Credit() {
        setContentPane(panel);
        setTitle("Task Manager");
        setSize(530, 200);
        setDefaultCloseOperation(HIDE_ON_CLOSE);
        setVisible(true);
        setResizable(UI_Properties.getScalable());

        try {
            FileInputStream fis = new FileInputStream(UI_Properties.getLanguagePath());
            java.util.Properties prop = new java.util.Properties();
            prop.load(fis);

            credits.setText(prop.getProperty("credit"));
            start_of_realisation.setText(prop.getProperty("start_of_realisation"));
            end_of_realisation.setText(prop.getProperty("end_of_realisation"));
            who_made_it.setText(prop.getProperty("who_made_it"));
            company.setText(prop.getProperty("company"));
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
                dispatchEvent(new WindowEvent(Credit.this, WindowEvent.WINDOW_CLOSING));
            }
        });
    }
}

package org.ui.program.settings;

import org.properties.UI_Properties;

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
        setResizable(UI_Properties.getScalable());

        FileInputStream fis = new FileInputStream(UI_Properties.getLanguagePath());

        java.util.Properties prop = new java.util.Properties();
        prop.load(fis);

        info_label.setText(prop.getProperty("you_have") + " " + 0 + " " + prop.getProperty("tasks"));
        closeButton.setText(prop.getProperty("close"));
        info_exams_label.setText(prop.getProperty("you_have") + " " + 0 + " " + prop.getProperty("exams_info") + " " + 0.1 + " " + prop.getProperty("hardness_scale"));
        info_homework_label.setText(prop.getProperty("you_have") + " " + 0 + " " + prop.getProperty("homework_info") + " " + 0.1 + " " + prop.getProperty("hardness_scale"));
        info_unassigend_label.setText(prop.getProperty("you_have") + " " + 0 + " " + prop.getProperty("unassigned_info") + " " + 0.1 + " " + prop.getProperty("hardness_scale"));

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

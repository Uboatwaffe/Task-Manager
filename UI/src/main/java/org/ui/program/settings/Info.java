package org.ui.program.settings;

import org.properties.Properties;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;

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

    public Info() {
        setContentPane(panel);
        setTitle("Task Manager");
        setSize(450, 270);
        setDefaultCloseOperation(HIDE_ON_CLOSE);
        setVisible(true);
        setResizable(Properties.getScalable());
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

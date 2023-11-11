package org.ui.program;

import org.properties.UI_Properties;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;

/**
 * @author
 */
public class Sure extends JFrame {
    private JButton understoodTheConsequencesButton;
    private JButton takeMeBackToButton;
    private JLabel question_label;
    private JLabel info_label;
    private JPanel panel;

    Sure(String action, Class<?> caller) {
        setContentPane(panel);
        setTitle("Task Manager");
        setSize(600, 170);
        setDefaultCloseOperation(HIDE_ON_CLOSE);
        setVisible(true);
        setResizable(UI_Properties.getScalable());
        understoodTheConsequencesButton.addActionListener(new ActionListener() {
            /**
             * Invoked when an action occurs.
             *
             * @param e the event to be processed
             */
            @Override
            public void actionPerformed(ActionEvent e) {
                dispatchEvent(new WindowEvent(Sure.this, WindowEvent.WINDOW_CLOSING));
                SwingUtilities.invokeLater(org.ui.Main::new);
            }
        });
        takeMeBackToButton.addActionListener(new ActionListener() {
            /**
             * Invoked when an action occurs.
             *
             * @param e the event to be processed
             */
            @Override
            public void actionPerformed(ActionEvent e) {
                switch (caller.getName().substring(15)) {
                    case "Tasks" -> {
                        dispatchEvent(new WindowEvent(Sure.this, WindowEvent.WINDOW_CLOSING));
                        SwingUtilities.invokeLater(Tasks::new);
                    }
                    default -> {
                    }
                }
            }
        });
    }
}

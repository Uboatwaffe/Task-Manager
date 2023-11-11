package org.ui;

import org.properties.UI_Properties;
import org.ui.program.Tasks;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;

/**
 * Main class
 *
 * @author Maciej
 * @version 0.1
 */
public class Main extends JFrame {

    private JPanel mainPanel;
    private JTabbedPane Debugging;
    private JPanel start;
    private JPanel debugging;
    private JPanel master;
    private JButton openButton;
    private JLabel welcome_main;
    private JLabel what_to_do;
    private JLabel from_what_to_choose_from;
    private JButton closeButton;
    private JLabel info_debugging;
    private JPanel properties;

    public Main() {
        setContentPane(mainPanel);
        setTitle("Task Manager");
        setSize(530, 250);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        setResizable(UI_Properties.getScalable());

        openButton.addActionListener(new ActionListener() {
            /**
             * Invoked when an action occurs.
             *
             * @param e the event to be processed
             */
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                // new Logging_in(); <- This will be implemented but rn for testing purposes this not in use
                new Tasks();
            }
        });
        closeButton.addActionListener(new ActionListener() {
            /**
             * Invoked when an action occurs.
             *
             * @param e the event to be processed
             */
            @Override
            public void actionPerformed(ActionEvent e) {
                dispatchEvent(new WindowEvent(Main.this, WindowEvent.WINDOW_CLOSING));
            }
        });
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(Main::new);
    }
}

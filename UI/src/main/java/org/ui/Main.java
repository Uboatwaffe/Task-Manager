package org.ui;

import org.properties.UI_Properties;
import org.ui.program.Tasks;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * Main class
 *
 * @author Maciej
 * @version 0.1
 */
public class Main extends JFrame {

    private JPanel mainPanel;
    private JTabbedPane tabbed;
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

        try {
            FileInputStream fis = new FileInputStream(UI_Properties.getLanguagePath());
            java.util.Properties prop = new java.util.Properties();
            prop.load(fis);

            tabbed.setTitleAt(0, prop.getProperty("start"));
            tabbed.setTitleAt(1, prop.getProperty("prop"));
            tabbed.setTitleAt(2, prop.getProperty("debugging"));

            welcome_main.setText(prop.getProperty("welcome_main"));
            what_to_do.setText(prop.getProperty("what_to_do"));
            from_what_to_choose_from.setText(prop.getProperty("from_what_to_choose_from"));
            openButton.setText(prop.getProperty("open"));
            closeButton.setText(prop.getProperty("close"));

        } catch (IOException ignore) {

        }

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
        try {
            SwingUtilities.invokeLater(Main::new);
        } catch (Exception ignore) {
            ignore.printStackTrace();
        }
    }
}

package org.ui.program;

import org.properties.Properties;
import org.ui.program.settings.Info;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.io.IOException;

/**
 * UI that shows tasks to user
 *
 * @author Maciej
 * @version 0.1
 */
public class Tasks extends JFrame {

    private JPanel panel;
    private JTabbedPane tabs;
    private JPanel exams;
    private JPanel homeworks;
    private JPanel other;
    private JLabel info;
    private JList<String> subject_list;
    private JList<String> date_list;
    private JList<Integer> scale_list;
    private JLabel subject;
    private JLabel date;
    private JButton closeButton;
    private JLabel scale;
    private JButton refreshAllButton;
    private JScrollPane subject_scroll;
    private JScrollPane date_scrol;
    private JScrollPane scale_scroll;
    private JPanel adding;
    private JPanel deleting;
    private JLabel info_hw;
    private JScrollPane subject_scroll_hw;
    private JScrollPane scale_scroll_hw;
    private JList<String> subject_list_hw;
    private JList<Integer> scale_list_hw;
    private JButton closeButtonHW;
    private JButton refreshButtonHW;
    private JLabel subject_hw;
    private JLabel scale_hw;
    private JTextField subject_field_add;
    private JTextField date_field_add;
    private JLabel subject_label_add;
    private JLabel date_label_add;
    private JComboBox<String> form_comboBox_add;
    private JLabel form_label_add;
    private JLabel scale_label_add;
    private JSlider scale_slider_add;
    private JButton addButton_add;
    private JButton closeButton_add;
    private JComboBox<String> comboBox_delete;
    private JButton deleteButton;
    private JButton closeButton1;
    private JLabel index_label_delete;
    private JSpinner index_spinner_delete;
    private JLabel type_label_delete;
    private JList<String> title_list_other;
    private JList<String> date_list_other;
    private JList<Integer> scale_list_other;
    private JButton refreshAllButton_other;
    private JButton closeButton_other;
    private JLabel info_label_other;
    private JLabel title_label_other;
    private JLabel date_label_other;
    private JLabel scale_label_other;
    private JScrollPane title_scroll_other;
    private JScrollPane scale_scroll_other;
    private JScrollPane date_scroll_other;
    private JPanel settings;
    private JButton infoButton;
    private JButton tutorialButton;
    private JButton resetButton;
    private JButton creditButton;
    private JButton changeAccountSettingsButton;
    private JButton closeButton_settings;
    private JButton changeAccountButton;

    public Tasks() {
        setContentPane(panel);
        setTitle("Task Manager");
        setSize(600, 270);
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
                dispatchEvent(new WindowEvent(Tasks.this, WindowEvent.WINDOW_CLOSING));
                SwingUtilities.invokeLater(org.ui.Main::new);
            }
        });

        closeButtonHW.addActionListener(new ActionListener() {
            /**
             * Invoked when an action occurs.
             *
             * @param e the event to be processed
             */
            @Override
            public void actionPerformed(ActionEvent e) {
                dispatchEvent(new WindowEvent(Tasks.this, WindowEvent.WINDOW_CLOSING));
                SwingUtilities.invokeLater(org.ui.Main::new);
            }
        });
        closeButton_add.addActionListener(new ActionListener() {
            /**
             * Invoked when an action occurs.
             *
             * @param e the event to be processed
             */
            @Override
            public void actionPerformed(ActionEvent e) {
                dispatchEvent(new WindowEvent(Tasks.this, WindowEvent.WINDOW_CLOSING));
                SwingUtilities.invokeLater(org.ui.Main::new);
            }
        });
        closeButton1.addActionListener(new ActionListener() {
            /**
             * Invoked when an action occurs.
             *
             * @param e the event to be processed
             */
            @Override
            public void actionPerformed(ActionEvent e) {
                dispatchEvent(new WindowEvent(Tasks.this, WindowEvent.WINDOW_CLOSING));
                SwingUtilities.invokeLater(org.ui.Main::new);
            }
        });
        closeButton_settings.addActionListener(new ActionListener() {
            /**
             * Invoked when an action occurs.
             *
             * @param e the event to be processed
             */
            @Override
            public void actionPerformed(ActionEvent e) {
                dispatchEvent(new WindowEvent(Tasks.this, WindowEvent.WINDOW_CLOSING));
                SwingUtilities.invokeLater(org.ui.Main::new);
            }
        });
        resetButton.addActionListener(new ActionListener() {
            /**
             * Invoked when an action occurs.
             *
             * @param e the event to be processed
             */
            @Override
            public void actionPerformed(ActionEvent e) {
                dispatchEvent(new WindowEvent(Tasks.this, WindowEvent.WINDOW_CLOSING));
                new Sure("Reset", Tasks.class);
            }
        });
        infoButton.addActionListener(new ActionListener() {
            /**
             * Invoked when an action occurs.
             *
             * @param e the event to be processed
             */
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    new Info();
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });
    }
}

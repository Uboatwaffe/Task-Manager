package org.ui.program;

import org.properties.UI_Properties;
import org.ui.program.settings.ChangeDetails;
import org.ui.program.settings.Credit;
import org.ui.program.settings.Info;
import org.ui.program.settings.Tutorial;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.io.FileInputStream;
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
    private JLabel info_exams;
    private JList<String> subject_list;
    private JList<String> date_list;
    private JList<Integer> scale_list;
    private JLabel subject_exam;
    private JLabel date_exam;
    private JButton closeButton;
    private JLabel scale_exam;
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
        setResizable(UI_Properties.getScalable());

        try {
            FileInputStream fis = new FileInputStream(UI_Properties.getLanguagePath());
            java.util.Properties prop = new java.util.Properties();
            prop.load(fis);

            tabs.setTitleAt(0, prop.getProperty("exam_tab"));
            tabs.setTitleAt(1, prop.getProperty("homework_tab"));
            tabs.setTitleAt(2, prop.getProperty("add_tab"));
            tabs.setTitleAt(3, prop.getProperty("delete_tab"));
            tabs.setTitleAt(4, prop.getProperty("other_tab"));
            tabs.setTitleAt(5, prop.getProperty("settings_tab"));


            info_exams.setText(prop.getProperty("info_exams"));
            subject_exam.setText(prop.getProperty("subject"));
            date_exam.setText(prop.getProperty("date"));
            scale_exam.setText(prop.getProperty("scale"));
            refreshAllButton.setText(prop.getProperty("refreshAllButton"));
            closeButton.setText(prop.getProperty("close"));

            info_hw.setText(prop.getProperty("info_hw"));
            closeButtonHW.setText(prop.getProperty("close"));
            refreshButtonHW.setText(prop.getProperty("refreshAllButton"));
            subject_hw.setText(prop.getProperty("subject"));
            scale_hw.setText(prop.getProperty("scale"));

            subject_label_add.setText(prop.getProperty("subject_label_add"));
            date_label_add.setText(prop.getProperty("date_label_add"));
            form_label_add.setText(prop.getProperty("form_label_add"));
            scale_label_add.setText(prop.getProperty("scale_label_add"));
            addButton_add.setText(prop.getProperty("addButton"));
            closeButton.setText(prop.getProperty("close"));

            index_label_delete.setText(prop.getProperty("index_label_delete"));
            type_label_delete.setText(prop.getProperty("type_label_delete"));
            closeButton.setText(prop.getProperty("close"));
            deleteButton.setText(prop.getProperty("deleteButton"));

            info_label_other.setText(prop.getProperty("info_label_other"));
            title_label_other.setText(prop.getProperty("title_label_other"));
            date_label_other.setText(prop.getProperty("date"));
            scale_label_other.setText(prop.getProperty("scale"));
            refreshAllButton_other.setText(prop.getProperty("refreshAllButton"));
            closeButton_other.setText(prop.getProperty("close"));

            infoButton.setText(prop.getProperty("infoButton"));
            tutorialButton.setText(prop.getProperty("tutorialButton"));
            resetButton.setText(prop.getProperty("resetButton"));
            creditButton.setText(prop.getProperty("creditButton"));
            changeAccountSettingsButton.setText(prop.getProperty("accountSettingsButton"));
            changeAccountButton.setText(prop.getProperty("changeAccountButton"));
            closeButton.setText(prop.getProperty("close"));
        } catch (IOException ignore) {

        }
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
                try {
                    new Sure("Reset", Tasks.class);
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
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
        creditButton.addActionListener(new ActionListener() {
            /**
             * Invoked when an action occurs.
             *
             * @param e the event to be processed
             */
            @Override
            public void actionPerformed(ActionEvent e) {
                new Credit();
            }
        });
        tutorialButton.addActionListener(new ActionListener() {
            /**
             * Invoked when an action occurs.
             *
             * @param e the event to be processed
             */
            @Override
            public void actionPerformed(ActionEvent e) {
                new Tutorial();
            }
        });
        changeAccountSettingsButton.addActionListener(new ActionListener() {
            /**
             * Invoked when an action occurs.
             *
             * @param e the event to be processed
             */
            @Override
            public void actionPerformed(ActionEvent e) {
                dispatchEvent(new WindowEvent(Tasks.this, WindowEvent.WINDOW_CLOSING));
                new ChangeDetails();
            }
        });
    }
}

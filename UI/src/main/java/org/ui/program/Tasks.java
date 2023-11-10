package org.ui.program;

import org.properties.Properties;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;

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

    public Tasks() {
        setContentPane(panel);
        setTitle("Task Manager");
        setSize(530, 250);
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
    }
}

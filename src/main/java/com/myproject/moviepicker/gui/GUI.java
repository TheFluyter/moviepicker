package com.myproject.moviepicker.gui;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

@Component
public class GUI implements ActionListener {

    private final JFrame frame = new JFrame();
    private final JPanel panel = new JPanel();
    private JButton button;
    private JLabel label;

    private GUI() {
        panel.setBorder(BorderFactory.createEmptyBorder(50, 150, 100, 150));
        panel.setLayout(new GridLayout(0, 1));

        setLabels();
        setButtons();
        setActions();
        setFrame();
    }

    @PostConstruct
    public void createGUI() {
        new GUI();
    }

    private void setLabels() {
        label = new JLabel("Placeholder welcome text", SwingConstants.CENTER);
        label.setPreferredSize(new Dimension(300, 30));
        panel.add(label);
    }

    private void setButtons() {
        button = new JButton("Placeholder button text");
        button.setPreferredSize(new Dimension(100, 30));
        panel.add(button);
    }

    private void setActions() {
        button.addActionListener(this);
        button.setActionCommand("Button Action");
    }

    private void setFrame() {
        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setTitle("Movier Picker");
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent event) {
        String command = event.getActionCommand();

        if (command.equals("Button Action")) {
            label.setText("You pushed the button");
        }
    }
}

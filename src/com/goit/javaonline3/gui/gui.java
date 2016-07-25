package com.goit.javaonline3.gui;

import com.goit.javaonline3.nod.Nod;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

/**
 * Created by a.lyahovich on 25.07.2016.
 */
public class Gui extends JFrame {
    JButton button;
    public JTextField inputField1;
    JTextField inputField2;
    JTextField outputField;


    public void run(){

        JFrame window = new JFrame();
        window.setVisible(true);
        window.setSize(600,120);
        window.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        window.setResizable(false);

        JPanel panel = new JPanel();

        inputField1= new JTextField("enter first digit here");
        inputField2 = new JTextField("enter second digit here");
        outputField = new JTextField("NOD will be here");
        button = new JButton("Get NOD");
        button.addActionListener(new NODListener());

        panel.add(inputField1);
        panel.add(inputField2);
        panel.add(button);
        panel.add(outputField);


        window.getContentPane().add(panel);
        window.pack();
        window.setLocationRelativeTo(null);



    }

    public class NODListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            int a;
            int b;
            int result;
            try {
                a = Integer.parseInt(inputField1.getText());
                b = Integer.parseInt(inputField2.getText());
                result = Nod.findNod(a, b);
                outputField.setText("" + result);
            }
            catch (NumberFormatException n)
            {
                outputField.setText("Not a digit");
            }




        }
    }
}

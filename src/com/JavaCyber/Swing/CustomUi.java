package com.JavaCyber.Swing;

import javax.swing.JTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;
import java.awt.FlowLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CustomUi extends JFrame {

    JButton btn;
    JTextField numOne;
    JTextField numTwo;
    JLabel showlb;

    public CustomUi(){

        btn = new JButton("Sum!");
        numOne = new JTextField(10);
        numTwo = new JTextField(10);
        showlb = new JLabel();

        add(btn);
        add(numOne);
        add(numTwo);
        add(showlb);

        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {

                try {


                    int nuOne = Integer.parseInt(numOne.getText());
                    int nuTwo = Integer.parseInt(numTwo.getText());
                    int sum = nuOne + nuTwo;
                    showlb.setText(String.valueOf(sum));


                }catch (Exception e)
                {
                    JOptionPane.showMessageDialog(
                            CustomUi.this
                            ,
                            "فیلد نباید خالی باید"
                            ,
                            "خطا"
                            ,
                            JOptionPane.ERROR_MESSAGE
                    );

                    showlb.setText(" ");

                }

            }
        });

        Dimension d = new Dimension();
        d.width = 500;
        d.height = 500;

        this.setLayout(new FlowLayout());
        this.pack();
        this.setLocationRelativeTo(null);
        this.setSize(d);
        this.setVisible(true);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);


    }
}

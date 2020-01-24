/*
Program Name: MorJoGuiTipCalc
Author: Jospeh Morrison
Date: 11/17/2019
Class: CIT171 JAVA I
Description: This program ask for user input and provides
a GUI for the user to select a 10, 15 or 20% tip rate, computes
the tip and displays for user. 
*/
import javax.swing.*;
import java.awt.event.*;

public class MorJoGuiTipCalc extends JFrame {
    public static void main(String[] args) {
        new MorJoGuiTipCalc();
    }
    //Variable decleration
    private JButton buttonCalculate;
    private JButton exitButton;
    private JTextField textAmount;
    private JRadioButton tenPercent;
    private JRadioButton fifteenPercent;
    private JRadioButton twentyPercent;

    public MorJoGuiTipCalc() {

        this.setSize(400, 150);
        this.setLocation(400, 150);
        this.setTitle("Tip Calculator");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        ButtonListener bl = new ButtonListener();
        ButtonGroup percentGroup = new ButtonGroup();
        JPanel panel1 = new JPanel();
        panel1.add(new JLabel("This program calcuates a tip amount"));
        panel1.add(new JLabel("Enter amount of bill and select the tip%"));
        //user input for bill total
        textAmount = new JTextField(11);
        panel1.add(textAmount);
        //10% radio button
        tenPercent = new JRadioButton("10%");
        panel1.add(tenPercent);
        percentGroup.add(tenPercent);
        //15% radio button
        fifteenPercent = new JRadioButton("15%");
        panel1.add(fifteenPercent);
        percentGroup.add(fifteenPercent);
        //20% radio button
        twentyPercent = new JRadioButton("20%");
        panel1.add(twentyPercent);
        percentGroup.add(twentyPercent);
        //calculate button
        buttonCalculate = new JButton("Calculate");
        buttonCalculate.addActionListener(bl);
        buttonCalculate.setToolTipText("Calculate the tip.");
        panel1.add(buttonCalculate);
        // exit button
        exitButton = new JButton("Exit");
        exitButton.addActionListener(bl);
        exitButton.setToolTipText("Exit the program.");
        panel1.add(exitButton);

        this.add(panel1);

        this.setVisible(true);
    }
    private class ButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            
            //variable decleration
            double percent = 0.0;
            //Determines what percent of a tip needs to be calculated 
            if(e.getSource() == buttonCalculate) {
                if(tenPercent.isSelected() ){
                    percent = 0.10;
                }
                else if(fifteenPercent.isSelected()) {
                    percent = 0.15;
                }
                else if(twentyPercent.isSelected()) {
                    percent = 0.20;
                }
                //computes and outputs tip
                double ticketTotal = Double.parseDouble(textAmount.getText());
                double tipAmount = ticketTotal * percent;
                String tipAmountDollars = (String.format("$%.2f", (tipAmount)));
                JOptionPane.showMessageDialog(MorJoGuiTipCalc.this, "Tip amount is" + tipAmountDollars, "Tip amount", JOptionPane.INFORMATION_MESSAGE);
                textAmount.requestFocus();
            }
            //exit button
            else if(e.getSource() == exitButton) {
                System.exit(0);
            }
        }
    }
}
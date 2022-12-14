package SimpleCalc;

import LeapYear.LeapYearGUI;
import java.util.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleCalcGUI extends JFrame{
    private JPanel pnlMain;
    private JTextField tfNumber1;
    private JComboBox cbOperations;
    private JButton btnCompute;
    private JTextField tfNumber2;
    private JTextField lblResult;

    public static void main (String[] args){
        SimpleCalcGUI simpleCalcGUI = new SimpleCalcGUI();
        simpleCalcGUI.setContentPane(simpleCalcGUI.pnlMain);
        simpleCalcGUI.setSize(700, 700);
        simpleCalcGUI.setDefaultCloseOperation(EXIT_ON_CLOSE);
        simpleCalcGUI.setVisible(true);
        simpleCalcGUI.setTitle("Simple Calculator");
    }

    public int sum(){
        int num1 = Integer.parseInt(tfNumber1.getText());
        int num2 = Integer.parseInt(tfNumber2.getText());
        int sum = num1+num2;
        return sum;
    }

    public int diff(){
        int num1 = Integer.parseInt(tfNumber1.getText());
        int num2 = Integer.parseInt(tfNumber2.getText());
        int diff = num1-num2;
        return diff;
    }

    public int prod(){
        int num1 = Integer.parseInt(tfNumber1.getText());
        int num2 = Integer.parseInt(tfNumber2.getText());
        int prod = num1*num2;
        return prod;
    }

    public SimpleCalcGUI(){

        btnCompute.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(cbOperations.getSelectedItem() == "+")
                {
                    lblResult.setText(String.valueOf(sum()));
                } else if(cbOperations.getSelectedItem() == "-")
                {
                    lblResult.setText(String.valueOf(diff()));
                } else if(cbOperations.getSelectedItem() == "*")
                {
                    lblResult.setText(String.valueOf(prod()));
                }
                else if(cbOperations.getSelectedItem() == "/")
                {

                    double num1 = Double.parseDouble(tfNumber1.getText());
                    double num2 = Double.parseDouble(tfNumber2.getText());
                    if(num2 == 0){
                        JOptionPane.showMessageDialog(pnlMain, "Cannot be divided by Zero");
                    }else {
                        double quotient = num1/num2;
                        lblResult.setText(String.valueOf(quotient));
                    }
                }
            }
        });
    }
}


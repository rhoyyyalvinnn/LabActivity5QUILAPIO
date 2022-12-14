package SimpleCalc;

import LeapYear.LeapYearGUI;

import javax.swing.*;

public class SimpleCalcGUI extends JFrame{
    private JPanel pnlMain;
    private JTextField tfNumber1;
    private JComboBox comboBox1;
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







}

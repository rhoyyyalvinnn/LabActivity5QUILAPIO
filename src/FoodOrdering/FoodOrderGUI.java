package FoodOrdering;

import LeapYear.LeapYearGUI;

import javax.swing.*;

public class FoodOrderGUI extends JFrame{
    private JPanel pnlMain;
    private JButton btnOrder;
    private JCheckBox cPizza;
    private JCheckBox cBurger;
    private JCheckBox cFries;
    private JCheckBox cSoftDrinks;
    private JCheckBox cTea;
    private JCheckBox cSundae;
    private JRadioButton rbNone;
    private JRadioButton rb5;
    private JRadioButton rb10;
    private JRadioButton rb15;

    public static void main (String[] args){
        FoodOrderGUI foodOrderGUI = new FoodOrderGUI();
        foodOrderGUI.setContentPane(foodOrderGUI.pnlMain);
        foodOrderGUI.setSize(700, 700);
        foodOrderGUI.setDefaultCloseOperation(EXIT_ON_CLOSE);
        foodOrderGUI.setVisible(true);
        foodOrderGUI.setTitle("Food Ordering System");
    }








}

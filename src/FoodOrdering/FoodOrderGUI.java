package FoodOrdering;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

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

    private List<JRadioButton> bgDiscounts;
    private List<JCheckBox> bgFood;

    public static void main (String[] args){
        FoodOrderGUI foodOrderGUI = new FoodOrderGUI();
        foodOrderGUI.setContentPane(foodOrderGUI.pnlMain);
        foodOrderGUI.setSize(700, 700);
        foodOrderGUI.setDefaultCloseOperation(EXIT_ON_CLOSE);
        foodOrderGUI.setVisible(true);
        foodOrderGUI.setTitle("Food Ordering System");
    }

    public FoodOrderGUI(){
        bgDiscounts = new ArrayList<>();
        bgDiscounts.add(rbNone);
        bgDiscounts.add(rb5);
        bgDiscounts.add(rb10);
        bgDiscounts.add(rb15);

        bgFood = new ArrayList<>();
        bgFood.add(cPizza);
        bgFood.add(cBurger);
        bgFood.add(cFries);
        bgFood.add(cSoftDrinks);
        bgFood.add(cTea);
        bgFood.add(cSundae);



        btnOrder.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                NoChosenFood();
                if(amountPaid() != 0) {
                    JOptionPane.showMessageDialog(pnlMain, "The total price is Php " + String.format("%.2f", FinalAmountPaid()));
                }
            }
        });
    }


    public int amountPaid(){
        int amountpaid = 0;
        if(cPizza.isSelected()){
            amountpaid += 100;
        }
        if(cBurger.isSelected()){
            amountpaid += 80;
        }
        if(cFries.isSelected()){
            amountpaid += 65;
        }
        if(cSoftDrinks.isSelected()){
            amountpaid += 55;
        }
        if(cTea.isSelected()){
            amountpaid += 50;
        }
        if(cSundae.isSelected()){
            amountpaid += 40;
        }
        return amountpaid;
    }

    public double FinalAmountPaid(){
        for(JRadioButton rb : bgDiscounts) {
            if (rbNone.isSelected()) {
                return amountPaid();
            } else if (rb5.isSelected()) {
                return amountPaid() - amountPaid() * .05;
            } else if (rb10.isSelected()) {
                return amountPaid() - amountPaid() * .1;
            } else if (rb15.isSelected()) {
                return amountPaid() - amountPaid() * .15;
            }
        }
        return amountPaid();

    }



    private void NoChosenFood() {
        int amount = 0;

        boolean food_chosen = false;
        for (JCheckBox cb : bgFood) {
            if (cb.isSelected()) {
                food_chosen = true;
            }
        }
        if (!food_chosen) {
            JOptionPane.showMessageDialog(pnlMain, "Please select the food you want to order");
        }
    }
}
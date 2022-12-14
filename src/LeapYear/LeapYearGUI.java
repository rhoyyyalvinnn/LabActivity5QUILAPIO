package LeapYear;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LeapYearGUI extends JFrame{
    private JPanel pnlMain;
    private JTextField tfYear;
    private JButton btnCheckYear;


        public static void main (String[] args){
        LeapYearGUI leapyearGUI = new LeapYearGUI();
        leapyearGUI.setContentPane(leapyearGUI.pnlMain);
        leapyearGUI.setSize(700, 700);
        leapyearGUI.setDefaultCloseOperation(EXIT_ON_CLOSE);
        leapyearGUI.setVisible(true);
        leapyearGUI.setTitle("Leap Year Checker");
    }


        public int LeapYearChecker () {

                int year = Integer.parseInt(tfYear.getText());

                if (year % 4 == 0 && year % 100 != 0) {
                    return 1;
                } else if (year % 4 == 0 && year % 100 == 0) {
                    return 0;
                } else if (year % 4 == 0 && year % 100 == 0 && year % 400 == 0) {
                    return 1;
                }
                return 0;
    }

    public LeapYearGUI() {
        btnCheckYear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (LeapYearChecker() == 1) {
                    JOptionPane.showMessageDialog(pnlMain, "Leap Year");
                } else if(LeapYearChecker() == 0){
                    JOptionPane.showMessageDialog(pnlMain, "Not a Leap Year");
                } else if(LeapYearChecker() == 3){
                    JOptionPane.showMessageDialog(pnlMain, "Invalid Input");
                }
            }
        });
    }

    }




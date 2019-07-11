package com.designpatterns.java;

import javax.swing.JOptionPane;

public class DogYearCalc {

    public static void main (String[] args) {
        double dogYears;
        double humanAge;

        humanAge = Double.parseDouble(JOptionPane.showInputDialog (null,"Please enter you dog's age in human years:"));

        dogYears = dogYearCalc(humanAge);

        JOptionPane.showMessageDialog(null, "Your dog's age in equivalent human years is: " + dogYears);
    }


    public static double dogYearCalc(double humanAge) {
        double dogAge = 0.0;
        if ((humanAge == 1) || (humanAge == 2)) {
            dogAge = 10.5 * humanAge;
        }
        if (humanAge > 2){
            dogAge = (humanAge - 2) * 4 + 21;
        }
        return dogAge;

    }

}
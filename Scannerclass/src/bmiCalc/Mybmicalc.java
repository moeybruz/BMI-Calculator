package bmiCalc;

import java.util.Scanner;

public class Mybmicalc {
    public static void main(String[] args) {
        Scanner height = new Scanner(System.in);
        System.out.println("What is your height (in metre)?");
        double myHeight = height.nextDouble();

        Scanner weight = new Scanner(System.in);
        System.out.println("What is your weight (in KG)?");
        double myWeight = weight.nextDouble();

        double bmicalc = myWeight / (myHeight * myHeight);
        System.out.println("Your BMI is " + bmicalc);

        if (bmicalc < 18.50) {
            System.out.println("Action required: You are considered underweight and possibly malnourished. Please see a nutritionist.");
        }

        if (bmicalc >= 18.50 && bmicalc <= 24.90) {
            System.out.println("No action required: You are within a healthy weight range for young and middle-aged adults, so keep it up.");
        }

        if (bmicalc >= 25.00 && bmicalc <= 29.90) {
            System.out.println("Action required: You are considered overweight. Please see a nutritionist and consider a diet chart.");
        }

        if (bmicalc > 30.00) {
            System.out.println("Urgent action required: You are considered obese. Please see a nutritionist immediately.");
        }

    }
}

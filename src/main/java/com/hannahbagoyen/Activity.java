package com.hannahbagoyen;
import java.util.*;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Activity {
    public static void main(String[] args) {

        Scanner hannah = new Scanner(System.in);

        double result,kilometers, miles;

        System.out.print("Enter first name: ");
        String fName = hannah.nextLine();
        System.out.print("Enter last name: ");
        String lName = hannah.nextLine();

        System.out.println("Hello " + fName + " " + lName);

        System.out.print("Enter first number: ");
        int fNumber = hannah.nextInt();
        System.out.print("Enter operator (+, -, *, /,): ");
        char operator = hannah.next().charAt(0);
        System.out.print("Enter second number: ");
        int sNumber = hannah.nextInt();

        switch (operator) {
            case '+':
                result = fNumber + sNumber;
                System.out.println(fNumber + "+" + sNumber + "=" + result);
                break;

            case '-':
                result = fNumber - sNumber;
                System.out.println(fNumber + "-" + sNumber + "=" + result);
                break;

            case '*':
                result = fNumber * sNumber;
                System.out.println(fNumber + "*" + sNumber + "=" + result);
                break;

            case '/':
                result = fNumber / sNumber;
                System.out.println(fNumber + "/" + sNumber + "=" + result);
                break;

            default:
                System.out.println("Invalid operator!");
                break;
        }

        System.out.print("Enter a distance in km: ");
        kilometers = hannah.nextDouble();

        miles = kilometers / 1.6;
        System.out.println(kilometers + "km is " + miles + "mi");

        System.out.print("Enter a number: ");
        int number = hannah.nextInt();
        for (int i = 1; i <= number; ++i){
            System.out.println("Looping through numbers from 1 to 10: ");
        }
    }
}
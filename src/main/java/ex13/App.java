/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Mauricio Rios
 */
package ex13;

import java.util.Scanner;

public class App {
    Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        App myApp = new App();
        int principal = myApp.getPrincipal();
        double rate = myApp.getRate();
        int years = myApp.getYears();
        int interestCompounded = myApp.getCompounded();
        double total = myApp.getTotal(principal, rate, years, interestCompounded);
        String outputString = myApp.generateOutputString(principal, rate, years, interestCompounded, total);
        myApp.printOutput(outputString);
    }

    public int getPrincipal() {
        System.out.print("What is the principal amount? ");
        return in.nextInt();
    }

    public double getRate() {
        System.out.print("What is the rate? ");
        return in.nextDouble();
    }

    public int getYears() {
        System.out.print("What is the number of years? ");
        return in.nextInt();
    }

    public int getCompounded() {
        System.out.print("What is the number of times the interest is compounded per year? ");
        return in.nextInt();
    }

    public double getTotal(int principal,double rate, int years, int interestCompounded){
        double Total = principal * Math.pow(1+((rate/100)/interestCompounded), interestCompounded*years);
        return Math.round(Total*100d)/100.0d;
    }

    public String generateOutputString(int principal,double rate, int years, int interestCompounded, double total) {
        return "$"+principal+" invested at "+rate+"% for "+years+" years compounded "+interestCompounded+" times per year is $"+total+".";
    }

    public void printOutput(String outputString) {
        System.out.print(outputString);
    }
}







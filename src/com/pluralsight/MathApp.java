package com.pluralsight;

import static java.lang.Math.PI;

public class MathApp {
    public static void main(String[] args) {
// Question 1:
// declare variables here
        double bobSalary = 4300.0;
        double garySalary = 5440.00;
        double highestSalary;

        highestSalary = Math.max(bobSalary, garySalary);

        System.out.println("The highest salary is " + highestSalary + "$");

        double carPrice = 88000.0;
        double truckPrice = 98800.0;
        double smallestPrice;

        smallestPrice = Math.min(carPrice, truckPrice);

        System.out.println("the smallest price is " + smallestPrice);

        double circleRadius = 7.25;
        double circleArea;
        circleArea = Math.PI * Math.pow(circleRadius, 2);

        System.out.println("Circle area is " + circleArea);

        double number = 5.0;
        double squareRoot = Math.sqrt(number);

        System.out.println("Square root of " + number + " is " + squareRoot);

        int point1X = 5;
        int point2X = 85;
        int point1Y = 10;
        int point2Y = 50;
//5, 10) and (85, 50
        double distanceBetweenTwoPoint;
        distanceBetweenTwoPoint = Math.sqrt(Math.pow(85-4, 2) + Math.pow(50-10, 2));
        System.out.println("The distance between point1 and point2 is " + distanceBetweenTwoPoint);

        double negativeNumber =  -3.8;
        double absOfNegativeNumber = Math.abs(negativeNumber);
        System.out.println("The absolute value of " + negativeNumber + " is " + absOfNegativeNumber);

        double randNumber = Math.random();
        System.out.println("This a random number " + randNumber);

        int hoursIn24Days = 24 * 24;
        int minutesIn24Dats = hoursIn24Days * 60;
        int second = minutesIn24Dats * 60;
        int mileSeconds = second * 1000;

        System.out.println("minutes in 24 days is " + minutesIn24Dats);
        System.out.println("mileSeconds in 24 days is " + mileSeconds);
// then code solution
// then use System.out.println() to display results
// ex: System.out.println("The answer is " + answer);
// REPEAT FOR NEXT EXERCISE
    }
}

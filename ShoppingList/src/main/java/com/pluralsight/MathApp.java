package com.pluralsight;

public class MathApp {
    public static void main(String[] args) {
        // Question 1: Compare salaries
        double bobSalary = 136000;
        double garySalary = 116000;
        double highestSalary = Math.max(bobSalary, garySalary);
        System.out.println("The highest salary is $" + highestSalary);

        // Question 2: Find the lowest price
        double carPrice = 25000;
        double truckPrice = 32000;
        double lowestPrice = Math.min(carPrice, truckPrice);
        System.out.println("The lowest vehicle price is $" + lowestPrice);

        // Question 3: Area of a circle with radius 7.25
        double radius = 7.25;
        double area = Math.PI * radius * radius;
        System.out.println("The area of the circle is " + area);

        // Question 4: Square root of 5.0
        double value = 5.0;
        double squareRoot = Math.sqrt(value);
        System.out.println("The square root of " + value + " is " + squareRoot);

        // Question 5: Distance between points (5, 10) and (85, 50)
        int x1 = 5;
        int y1 = 10;
        int x2 = 85;
        int y2 = 50;
        double distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        System.out.println("The distance between the points is " + distance);

        // Question 6: Absolute value of -3.8
        double number = -3.8;
        double absoluteValue = Math.abs(number);
        System.out.println("The absolute value of " + number + " is " + absoluteValue);

        // Question 7: Random number between 0 and 1
        double randomNumber = Math.random();
        System.out.println("Random number between 0 and 1 is " + randomNumber);

    }
}

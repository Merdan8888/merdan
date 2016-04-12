package task2;

import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter center coordinates: ");
        int centerX = input.nextInt();
        int centerY = input.nextInt();

        System.out.println("Please enter center radius: ");
        double radius = input.nextInt();

        System.out.println("Please enter the point coordinates: ");
        int pointX = input.nextInt();
        int pointY = input.nextInt();

//        double area = Math.PI * (radius ^ 2);
        double distance = (((centerX - pointX) ^ 2) + ((centerY - pointY) ^ 2)) ^ (1 / 2);

        if (distance > radius) {
            System.out.println("The point is outside");
        } else {
            System.out.println("The point is inside");
        }

    }

}

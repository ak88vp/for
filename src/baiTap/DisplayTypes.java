package baiTap;

import java.awt.*;
import java.util.Scanner;

public class DisplayTypes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = 0;
        while (choice != 4) {
            System.out.println("Menu:");
            System.out.println("1.Print the rectangle");
            System.out.println("2.Print the square triangle ");
            System.out.println("3.Print isosceles triangle");
            System.out.println("4.Exit");
            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    for (int i = 0; i < 3; i++) {
                        System.out.println("###############");

                    }
                    break;
                case 2:
                    for (int j = 0; j < 4; j++) {
                        System.out.println("#########");


                    }
                    break;
                case 3:
                    String res = "";

                    for (int i = 1; i <= 5; i++) {
                        res += " # ";
                        System.out.println(res);
                    }
                    break;
                case 4:
                    break;

                default:
                    System.out.println("No choice!");


            }
        }
    }
}


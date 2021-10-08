package thucHanh;

import java.util.Scanner;

public class CheckPrimes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number :");
        int number;
        number = scanner.nextInt();
        System.out.println(checkPrimes(number));

    }

    public static String checkPrimes(int number) {
        if (number >= 2) {
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    return number + " is not a prime";
                } else return number + " is a prime";

            }
        }
        return number + " is not a prime";

    }
}

package baiTap;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        int n;
        boolean check=true;
        int num = 3;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào n số nguyên tố đầu tiên:");
        n = scanner.nextInt();
        if (n >= 1) {
            System.out.println(n + " Số nguyên tố đầu tiên là:");
            System.out.println(2);
        }
        for (int i = 2; i <= n; ) {
            for (int j = 2; j <= Math.sqrt(num); j++) {
                if (num % j == 0) {
                    check=false;
                    break;
                }
            }
            if (check) {
                System.out.println(num);
                i++;
            }check=true;
            num++;
        }
    }
}





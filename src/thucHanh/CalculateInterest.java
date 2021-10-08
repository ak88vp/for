package thucHanh;

import java.util.Scanner;

public class CalculateInterest {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Money :");
        float money=scanner.nextFloat();
        System.out.println("Month :");
        int month=scanner.nextInt();
        System.out.println("Interest Rate :");
        double interestRate=scanner.nextDouble();
        double totalInterest = 0;
        for(int i = 0; i < month; i++){
            totalInterest += money * (interestRate/100)/12 * month;
        }
        System.out.println("Total of interest: " + totalInterest);

    }
}

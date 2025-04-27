package basicMaths;

import java.util.Scanner;

public class armstrongNumber {
    public static void main(String[] args) {
        System.out.print("Enter the number:");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        int temp = number;
        int count = 0;

        while (temp != 0){
            temp /=10;
            count++;
        }

        temp = number;
        int armstrongSum = 0;

        while (temp != 0){
            int digit = temp%10;
            armstrongSum  += (int)Math.pow(digit, count);
            temp /= 10;
        }
        if (armstrongSum == number)
            System.out.println("The given number is " +number+ " palindrome");
        else
            System.out.println("The given number is " +number+ " not palindrome");

    }
}

package basicMaths;

import java.util.Scanner;

public class reverseNumber {
    public static void main(String[] args) {
        System.out.print("Enter the number:");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        int temp = number;
        int revNumber = 0;
        while (temp != 0){
            int digit = temp%10;
            revNumber = revNumber*10 + digit;
            temp /= 10;
        }

        System.out.println("The reveresed number " +revNumber+ " for the number " +number);
    }
}

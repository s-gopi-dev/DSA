package basicMaths;

import java.util.Scanner;

public class allDivisorsPrint {
    public static void main(String[] args) {
        System.out.println("Enter the numbe: ");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        System.out.println("The Divisors are as follows:");
        for (int i = 1; i <= Math.sqrt(number) ; i++) {
            if (number%i == 0) {
                System.out.println(i);
                if (i != number / i) {  // To avoid printing the square root twice
                    System.out.println(number / i); // Paired divisor
                }
            }
        }
    }
}

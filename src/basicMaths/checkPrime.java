package basicMaths;

import java.util.Scanner;

public class checkPrime {

    public static void main(String[] args) {
        System.out.print("Enter the Number: ");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        boolean isPrime = true;


        for (int i = 2; i < Math.sqrt(number) ; i++) {
            if(number%i == 0){
                isPrime = false;
                break;
            }

        }

        if(isPrime)
            System.out.println("Entered number is prime number");
        else
            System.out.println("Entered number is not prime number");

    }
}

package basicRecursion;

import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        System.out.println("Enter the Nth number");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        int result = fact(number);
        System.out.println("Factorial of " + number + " is: " + result);

    }
    public static int fact(int number){
        if(number == 0 || number == 1)
            return 1;
        else
            return number * fact(number - 1);

    }
}

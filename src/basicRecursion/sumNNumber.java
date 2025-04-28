package basicRecursion;

import java.util.Scanner;

public class sumNNumber {
    public static void main(String[] args) {
        System.out.println("Enter the Nth number");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        int result = sum(number);
        System.out.println("The Sum is " + result);

    }

    public static int sum(int number){
        if (number == 0)
            return 0;
        else
            return number + sum(number-1);

    }
}

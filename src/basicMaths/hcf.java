package basicMaths;

import java.util.Scanner;

public class hcf {
    public static void main(String[] args) {
        System.out.print("Enter the 1st number:");
        Scanner input = new Scanner(System.in);
        int number1 = input.nextInt();
        System.out.print("Enter the 2nd number:");
        int number2 = input.nextInt();

//        Euclidean algorithm
//        Keep replacing number1 with number2, and number2 with number1 % number2.
//        When number2 becomes 0, number1 is the HCF.

        while (number2 != 0){
            int temp = number2;
            number2 = number1 % number2;
            number1 = temp;
        }

        System.out.println("HCF is " + number1);
        }
}

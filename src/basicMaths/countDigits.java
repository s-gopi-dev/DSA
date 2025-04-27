package basicMaths;

import java.util.Scanner;

public class countDigits {
    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        int temp = number;
        int count = 0;

        while (temp !=0){
            temp /=10;
            count++;
        }

        System.out.println("The number of digits : " +count+" for the number "+number);
    }


}


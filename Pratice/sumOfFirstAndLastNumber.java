package Pratice;

import java.util.Scanner;

public class sumOfFirstAndLastNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        int temp =num;
        
        while(temp>=10){
            temp = temp/10;
        }
        int firstDigit = temp;
        int lastDigit = num%10;
       
        int sum = firstDigit + lastDigit;
        System.out.println("First digit of " + num + " is: " + firstDigit);
        System.out.println("Last digit of " + num + " is: " + lastDigit);
        
        System.out.println("Sum of first and last digit of " + num + " is: " + sum);
        sc.close();
    }
}

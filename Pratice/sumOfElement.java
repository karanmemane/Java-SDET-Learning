package Pratice;

import java.util.Scanner;

public class sumOfElement {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of Array: ");
        int size  = sc.nextInt();
        System.out.println("Enter the element of array: ");
        int arr[] = new  int[size];
        for(int i=0; i<size; i++){
            arr[i] = sc.nextInt();
        }
        int sum = 0;
        for(int i=0; i<size; i++){
            sum += arr[i];
        }
        System.out.println("Sum of Array Elements is: " + sum);
    }
}

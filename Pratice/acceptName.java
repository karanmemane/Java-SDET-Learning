package Pratice;

import java.util.Scanner;

public class acceptName {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = sc.nextLine().toUpperCase();
        System.out.println("Hello, " + name + "!");
    }
}

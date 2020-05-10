package com.company;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] array = inputNumbers();
        for(int i =0;i<array.length;i++){
            int a = array[i];
            boolean isPalindrome = isPalidrome(a);
            if(isPalindrome = false){
                System.out.println("Your array is not a palindrome");
                break;
            }
        }
        System.out.println("Your array is a palindrome");
    }
    public static boolean isPalidrome(int number){
        int reverse = 0;
        int lastDigit = 0;

        do{
            lastDigit=number%10;
            reverse+=lastDigit;
            if(number == reverse){
                return true;
            }
        } while(lastDigit!=0);
        return false;
    }

    public static int[] inputNumbers(){
        System.out.print("please enter the number of numbers you want to: ");
        int number = scanner.nextInt();
        scanner.nextLine();
        int[] array = new int[number];
        for(int i=0;i<array.length;i++){
            System.out.print("please enter a number: ");
            int number1 = scanner.nextInt();
            scanner.nextLine();
            array[i] = number1;
        }
        return array;
    }
}

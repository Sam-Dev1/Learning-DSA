/*
Write a program to print the factorial of a number by defining a method named 'Factorial'. Factorial of any number n is represented by n! and is equal to 1 * 2 * 3 * .... * (n-1) *n. E.g.-
*/

import java.util.Scanner;
public class Factorial {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number whose Factorial you want!!");
        int num= sc.nextInt();
        display(num);
    }
    public static void display(int num){
        int mul=1;
        for(int i=1; i<=num; i++){
            mul=mul*i;

        }System.out.println(mul);
    }
}

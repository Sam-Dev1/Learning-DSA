// Take two numbers and print the sum of both.

import java.util.Scanner; 

public class  Sum{
    public static void Main(String []args){
        Scanner obj = new Scanner(System.in);
        int a= obj.nextInt();
        int b= obj.nextInt();
        int add=a+b;
        System.out.println("Sum is "+ add);
    }
}
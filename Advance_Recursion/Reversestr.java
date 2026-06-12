package Advance_Recursion;

import java.util.*; 
public class Reversestr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Sting to me reverse");
        String str=sc.nextLine();
        reverseString(str , str.length()-1);
    }

    public static void reverseString(String str , int index) {
        if(index==0){
            System.out.println(str.charAt(index));
            return;
        }
        System.out.print(str.charAt(index));
        reverseString(str , index-1);

    }
}
//Count digits of a number recursively
package Recursion;

import java.util.*;

public class recursionQ6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        print(num, 0);
    }

    public static void print(int num, int length) {
        if (num == 0) {
            System.out.println(length);
            return;
        }
        num = num / 10;
        print(num, length + 1);
    }
}
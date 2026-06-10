//fibonacci series of nth term 

package Recursion;
import java.util.*;

public class recursionQ5 {
    public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	int n=sc.nextInt();
	int a=0 , b=1;
	System.out.println(a);
	System.out.println(b);
	printNumber(n-2 , a,b);
    }

    public static void printNumber(int n , int a , int b){
		if(n==0){
	    	return;
		}
		int c=a+b;
		a=b;
		b=c;
		System.out.println(c);
		
		printNumber(n-1, a , b);

    }
}

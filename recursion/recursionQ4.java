//Factorial of a number n 

package Recursion;
import java.util.*;

public class recursionQ4 {
    public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	int n=sc.nextInt();
	printNumber(n , 1);
    }

    public static void printNumber(int n , int mul){

		if(n==1){
	    	mul =mul*(int) n;
	    	System.out.println(mul);
	    	return;
		}
		mul =mul*n;
		printNumber(n-1, mul);

    }
}

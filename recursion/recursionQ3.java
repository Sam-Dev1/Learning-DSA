package recursion;

public class recursionQ3 {
    public static void main(String[] args) {
        printNumber(1, 5, 0);
    }

    public static void printNumber(int i, int n , int sum){
    	if(i==n){
	    sum+=i;
	    System.out.println(sum);
	    return;
	}
	sum+=i;
	printNumber(i+1,n,sum);
    }
}

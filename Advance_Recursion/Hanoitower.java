package Advance_Recursion;

public class Hanoitower {
    public static void main(String[] args) {
        int n = 3;
        tower(n, "S", "H", "D");
    }

    public static void tower(int n, String src, String helper, String dist){
		if(n==1){
			System.out.println("Transfer disk "+ n+" from "+ src +" to "+ dist);
			return;
		}
		tower(n-1, src, dist, helper);
		System.out.println("Transfer disk "+ n+" from "+ src +" to "+ dist);
		tower(n-1, helper, src, dist);
	}

}

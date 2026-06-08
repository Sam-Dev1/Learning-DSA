import java.util.Scanner;

public class Permutation {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int r= sc.nextInt();
        display(n ,r);

    }
    public static void display(int n , int r) {
        int mul = 1;
        int div = 1;
        int[] per = new int[n];
        for (int i = 1; i <= n; i++) {
            mul = mul * i;

            for (int j = 1; j <= r; j++) {
                div = i - j;
            }
            per[i] = mul / div;
        }
        if (div <= 0) {
            System.out.println("Error");
        }
        for (int i = 0; i <= n; i++) {
            System.out.println(per[i]);

        }
    }
}

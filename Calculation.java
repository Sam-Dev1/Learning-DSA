import java.util.Scanner;

public class Calculation {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter your electricity units consumed:");
        int n = obj.nextInt();
        System.out.println("Electricity bill for " + n + " units:");
        if(n <= 50){
            System.out.println("Total bill is: Rs 0");
        }else{
            int a = 10 * n;
            int b = a + (int)(a * 0.05);
            System.out.println("Total bill is: Rs " + b);
        }
       
    }
}
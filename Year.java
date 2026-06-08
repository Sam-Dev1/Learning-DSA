import java.util.Scanner;
public class Year {
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        int year = obj.nextInt();
        if (year % 4 == 0) {
            System.out.println("leap year");
        } else {
            System.out.println("not a leap year");
        }
    }
}

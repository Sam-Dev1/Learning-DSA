import java.util.Scanner;
public class Year {
    public static void main(String[] args){
        Scanner src = new Scanner(System.in);
        int year = src.nextInt();
        if (year % 4 == 0) {
            System.out.println("leap year");
        } else {
            System.out.println("not a leap year");
        }
    }
}

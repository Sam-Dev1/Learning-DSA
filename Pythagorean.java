
import java.util.Scanner;
public class Pythagorean {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a= sc.nextInt();
        int b=sc.nextInt();
        int c= sc.nextInt();
        check(a , b , c);
    }
    public static void check(int a, int b, int c){
        int x=a*a;
        int y=b*b;
        int z= c*c;
        int xy =x+y;
        int yz =y+z;
        int xz =x+z;
        if(xy==z || yz==x || xz==y){
            System.out.println("It is pythagorean number");
        }else{
            System.out.println("It is not pythagorean number");
        }
    }
}


//Define two methods to print the maximum and the minimum number respectively among three numbers entered by the user.
import java.lang.reflect.Method;
import java.util.Scanner;

class method {
    public static void maximum(int a, int b, int c){
                if(a>b && a>c){
                    System.out.println("A is maximum");
                }else if (b>a && b>c){
                    System.out.println("B is maximum");
                }else if (c>a && c>b){
                    System.out.println("C is maximum");
                }else{
                    System.out.println("Error!!");
                }
    }
    public static void minimum(int a, int b, int c){
        if(a<b && a<c){
            System.out.println("A is minimum");
        }else if (b<a && b<c){
            System.out.println("B is minimum");
        }else if (c<a && c<b){
            System.out.println("C is minimum");
        }else{
            System.out.println("Error!!");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        maximum(a, b, c);
        minimum(a, b, c);

    }
}
package arrays;
import java.util.Scanner;
public class Permutations {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        buildArray(n);
    }
    public int[] buildArray(int nums) {
        int n = nums.length;
        int[] ans = new int[n];
        for (int i = 0; i < n; ++i) {
            ans[i] = nums[nums[i]];
        }

        return ans;

    }
}

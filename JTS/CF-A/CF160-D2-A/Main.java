import java.util.Arrays;
import java.util.Scanner;

//    Date : 2019-06-07
//  Author : Yash Kumar
// Problem : http://codeforces.com/contest/160/problem/A

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] ary = new int[n];
        int sum = 0;
        for(int i = 0; i < n; i++){
            ary[i] = sc.nextInt();
            sum += ary[i];
        }
        Arrays.sort(ary);
        int sum1 = 0;
        int count = 0;
        for(int i = n-1; i>=0; i--){
            if(sum1 > sum/2) break;
            count++;
            sum1 += ary[i];
        }
        System.out.print(count);
    }
}

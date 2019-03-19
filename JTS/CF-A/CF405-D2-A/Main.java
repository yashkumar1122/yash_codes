import java.util.Scanner;
import java.util.Arrays;

//    Date : 2019-03-19
//  Author : Yash Kumar
// Problem : http://codeforces.com/contest/405/problem/A

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] ary = new int[n];

        for (int i = 0; i < n; i++)
            ary[i] = sc.nextInt();

        for (int i = 0; i < n; i++) {
            Arrays.sort(ary);
        }
        for (int i = 0; i < n; i++)
            System.out.print(ary[i] + " ");
    }
}

import java.util.Scanner;

//    Date : 2019-03-19
//  Author : Yash Kumar
// Problem : http://codeforces.com/contest/677/problem/A

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int h = sc.nextInt();
        int width = 1;
        int sum = 0;
        int[] ary = new int[n];

        for (int i = 0; i < n; i++) {
            ary[i] = sc.nextInt();

            if (ary[i] > h) {
                ary[i] = width + 1;
                sum += ary[i];
            } else {
                sum = sum + width;
            }
        }
        System.out.println(sum);
    }
}

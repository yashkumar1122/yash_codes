import java.util.Scanner;

//    Date : 2019-03-19
//  Author : Yash Kumar
// Problem : http://codeforces.com/contest/231/problem/A

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int count = 0;
        int[][] ary = new int[a][3];

        for (int i = 0; i < a; i++) {
            for (int j = 0; j < 3; j++) {
                ary[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < a; i++) {
            int sum = 0;
            for (int j = 0; j < 3; j++) {
                sum = sum + ary[i][j];
            }
            if (sum >= 2)
                count++;
        }
        System.out.println(count);

    }
}

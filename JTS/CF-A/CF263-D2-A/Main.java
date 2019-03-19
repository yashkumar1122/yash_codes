import java.util.Scanner;

//    Date : 2019-03-19
//  Author : Yash Kumar
// Problem : http://codeforces.com/contest/263/problem/A

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        int[][] ary = new int[5][5];

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                ary[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (ary[i][j] == 1) {
                    count = Math.abs(2 - i) + Math.abs(2 - j);
                }
            }
        }
        System.out.println(count);
    }
}

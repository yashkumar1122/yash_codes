import java.util.Scanner;
import java.util.*;

//    Date : 2019-03-19
//  Author : Yash Kumar
// Problem : http://codeforces.com/contest/228/problem/A

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] ary = new int[4];
        int count = 0;
        for (int i = 0; i < 4; i++) {
            ary[i] = sc.nextInt();
        }
        Arrays.sort(ary);
        for (int i = 1; i <= 3; i++) {
            if (ary[i - 1] == ary[i]) {
                count++;
            }
        }
        System.out.println(count);
    }
}

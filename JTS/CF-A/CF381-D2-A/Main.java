import java.util.Scanner;

//    Date : 2019-03-19
//  Author : Yash Kumar
// Problem : http://codeforces.com/contest/381/problem/A

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] ary = new int[n];
        for (int i = 0; i < ary.length; i++) {
            ary[i] = sc.nextInt();
        }

        int left = 0, right = n - 1;
        boolean flag = true;
        int seraja = 0, dima = 0;
        while (left <= right) {
            if (ary[left] >= ary[right]) {
                if (flag)
                    seraja = seraja + ary[left];
                else
                    dima = dima + ary[left];
                left++;
            } else if (ary[right] > ary[left]) {
                if (flag)
                    seraja = seraja + ary[right];
                else
                    dima = dima + ary[right];
                right--;
            }
            if (flag)
                flag = false;
            else
                flag = true;

        }
        System.out.println(seraja + " " + dima);
    }
}

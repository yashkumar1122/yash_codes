import java.util.Scanner;

//    Date : 2019-03-19
//  Author : Yash Kumar
// Problem : http://codeforces.com/contest/731/problem/A

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char[] c = str.toCharArray();
        int start = 0;
        int dis = 0;
        int index = 0;
        for (int i = 0; i < c.length; i++) {
            index = c[i] - 97;
            int walk = Math.abs(start - index);
            if (walk < 13)
                dis = dis + walk;
            else
                dis = dis + 26 - walk;
            start = index;

        }

        System.out.println(dis);
    }
}

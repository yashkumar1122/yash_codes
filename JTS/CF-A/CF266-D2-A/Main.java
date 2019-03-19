import java.util.Scanner;

//    Date : 2019-03-19
//  Author : Yash Kumar
// Problem : http://codeforces.com/contest/266/problem/A

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String str = sc.nextLine();
        char[] c = str.toCharArray();
        int count = 0;
        for (int i = 1; i < c.length; i++) {
            if (c[i - 1] == c[i]) {
                count++;
            }
        }
        System.out.println(count);
    }
}

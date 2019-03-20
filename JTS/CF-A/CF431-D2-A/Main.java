import java.util.Scanner;

//    Date : 2019-03-19
//  Author : Yash Kumar
// Problem : http://codeforces.com/contest/431/problem/A

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[4];
        for (int i = 0; i < 4; i++)
            a[i] = sc.nextInt();

        sc.nextLine();
        String s = sc.nextLine();
        int c = 0;
        for (int i = 0; i < s.length(); i++)
            c += a[s.charAt(i) - '1'];
        System.out.println(c);
    }
}

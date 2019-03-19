import java.util.Scanner;

//    Date : 2019-03-19
//  Author : Yash Kumar
// Problem : http://codeforces.com/contest/344/problem/A

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a, b = 0, c = 0;
        for (int i = 0; i < n; i++) {
            a = sc.nextInt();
            if (a != b)
                c++;
            b = a;
        }
        System.out.println(c);
    }
}

import java.util.Scanner;

//    Date : 2019-04-05
//  Author : Yash Kumar
// Problem : http://codeforces.com/contest/71/problem/A

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            String a = sc.nextLine();
            if (a.length() > 10)
                System.out.println(a.charAt(0) + Integer.toString(a.length() - 2) + a.charAt(a.length() - 1));
            else
                System.out.println(a);
        }
    }
}

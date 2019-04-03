import java.util.Scanner;

//    Date : 2019-03-19
//  Author : Yash Kumar
// Problem : http://codeforces.com/contest/677/problem/A

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int h = sc.nextInt();
        int width = n;

        for (int i = 0; i < n; i++) {
            if(sc.nextInt() > h)
                width++;
        }
        System.out.println(width);
    }
}

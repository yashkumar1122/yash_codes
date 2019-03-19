import java.util.Scanner;

//    Date : 2019-03-19
//  Author : Yash Kumar
// Problem : http://codeforces.com/contest/791/problem/A

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int count = 0;

        double n = ((Math.log10(b) - Math.log10(a)) / Math.log10(1.5));
        /*
         * while (a <= b) { a = a * 3; b = b * 2; count++; }
         */

        System.out.println((int) Math.ceil(n + 0.000005));
    }
}

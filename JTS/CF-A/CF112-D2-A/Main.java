import java.util.Scanner;

//    Date : 2019-03-19
//  Author : Yash Kumar
// Problem : http://codeforces.com/contest/112/problem/A

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine().toLowerCase();
        String str2 = sc.nextLine().toLowerCase();
        int f = 0;

        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) > str2.charAt(i)) {
                f = 1;
                break;
            } else if (str1.charAt(i) < str2.charAt(i)) {
                f = -1;
                break;
            }
        }
        System.out.println(f);
    }
}

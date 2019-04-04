import java.util.Scanner;

//    Date : 2019-04-05
//  Author : Yash Kumar
// Problem : http://codeforces.com/contest/265/problem/A

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String t = sc.nextLine();

        // int count = 1;
        // char[] c = s.toCharArray();
        int i = 0;
        for (int j = 0; i < s.length() && j < t.length(); j++) {
            if (s.charAt(i) == t.charAt(j))
                i++;
        }
        System.out.println(i+1);
    }
}

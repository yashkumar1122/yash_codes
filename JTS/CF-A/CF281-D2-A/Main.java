import java.util.Scanner;

//    Date : 2019-03-19
//  Author : Yash Kumar
// Problem : http://codeforces.com/contest/281/problem/A

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();

        char[] ary = str1.toCharArray();
        for (int i = 0; i < ary.length; i++) {
            if (Character.isLowerCase(ary[0]))
                ary[i] = Character.toUpperCase(ary[0]);
        }

        System.out.println(String.valueOf(ary));
    }
}

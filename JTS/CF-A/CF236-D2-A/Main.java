import java.util.Scanner;

//    Date : 2019-03-19
//  Author : Yash Kumar
// Problem : http://codeforces.com/contest/236/problem/A

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        boolean[] ary = new boolean[26];

        for (int i = 0; i < str1.length(); i++) {
            Character c = Character.toUpperCase(str1.charAt(i));
                ary[(int) c - 65] = true;
        }
        int count = 0;
        for(boolean v: ary)
            if(v)
                count++;

        if(count % 2 != 0)
            System.out.println("IGNORE HIM!");
        else
            System.out.println("CHAT WITH HER!");
    }
}

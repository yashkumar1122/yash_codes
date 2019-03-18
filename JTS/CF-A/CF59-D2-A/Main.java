import java.util.Scanner;

//    Date : 2019-03-19
//  Author : Yash Kumar
// Problem : http://codeforces.com/contest/59/problem/A

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        int[] ary = new int[26];
        int count1 = 0;
        int count2 = 0;

        for (int i = 0; i < str1.length(); i++) {
            Character c = (str1.charAt(i));
            if (Character.isUpperCase(c))
                count1++;
            else
                count2++;
        }
        if (count1 <= count2)
            System.out.println(str1.toLowerCase());
        else
            System.out.println(str1.toUpperCase());
    }
}

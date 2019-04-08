import java.util.Scanner;

//    Date : 2019-04-09
//  Author : Yash Kumar
// Problem : http://codeforces.com/contest/443/problem/A

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        boolean[] appeared = new boolean[26];


        for (int i = 0; i < s.length(); i++){
            Character c = Character.toUpperCase(s.charAt(i));
            if(Character.isLetter(c))
                appeared[(int)c - 65] = true;
        }

        int count = 0;
        for(boolean v:appeared)
            if(v)
                count++;

        System.out.println(count);
    }
}

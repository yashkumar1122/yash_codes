import java.util.Scanner;

//    Date : 2019-03-19
//  Author : Yash Kumar
// Problem : http://codeforces.com/contest/427/problem/A

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int crime = 0;
        int counter = 0;
        int officer = 0;

        for (int i = 0; i < n; i++) {
            int req = sc.nextInt();
            if (req < 0) {
                if (officer > 0)
                    officer--;
                else
                    crime++;
            } else
                officer = officer + req;

        }

        System.out.println(crime);
    }
}

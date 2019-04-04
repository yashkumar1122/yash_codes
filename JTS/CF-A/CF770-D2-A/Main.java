import java.util.Scanner;

//    Date : 2019-04-05
//  Author : Yash Kumar
// Problem : http://codeforces.com/contest/770/problem/A

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        for(int i = 0; i < n; i++){
            System.out.print((char)('a' + i % k));
        }
    }
}

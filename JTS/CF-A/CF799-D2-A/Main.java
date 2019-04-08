import java.util.Scanner;

//    Date : 2019-04-08
//  Author : Yash Kumar
// Problem : http://codeforces.com/contest/799/problem/A

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = sc.nextInt();
        int k = sc.nextInt();
        int d = sc.nextInt();

        int x = (n+k-1)/k;
        int out1 = 0;
        int out2 = d;

        for(int i = 0; i < x; i++){
            if(out1 <= out2)
                out1 += t;
            else
                out2 += t;    
        }
        if(Math.max(out1, out2) < x*t)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}

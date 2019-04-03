import java.util.Scanner;

//    Date : 2019-04-03
//  Author : Yash Kumar
// Problem : http://codeforces.com/contest/294/problem/A

public class Main {

    public static void main(String[] args) {
        int[] ary = new int[100];

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0; i < n; i++){
            ary[i] = sc.nextInt();
        }
        int m = sc.nextInt();
        for(int i = 0; i < m; i++){
            int x = sc.nextInt();
            int y = sc.nextInt();
            x--;
            if(x !=0 )
                ary[x-1] += y-1;
            if(x != n-1 )
                ary[x+1] += ary[x] - y;
            ary[x] = 0;
        }

        for(int i = 0; i < n; i++)
            System.out.println(ary[i]+ " ");
    }
}

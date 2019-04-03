import java.util.HashMap;
import java.util.Scanner;

//    Date : 2019-04-03
//  Author : Yash Kumar
// Problem : http://codeforces.com/contest/268/problem/A

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        HashMap<Integer, Integer> hm = new HashMap<>();

        int[] home = new int[n];

        for (int i = 0; i < n; i++) {
            home[i] = sc.nextInt();
            int guest = sc.nextInt();
            if (hm.containsKey(guest))
                hm.put(guest, hm.get(guest) + 1);
            else
                hm.put(guest, 1);
        }
        int count = 0;
        for (int h : home)
            if (hm.containsKey(h))
                count += hm.get(h);
        System.out.println(count);
    }
}

import java.util.Scanner;
import java.util.ArrayList;

//    Date : 2019-04-09
//  Author : Yash Kumar
// Problem : http://codeforces.com/contest/490/problem/A

public class Main {

    public static void main(String[] args) {

        ArrayList<ArrayList<Integer>> s1 = new ArrayList<ArrayList<Integer>>();
        for (int i = 0; i < 3; i++)
            s1.add(new ArrayList<Integer>());

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++)
            s1.get(sc.nextInt()-1).add(i + 1);

        int team = Math.min(Math.min(s1.get(0).size(), s1.get(1).size()), s1.get(2).size());
        System.out.println(team);

        for(int i = 0; i < team; i++){
            System.out.println(s1.get(0).get(i) + " " + s1.get(1).get(i) +" " + s1.get(2).get(i));
        }
    }
}
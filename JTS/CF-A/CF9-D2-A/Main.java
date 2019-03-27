import java.util.Scanner;

//    Date : 2019-03-27
//  Author : Yash Kumar
// Problem : http://codeforces.com/contest/9/problem/A

public class Main {

    public static void main(String[] args) {

        String[] dice_roll = new String[]{"1/6","1/3","1/2","2/3","5/6","1/1"};
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int out =  Math.max(x,y);

        System.out.println(dice_roll[6-out]);
    }
}

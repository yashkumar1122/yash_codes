import java.util.Scanner;

//    Date : 2019-03-19
//  Author : Yash Kumar
// Problem : http://codeforces.com/contest/734/problem/A

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String str = sc.nextLine();
        int count1 = 0;
        int count2 = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (str.charAt(i) == 'A')
                count1++;
            else
                count2++;
        }
        if (count1 == count2)
            System.out.println("Friendship");
        else if (count1 > count2)
            System.out.println("Anton");
        else
            System.out.println("Danik");
    }
}

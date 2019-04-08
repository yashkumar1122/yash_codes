import java.util.Scanner;
import java.util.ArrayList;

//    Date : 2019-03-27
//  Author : Yash Kumar
// Problem : http://codeforces.com/contest/9/problem/A

public class Main {

    public static ArrayList<String> split(String s) {
        ArrayList<String> al = new ArrayList();
        String word = "";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                al.add(word);
                word = "";
            } else
                word += s.charAt(i);
        }
        if (word != "")
            al.add(word);
        return al;
    }

    public static String removeDup(String s){
        String str = "";
        for(int i = 0; i < s.length(); i++){
            if(!str.contains(Character.toString(s.charAt(i)))){
                str += s.charAt(i);
            }
        }
        return str;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        // ArrayList<String> output = split(s);
        String[] output = s.split(" ");

        for (String w : output)
            System.out.print(removeDup(w) + " ");
    }
}

import java.util.Scanner;
import java.util.ArrayList;


//    Date : 2019-06-06
//  Author : Yash Kumar
// Problem : http://codeforces.com/contest/474/problem/A

public class Main {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        ArrayList<Character> al = new ArrayList<Character>();
        al.add('q');al.add('w');al.add('e');al.add('r');al.add('t');al.add('y');al.add('u');al.add('i');
        al.add('o');al.add('p');al.add('a');al.add('s');al.add('d');al.add('f');al.add('g');
        al.add('h');al.add('j');al.add('k');al.add('l');al.add(';');al.add('z');
        al.add('x');al.add('c');al.add('v');al.add('b');al.add('n');al.add('m');al.add(',');al.add('.');al.add('/');
        String  s1 = sc.nextLine();
        String s2 = sc.nextLine();

        if(s1.equals("R")){
            for(int i = 0; i<s2.length(); i++)
                System.out.print(al.get(al.indexOf(s2.charAt(i))-1));
        }
        else{
            for(int i = 0; i<s2.length(); i++)
                System.out.print(al.get(al.indexOf(s2.charAt(i))+1));
            
        }
    }
}

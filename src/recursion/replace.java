package recursion;

import java.util.Scanner;

public class replace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String:");
        String s = sc.next();
        System.out.println("Enter char c1 and c2:");
        char c1 = sc.next().charAt(0);
        char c2 = sc.next().charAt(0);
        String newS = rep(0,s,c1,c2);
        System.out.println("Replaced string: "+newS);

    }
    static String rep(int index, String s, char c1, char c2) {
        if(index==s.length())
            return s;
        if(s.charAt(index)==c1)
        {
            s=s.replace(c1,c2);
        }
        return rep(index+1,s,c1,c2);
    }
}

package recursion;

import java.util.Scanner;

public class remove {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String:");
        String s = sc.next();
        StringBuilder ss = new StringBuilder(s);
        StringBuilder newString = rem(0,ss);
        System.out.println("New String: "+newString);

    }
    static StringBuilder rem(int index, StringBuilder s) {
             if(index+1==s.length())
               return s;
             if(s.charAt(index)==s.charAt(index+1))
             {
                 s.deleteCharAt(index);
                 return rem(index,s);
             }
             else
             {
                 return rem(index+1,s);
             }
    }
}

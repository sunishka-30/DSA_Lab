package recursion;

import java.util.Scanner;

public class convert {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String:");
        String s = sc.next();
        int n = con(s.length()-1,s,1);
        System.out.println("Number is : "+n);
        System.out.println(n + " is of type " + ((Object)n).getClass().getSimpleName());
    }
    static int con (int index,String s, int m)
    {
        if(index<0)
            return 0;
        return (s.charAt(index)-48)*m+con(index-1,s,m*10);

    }
}

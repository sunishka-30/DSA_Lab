package recursion;

import java.util.Scanner;

public class power {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter x:");
        int x = sc.nextInt();
        System.out.println("Enter power n:");
        int n = sc.nextInt();
        int ans = power(x,n);
        System.out.println(x+"^"+n+"="+ans);

    }
   static int power(int x, int n) {
        int p=1;
        if(n==0)
        {
            return 1;
        }
        if(x==0)
        {
            return 0;
        }
        return x*power(x, n - 1);
    }
}

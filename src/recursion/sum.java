package recursion;

import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no.of elements in array:");
        int n = sc.nextInt();
        System.out.println("Enter array elements:");
        int[] ar = new int[n];
        for (int i=0;i<n;i++)
        {
            ar[i]=sc.nextInt();
        }
        int s = calcSum(ar,n);
        System.out.println("sum = "+s);
    }
    static int calcSum(int[] a, int n)
    {
        if(n<=0)
            return 0;
        return(calcSum(a,n-1)+a[n-1]);

    }
}

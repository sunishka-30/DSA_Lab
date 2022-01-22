package recursion;

import java.util.Scanner;

public class numbers {

    static void print1(int n)
    {
        if (i<=n)
        {
            System.out.print(i+" ");
            i++;
            print2(n);

        }

    }
    static void print2(int n)
    {
        if(i<=n)
        {
            System.out.print(i+" ");
            i++;
            print1(n);

        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n:");
        int n = sc.nextInt();
        print1(n);
    }


    static int i = 1;
}


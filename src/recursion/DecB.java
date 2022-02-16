package recursion;

import java.util.Scanner;

public class DecB {
    public static void decToBin(int n)
    {
        if(n==1 || n==0) {
            System.out.print(n);
            return;
        }
        decToBin(n/2);
        System.out.print(n%2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        decToBin(n);
    }
}

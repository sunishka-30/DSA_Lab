package recursion;

import java.util.Scanner;

public class searchAll {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no.of elements in array:");
        int n = sc.nextInt();
        System.out.println("Enter array elements:");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter element to be searched:");
        int e = sc.nextInt();


        int[] iarr = searchAllValue(arr,e,0,0);
        System.out.println("Indices at which element is present:");
        for (int j : iarr) {
            System.out.print(j+" ");
        }

    }
    static int[] searchAllValue(int[] arr, int ele, int currentIndex, int fsf)
    {
        if(currentIndex == arr.length)
        {
            return new int[fsf];
        }
        int[] iarr;
        if (arr[currentIndex] == ele)
        {
            iarr = searchAllValue(arr, ele, currentIndex + 1, fsf + 1);
            iarr[fsf] = currentIndex+1;
        }
        else
        {
            iarr = searchAllValue(arr, ele, currentIndex + 1, fsf);


        }
        return iarr;
    }
}

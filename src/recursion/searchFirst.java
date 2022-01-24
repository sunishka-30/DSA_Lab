package recursion;

import java.util.Scanner;

public class searchFirst {

        public static int searchValue(int[] arr, int currentIndex, int element)
        {
            if(currentIndex==arr.length)
                return -1;
            if(arr[currentIndex]==element)
                return currentIndex+1;
            return searchValue(arr,currentIndex+1,element);
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter no.of elements in array:");
            int n = sc.nextInt();
            System.out.println("Enter array elements:");
            int[] arr = new int[n];
            for (int i=0;i<n;i++)
            {
                arr[i]=sc.nextInt();
            }
            System.out.println("Enter element to be searched:");
            int e = sc.nextInt();
            int ans=searchValue(arr,0,e);
            System.out.println(ans);
        }
    }


package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class insertionSort
{
    public  static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i]=sc.nextInt();
        }
        for(int i=1;i<n;i++)
        {
            int j=i-1;

            while (j>=0 && a[j]>a[i])
            {
                a[j+1]=a[j];
                j--;
            }
            a[j+1]=a[i];
        }
        System.out.println(Arrays.toString(a));

    }
}

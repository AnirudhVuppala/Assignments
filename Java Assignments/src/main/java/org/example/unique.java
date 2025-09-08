package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class unique {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int[] a = new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        Arrays.sort(a);
        int ctr=0;
        for (int i = 0; i < n - 1; i++) {
            if (a[i] == a[i + 1]) {

                if (i == 0 || a[i] != a[i-1]) {
                    ctr++;
                }
            }
        }
        System.out.println(ctr);
    }
}

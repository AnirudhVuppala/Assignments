package org.example;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class duplicateChar
{
    public  static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.next();

        Set<Character> seen = new HashSet<>();
        Set<Character> duplicates = new HashSet<>();

        for (char ch : str.toCharArray()) {
            if (!seen.add(ch)) {
                duplicates.add(ch);
            }
        }

        System.out.println( duplicates);
        sc.close();
//        System.out.println(str.length()-set.size());
    }
}

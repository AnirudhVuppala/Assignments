package org.example;

import java.util.HashMap;
import java.util.Scanner;

public class isomorphic {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        String s1=sc.next();
        if(s1.length()!=s.length()) {
            System.out.println("false");
            return;
        }
        HashMap<Character,Character> hm=new HashMap<>();
        for(int i=0;i<s1.length();i++) {
            if(hm.containsKey(s.charAt(i))) {
                if(hm.get(s.charAt(i))!=s1.charAt(i)) {
                    System.out.println("false");
                    return;
                }
            }
            else {
                hm.put(s.charAt(i),s1.charAt(i));
            }
        }
        System.out.println("true");
    }
}

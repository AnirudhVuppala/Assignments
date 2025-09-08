package org.example;

import java.util.ArrayList;
import java.util.List;

public class phonenumber
{
    public static void main(String[] args)
    {
        String digits="2";
        String []keys={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        List<String> list=new ArrayList<>();
        backtrack(digits,keys,list,0,"");
        System.out.println(list);
    }
    public static void backtrack(String digits,String[] keys,List<String> list,int index,String temp)
    {
        if(index==digits.length()) {
            list.add(temp);
            return;
        }
        String str=keys[digits.charAt(index)-'0'];

        for(int i=0;i<str.length();i++)
        {
            temp+=str.charAt(i);
            backtrack(digits,keys,list,index+1,temp);
            temp=temp.substring(0,temp.length()-1);

        }

    }
}

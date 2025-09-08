package org.example;

import java.util.HashMap;
import java.util.Scanner;

public class reformatdate
{
    public static void main(String[] args)
    {
        HashMap<String, String> monthMap = new HashMap<>();
        monthMap.put("Jan", "01");
        monthMap.put("Feb", "02");
        monthMap.put("Mar", "03");
        monthMap.put("Apr", "04");
        monthMap.put("May", "05");
        monthMap.put("Jun", "06");
        monthMap.put("Jul", "07");
        monthMap.put("Aug", "08");
        monthMap.put("Sep", "09");
        monthMap.put("Oct", "10");
        monthMap.put("Nov", "11");
        monthMap.put("Dec", "12");
        Scanner sc = new Scanner(System.in);
        String date = sc.nextLine();
        String []div=date.split(" ");
        String day=div[0].substring(0,div[0].length()-2);
        String month=div[1];
        String year=div[2];
        if(day.length()==1)
            day="0"+day;

        System.out.println( year+"-"+monthMap.get(month)+"-"+day);
    }
}

package org.example;

import java.util.ArrayList;
import java.util.List;

public class subsets   {
    public static void main(String[] args){
        int []nums={1,2,3};
        List<List<Integer>> list=new ArrayList<>();
        backtrack(list,new ArrayList<>(),0,nums);
        System.out.println(list);
    }
    public static void backtrack(List<List<Integer>> list,List<Integer> temp,int index,int []nums){

        list.add(new ArrayList<>(temp));


        for (int i = index; i < nums.length; i++) {
            temp.add(nums[i]);
            backtrack(list, temp, i + 1, nums);
            temp.remove(temp.size() - 1);

//            list.add(new ArrayList<>(temp));
//
//            if(index==nums.length-1){
//
//                return;
//
//            }
//
//            backtrack(list,temp,index+1,nums);
//
//            if(index<nums.length){
//
//                temp.add(nums[index]);
//
//                backtrack(list,temp,index+1,nums);
//
//                temp.remove(temp.size()-1);
        }
    }
}

package org.killers.playground;

public class LeetCodeArraysAndStrings {

    //Find Pivot Index
    public static int pivotIndex(int[] nums) {
        int index=-1;
        int rightSum=0,leftSum=0;
        for (int i = 0; i < nums.length; i++) {
            rightSum += nums[i];
        }
        System.out.println(rightSum);
        for (int i = 0; i < nums.length; i++) {
            rightSum-=nums[i];
            if(leftSum==rightSum){
                return i;
            }
            leftSum+=nums[i];
        }

        return index;
    }

    //Largest Number At Least Twice of Others
    public int dominantIndex(int[] nums) {
        int index=-1;
        int maxInt=Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if(maxInt<nums[i]){
                maxInt = nums[i];
                index = i;
            }
        }

        for (int i = 0; i < nums.length; i++) {
            if(maxInt!=nums[i] && maxInt<2*nums[i]){
                return -1;
            }
        }
        return index;
    }

    //Plus One
    public static int[] plusOne(int[] digits) {
        int size = digits.length;
        int unitDigit = digits[size-1];
        if(unitDigit!=9){
            digits[size-1] += 1;
            return digits;
        }
        while (size>0 && digits[size-1]==9){
            digits[size-1] = 0;
            size--;
        }
        if(size==0){
            int[] newDigit = new int[digits.length+1];
            newDigit[0] = 1;
            return newDigit;
        }
        else{
            digits[size-1]+=1;
        }
        return digits;
    }
    public static void main(String[] args) {
        int []num = plusOne(new int[]{9,9,9,9,9});
        for (Integer i : num){
            System.out.print(i+" ");
        }
    }
}

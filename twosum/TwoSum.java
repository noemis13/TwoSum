/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package twosum;

import java.util.Arrays;
import java.util.HashMap;

/**
 *
 * @author NS
 */
public class TwoSum {

    /**
     * @param args the command line arguments
     */
    
     /*
    Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
    You may assume that each input would have exactly one solution, and you may not use the same element twice.
    You can return the answer in any order.
    Example 1:
    Input: nums = [2,7,11,15], target = 9
    Output: [0,1]
    Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
    Example 2:

    Input: nums = [3,2,4], target = 6
    Output: [1,2]
    */
    public int[] twoSum(int[] nums, int target) {

        // save values to a hasmap
        int i;
        int[] posForSum = new int[2];
        HashMap<Integer, Integer> twoSumList = new HashMap<Integer, Integer>();

        for (i = 0; i < nums.length; i++) {
            twoSumList.put(i, nums[i]);

        }

        for (i = 0; i < nums.length; i++) {

            for (Integer listValue : twoSumList.keySet()) {
                //compare all values

                if (i != listValue) {
                    if (nums[i] + twoSumList.get(listValue) == target) {

                        posForSum[0] = listValue;
                        posForSum[1] = i;

                        break;

                    }

                }

            }

        }

        return posForSum;
    }
    
    
    public static void main(String[] args) {
        // TODO code application logic here
          // twoSum
        int[] value = {2, 4, 11, 3};

        TwoSum ts = new TwoSum();
        int[] result;
        result = ts.twoSum(value, 6);
        System.out.println(Arrays.toString(result));

        int[] value1 = {3, 3};

        result = ts.twoSum(value1, 6);
        System.out.println(Arrays.toString(result));
    }
    
}

package org.example.Problem80;

import org.example.IResolvable;
import org.example.Problem;

import java.util.ArrayList;
import java.util.Arrays;

public class Problem80 extends Problem implements IResolvable {

    public Problem80() {
        System.out.println("80. Remove Duplicates from Sorted Array II");
        System.out.println("https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/");
        lineBreak();
    }

    @Override
    public void resolve() {
        int [] inputList = {1, 1, 1, 2, 2, 3};

        int k = removeDuplicates(inputList);

        ArrayList<Integer> resultList = new ArrayList<>();

        for (int i = 0; i < k; i++) {
            resultList.add(inputList[i]);
        }

        validate(Arrays.toString((int[]) new int[]{1, 1, 2, 2, 3}), Arrays.toString(new ArrayList[]{resultList})); ;
    }

    private int removeDuplicates(int[] nums) {
        int bulunma_sayisi = 0;
        int yazilacak_index = 0;

        if (nums.length > 2) {
            for (int i = 1; i < nums.length; i++) {
                if (nums[yazilacak_index] == nums[i]) {
                    bulunma_sayisi++;
                    if (bulunma_sayisi < 2) yazilacak_index++;
                } else {
                    yazilacak_index++;
                    bulunma_sayisi = 0;
                }
                nums[yazilacak_index] = nums[i];
            }
            return yazilacak_index + 1;
        } else {
            return nums.length;
        }
    }

}

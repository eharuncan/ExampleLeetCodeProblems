package org.example.Problem80;

import org.example.IDrivable;
import org.example.Problem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

public class Problem80 extends Problem implements IDrivable {

    public Problem80() {
        this.setName("80. Remove Duplicates from Sorted Array II");
        this.setUrl("https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/");
    }

    int[] nums = {1, 1, 1, 2, 2, 3};

    @Override
    public void driver() {

        int[] expectedNums = {1, 1, 2, 2, 3};

        int k = removeDuplicates(nums); // Calls your implementation

        ArrayList<Integer> resultList = new ArrayList<>();

        for (int i = 0; i < k; i++) {
            resultList.add(nums[i]);
        }

        validator(resultList.toString(), Arrays.toString(expectedNums));
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

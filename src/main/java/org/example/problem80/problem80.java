package org.example.problem80;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

public class problem80 {

    static int[] nums = {1, 1, 1, 2, 2, 3};
    public static void driver() {

        // 80. Remove Duplicates from Sorted Array II
        // https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/

        int[] expectedNums = {1, 1, 2, 2, 3};

        int k = removeDuplicates(nums); // Calls your implementation

        ArrayList<Integer> resultList = new ArrayList<>();

        for (int i = 0; i < k; i++) {
            resultList.add(nums[i]);
        }

        validate(resultList.toString(), Arrays.toString(expectedNums));
    }

    private static int removeDuplicates(int[] nums) {
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

    private static void validate(Object object1, Object object2) {
        System.out.println(object1);
        System.out.println(object2);

        if (Objects.equals(object1, object2)) {
            System.out.println("Başarılı");
        } else {
            System.out.println("Başarısız");
        }
    }
}

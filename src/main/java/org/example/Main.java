package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

public class Main {

    static int[] nums = {1,1,1,2,2,3};

    public static void main(String[] args) {
        leetCode1Driver();
        System.out.println("");
        leetCode2Driver();
    }

    public static void leetCode1Driver (){
        int[] expectedNums =  {1,1,2,2,3};

        int k = removeDuplicates(nums); // Calls your implementation

        ArrayList<Integer> resultList = new ArrayList<>();

        for (int i = 0; i < k; i++) {
            resultList.add(nums[i]);
        }

        validate(resultList.toString(), Arrays.toString(expectedNums));
    }

    public static void leetCode2Driver (){
        String string = "PAYPALISHIRING";
        int numRows = 4;
        String expectedString = "PINALSIGYAHRPI";
        String resultString = convert(string, numRows); // Calls your implementation

        validate(expectedString, resultString);
    }

    public static void validate(Object object1, Object object2){
        System.out.println(object1);
        System.out.println(object2);

        if (Objects.equals(object1, object2)){
            System.out.println("Başarılı");
        }else {
            System.out.println("Başarısız");
        }
    }

    public static String convert(String s, int numRows) {
        if (s == null || s.isEmpty() || numRows <= 0) return ""; // Base conditions
        if (numRows == 1) return s;

        StringBuilder result = new StringBuilder(); // Resultant string
        int step = 2 * numRows - 2; // Step size
        for (int i = 0; i < numRows; i++) { // Loop for each row
            for (int j = i; j < s.length(); j += step) { // Loop for each character in the row
                result.append(s.charAt(j));
                if (i != 0 && i != numRows - 1 && (j + step - 2 * i) < s.length()) {
                    result.append(s.charAt(j + step - 2 * i));
                }
            }
        }
        return result.toString();
    }

    public static int removeDuplicates(int[] nums) {
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
            return yazilacak_index+1;
        } else {
            return nums.length;
        }
    }
}







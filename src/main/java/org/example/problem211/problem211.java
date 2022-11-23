package org.example.problem211;

public class problem211 {

    public static void driver (){
        // 211. Design Add and Search Words Data Structure
        // https://leetcode.com/problems/design-add-and-search-words-data-structure/description/

        String word = "test";
        WordDictionary obj = new WordDictionary();
        obj.addWord(word);
        boolean param_2 = obj.search(word);
        System.out.println(param_2);
    }
}

package org.example.Problem211;

import org.example.Problem;

public class Problem211 extends Problem {

    public Problem211() {
        this.setName("211. Design Add and Search Words Data Structure");
        this.setUrl("https://leetcode.com/problems/design-add-and-search-words-data-structure/description/");
    }

    public void driver (){
        String word = "test";
        WordDictionary obj = new WordDictionary();
        obj.addWord(word);
        boolean param_2 = obj.search(word);
        System.out.println(param_2);
    }
}

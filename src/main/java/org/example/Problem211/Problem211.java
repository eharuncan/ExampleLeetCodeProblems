package org.example.Problem211;

import org.example.IResolvable;
import org.example.Problem;

public class Problem211 extends Problem implements IResolvable {

    public Problem211() {
        System.out.println("211. Design Add and Search Words Data Structure");
        System.out.println("https://leetcode.com/problems/design-add-and-search-words-data-structure/");
        this.lineBreak();
    }

    @Override
    public Object resolve(Object inputObject1, Object inputObject2) {
        String word = "test";
        WordDictionary obj = new WordDictionary();
        obj.addWord(word);
        boolean param_2 = obj.search(word);
        System.out.println(param_2);
        return null;
    }

}

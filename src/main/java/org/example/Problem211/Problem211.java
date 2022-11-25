package org.example.Problem211;

import org.example.IResolvable1Input;
import org.example.Problem;

public class Problem211 extends Problem implements IResolvable1Input {

    public Problem211() {
        System.out.println("211. Design Add and Search Words Data Structure");
        System.out.println("https://leetcode.com/problems/design-add-and-search-words-data-structure/");
        lineBreak();
    }

    public void resolveAndShowResults(Object inputObject, Object expectedObject){
        validate(expectedObject, resolve(inputObject));
    }

    @Override
    public Object resolve(Object inputObject) {
        String word = "test";
        WordDictionary obj = new WordDictionary();
        obj.addWord(word);
        return obj.search(word);
    }

}

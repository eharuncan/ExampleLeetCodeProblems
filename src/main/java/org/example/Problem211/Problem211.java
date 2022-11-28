package org.example.Problem211;

import org.example.IResolvable;
import org.example.Problem;

public class Problem211 extends Problem implements IResolvable {

    public Problem211() {
        System.out.println("211. Design Add and Search Words Data Structure");
        System.out.println("https://leetcode.com/problems/design-add-and-search-words-data-structure/");
        lineBreak();
    }

    @Override
    public void resolve() {

        WordDictionary wordDictionary = new WordDictionary();
        wordDictionary.addWord("bad");
        wordDictionary.addWord("dad");
        wordDictionary.addWord("mad");
        System.out.println(wordDictionary.search("pad"));
        System.out.println(wordDictionary.search("bad")); // return True
        System.out.println(wordDictionary.search(".ad")); // return True
        System.out.println(wordDictionary.search("b..")); // return True
    }

}

package org.example.problem211;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class WordDictionary {

    List<String> wordList = new ArrayList<>();

    public WordDictionary() {

    }

    public void addWord(String word) {
        wordList.add(word);
    }

    public boolean search(String word) {
        for (String s : wordList) {
            return Objects.equals(s, word);
        }
        return false;
    }

}

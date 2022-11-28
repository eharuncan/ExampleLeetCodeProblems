package org.example.Problem211;

public class WordDictionary {

    private WordDictionary[] children;
    boolean isEndOfWord;
    // Initialize your data structure here.
    public WordDictionary() {
        children = new WordDictionary[26];
        isEndOfWord = false;
    }

    // Adds a word into the data structure.
    public void addWord(String word) {
        WordDictionary currentDictionary = this;
        for(char c: word.toCharArray()){
            if(currentDictionary.children[c - 'a'] == null)
                currentDictionary.children[c - 'a'] = new WordDictionary();
            currentDictionary = currentDictionary.children[c - 'a'];
        }
        currentDictionary.isEndOfWord = true;
    }

    // Returns if the word is in the data structure. A word could contain the dot character '.' to represent any one letter.
    public boolean search(String word) {
        WordDictionary currentDictionary = this;
        for(int i = 0; i < word.length(); ++i){
            char c = word.charAt(i);
            if(c == '.'){
                for(WordDictionary childrenDictionary: currentDictionary.children)
                    if(childrenDictionary != null && childrenDictionary.search(word.substring(i+1))) return true;
                return false;
            }
            if(currentDictionary.children[c - 'a'] == null) return false;
            currentDictionary = currentDictionary.children[c - 'a'];
        }
        return currentDictionary != null && currentDictionary.isEndOfWord;
    }

}

// https://leetcode.com/problems/design-add-and-search-words-data-structure/
package trie;

import java.util.HashMap;
import java.util.Map;

class WordDictionary {
  TrieNode dict;
  
  class TrieNode {
      Map<Character, TrieNode> children = new HashMap<>();
      boolean isWord = false;
      
      public TrieNode(){}
  }

  public WordDictionary() {
      dict = new TrieNode();
  }
  
  public void addWord(String word) {
      TrieNode node = dict;
      
      for (char ch : word.toCharArray()) {
          if (!node.children.containsKey(ch)) {
              node.children.put(ch, new TrieNode());
          }
          
          node = node.children.get(ch);
      }
      
      node.isWord = true;
  }
  
  private boolean searchByNode(String word, TrieNode node) {
      for (int i = 0 ; i < word.length() ; i++) {
          char ch = word.charAt(i);
      
          if (ch == '.') {
              String nextWord = word.substring(i + 1);
              
              for (char key : node.children.keySet()) {
                  if (searchByNode(nextWord, node.children.get(key))) {
                      return true;
                  }
              }
              
              return false;
          }
          
          if (node.children.containsKey(ch)) {
              return searchByNode(word.substring(i + 1), node.children.get(ch));
          }
          
          return false;
      }
      
      return node.isWord;
  }
  
  public boolean search(String word) {
      return searchByNode(word, dict);
  }
}

/**
* Your WordDictionary object will be instantiated and called as such:
* WordDictionary obj = new WordDictionary();
* obj.addWord(word);
* boolean param_2 = obj.search(word);
*/
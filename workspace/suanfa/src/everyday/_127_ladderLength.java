package everyday;


import com.sun.org.apache.xerces.internal.impl.xpath.XPath;

import java.util.*;

public class _127_ladderLength {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        HashSet<String> wordSet = new HashSet<>(wordList);
        if(!wordSet.contains(endWord)) return 0;
        wordList.remove(beginWord);

        Queue<String> queue = new LinkedList<>();
        queue.offer(beginWord);
        HashSet<String> visited = new HashSet<>();
        visited.add(beginWord);

        int step = 1;
        while(!queue.isEmpty()){
            int currentSize = queue.size();
            for (int i = 0; i < currentSize; i++) {
                String currentWord = queue.poll();

                if(changeOneWord(currentWord,endWord,queue,wordSet,visited)){
                    return step + 1;
                }
            }
            step++;
        }
        return 0;
    }

    private boolean changeOneWord(String currentWord, String endWord, Queue<String> queue,
                                  HashSet<String> wordSet, HashSet<String> visited) {
        char[] charArray = currentWord.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            char originChar = charArray[i];
            for (char k = 'a';k <= 'z';k++) {
                if(k == originChar) {
                    continue;
                }
                charArray[i] = k;
                String word = String.valueOf(charArray);
                if(wordSet.contains(word)){
                    if(word.equals(endWord)){
                        return true;
                    }
                    if(!visited.contains(word)){
                        queue.offer(word);
                        visited.add(word);
                    }
                }
            }
            charArray[i] = originChar;
        }
        return false;
    }

    public static void main(String[] args) {
        _127_ladderLength ladderLength = new _127_ladderLength();
        ladderLength.ladderLength("hit","cog",new ArrayList<String>
                (Arrays.asList(new String[]{"hot", "dot", "dog", "lot", "log", "cog"})));
    }
}

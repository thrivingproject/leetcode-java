package p2942;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < words.length; i++) {
            // Use indexOf instead of contains to avoid creating a new String
            // object
            if (words[i].indexOf(x) != -1)
                list.add(i);
        }
        return list;
    }
}

package com.algoexpert.medium.groupanagrams;

import java.util.*;

public class Solution {

        public static List<List<String>> groupAnagrams(List<String> words) {
            HashMap<String,List<String>> map = new HashMap<>();


            words.forEach(word -> {
                char[] chars = word.toCharArray();
                Arrays.sort(chars);
                String sortedWord = new String(chars);
               if (map.containsKey(sortedWord)){
                    map.get(sortedWord).add(word);
                }else{
                    map.put(sortedWord, new ArrayList<>(Collections.singletonList(word)));
                }
            });

            return new ArrayList<>(map.values());
        }
}

package com.epam.mjc.collections.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class WordRepetitionMapCreator {
    public Map<String, Integer> createWordRepetitionMap(String sentence) {
        Map<String, Integer> resultMap = new HashMap<>();
        if (sentence.equals("")) {
            return resultMap;
        }
        String[] words = sentence.split("[ .,]+");
        for (String word : words) {
            if (resultMap.containsKey(word.toLowerCase())) {
                resultMap.put(word.toLowerCase(), resultMap.get(word.toLowerCase()) + 1);
            }
            else {
                resultMap.put(word.toLowerCase(), 1);
            }
        }
        return resultMap;
    }
}

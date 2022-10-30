package com.epam.mjc.collections.map;

import java.util.HashMap;
import java.util.Map;

public class KeyValueSwapper {
    public Map<String, Integer> swap(Map<Integer, String> sourceMap) {
        Map<String, Integer> resultMap = new HashMap<>();
        Integer[] keys = sourceMap.keySet().toArray(new Integer[0]);
        String[] values = sourceMap.values().toArray(new String[0]);
        for (int i = 0; i < keys.length; i++) {
            if (resultMap.containsKey(values[i])) {
                resultMap.put(values[i], Math.min(resultMap.get(values[i]), keys[i]));
            } else {
                resultMap.put(values[i], keys[i]);
            }
        }
        return resultMap;
    }
}

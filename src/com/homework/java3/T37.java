package com.homework.java3;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @projectName: newJavaProject
 * @className: T37
 * @author: AaronLi
 * @description: nothing
 * @date: 2022/6/8 20:46
 * @version: JDK17
 */
public class T37 {
    static Map<String, Set<String>> createDemoMap() {
        Map<String, Set<String>> source = new HashMap<String, Set<String>>();
        Set<String> keywordSet1 = new HashSet<String>();
        keywordSet1.add("KeyWord1");
        keywordSet1.add("KeyWord2");
        keywordSet1.add("KeyWord3");
        source.put("URL1", keywordSet1);
        Set<String> keywordSet2 = new HashSet<String>();
        keywordSet2.add("KeyWord2");
        keywordSet2.add("KeyWord4");
        source.put("URL2", keywordSet2);
        Set<String> keywordSet3 = new HashSet<String>();
        keywordSet3.add("KeyWord3");
        keywordSet3.add("KeyWord2");
        source.put("URL3", keywordSet3);
        return source;
    }

    static void showMap(Map<String, Set<String>> map) {
        for (String key : map.keySet()) {
            System.out.println("Key: " + key + "---------------->Values:");
            for (String value : map.get(key)) {
                System.out.println("\t" + value);
            }
        }
    }

    static Map<String, Set<String>> reverseIndex(Map<String, Set<String>> source) {
        Map<String, Set<String>> map = new HashMap<String, Set<String>>();
        for (String key : source.keySet()) {
            for (String value : source.get(key)) {
                if (!map.containsKey(value)) {
                    Set<String> url = new HashSet<String>();
                    url.add(key);
                    map.put(value, url);
                } else {
                  map.get(value).add(key);
                }
            }
        }
        return map;
    }

    public static void main(String[] args) {
        Map<String, Set<String>> source = createDemoMap();
        showMap(source);
        System.out.println("反向索引================================");
        Map<String, Set<String>> reverseMap = reverseIndex(source);
        showMap(reverseMap);
    }

}

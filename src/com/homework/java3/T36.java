package com.homework.java3;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @projectName: newJavaProject
 * @className: T36
 * @author: AaronLi
 * @description: nothing
 * @date: 2022/6/8 21:44
 * @version: JDK17
 */
public class T36 {
    static Map<String,Set<String>> createDemoMap(){
        Map<String,Set<String>> source=new HashMap<String,Set<String>>();
        Set<String> keywordSet1=new HashSet<String>();
        keywordSet1.add("门户");
        keywordSet1.add("高校");
        keywordSet1.add("新闻");
        source.put("www.pzhu.cn", keywordSet1);
        Set<String> keywordSet2=new HashSet<String>();
        keywordSet2.add("KeyWord2");
        keywordSet2.add("KeyWord4");
        source.put("URL2", keywordSet2);
        Set<String> keywordSet3=new HashSet<String>();
        keywordSet3.add("KeyWord3");
        keywordSet3.add("KeyWord2");
        source.put("URL3", keywordSet3);
        return source;
    }
    static void showMap(Map<String,Set<String>> map){
        ////////////////////请完成此方法的代码//////////////////////////////////////////
        for (String key : map.keySet()) {
            System.out.println("key"+":"+key);
            for (String value : map.get(key)) {
                System.out.println("\tvalue"+":"+value);
            }
        }
    }
    static Map<String,Set<String>> reverseIndex( Map<String,Set<String>> source){
        ////////////////////请完成此方法的代码//////////////////////////////////////////
        Map<String,Set<String>> reverseMap = new HashMap<String, Set<String>>();
        for (String key : source.keySet()) {
            for (String value : source.get(key)) {
                if(reverseMap.get(value)==null){
                    reverseMap.put(value, new HashSet<String>());
                }
                reverseMap.get(value).add(key);
            }
        }
        return reverseMap;
    }
    public static void main(String[] args) {
        Map<String,Set<String>> source=createDemoMap();
        showMap(source);
        System.out.println("反向索引================================");
        Map<String,Set<String>> reverseMap=reverseIndex(source);
        showMap(reverseMap);
    }
}

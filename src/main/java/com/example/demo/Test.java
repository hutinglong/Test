package com.example.demo;

import lombok.Data;

import java.lang.reflect.Array;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Test {

    public static void main(String[] args) {
        Map<String,Object> map = new HashMap<>();
        Map<String,Object> map1 = new HashMap<>();
        List<Map<String,Object>> l = new ArrayList<>();
        map.put("name","aa");
        map.put("age",18);
        map1.put("name","bb");
        l.add(map1);
        l.add(map);
        for (Map<String,Object> m :l){
            if (!m.containsKey("age")){
                l.remove(m);
            }
        }
        System.out.println(l);

    }


}

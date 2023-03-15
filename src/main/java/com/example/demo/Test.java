package com.example.demo;

import lombok.Data;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Test {

//    public static void main(String[] args) {
//
//
//
//        String data = "2023年３月８日";
//        //正则表达式以匹配字符串中的数字
//        String regex = "\\d+年\\d+月\\d+日";
//        //创建一个模式对象
//        Pattern pattern = Pattern.compile(regex);
//        //创建一个Matcher对象
//        Matcher matcher = pattern.matcher(data);
//        List<String> matchStrings = new ArrayList<String>();
//        while (matcher.find()) {
//
//            matchStrings.add(matcher.group(0));
//        }
//        System.out.println(matchStrings);
//    }

    public static void main(String[] args) {
        String line = "日期：2023年2月17日";
        Pattern datePattern = Pattern.compile("([0-9]{4})|([0-9]{1,2})|([0-9]{2})");
        Matcher dateMatcher = datePattern.matcher(line);
         List<String> list =new ArrayList();
         String str="";
         StringBuffer sbf =new StringBuffer();
        while(dateMatcher.find()) {
            str=  dateMatcher.group();
            if(dateMatcher.group().length()<2 && dateMatcher.group().length()>0){
                str="0"+str;
                sbf.append(str);
            }else {
                sbf.append(str);

            }
        }
        System.out.println(sbf.toString());
    }


}

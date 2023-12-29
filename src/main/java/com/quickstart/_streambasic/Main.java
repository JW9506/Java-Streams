package com.quickstart._streambasic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        Collections.addAll(list, 
        "张無忌",
        "周芷若",
        "赵敏",
        "张强",
        "张三丰"
        );

        Stream<String> zhanglist;
        
        // Stream to Array
        zhanglist = list.stream().filter(s -> s.startsWith("张"));
        String[] array = zhanglist.toArray(String[]::new);
        log.info("{}", Arrays.toString(array));

        // Stream to Set
        zhanglist = list.stream().filter(s -> s.startsWith("张"));
        Set<String> sets = zhanglist.collect(Collectors.toSet());
        log.info("{}", sets);

        // Stream to List
        zhanglist = list.stream().filter(s -> s.startsWith("张"));
        List<String> lists = zhanglist.collect(Collectors.toList());
        log.info("{}", lists);
    }
}

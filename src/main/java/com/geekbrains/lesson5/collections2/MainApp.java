package com.geekbrains.lesson5.collections2;

import java.lang.reflect.Field;
import java.sql.SQLOutput;
import java.util.*;

public class MainApp {
    public static void main(String[] args) throws Exception {
        //
        Map<String ,String> map = new HashMap<>(8);
        // HashMap
        // LinkedHashMap
        // TreeMap
        map.put("A1", "B");
        map.put("A2", "B");
        map.put("A3", "B");
        map.put("A4", "B");
        map.put("A5", "B");
        map.put("A6", "B");
        map.put("A7", "B");
        Class hashMapClass = HashMap.class;
        Field tableField = hashMapClass.getDeclaredField("table");
        tableField.setAccessible(true);
        int capacity = ((Object[]) tableField.get(map)).length;
        System.out.println(capacity);
        // we got hide field

        System.out.println("---");
        for (Map.Entry<String, String> o : map.entrySet()){
            System.out.println(o.getKey());
            System.out.println(o.getValue());
            System.out.println("---");
        }
        System.out.println("-1--");
        System.out.println(map.getOrDefault("A8", "Q"));

        Set<String> set = new HashSet<>();
        set.add("A");
        set.add("A");
        set.add("A");
        set.add("B");
        System.out.println(set);
        set.add("A");
        set.add("A");
        set.add("A");
        set.add("B");
        Iterator<String> iter = set.iterator();
        while (iter.hasNext()){
            String o = iter.next();
            if(o.equals("A")){
                iter.remove();
            }
        }
        System.out.println(set);


        System.out.println("-2--");
        List<String> list = new ArrayList<>(Arrays.asList("A", "A", "B", "С", "A"));
        for (int i = 0; i < list.size(); i++){
            if(list.get(i).equals("A")){
                list.remove(i);
            }
        }
        System.out.println(list); // Why "A" did not delete?
        System.out.println("-2b-");
        ListIterator<String> lis = list.listIterator();
    }
}

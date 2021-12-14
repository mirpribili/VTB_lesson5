package com.geekbrains.lesson5.collections2.homework;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeSet;

/*
        Написать простой класс Телефонный Справочник, который хранит в себе список фамилий и
    телефонных номеров. В этот телефонный справочник с помощью метода add() можно
    добавлять записи, а с помощью метода get() искать номер телефона по фамилии. Следует
    учесть, что под одной фамилией может быть несколько телефонов (в случае однофамильцев),
    тогда при запросе такой фамилии должны выводиться все телефоны.
 */
public class Phonebook {
    private Map<String, TreeSet<String>> phonebook = new HashMap<>();

    public void add(String surname, String phoneNumber){
        if(phonebook.containsKey(surname)){
            phonebook.get(surname).add(phoneNumber);
        }else{
            phonebook.put(surname, new TreeSet<String >(Arrays.asList(phoneNumber)));
        }
    }
    public void get(String surname){
        System.out.println(surname + " : " +phonebook.get(surname));
    }

}

package com.geekbrains.lesson5.collections2.homework;

import java.util.HashMap;
import java.util.Map;

public class MainApp {

    public static void main(String[] args) {
        /*
        Создать массив с набором слов (10-20 слов, должны встречаться повторяющиеся). Найти и
    вывести список уникальных слов, из которых состоит массив (дубликаты не считаем).
    Посчитать, сколько раз встречается каждое слово.
     */
        String[] findAndCountUniqueWords = {
                "Cat", "Dog", "Mouse", "Bird", "Horse",
                "Cat", "Dog", "Mouse", "Bird", "Horse",
                "Cat", "Dog", "Mouse", "Bird", "Horse",
                "Cat", "Dog", "Mouse", "Bird", "Horse",
                "Cat", "Dog", "Mouse",
        };
        Map<String, Integer> mapString = new HashMap<>();
        // new
        for (String str : findAndCountUniqueWords){
            mapString.put(str, mapString.getOrDefault(str, 0) + 1);
        }
        System.out.println("mapString : " + mapString);
        System.out.println("keySet : " + mapString.keySet());
        /*
        * old version
        for (String string : findAndCountUniqueWords){
            if(!mapString.containsKey(string)){
                mapString.put(string, 1);
            }else{
                mapString.put(string, mapString.get(string) + 1);
            }
        }
        System.out.println(mapString.keySet());
        *
         */


        Phonebook phonebook = new Phonebook();
        phonebook.add("Shang Tsung", "+7 900 800 00 01");
        phonebook.add("Kung Lao", "+7 900 800 00 02");
        phonebook.add("Kung Lao", "+7 900 800 00 03");
        phonebook.add("Kung Lao", "+7 900 800 00 04");
        phonebook.add("Kung Lao", "+7 900 800 00 05");
        phonebook.add("Kung Lao", "+7 900 800 00 06");
        phonebook.add("Shang Tsung", "+7 900 800 00 07");

        phonebook.get("Shang Tsung");
        phonebook.get("Kung Lao");
    }// Main
}

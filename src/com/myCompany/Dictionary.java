package com.myCompany;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Dictionary {

    public static void countChar() {

        char[] charArray =  Helper.getText().replaceAll("[^\\da-zA-Zа]", "")
                .replace(" ", "").toCharArray();
        HashMap<Character, Integer> countChar = new HashMap<Character, Integer>();

        for(int i = 0; i < charArray.length; i++){
            if(countChar.containsKey(charArray[i])){
                countChar.put(charArray[i], countChar.get(charArray[i]) + 1);
            } else {
                countChar.put(charArray[i], 1);
            }
        }

        for(Map.Entry<Character, Integer> c : countChar.entrySet()){
            System.out.println("Буква \"" + c.getKey() + "\", кол-во: " + c.getValue());
        }


    }



}

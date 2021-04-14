package com.bridgelabz.datastructure;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MyHashMapTest
{
    public static void beforeClass() throws Exception
    {

        System.out.println("\n welcome to Data structure ");
    }

    @Test
    public void givenASentenceWhenWordsAreAddedToListShouldReturnWordFrequency()
    {

        String sentence = "To be or not to be";
        MyHashMap <String, Integer> myHashMap = new MyHashMap<String, Integer>();
        String[] words = sentence.toLowerCase().split(" ");
        for(String word : words)
        {
            Integer value = myHashMap.get(word);
            if(value == null) value = 1;
            else value = value + 1;
            myHashMap.add(word, value);
        }
        int frequency = myHashMap.get("to");
        System.out.println(myHashMap);
        Assertions.assertEquals(2, frequency);
    }

    @Test
    public void givenSentenceWhenWordsAreAddedToListShouldReturnParanoidFrequency()
    {

        String sentance = "Paranoids are not" + " paranoid because they are paranoid but"
                + " because they keep putting themselves" + " deliberately into paranoid avoidable" + " situations";
        MyHashMap<String, Integer> myHashMap = new MyHashMap();
        String[] words = sentance.toLowerCase().split(" ");

        for (String word : words)
        {
            Integer value = myHashMap.get(word);

            if (value == null)
                value = 1;
            else
                value = value + 1;
            myHashMap.add(word, value);
        }

        int frequency = myHashMap.get("paranoid");
        System.out.println(myHashMap);
        Assertions.assertEquals(3, frequency);
    }
}
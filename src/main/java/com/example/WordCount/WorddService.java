package com.example.WordCount;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Service
public class WorddService {
    HashMap<String, Integer> wordMap = new HashMap<>();
    public static final String toLang = "en";
    public String addWord(String language, String word) throws Exception {
        Translator translator = new Translator();
        String wordAdded = word + " translated word in english is ";
        Pattern digit = Pattern.compile("[0-9]");
        Pattern special = Pattern.compile ("[!@#$%&*()_+=|<>?{}\\[\\]~-]");
        Matcher hasDigit = digit.matcher(word);
        Matcher hasSpecial = special.matcher(word);
        if(hasDigit.find() || hasSpecial.find()){
            return "word contains digits or special char";
        }else{
            if (language=="en"){
                if (wordMap.containsKey(word)){
                    wordMap.put(word,(wordMap.get(word)+1));
                }else{
                    wordMap.put(word,1);
                }
                wordAdded = "word is already in english";
            }else{
                String engWord =  translator.translate(language, toLang, word);
                if (wordMap.containsKey(engWord)){
                    wordMap.put(engWord,(wordMap.get(engWord)+1));
                }else{
                    wordMap.put(engWord,1);
                }
                wordAdded = wordAdded + engWord;
            }
            return wordAdded;
        }
    }

    public Integer getCount(String word){
        if(wordMap.containsKey(word)){
            return wordMap.get(word);
        }else{
            return 0;
        }
    }
}
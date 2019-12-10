package rocks.zipcode.quiz4.fundamentals;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @author leon on 21/12/2018.
 */
public class StringUtils {
    public static Character getMiddleCharacter(String string) {

        return string.charAt(string.length() / 2);
    }

    public static String capitalizeMiddleCharacter(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {

            if (i == (str.length() / 2)) {
                sb.append(str.toUpperCase().charAt(i));
            } else {
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }

    public static String lowerCaseMiddleCharacter(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {

            if (i == (str.length() / 2)) {
                sb.append(str.toLowerCase().charAt(i));
            } else {
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }

    public static Boolean isIsogram(String str) {
        char[] ori = str.toCharArray();
        Set<Character> result = new TreeSet<>();
       for (char c : ori){
           result.add(c);
       }
       if (ori.length == result.size()){
           return true;
       }
        return false;
    }

    public static Boolean hasDuplicateConsecutiveCharacters(String str) {
        char[] chars = str.toCharArray();
        for (int i = 0; i < str.length() - 1; i++) {
            if (chars[i] == chars[i + 1]) {
                return true;
            }
         }
        return false;
    }

    public static String removeConsecutiveDuplicateCharacters(String str) {
        StringBuilder sb=new StringBuilder(str);
        for (int i = 1; sb.length()>1 && i <sb.length() ; i++) {
            if(sb.charAt(i)==sb.charAt(i-1)){
                sb.deleteCharAt(i);
                sb.deleteCharAt(i-1);
                i=-2;
                if(i<0)
                    i=0;
            }
        }
        return sb.toString();
    }


        public static String invertCasing (String str){
            char[] chars = str.toCharArray();
            for (int i = 0; i < chars.length; i++) {
                char c = chars[i];
                if (Character.isUpperCase(c)) {
                    chars[i] = Character.toLowerCase(c);
                } else if (Character.isLowerCase(c)) {
                    chars[i] = Character.toUpperCase(c);
                }
            }
            return new String(chars);
        }
    }

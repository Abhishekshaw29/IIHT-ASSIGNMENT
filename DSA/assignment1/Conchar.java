package assignment1;
import java.util.*;

public class Conchar {
    public static String[] printConsecutiveCharacters(String str) {
        String data[] = new String[str.length()];
        for (int i = 0; i < str.length() - 1; i++) {
            char first = str.charAt(i);
            int check = (int) first + 1;
            char checkalpha = (char) check;
            if (check == str.charAt(i + 1)) {
                // System.out.println(first + "" + checkalpha);
                data[i] = first + "" + checkalpha;
                // System.out.println(data[i]);
            }
        }
        return data;
    }

    public static void countFreq(String data[]) {
        HashMap<String, Integer> charCountMap = new HashMap<String, Integer>();
        for (String str : data) {
            if (str != null) {
                String newstr = str.toUpperCase();
                if (charCountMap.containsKey(newstr))
                    charCountMap.put(newstr, charCountMap.get(newstr) + 1);
                else
                    charCountMap.put(newstr, 1);

                    newstr = null;
                }
            
            }
        for (Map.Entry entry : charCountMap.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }

    public static void main(String[] args) {
        String str = "I saw a CD play-er and a modem in ccd";
        // String str = "Student List do not exist in sys-tem";
        String[] data = printConsecutiveCharacters(str);
        int i = 0;
        for (String string : data) {
            if (string != null) {
                System.out.println(string);
                data[i] = string;
                i++;
            }

        }
        countFreq(data);

    }
}
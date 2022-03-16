package assignment1;

import java.util.regex.Pattern;

public class ReverseSentence {
    public static StringBuilder reverse(String word){
        StringBuilder input1 = new StringBuilder();
        input1.append(word);
        input1.reverse();
        return input1;
        
    }
    public static void main(String[] args) {
        String input = "1 cup of hot coffee costs 8.00, whereas cold coffee costs 45.00.";
        String[]arr =  input.split(" ");
        StringBuilder ans  = new StringBuilder();
        for (String string : arr) {
            if(Pattern.matches("^[a-zA-Z]*$", string)){
                ans = ans.append(reverse(string));
            }
            else{
                ans = ans.append(string);
            }
            ans.append(" ");

        }

        System.out.println(ans);


 
        
    }
}

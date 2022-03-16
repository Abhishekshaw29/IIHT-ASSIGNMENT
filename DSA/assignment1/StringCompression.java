package assignment1;
import java.util.Scanner;
public class StringCompression {
        public static void main(String[] args) {
        
            String str="bbbbBBBB";
            str = str.toLowerCase();
            char first=str.charAt(0);
            int count=1;
            StringBuilder s=new StringBuilder();
            
            for(int i=1;i<str.length();i++)
            {
            char next=str.charAt(i);
            
            if(first==next)
            count++;
            else
            {
            s=s.append(first);
            s.append(count);
            count=1;
            }
            first=next;
            }
            s=s.append(first);
            s.append(count);
            
            if(str.length()>s.length())
            System.out.println(s);
            else
            System.out.println(str);

            
            }
        
    }
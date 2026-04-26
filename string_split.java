import java.io.*;
import java.util.*;

public class string_split {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        if(!scan.hasNextLine()){
            System.out.println(0);
            return;
        }
        String s = scan.nextLine().trim();
        scan.close();
        
        if(s.length()==0){
            System.out.println(0);
            return;
        }
        String[] tokens=s.trim().split("[^A-Za-z]+");
        if (tokens.length > 0 && tokens[0].isEmpty()) {
            System.out.println(0); 
        } else if (s.trim().isEmpty()) {
            System.out.println(0);
        } else {
        System.out.println(tokens.length);
        for(String word: tokens){
            System.out.println(word);
        }
        scan.close();
    }
    }
}

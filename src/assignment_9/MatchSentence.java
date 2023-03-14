package assignment_9;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatchSentence {
    public static void sentenceMethod(Pattern pattern,String sentence){
        Matcher match=pattern.matcher(sentence);
        Pattern pattern1=Pattern.compile("^.*\\.$");
        Matcher matcher=pattern1.matcher(sentence);
        if(match.find()){
            if(matcher.find()) {
                System.out.println(sentence + " Starts with Capital letter and ends with period");
            }
            else{
                System.out.println(sentence +" Starts with Only Capital letter" );
            }
        }
        else{
            if(matcher.find()) {
                System.out.println(sentence + " do not Starts with Capital letter but ends with period");
            }
            else{
                System.out.println(sentence + " do not Starts with Capital letter and ends with period");
            }
        }
    }
}

package de.htw.Algorithms;

public class StringMatchingAlgorithm {
    public static String match(String text, String search) {
        boolean text_contains_the_phrase_or_word = false;

        for(int i = 0; i<text.length()-search.length()+1; i++){
            String subseq ="";
            for (int j=i; j<i+search.length();j++){
                subseq+=text.charAt(j);
            }
            if (subseq.equals(search)){
                text_contains_the_phrase_or_word = true;
                break;
            }
        }

        if (text_contains_the_phrase_or_word){
            return "It's a match! The text contains the given word or phrase";
        }
        else{
            return "Unfortunately the text does not contain the given word or phrase";
        }
    }
}

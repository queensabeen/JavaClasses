package com.syntax.class16;

import java.util.Arrays;

public class ReverseWords {
    public static void main(String[] args) {
        String sentence="What did you use the most?";
        //want to reverse the words, but the position of the words need to stay the same.
        String[]StringArray=sentence.split(" ");
        System.out.println(Arrays.toString(StringArray));//[What, did, you, use, the, most?]

        for (int i=0; i<StringArray.length; i++){
           StringBuilder stringBuilder = new StringBuilder(StringArray[i]);
           StringArray[i]=stringBuilder.reverse().toString();
        }
        System.out.println(Arrays.toString(StringArray));//[tahW, did, uoy, esu, eht, ?tsom]

    }
}

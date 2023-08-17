package org.com.corjava;

import java.util.ArrayList;
import java.util.List;

public class task2 {
    public static void main(String[] args) {
        /*
    Given a string, return the length of the largest "block" in the string.
    A block is a run of adjacent chars that are the same.

    maxBlock("hoopla") → 2
    maxBlock("abbCCCddBBBxx") → 3
    maxBlock("") → 0
     */



    }
    public static int maxBlok1(String str){
        int max=0;
        for (int i = 0; i < str.length(); i++) {
            String result=str.substring(i,i+1);
            String control="";
            for (int j = i; j < str.length(); j++) {
                if(result.equals(str.substring(j,j+1))){
                    control+=str.substring(j,j+1);
                }else break;
                max=Math.max(control.length(),max);

            }

        }
        return max;
    }
  
    
    public static int maxBlock(String str) {
        int maxBlockLength = 0;
        int currentBlockLength = 0;
        char currentChar = '8';

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == currentChar) {
                currentBlockLength++;
            } else {
                currentChar = c;
                currentBlockLength = 1;
            }
            maxBlockLength = Math.max(maxBlockLength, currentBlockLength);
        }

        return maxBlockLength;
    }
    public static int maxBlok2(String str){
        int max=0;
        int count=0;
        String s="";
        for (int i = 0; i < str.length(); i++) {
            if(str.substring(i,i+1).equals(s)){
                count++;
            }else{
                s=str.substring(i,i+1);
                count=1;
            }  max=Math.max(max,count);
        }
return max;
    }

}



package org.com.corjava;

import java.text.DateFormatSymbols;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class task3 {
    public static void main(String[] args) {
        //Double toplam çözümü
        double d=12.99,d1=15.99,d3=18.99, db4;
        db4=d+d1-d3;
        DecimalFormat df=new DecimalFormat("#.##");
        String format=df.format(db4);
        DateFormatSymbols dfs=new DateFormatSymbols();


        /**
         * Given a string s, return the longest palindromic substring in s.
         * Example 1:
         * <p>
         * Input: s = "babad"
         * Output: "bab"
         * Explanation: "aba" is also a valid answer.
         * Example 2:
         * <p>
         * Input: s = "cbbd"
         * Output: "bb"
         */
        System.out.println(longestPalindrome("kjgkakuıo"));


    }
    public static String longestPolindrome2(String str){
        String polindrome="";
        boolean bl=false;
        int max=0;
        String result="";
        for (int i = 0; i < str.length(); i++) {
            for (int j =i; j < str.length(); j++) {
                bl=isPolindrome(str.substring(i,j+1));
                polindrome=str.substring(i,j+1);
                if(bl&&polindrome.length()>max){
                    max=polindrome.length();
                    result=polindrome;
                }
            }
        }
        return result;
    }

    public static String logestPolindromeIhsanHoca(String str){
        if(str.length()==0) return "";
        if(str.length()==1) return str;
        List<String> allSubs=new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            for (int j = i+1; j <str.length() ; j++) {
                String newStr=str.substring(i,j);
                allSubs.add(newStr);
            }

        }
        List<String >allPolindromeSubs=new ArrayList<>();

        for (String allSub : allSubs) {
           if( isPolindrome(allSub)){
               allPolindromeSubs.add(allSub);
           }

        }
        List<Integer>lenfthOfSub=new ArrayList<>();
        for (String allPolindromeSub : allPolindromeSubs) {
            lenfthOfSub.add(allPolindromeSub.length());

        }
        int max= Collections.max(lenfthOfSub);
        return allPolindromeSubs.get(lenfthOfSub.indexOf(max));




    }
    public static boolean isPolindrome(String str){
     return   str.equals(new StringBuffer(str).reverse().toString());

    }

    public static String longestPolindromic(String str){
        StringBuilder newStr=new StringBuilder(str);
        newStr.reverse();
        String result="";
        for (int i = 0; i < str.length(); i++) {
            for (int j =i; j <=newStr.length(); j++) {
                if(str.substring(i,i+1).equals(newStr.substring(j,j+1))){

                    result+=str.substring(i,i+1);


            }
            }
        }
        return result;
    }


        public static String longestPalindrome(String s) {
            if (s == null || s.length() < 2) {
                return s;
            }

            int n = s.length();
            int start = 0, end = 0;

            for (int i = 0; i < n; i++) {
                int len1 = expandAroundCenter(s, i, i); // odd length palindrome
                int len2 = expandAroundCenter(s, i, i + 1); // even length palindrome
                int len = Math.max(len1, len2);

                if (len > end - start) {
                    start = i - (len - 1) / 2;
                    end = i + len / 2;
                }
            }

            return s.substring(start, end + 1);
        }

        public static int expandAroundCenter(String s, int left, int right) {
            while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
                left--;
                right++;
            }

            return right - left - 1;
        }
    }




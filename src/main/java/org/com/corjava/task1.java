package org.com.corjava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class task1 {
    public static void main(String[] args) {
        /**
         * Given a string s, find the length of the longest
         * substring
         *  without repeating characters.
         *
         *
         *
         * Example 1:
         *
         * Input: s = "abcabcbb"
         * Output: 3
         * Explanation: The answer is "abc", with the length of 3.
         * Example 2:
         *
         * Input: s = "bbbbb"
         * Output: 1
         * Explanation: The answer is "b", with the length of 1.
         * Example 3:
         *
         * Input: s = "pwwkew"
         * Output: 3
         * Explanation: The answer is "wke", with the length of 3.
         * Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.
         * tekrar harf içermeyen en uzun substringin boyu nedir diye çevirmek mümkün soruyu?
         * mesela atmaca kelimesi için tmac 'nin boyu yani 4 oluyor cevap...
         * mesela atakama için tak ya da kam oluyor ve cevap 3 oluyor
         * mesela atlama için ise tlam yani 4 oluyor....
         *
         */
        /*
            str.replaceAll("[^A-Za-z]", "");   sadece harfleri bırakır..
            str.replaceAll("[^A-Z]", "");   sadece büyük harfleri bırakır..
            str.replaceAll("[^a-z]", "");   sadece küçük harfleri bırakır..
            str.replaceAll("[^A-Za-z0-9]", "") sadece harfleri ve sayıları bırakır…
             */}

    public static int longestSubWithoutRepeat(String str) {
        int max = 0;
        for (int i = 0; i < str.length(); i++) {
            String control = str.substring(i, i + 1);
            for (int j = i + 1; j < str.length(); j++) {
                if (!control.contains(str.substring(j, j + 1))) {
                    control += str.substring(j, j + 1);
                } else break;
            }
            max = Math.max(max, control.length());

        }
        return max;
    }

    public static int longestSubWithoutRepeat1(String str) {
        if (str.length() == 0) return 0;
        List<String> allSubs = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            String newStr;
            for (int j = i + 1; j <= str.length(); j++) {
                newStr = str.substring(i, j);
                allSubs.add(newStr);

            }

        }
        List<String> allUniqueSubs = new ArrayList<>();
        for (String sub : allSubs) {
            if (isUnique(sub)) {
                allUniqueSubs.add(sub);

            }

        }
        List<Integer> allUniqueSubsLenght = new ArrayList<>();
        for (String allUniqueSub : allUniqueSubs) {
            allUniqueSubsLenght.add(allUniqueSub.length());

        }
        return Collections.max(allUniqueSubsLenght);
    }

    public static boolean isUnique(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (str.indexOf(str.charAt(i)) != str.lastIndexOf(str.charAt(i))) {
                return false;

            }

        }
        return true;
    }
      /*
        String str"128 2 3693 65 89 25 10" str içerisindeki boşlukla ayrılmış sayıların sayı değerleri toplanarak
        küçükten büyüğe dizili olarak yeniden bir stringe tanımlayan metod nedir? Bu soru için cevap
        String result="1 2 7 11 11 17 21" şeklinde olmalıdır.
         */
      public static String sortAndSum(String str) {
          String[] numbers = str.split(" "); // boşluk karakterine göre stringi parçalayarak sayıları bir diziye alıyoruz
          int[] nums = new int[numbers.length];
          for (int i = 0; i < numbers.length; i++) {
              nums[i] = Integer.parseInt(numbers[i]); // stringleri integer sayılara dönüştürüyoruz
          }
          Arrays.sort(nums); // sayıları küçükten büyüğe sıralıyoruz
          int sum = 0;
          StringBuilder sb = new StringBuilder();
          for (int i = 0; i < nums.length; i++) {
              sum += nums[i]; // sayıların toplamını hesaplıyoruz
              sb.append(nums[i]); // sayıları stringe ekliyoruz
              if (i != nums.length - 1) {
                  sb.append(" "); // son sayıdan sonra boşluk karakteri koymuyoruz
              }
          }
          sb.insert(0, sum + " "); // toplamı ilk eleman olarak stringin başına ekliyoruz
          return sb.toString();
      }
    public static String toplasırala(String str){
        String rak="";
        int sum=0;
        int rakam=0;
        String [] ars=str.split(" ") ;
        int [] newars=new int[ars.length];
        for (int i = 0; i < ars.length; i++) {
            rak=ars[i];
            for (int j = 0; j < rak.length(); j++) {
                rakam=Integer.parseInt(rak.substring(j,j+1));
                sum=rakam;
            }
            newars[i]=sum;
            sum=0;}
        Arrays.sort(newars);
        String result="";
        for (int i = 0; i < newars.length; i++) {
            result+=newars[i]+" ";
        }

        return result;



}
    /*Java sorumuz : verilen string içerisindeki açılan her "(" parantez kapatılmalıdır. Açılmamış parantez kapatılamaz. Açılan her parantez mutlaka kapatılmalıdır.
           Örnek : "(())" valid
                   (()()) valid
                   ((()())) valid
                   ()()() valid
                    ())() invalid
                  )()( invalid

            */
    // String str="";
    String str = "(())";           //  valid
    String str1 = "((()()))";       //  valid
    String str2 = "()()()";         //  valid
    String str3 = "())()";         //  invalid
    String str4 = ")()(";          //  invalid
    String str5 = "())(()()";      //  invalid
    String str6 = "(())(()()";     //  invalid
    String str7 = "(())(())() ";    //  valid
    String a="a";
    public static String mirrorEnds(String str){
        String result="";
        if(str.equals(new StringBuffer(str).reverse().toString())){
            return str;
        }
        for (int i = 0; i < str.length()/2; i++) {
            if(str.charAt(i)==str.charAt(str.length()-1-i)){
                result+=str.charAt(i);
            }else{
                break;
            }

        }
        return result;
    }
    public static boolean isValid(String str){
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(0)!='(') return false;
            if(str.length()%2==1) return false;
            str=str.replaceFirst("[(]","");
            str=str.replaceFirst("[)]","");


        }  return true;
    }
    public static boolean isValidString(String s) {
        int openParentheses = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(') {
                openParentheses++;
            } else if (c == ')') {
                if (openParentheses > 0) {
                    openParentheses--;
                } else {
                    return false;
                }
            }
        }
        return openParentheses == 0;
    }



}

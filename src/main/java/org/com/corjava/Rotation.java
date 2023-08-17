package org.com.corjava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Rotation {
    //Which method would you use to learn if a string is a rotation of another string?
    //rotation of car->car, arc, rca
    //sarı->sarı,arıs,rısa,ısar  -->en baştaki harfin en sona geçmesiyle oluşan yeni kelime..sıra bozulmuyor
    //ve en fazla harf sayısı kadar oluyor

    public static void main(String[] args) {


        System.out.println(rotation("mözle","sarı"));
    }
    public static boolean rotation(String str1,String str) {
        List<String> rota = new ArrayList<>();
        for (int i = 0; i <str.length(); i++) {
          String  s =str.substring(i)+str.substring(0,i);
            rota.add(s);
        }
        System.out.println(rota);
       return  rota.stream().anyMatch(n ->n.equals(str1));
    }

    public static boolean isroraİhsanH(String str, String str1){
        List<String> list=new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            str=str.substring(1)+str.substring(0,1);
            list.add(str);}
    return list.contains(str1);
    }
    public static boolean isrota2(String str, String str1){
        if(str.length()!=str1.length()) return  false;
        return (str+str).contains(str1);
    }











    }

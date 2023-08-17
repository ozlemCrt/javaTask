package org.com.corjava;

import java.util.*;

public class PriceSort {
    /**
     * Problem statement:-
     * <p>
     * <p>
     * Input string( it is a single string, you can take input as param , from file or any possible way):-
     * <p>
     * samsung,'OEM Samsung Washing Machine Pulsator Washplate Cap Shipped With WA48J7700AW, WA48J7700AW/A2, WA48J7700AW/AA',20916,samsung,'OEM Samsung Chrome Washing Machine Washplate Pulsator Cap Shipped With WA52M7750AV, WA52M7750AV/A4, WA52M7750AW, WA52M7750AW/A4',91995,samsung, 'SAMSUNG Washing Machine Spring Hanger, DC61-01257M', 22970,samsung,'Samsung DC97-17022B Assy Detergent',32959,samsung,'Samsung DC66-00470A DAMPER SHOCK',29981,samsung,'DC64-00519D Samsung Washing Machine Door Lock Washer Dryer Dishwashe -MP#GH4498 349Y49HBRG9109150',52000,samsung,'Samsung DC97-16991A Assembly Filter',13000
     * <p>
     * <p>
     * Output ( output is sorted by price. Console output/file output anything will works):-
     * <p>
     * samsung,'Samsung DC97-16991A Assembly Filter',13000
     * samsung,'OEM Samsung Washing Machine Pulsator Washplate Cap Shipped With WA48J7700AW, WA48J7700AW/A2, WA48J7700AW/AA',20916
     * samsung, 'SAMSUNG Washing Machine Spring Hanger, DC61-01257M', 22970
     * samsung,'Samsung DC66-00470A DAMPER SHOCK',29981
     * samsung,'Samsung DC97-17022B Assy Detergent',32959
     * samsung,'DC64-00519D Samsung Washing Machine Door Lock Washer Dryer Dishwashe -MP#GH4498 349Y49HBRG9109150',52000
     * samsung,'OEM Samsung Chrome Washing Machine Washplate Pulsator Cap Shipped With WA52M7750AV, WA52M7750AV/A4, WA52M7750AW, WA52M7750AW/A4',91995
     */
    public static void main(String[] args) {
        String str="samsung,'OEM Samsung Washing Machine Pulsator Washplate Cap Shipped With WA48J7700AW, WA48J7700AW/A2, WA48J7700AW/AA', 20916," +
                "samsung,'OEM Samsung Chrome Washing Machine Washplate Pulsator Cap Shipped With WA52M7750AV, WA52M7750AV/A4, WA52M7750AW, WA52M7750AW/A4', 91995," +
                "samsung,'SAMSUNG Washing Machine Spring Hanger, DC61-01257M', 22970," +
                "samsung,'Samsung DC97-17022B Assy Detergent', 32959," +
                "samsung,'Samsung DC66-00470A DAMPER SHOCK', 29981," +
                "samsung,'DC64-00519D Samsung Washing Machine Door Lock Washer Dryer Dishwashe -MP#GH4498 349Y49HBRG9109150', 52000," +
                "samsung,'Samsung DC97-16991A Assembly Filter', 13000";
        String s = "samsung,'OEM Samsung Washing Machine Pulsator Washplate Cap Shipped With WA48J7700AW, WA48J7700AW/A2, WA48J7700AW/AA',20916,samsung,'OEM Samsung Chrome Washing Machine Washplate Pulsator Cap Shipped With WA52M7750AV, WA52M7750AV/A4, WA52M7750AW, WA52M7750AW/A4',91995,samsung, 'SAMSUNG Washing Machine Spring Hanger, DC61-01257M', 22970,samsung,'Samsung DC97-17022B Assy Detergent',32959,samsung,'Samsung DC66-00470A DAMPER SHOCK',29981,samsung,'DC64-00519D Samsung Washing Machine Door Lock Washer Dryer Dishwashe -MP#GH4498 349Y49HBRG9109150',52000,samsung,'Samsung DC97-16991A Assembly Filter',13000";
          priceSort(s);

    }
    public static void samsung(String s){
        String [] strArr=s.split("samsung,'");
        Map<String,String>mapStr=new TreeMap<>();
        for (int i = 0; i < strArr.length; i++) {
            String [] newStrArr=strArr[i].split("',");
            mapStr.put(newStrArr[1],newStrArr[0]);

        }
        mapStr.forEach((k,v)-> System.out.println("samsung,'"+v+"',"+k));

    }


    public static void priceSort(String str) {
        String[] arrayS = str.split("samsung,");
        String value="";
            Integer key=0;
            Map<Integer,String>price =new TreeMap<>();
            for (int i = 1; i < arrayS.length; i++) {
                value="samsung,"+arrayS[i].substring(0,arrayS[i].length()-5);
                if(Character.isDigit(value.charAt(value.length()-1))){
                 value=value.substring(0,value.length()-2)+",";
                }
                if(value.endsWith(",,")){
                    value=value.substring(0,value.length()-1)+" ";
                }
                String s = arrayS[i].substring(arrayS[i].length() - 7).replaceAll("[^0-9]", "");
                key=Integer.valueOf(s);
                price.put(key,value);
            }
            price.forEach((k, v) -> System.out.println(v+ k ));





            }



        }







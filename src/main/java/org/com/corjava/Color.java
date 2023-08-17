package org.com.corjava;

public class Color {
    /* String [] strAr=str.split(" ");
      Map<Integer,String> maplist=new TreeMap<>();
      for (int i = 0; i < strAr.length; i++) {
          int key= Integer.parseInt(strAr[i].charAt(strAr[i].length()-1)+"");
          String value=strAr[i].substring(0,strAr[i].length()-1);
              maplist.put(key,value);
      } System.out.println(maplist.values());

     */
    public static String orderColor2(String str){
        String [] words=str.split(" ");
        for (int i = 0; i < words.length; i++) {
            for (int j = i+1; j < words.length; j++) {
                if(Integer.parseInt(words[i].replaceAll("[A-Za-z]",""))>Integer.parseInt(words[j].replaceAll("[A-Za-z]",""))){
                    String temp=words[j];
                    words[j]=words[i];
                    words[i]=temp;
                }
            }
        }
        String result=String.join(" ",words).replaceAll("[0-9]","");
        return result;
    }

}

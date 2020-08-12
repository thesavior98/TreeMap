//Name - Rohan Gajjar
//HackerRank Name  - rug5006

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
      Map<String,String> leader = new TreeMap();
      Map<String,Integer> count = new TreeMap();
      Scanner sc= new Scanner(System.in);
      int x = sc.nextInt();
      for(int i=0;i<x;i++){
        String name = sc.next();
        String boss_name= sc.next();
        leader.put(name,boss_name);

      }
      for(String word: leader.keySet()){
        String a = word;
        while(leader.get(a)!=null){
          a = leader.get(a);
        }
        count.put(a,count.getOrDefault(a,0)+1);
      }

      int d =0;
      String xz="";
      for(String b: count.keySet()){
        if(count.get(b)>d){
          d=count.get(b);
          xz = b;
        }
      }
      System.out.println(xz);
  }
}

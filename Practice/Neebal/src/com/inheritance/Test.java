package com.inheritance;

import java.util.HashSet;

class Test {
     public static void main(String[] args) {
        HashSet<Integer>set=new HashSet<>();
         set.add(2);
         set.add(1);
         set.add(4);
         set.add(3);

         for(int a :set){
             System.out.println(a);
         }
     }
 }
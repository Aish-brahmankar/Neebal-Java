package com.inheritance;

public class Overloading {
    static int add(int a, int b){
        return a/b;
    }
    static int add(int a, int b,int c){
        return a+b/c;
    }


    class PracticeOverload{
        public static void main(String[] args) {
            Overloading overloading = new Overloading();
            System.out.println(Overloading.add(10,2));
        }
    }

}

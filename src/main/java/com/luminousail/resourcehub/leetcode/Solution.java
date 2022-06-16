package com.luminousail.resourcehub.leetcode;

import java.util.Stack;

public class Solution {

    public static void main(String[] args) {
//        isPalindrome(1234321);
//        divide(6,1  );
        addBinary("1111","1111");
    }

    public static boolean isPalindrome(int x) {

        Stack stack = new Stack();
        String str = String.valueOf(x);
        for (int i = 0 ; i<str.length()/2;i++){
            System.out.println(str.charAt(i));
            stack.push(str.charAt(i));
        }

        if (str.length()%2 == 0){
            for (int i = str.length()/2  ; i<str.length();i++){
                System.out.println(str.charAt(i));
//                stack.push(str.charAt(i));
                if (str.charAt(i) != (char)stack.pop()){
                    System.out.println("false");
                    return false;
                }
            }

            return true;


        }else {
            for (int i = str.length()/2 + 1  ; i<str.length();i++){
                System.out.println(str.charAt(i));
//                stack.push(str.charAt(i));
                if (str.charAt(i) != (char)stack.pop()){
                    System.out.println("false");
                    return false;
                }
            }


        }


        return true;

    }

    public static int divide(int a, int b) {

        System.out.println(a>>b);

        return 0;

    }

    public static String addBinary(String a, String b) {
        String str = "";
        Stack stack_a = new Stack();
        Stack stack_b = new Stack();
        Stack stack = new Stack();
        Integer temp = 0;

        if (a.length() != b.length()){
            if (a.length() > b.length()){

                while (a.length() - b.length()!=0){
                    b = "0"+b;
                }

            }else {
                while (a.length() - b.length()!=0){
                    a = "0"+a;
                }
            }
        }

        for (int i = 0; i< a.length();i++){
            stack_a.push(a.charAt(i));
        }

        for (int i = 0; i< b.length();i++){
            stack_b.push(b.charAt(i));
        }

//        int size = stack_a.size() >= stack_b.size()?stack_a.size():stack_b.size();
        while (stack_a.size()!=0){
//            System.out.println(stack_a.pop());
            int aa =  (char)stack_a.pop() - '0';
            int bb =  (char)stack_b.pop() - '0';


            if ( aa + bb + temp >= 2){


                stack.push(0 + 1);
                temp +=  1;
            }

            else {

                stack.push(aa + bb + 1);
                temp -= 1;
            }
        }
        if (temp != 0){
            stack.push(1);
        }

        while (stack.size()!=0){
//            System.out.print(stack.pop());
            str = str + stack.pop();
        }

         System.out.print(str);



        return str;
    }
}

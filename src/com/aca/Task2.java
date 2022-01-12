package com.aca;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Input str");
        String str=scanner.nextLine();
        System.out.println(anagram(str));
    }
    public static boolean anagram(String str){
        for (int i = 0; i <str.length()/2 ; i++) {
            if(str.charAt(i)!=str.charAt(str.length()-1-i)){
                return false;
            }
        }
        return true;
    }
}

package com.aca;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Input n");
        int n=scanner.nextInt();
        int sum=0;
        for (int i = 1; i <=n ; i++) {
            sum+=i;
        }
        System.out.println(sum);
    }
}

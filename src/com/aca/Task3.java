package com.aca;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("a)americano 1$ 2$");
        System.out.println("b)late 3$ 6$");
        System.out.println("c)espresso 0.5$ 1$");
        System.out.println("d)capuchino 4$ 8$");
        char str =scanner.nextLine().charAt(0);
        switch (str){
            case 'a':
                prise(variant(50),variant(100),1,2);
                break;
            case 'b':
                prise(variant(50),variant(100),3,6);
                break;
            case 'c':
                prise(variant(50),variant(100),0.5,1);
                break;
            case 'd':
                prise(variant(50),variant(100),4,8);
                break;
            default:
                System.out.println("Error");
                break;
        }
    }
    public static int variant(int type){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Input "+type+"ml-");
        int num=scanner.nextInt();
        return num;
    }
    public static void prise(int smal,int big,double smalPrise,double bigPrise){
        System.out.println("Your prise is-"+(smal*smalPrise+big*bigPrise)+"$");
    }
}

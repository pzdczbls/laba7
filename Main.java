package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input string");
        String str = in.nextLine();
        String longword = " ";
        for(String n: str.split(" ")){
            if(n.length() > longword.length()) longword = n;
        }
        System.out.println("Long word: "+ longword);
    }
}

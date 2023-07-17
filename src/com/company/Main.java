package com.company;

public class Main {

    public static void main(String[] args) {
        String str = ("get24");
        String str2 = ("get");

        if (str.equals(str2)) {
            System.out.println("da");
        } else System.out.println("no");

        if (str.contains("g")) {
            System.out.println("sodergjit ");
        } else System.out.println("ne sodergjit");

        if (str.endsWith("t2")) {
            System.out.println("sodergjit ");
        } else System.out.println("ne sodergjit");

        char x = str.charAt(2);
        System.out.println("index " + x);
    }
}

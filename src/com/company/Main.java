package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Please enter a six letter password: ");
        Scanner password = new Scanner(System.in);
        String pw = password.nextLine();

        if (pw.length() > 6) {
            System.out.println("Sorry, that password is too long:(");
        } else if (pw.length() < 6) {
            System.out.println("Sorry, that password is too short:(");
        } else if (pw.length() == 6) {

        }


    }
}

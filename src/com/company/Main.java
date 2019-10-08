package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	int length;
	int height;
        Scanner in = new Scanner(System.in);
        while(true){
            try {

                System.out.println("Input length: ");
                length = in.nextInt();
                System.out.println("Input height: ");
                height = in.nextInt();
                Chess chess = new Chess(length, height);
                chess.Draw();

        } catch (Exception e) {
            System.out.println("Incorrect value. Input an integer.");
            in.next();
        }

    }}


}

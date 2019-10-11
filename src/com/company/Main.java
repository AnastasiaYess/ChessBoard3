package com.company;

import java.util.Scanner;

public class Main {
    static int length;
    static int height;
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
      //  while(true){
            try {

                System.out.println("Input length: ");
                length = in.nextInt();
                System.out.println("Input height: ");
                height = in.nextInt();
                Chess chess = new Chess(length, height);
                Draw();

        } catch (Exception e) {
            System.out.println("Incorrect value. Input an integer.");
            in.next();
      //  }

    }}
    public static void Draw() {
        int[][] f = new int[8][8];

        for (int i = 0; i < length; i++) {
            for (int j = 0; j < height; j++) {
                if ((i + j) % 2 == 0) {
                    f[i][j] = 1;
                } else {
                    f[i][j] = 0;
                }
            }
        }
        for (int k = 0; k < length; k++) {
            for (int m = 0; m < height; m++) {
                System.out.print(f[k][m] + " ");
            }
            System.out.println();
        }
    }

}

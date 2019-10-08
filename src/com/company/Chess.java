package com.company;
import java.util.Scanner;

public class Chess {

    int length;
    int height ;
    public Chess(int length, int height) {
        this.length = length;
        this.height = height;
    }

    public int getLength(int length) {
        return this.length;
    }

    public void setLength(int length) {
        this.length = length;
    }
    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height= height;
    }

 public  void Draw()
{
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
        for(int m=0;m<height;m++){
            System.out.print(f[k][m]+" ");
        }
        System.out.println();
    }
    }


}



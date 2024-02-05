package com.myblog.myblog1.debug;

public class C {

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            if (i == 2) {
                for (int j = 5; j >= 0; j--) {
                    if (j == 2 || j == 4) {
                        System.out.println("J Count : " + j);
                    }
                    System.out.println("Time Pass :" + j);
                }
                continue;
            }
            System.out.println("count : " + i);
        }
        System.out.println("Finish....!!!");

    }
}

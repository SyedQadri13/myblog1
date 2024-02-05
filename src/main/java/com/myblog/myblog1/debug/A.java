package com.myblog.myblog1.debug;

public class A {
    public static void main(String[] args) {
        A a1 = new A();
        System.out.println(100);
        System.out.println(200);
        int z = a1.test();
        System.out.println(z);
    }
    public int test(){
        int otp = B.test1();
        return otp;
    }
}

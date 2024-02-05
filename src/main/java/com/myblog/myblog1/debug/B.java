package com.myblog.myblog1.debug;

public class B {

    public static int test1(){
        B b1 = new B();
        int otp = b1.returnOtp();
        return otp;
    }

    public int returnOtp(){
        return 1234;
    }



}

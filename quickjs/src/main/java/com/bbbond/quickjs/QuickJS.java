package com.bbbond.quickjs;

public class QuickJS {

    public QuickJS() {
    }

    static {
        System.loadLibrary("quickjs");
    }

    public native String nativeTest();
    public native String version();
}

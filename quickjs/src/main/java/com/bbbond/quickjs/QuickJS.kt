package com.bbbond.quickjs

class QuickJS {
    companion object {
        init {
            System.loadLibrary("quickjs")
        }
    }

    external fun nativeTest(): String?
    external fun version(): String?
}
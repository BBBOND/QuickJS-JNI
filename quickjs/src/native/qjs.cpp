//
// Created by 金伟阳 on 2021/9/7.
//

#include <jni.h>
#include "qjs.h"
#include <string>
//#include "quickjs/quickjs.h"

extern "C" {

JNIEXPORT jstring JNICALL
Java_com_bbbond_quickjs_QuickJS_nativeTest(JNIEnv *env, jobject /* this */) {
    std::string hello = "Hello from C++";
    return env->NewStringUTF(hello.c_str());
}

JNIEXPORT jstring JNICALL
Java_com_bbbond_quickjs_QuickJS_version(JNIEnv *env, jobject /* this */) {
    std::string hello = CONFIG_VERSION;
    return env->NewStringUTF(hello.c_str());
}
}

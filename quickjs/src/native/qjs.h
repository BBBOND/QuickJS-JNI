//
// Created by 金伟阳 on 2021/9/7.
//
#include <jni.h>

#ifndef QUICKJS_H
#define QUICKJS_H

extern "C" {
JNIEXPORT jstring JNICALL Java_com_bbbond_quickjs_QuickJS_nativeTest(JNIEnv *, jobject);
JNIEXPORT jstring JNICALL Java_com_bbbond_quickjs_QuickJS_version(JNIEnv *, jobject);
};

#endif //QUICKJS_H

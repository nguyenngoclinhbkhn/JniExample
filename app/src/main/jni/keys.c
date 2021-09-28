//
// Created by Nguyen Ngoc Linh on 9/28/21.
//

#include <jni.h>

JNIEXPORT jstring JNICALL
Java_jp_co_jniexample_MainActivity_getStringHello(JNIEnv *env, jobject instance) {
 return (*env)->  NewStringUTF(env, "Hello from nativeLib");
}



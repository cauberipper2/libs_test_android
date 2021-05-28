package com.example.libs_module

import android.os.Build

class LibsModuleKotlin {
    fun getAndroidVersion() : String{
        return Build.VERSION.RELEASE
    }
}
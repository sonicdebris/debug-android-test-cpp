package sonicdebris.library

fun loadLibrary() {
    System.loadLibrary("native-lib")
}

class Foo {
    external fun stringFromJNI(): String
}

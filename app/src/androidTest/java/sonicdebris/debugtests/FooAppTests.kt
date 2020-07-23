package sonicdebris.debugtests

import androidx.test.ext.junit.runners.AndroidJUnit4

import org.junit.Test
import org.junit.runner.RunWith

import org.junit.Assert.*
import sonicdebris.library.Foo
import sonicdebris.library.loadLibrary

@RunWith(AndroidJUnit4::class)
class FooAppTests {

    @Test
    fun testInAppModule() {
        loadLibrary()
        val res = Foo().stringFromJNI()
        assertEquals("Hello from C++", res)
    }
}

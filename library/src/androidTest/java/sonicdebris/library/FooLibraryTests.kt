package sonicdebris.library

import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.Assert.*

@RunWith(AndroidJUnit4::class)
class FooLibraryTests {

    @Test
    fun testInLibraryModule() {
        loadLibrary()
        val res = Foo().stringFromJNI()
        assertEquals("Hkello from C++", res)
    }
}

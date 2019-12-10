package sonicdebris.debugtests

import android.app.Activity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import sonicdebris.library.Foo
import sonicdebris.library.loadLibrary

class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        sample_text.text = Foo().stringFromJNI()
    }

    companion object {
        init { loadLibrary() }
    }
}

A simple android application where all native (C++) code is in the `library` module.

Trivial instrumentation tests can be found in both `library` and `app` modules.

Attaching the native debugger when running tests defined in a library module used to be broken...

BUT

I tested this on Android Studio 4.2 Canary 3 and it looks like now you can attach the c++ debugger when running tests, no matter in which module.
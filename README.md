A simple android application where all native (C++) code is in the `library` module.

Trivial instrumentation tests can be found in both `library` and `app` modules.

- `FooAppTests` (`app` module): it runs fine and you can attach either the java or the c++ debugger without issues.
- `FooLibraryTests` (`library` module): it runs fine and you can attach a java debugger, but attaching a c++ one will fail.
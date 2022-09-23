package com.berry.exceptionhandling.top_10_exceptions_or_errors;

public class NoClassDefFoundError {
	public static void main(String[] args) {
		T2 t = new T2();
	}
}

class T2 {
	
}

//console
//-------

//Exception in thread "main" java.lang.NoClassDefFoundError: com/berry/exceptionhandling/top_10_exceptions_or_errors/T2
//at com.berry.exceptionhandling.top_10_exceptions_or_errors.NoClassDefFoundError.main(NoClassDefFoundError.java:5)
//Caused by: java.lang.ClassNotFoundException: com.berry.exceptionhandling.top_10_exceptions_or_errors.T2
//at java.base/jdk.internal.loader.BuiltinClassLoader.loadClass(BuiltinClassLoader.java:641)
//at java.base/jdk.internal.loader.ClassLoaders$AppClassLoader.loadClass(ClassLoaders.java:188)
//at java.base/java.lang.ClassLoader.loadClass(ClassLoader.java:521)
//... 1 more

// Here after compilation of code go to specified path and delete T2.class file then this Exception is occurred.

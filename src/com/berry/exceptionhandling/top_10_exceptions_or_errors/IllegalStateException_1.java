package com.berry.exceptionhandling.top_10_exceptions_or_errors;

import java.util.ArrayList;
import java.util.Iterator;

public class IllegalStateException_1 {
	public static void main(String[] args) {
		Thread t1 = new Thread();
		t1.start();

		t1.start();
	}
}

class IllegalStateException_2 {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(13);
		al.add(25);
		al.add(45);

		Iterator<Integer> itr = al.iterator();
		System.out.println(al);
		while (itr.hasNext()) {
//			itr.next();
			itr.remove(); // here there is no object present, if there is no object in itr, then how can
							// it perform remove operation
		}
		System.out.println(al);
	}
}

//console
//-------

//Exception in thread "main" java.lang.IllegalThreadStateException
//at java.base/java.lang.Thread.start(Thread.java:793)
//at com.berry.exceptionhandling.top_10_exceptions_or_errors.IllegalStateException_1.main(IllegalStateException_1.java:11)


//[13, 25, 45]
//Exception in thread "main" java.lang.IllegalStateException
//	at java.base/java.util.ArrayList$Itr.remove(ArrayList.java:980)
//	at com.berry.exceptionhandling.top_10_exceptions_or_errors.IllegalStateException_2.main(IllegalStateException_1.java:26)

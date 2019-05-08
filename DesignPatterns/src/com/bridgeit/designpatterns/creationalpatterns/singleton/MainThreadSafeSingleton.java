
package com.bridgeit.designpatterns.creationalpatterns.singleton;

public class MainThreadSafeSingleton 
{
	public static void main(String[] args)
	{
		ThreadSafeSingleton thread=ThreadSafeSingleton.getInstance();
		System.out.println(" "+thread.hashCode());
		ThreadSafeSingleton thread1=ThreadSafeSingleton.getInstance();
		System.out.println(" "+thread1.hashCode());
	}
}

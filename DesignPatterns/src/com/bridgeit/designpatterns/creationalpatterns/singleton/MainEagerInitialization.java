
package com.bridgeit.designpatterns.creationalpatterns.singleton;

public class MainEagerInitialization
{
	public static void main(String[] args)
	{
		 EagerInitialization es =  EagerInitialization.getInstance();
		 EagerInitialization es1 =  EagerInitialization.getInstance();
		 System.out.println(" "+es.hashCode());
		 System.out.println(" "+es1.hashCode());
	}
}


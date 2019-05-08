
package com.bridgeit.designpatterns.creationalpatterns.singleton;

public class MainStaticBlockInitialization 
{
	public static void main(String[] args)
	{
		StaticBlockInitialization sb = StaticBlockInitialization.getInstance();
		System.out.println(" "+sb.hashCode());
		StaticBlockInitialization sb1 =StaticBlockInitialization.getInstance();
		System.out.println(" "+sb1.hashCode());
	}
}

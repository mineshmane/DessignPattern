
package com.bridgeit.designpatterns.creationalpatterns.singleton;

public class MainEnumSingleton 
{
	public static void main(String[] args)
	{
		EnumSingleton enu=EnumSingleton.INSTANCE;
		System.out.println(" "+enu.hashCode());
		EnumSingleton enu1=EnumSingleton.INSTANCE;
		System.out.println(" "+enu1.hashCode());
		
	}
}

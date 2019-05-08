package com.bridgeit.designpatterns.behavioralpatterns.visitorpatterns;

public interface ItemElement {
	public int accept(ShoppingCartVisitor visitor);
}

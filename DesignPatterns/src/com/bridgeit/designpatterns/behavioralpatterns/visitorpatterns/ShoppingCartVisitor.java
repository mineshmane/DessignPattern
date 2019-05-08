package com.bridgeit.designpatterns.behavioralpatterns.visitorpatterns;

public interface ShoppingCartVisitor {
	int visit(Book book);

	int visit(Fruit fruit);
}

package com.bridgeit.designpatterns.behavioralpatterns.mediatorpatterns;

public class ChatClientRunner {
	
	public static void main(String[] args) {
		ChatMediator mediator = new ChatMediatorImpl();
		User user1 = new UserImpl(mediator, "minesh");
		User user2 = new UserImpl(mediator, "rahul");
		User user3 = new UserImpl(mediator, "sanjay");
		User user4 = new UserImpl(mediator, "ravindra");
		mediator.addUser(user1);
		mediator.addUser(user2);
		mediator.addUser(user3);
		mediator.addUser(user4);

		user1.send("Hi All How Are You");
	}
}

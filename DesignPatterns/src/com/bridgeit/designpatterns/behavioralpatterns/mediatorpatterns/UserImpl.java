package com.bridgeit.designpatterns.behavioralpatterns.mediatorpatterns;

public class UserImpl extends User {
	public UserImpl(ChatMediator med, String name) {
		super(med, name);
	}

	@Override
	public void send(String msg) {
		System.out.println(this.name + ": Sent Message=" + msg);
		mediator.sendMessage(msg, this);
	}

	@Override
	public void receive(String msg) {
		System.out.println(this.name + ": Received Message:" + msg);
	}
}

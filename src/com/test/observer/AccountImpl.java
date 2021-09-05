package com.test.observer;

public class AccountImpl implements Account {

	private String username;
	private Twitter twitter;
	
	public AccountImpl(Twitter twitter) {
		this.twitter = twitter;
		twitter.registerAccount(this);
	}
	
	public void create(String username) {
		this.username = username;
		display();
	}
	
	public void display() {
		System.out.println("username: " + username);
	}


}

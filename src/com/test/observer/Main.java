package com.test.observer;

public class Main {

	public static void main(String[] args) {
		Twitter twitter = new TwitterImpl();
		Account account = new AccountImpl(twitter);
		account.create("Sharath1");
		account.create("Sampath1");
		account.create("Buchaiah1");
		twitter.removeAccount(account);
	}
}

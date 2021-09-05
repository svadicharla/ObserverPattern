package com.test.observer;

import java.util.ArrayList;
import java.util.List;


public class TwitterImpl implements Twitter {
	private List<Account> accounts;
	private String username = "";
	
	public TwitterImpl() {
		accounts = new ArrayList<Account>();
	}
	
	public void registerAccount(Account o) {
		accounts.add(o);
	}
	
	public void removeAccount(Account o) {
		accounts.remove(o);
	}
	
	public void notifyAccounts() {
		for (Account account : accounts) {
			account.create(username);
		}
	}
	
	public void setUsername(String username) {
		this.username = username;
		notifyAccounts();
	}
}

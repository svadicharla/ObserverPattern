package com.test.observer;

public interface Twitter {
	public void registerAccount(Account o);
	public void removeAccount(Account o);
	public void notifyAccounts();
}

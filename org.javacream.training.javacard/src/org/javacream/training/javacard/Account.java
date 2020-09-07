package org.javacream.training.javacard;

public class Account {

	private byte id;
	private  short balance;
	
	public short getBalance(){
		return balance;
	}
	
	public void credit(short amount) {
		balance = (short)(balance + amount);
	}
	public void debit(short amount) {
		balance = (short)(balance - amount);
	}

	public Account(byte id){
		this.id = id;
	}
}

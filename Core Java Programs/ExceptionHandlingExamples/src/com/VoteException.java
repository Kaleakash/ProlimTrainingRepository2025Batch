package com;

public class VoteException extends Exception{

	public VoteException() {
		super();
	}
	
	public VoteException(String msg) {
			//super();		// it call super class ie Exception empty constructor 
			super(msg);			// calling super class parameter constructor to set custom  message 
	}
}

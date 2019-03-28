package org.inter;

public class HDFCBank implements bank{
	public void savingAcct() {
	    System.out.println("6%");

	  }

	  public void currentAcct() {
	    System.out.println("8%");
	  }

	  public static void main(String[] args) {
	    HDFCBank b = new HDFCBank();
	    b.savingAcct();
	    b.currentAcct();
	  }

	}





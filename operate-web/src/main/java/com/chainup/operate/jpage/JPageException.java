package com.chainup.operate.jpage;

public class JPageException extends RuntimeException {

	private static final long serialVersionUID = 1L;
	
	public JPageException(String s) {
        super(s);
    }
	
	public JPageException(String s, Exception e) {
        super(s + "\n" + e);
    }
}

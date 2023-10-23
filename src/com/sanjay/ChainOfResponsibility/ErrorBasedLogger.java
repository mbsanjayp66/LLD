package com.sanjay.ChainOfResponsibility;

public class ErrorBasedLogger extends Logger {
	
	public ErrorBasedLogger(int levels) {
		this.levels = levels;
	}

	@Override
	protected void displayLogInfo(String msg) {
		logMessage(levels, msg);
	}

}

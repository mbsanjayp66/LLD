package com.sanjay.ChainOfResponsibility;

public class ConsoleBasedLogger extends Logger {
	
	public ConsoleBasedLogger(int levels) {
		this.levels = levels;
	}

	@Override
	protected void displayLogInfo(String msg) {
		logMessage(levels, msg);
	}

}

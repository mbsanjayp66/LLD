package com.sanjay.ChainOfResponsibility;

public class DebugBasedLogger extends Logger {
	
	public DebugBasedLogger(int levels) {
		this.levels = levels;
	}

	@Override
	protected void displayLogInfo(String msg) {
		logMessage(levels, msg);
	}

}

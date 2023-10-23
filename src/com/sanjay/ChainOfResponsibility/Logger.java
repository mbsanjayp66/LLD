package com.sanjay.ChainOfResponsibility;

public abstract class Logger {
	public static int outputInfo = 1;
	public static int errorInfo = 1;
	public static int debufgInfo = 1;
	int levels;
	Logger nextLevelLogger;
	public void setNextLevelLogger(Logger logger) {
		this.nextLevelLogger = logger;
	}
	public void logMessage(int levels, String msg){  
        if(this.levels<=levels){  
            displayLogInfo(msg);  
        }  
        if (nextLevelLogger!=null) {  
            nextLevelLogger.logMessage(levels, msg);  
        }  
    }  
    protected abstract void displayLogInfo(String msg);  

}

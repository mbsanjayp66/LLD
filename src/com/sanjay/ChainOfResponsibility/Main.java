package com.sanjay.ChainOfResponsibility;

public class Main {

	private static Logger doChaining(){  
        Logger consoleLogger = new ConsoleBasedLogger(Logger.outputInfo);  
          
        Logger errorLogger = new ErrorBasedLogger(Logger.errorInfo);  
        consoleLogger.setNextLevelLogger(errorLogger);  
          
        Logger debugLogger = new DebugBasedLogger(Logger.debufgInfo);  
        errorLogger.setNextLevelLogger(debugLogger);  
          
        return consoleLogger;   
        }  
        public static void main(String args[]){  
        Logger chainLogger= 

            chainLogger.logMessage(Logger.outputInfo, "Enter the sequence of values ");  
            chainLogger.logMessage(Logger.errorInfo, "An error is occured now");  
            chainLogger.logMessage(Logger.debufgInfo, "This was the error now debugging is compeled");  
            }  

}

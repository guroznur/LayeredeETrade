package nLayeredProject.core.concretes;

import nLayeredProject.core.abstracts.LoggerService;

public class LoggerManager implements LoggerService{

	@Override
	public void log(String message) {
		System.out.println("Logger loglandý:" + message);
		
	}

}

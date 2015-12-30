package com.yulartech.app;

import org.apache.log4j.Logger;
import org.apache.log4j.*;

public class App {

    final static Logger logger = Logger.getLogger(App.class);

    public App() {

	int a = 1, b = 2;
        int sum = a + b;
        System.out.println( " a + b = " + sum);

    }

    public static void main( String[] args ){

	App obj = new App();
	obj.printMsg(" Yular ");

    }

    private void printMsg(String param) {
	
	if(logger.isDebugEnabled()){
	    logger.debug(" This is debug: " + param);
	}

        if(logger.isInfoEnabled()){
            logger.debug(" This is info: " + param);
	}

	logger.warn("This is warn : " + param);
	logger.error("This is error : " + param);
	logger.fatal("This is fatal : " + param);

    }

}

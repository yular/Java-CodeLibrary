package com.yulartech.app;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ShellCommandExecutor {

    public String executorCommand(String command){
	StringBuffer output =  new StringBuffer();

	Process p;
	try{
	    p = Runtime.getRuntime().exec(command);
	    p.waitFor();
            BufferedReader reader = new BufferedReader(new InputStreamReader(p.getInputStream()));
	    String line = "";
	    while((line = reader.readLine()) != null){
		output.append(line+'\n');
	    }
	}catch (Exception e){
	    e.printStackTrace();
	}

	return output.toString();
    }

}

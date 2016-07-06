package com.yulartech.app;

import com.yulartech.app.ShellCommandExecutor;

public class App {

    public static void main( String[] args ){
	ShellCommandExecutor exe = new ShellCommandExecutor();
	
	String command = "ping -c 3 google.com";
	String res = exe.executorCommand(command);

	System.out.println(res);
    }
}

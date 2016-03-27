package com.yulartech.template;

import java.io.*;
import java.util.*;

import org.joda.time.LocalDate;

import com.yulartech.template.functions.*;

public class App {

    public static void main( String[] args ){

	int a = 1, b = 2;
	if(args.length == 2){
	    a = Integer.parseInt(args[0]);
            b = Integer.parseInt(args[1]);
	}
	int sum = a + b;
	String res = "x";
	if(args.length == 3){
	    res = StringUtils.reverseString(args[2]);
	}
        System.out.println(getLocalCurrentDate()+" : The Sum is "+ sum+" .");
	System.out.println(getLocalCurrentDate()+" : The reversed string is "+ res+" .");

    }

    private static String getLocalCurrentDate() {

        LocalDate date = new LocalDate();
        return date.toString();

    }
}


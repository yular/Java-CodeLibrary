package com.yulartech.template.functions;

import java.io.*;
import java.util.*;

public class StringUtils {

    public static String reverseString(String val){

	String res = new StringBuilder(val).reverse().toString();
	return res;

    }

}

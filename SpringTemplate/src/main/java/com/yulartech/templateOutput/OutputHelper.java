package com.yulartech.templateOutput;

import com.yulartech.templateOutput.IOutputGenerator;;

public class OutputHelper {
	
	IOutputGenerator outputGenerator;
	
	OutputHelper(IOutputGenerator outputGenerator){
		this.outputGenerator = outputGenerator;
	}
	
	public void generateOutput() {
		outputGenerator.generateOutput();
	}
	
	public void setOutputGenerator(IOutputGenerator outputGenerator) {
		this.outputGenerator = outputGenerator;
	}

}

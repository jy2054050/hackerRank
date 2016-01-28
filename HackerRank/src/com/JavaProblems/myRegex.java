package com.JavaProblems;


public class myRegex {
	public String pattern;

/*static final String pattern1 ="^(([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\.){3}([01]?\\d\\d?|2[0-4]\\d|25[0-5])$";
	static final Pattern pattern = Pattern.compile(pattern1);*/
myRegex(){
	  String zeroTo255 ="(\\d{1,2}|(0|1)\\d{2}|2[0-4]\\d|25[0-5])";
      pattern = zeroTo255 + "\\." + zeroTo255 + "\\." + zeroTo255 + "\\." + zeroTo255;

  }
}


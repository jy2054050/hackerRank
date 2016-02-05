package com.JavaProblems;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;

import com.JavaProblems.Student;

public class GetMethods {

	public static void main(String[] args) {
		         Class c = Student.getClass();
	            Method[] methods = c.getDeclaredMethods();

	            ArrayList<String> methodList = new ArrayList<>();
	           // for(~~~Complete this line~~~){
	         //       methodList.add(~~~Complete this line~~~);
	          //  }
	            Collections.sort(methodList);
	            for(String name: methodList){
	                System.out.println(name);
	            }
	        }

	    }
	}
}

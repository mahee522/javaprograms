package com.iostreams;

import java.io.File;

public class MyFileLastModified {
	 public static void main(String a[]) {
         
	        File file = new File("MyProp.xml");
	        System.out.println(file.lastModified());
	    }
	
}

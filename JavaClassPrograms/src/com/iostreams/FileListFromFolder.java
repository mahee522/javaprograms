package com.iostreams;

import java.io.File;

public class FileListFromFolder {
	  
    public static void main(String a[]){
        File file = new File("C:/Users/MAHI/Desktop/Ravi-Java/JUNIT");
        String[] fileList = file.list();
        for(String name:fileList){
            System.out.println(name);
        }
        
        File fl = new File("C:/Users/MAHI/Desktop/Ravi-Java/JUNIT");
        File[] files = fl.listFiles();
        for(File f: files){
            System.out.println(f.getName());
        }

    }

}

package com.iostreams;

import java.io.File;

public class FileListFromFolder {
	  
    public static void main(String a[]){
        File file = new File("C:/MyFolder/");
        String[] fileList = file.list();
        for(String name:fileList){
            System.out.println(name);
        }
        
        File fl = new File("C:/MyFolder/");
        File[] files = fl.listFiles();
        for(File f: files){
            System.out.println(f.getName());
        }

    }

}

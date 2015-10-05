package com.iostreams;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class FileToByteArray {
	 public static void main(String a[]){
         
	        String fileName = "C:/Users/MAHI/Desktop/Ravi-Java/JUNIT";
	        InputStream is = null;
	        try {
	            is = new FileInputStream(fileName);
	            byte content[] = new byte[2*1024];
	            int readCount = 0;
	            while((readCount = is.read(content)) > 0){
	                System.out.println(new String(content, 0, readCount-1));
	            }
	        } catch (FileNotFoundException e) {
	            e.printStackTrace();
	        } catch (IOException e) {
	            e.printStackTrace();
	        } finally {
	            try{
	                if(is != null) is.close();
	            } catch(Exception ex){
	                 
	            }
	        }
	    }
	
}

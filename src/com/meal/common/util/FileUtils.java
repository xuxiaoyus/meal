package com.meal.common.util;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileUtils {

	//读取内容
	public static String ReadContent(String file){
		BufferedReader reader=null;
		
		String str="";
		
	
		try {
			
			reader=new BufferedReader(new FileReader(file));
			
			while((str=reader.readLine()) != null){
				System.out.println(str);
				str += str;
			}
			
			reader.close();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return str;
	}
	
	//内容删除
	public static void DeleteContent(String file){
		FileWriter fileWriter=null;
		
		try {
			fileWriter=new FileWriter(file);
			fileWriter.write("");
			fileWriter.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

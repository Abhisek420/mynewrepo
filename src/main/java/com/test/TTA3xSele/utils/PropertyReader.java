package com.test.TTA3xSele.utils;

import java.io.File;
import java.io.FileInputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import com.google.common.base.Objects;
import com.google.common.util.concurrent.Service.State;

public class PropertyReader {
	PropertyReader(){}
	static FileInputStream fps=null;
	static Properties p=null;
	static Map<String, String> PROP_KEYS= new HashMap<>();
	static {
		try {
			fps=new FileInputStream(new File(System.getProperty("user.dir")+"/src/test/java/resources/config.properties"));
			p=new Properties();
			p.load(fps);
			for (Object key : p.keySet()) {
				PROP_KEYS.put(String.valueOf(key), String.valueOf(key));
				
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}
	public static  String readKey(String key)throws Exception {
		if(key == null && p.getProperty(key) == null) {
			throw new Exception(p.getProperty(key)+"not found");
		}
		else {
			return PROP_KEYS.get(key);
		}
		
		
		
	}
	
	
	
	
	
}

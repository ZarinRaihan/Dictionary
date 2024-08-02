package question2;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Dictionary {

	public static void main(String[] args) {
		Dictionary d=new Dictionary();
		
		System.out.println(d.getKeyValue("data/dictionary.properties", "word1"));

	}
public String getKeyValue (String path,String key) {
	try {
		File f=new File(path);
		FileInputStream fi=new FileInputStream(f);
		Properties prop=new Properties();
		prop.load(fi);
		return prop.getProperty(key);	
		
	}
	catch(IOException e) {
		e.printStackTrace();
		return null;
	}
	
}
}


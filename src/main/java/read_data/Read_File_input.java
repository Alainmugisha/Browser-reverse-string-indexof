package read_data;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStream;
import java.io.Reader;
import java.util.Properties;
import java.util.Scanner;
import java.util.stream.Stream;

public class Read_File_input {

	
	public static void main(String[] args) throws Throwable {
		
	//	read();
		read_file();
		//read_file_Json();
	}
	public static void read() throws Throwable {
		

		Properties pro = new Properties();
		InputStream input = new FileInputStream("C:\\Users\\Alain Mickey\\Desktop\\All Java project____eclipse\\maven projects\\DATA_DRIVEN (for submission)\\Browsers\\src\\main\\java\\read_data\\data_file.propertie");
	    pro.load(input);
	    System.out.println(pro.getProperty("browser"));
	
	}
	public static void read_file() throws Throwable {
		String path = "C:\\Users\\Alain Mickey\\Desktop\\All Java project____eclipse\\maven projects\\DATA_DRIVEN (for submission)\\Browsers\\src\\main\\java\\read_data\\data_file.propertie";
		
	
		FileReader reade = new FileReader(path);
		BufferedReader read = new BufferedReader(reade);
		
		String data_preview = read.readLine();
	
			
			System.out.println(data_preview);
		
		
		
//		Properties pro = new Properties();
//		InputStream input = new FileInputStream("C:\\Users\\Alain Mickey\\Desktop\\All Java project____eclipse\\maven projects\\DATA_DRIVEN (for submission)\\Browsers\\src\\main\\java\\read_data\\data_file.propertie");
//		pro.load(input);
//		System.out.println(pro.getProperty("browser"));
		
	}
	public static void read_file_Json() throws Throwable {
		
//		File file = new File("C:\\Users\\Alain Mickey\\Desktop\\All Java project____eclipse\\maven projects\\DATA_DRIVEN (for submission)\\Browsers\\src\\main\\java\\read_data\\readJsonfiles.json");
//		Scanner scn = new Scanner(file);
//		String data_preview = scn.nextLine();
//		System.out.println(data_preview);
		

	Properties pro = new Properties();
	InputStream input = new FileInputStream("C:\\Users\\Alain Mickey\\Desktop\\All Java project____eclipse\\maven projects\\DATA_DRIVEN (for submission)\\Browsers\\src\\main\\java\\read_data\\readJsonfiles.json");
		pro.load(input);
		System.out.println(pro.getProperty("username"));
		
	}

	
	
	
	
}

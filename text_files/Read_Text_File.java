package text_files;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class Read_Text_File {

	public static void main(String[] args) throws IOException {

		/*
		 * Working with Text Files using Apache Commons IO
		 * 
		 * 1. Download Apache Commons IO from:
		 * https://commons.apache.org/proper/commons-io/download_io.cgi 2. Add Commons
		 * IO jar files to Java Build Path 3. Use FileUtils from commons-io to read a
		 * text file
		 */

		File file = new File("/Users/mayurdeshmukh/Documents/TextFiles/File1.txt");

		String x = FileUtils.readFileToString(file, "UTF-8");

		System.out.println(x);
		
		List<String> list = FileUtils.readLines(file,"UTF-8");
		
		System.out.println(list);

	}

}

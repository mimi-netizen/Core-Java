package text_files;

import java.io.File;
import java.io.IOException;

public class Edit_Text_File {

	public static void main(String[] args) throws IOException {
	
		File file = new File("/Users/mayurdeshmukh/Documents/TextFiles/File1.txt");
		
		FileUtils.write(file, "Learning is Growing", "UTF-8", false);
	}

}


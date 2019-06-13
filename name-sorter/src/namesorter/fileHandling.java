package namesorter;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class fileHandling {
	
	public static ArrayList<String> readFile(String fileName) throws FileNotFoundException, IOException {
		File file2read = new File("./"+fileName); 
		ArrayList<String> readResult = new ArrayList<>();
		try (BufferedReader reader = new BufferedReader(new FileReader(file2read))) {
		      while (reader.ready()) {
		          readResult.add(reader.readLine());
		      }
		  }
		return readResult;
	}
	
	public static void writeFile(ArrayList<String> result, String fileName) throws IOException {
		File file2write = new File("./"+fileName);
		try (BufferedWriter writer = new BufferedWriter(new FileWriter(file2write))) {
			writer.write("Here're your sorted name:\n\n");
			for (String item : result) { 		      
				writer.write(String.valueOf(item));
				writer.write("\n");
			 }
		    writer.close();
		  }
	}
}

package namesorter;

import static org.junit.Assert.assertArrayEquals;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

import org.junit.Test;

public class theNameSorter {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		String file2read = "unsorted-names-list.txt";
		String file2write = "sorted-names-list.txt";
		
		ArrayList<String> rawData = fileHandling.readFile(file2read);
		
		ArrayList<String> result = sorter.sortLast(rawData);
		
		fileHandling.writeFile(result, file2write);

	}
	
	@Test
	public void sortingTest() 
	{
		ArrayList<String> actual = new ArrayList<>();
		actual.add("A C");
		actual.add("A A");
		actual.add("A D");
		actual.add("A B");
		ArrayList<String> expected = new ArrayList<>();
		expected.add("A A");
		expected.add("A B");
		expected.add("A C");
		expected.add("A D");
		
		sorter.sortLast(actual);
		
		assertArrayEquals(actual.toArray(), expected.toArray());
	}

}
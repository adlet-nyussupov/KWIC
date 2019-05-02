package MainPackage;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Input {
	
	private String sentences = new String();
	public String getInput() {
		return sentences;
	}
	
	public String ReadInput(String inputFile) 
	{
	if (inputFile.isEmpty()) {
		System.out.println("You didn't write the name of file");
	}
	else {
		BufferedReader bf=null;
		File file=new File(inputFile);
		try {
		    bf = new BufferedReader(new FileReader(file));
		    String sentence = null;

		    while ((sentence = bf.readLine()) != null) {
		        sentences+=sentence + "/n";
		        
		    }
		} catch (FileNotFoundException e) {
		    e.printStackTrace();
		} catch (IOException e) {
		    e.printStackTrace();
		} finally {
		    try {
		        if (bf != null) {
		            bf.close();
		        }
		    } catch (IOException e) {
		    }
		}
		
		
		}
	return sentences;
	}
}



package MainPackage;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Output {
	
	public void writeOutput(String fileName, ArrayList<String> sentences) {
		BufferedWriter bw=null;

		try {
			bw = new BufferedWriter(new FileWriter(fileName));
			for(String str: sentences) {
				  bw.write(str);
				  bw.newLine();
				  
			}
			bw.flush();
			bw.close();
			System.out.println("Done!!!");

			
}
		catch (IOException e) {

			e.printStackTrace();
			 System.out.println("Error");

		}


		
		

	}
}

package HidePackage;
import java.util.ArrayList;
import java.util.Arrays;


public class Storage {
	
	protected ArrayList<String> sentences;
	
	protected ArrayList<String> lineStoring(String text) {
		sentences = new ArrayList<String>(Arrays.asList(text.split("/n")));
		return sentences;
	}
	protected void setSentences(ArrayList<String> list) {
		sentences=list;
	}
	protected ArrayList<String> getSentences() {
		return sentences;
		
		
	}

}

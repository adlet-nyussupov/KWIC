package MainPackage;
import java.util.ArrayList;
import java.util.Collections;

public class AlphabeticShifts {
	
	public ArrayList<String> DoAlphapeticShifts(ArrayList<String> sentences) {
		Collections.sort(sentences, String.CASE_INSENSITIVE_ORDER);
		return sentences;
	}

}

package HidePackage;
import java.io.IOException;

import MainPackage.AlphabeticShifts;
import MainPackage.CircularShift;
import MainPackage.Input;
import MainPackage.Output;


public class MasterControl {

	private static AlphabeticShifts alphabeticShifts;
	private static CircularShift circularShift;
	private static Storage storage;
	private static Input input;
	private static Output output;
	
	public static void main(String[] args) throws IOException {
		alphabeticShifts=new AlphabeticShifts();
		circularShift=new CircularShift();
		storage=new Storage();
		input=new Input();
		output=new Output();
		storage.setSentences(circularShift.DoCircularShift(storage.lineStoring(input.ReadInput(args[0]))));
	    storage.setSentences(alphabeticShifts.DoAlphapeticShifts(storage.getSentences()));
	    output.writeOutput(args[1], storage.getSentences());
	}
	
}


























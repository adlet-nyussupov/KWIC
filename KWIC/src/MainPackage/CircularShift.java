package MainPackage;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CircularShift {
	
	
	public ArrayList<String> DoCircularShift(ArrayList<String> sentences) {
		
		ArrayList<String> all = new ArrayList<>();
		//int n = 0;
		for (int g = 0; g <sentences.size(); g++) {
			String[] list = sentences.get(g).split(" ");
			ArrayList<String> b = new ArrayList<>();
			b.addAll(Arrays.asList(list));
			StringBuilder sb = new StringBuilder();
				for (String y : b) {
					sb.append(y);
					sb.append(" ");
				}
			all.add(sb.toString());
				for (int t = 0; t < b.size() - 1; t++) {
					String temp = b.get(0);
					for (int i = 0; i < b.size() - 1; i++) {
						b.set(i, b.get(i + 1));
					}
					b.set(b.size() - 1, temp);
					sb = new StringBuilder();
					for (String y : b) {
						sb.append(y);
						sb.append(" ");
					}
					all.add(sb.toString());
					
				}
			}
		return all;
	}

}

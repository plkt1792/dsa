package recursion;

import java.util.ArrayList;

public class GenerateValidParanthesis {
	public static ArrayList<String> solve(int N) {
		ArrayList<String> list = new ArrayList<String>();
		generate(N, N, "", list);
		return list;
	}

	static void generate(int open, int close, String sequence, ArrayList<String> list) {
		if(open == 0 && close == 0) {
			list.add(sequence);
			return;
		}

		if (open < close) {
			generate(open, close - 1, sequence + ")", list);
		}

		if (open > 0) {
			generate(open - 1, close, sequence + "(", list);
		}
	}
}
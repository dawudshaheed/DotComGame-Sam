public class RangeLister {
		int[] makeRange(int lower, int upper) {
			int[] range = new int [(upper - lower) + 1];
		
			for (int i = 0; i < range.length; i++) {
				range[i] = lower++;
			
			}
			
			return range;
	}
}

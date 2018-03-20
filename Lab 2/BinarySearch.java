public class BinarySearch {

	public static void main(String[] args) {
		
		int data[] = { 3, 6, 7, 10, 34, 56, 60 };
		int numberToFind = 10;
		int lower = 0, upper = data.length-1;
		while(lower<=upper) {
			int middle = lower + (upper-lower)/2;
				
			if (data[lower] == numberToFind) {
				System.out.println(lower);
				break;
			}
			
			if(data[middle] > numberToFind) {
				upper=middle-1;
			}
			if (data[middle] < numberToFind) {
				lower=middle + 1;
			}
			if(data[middle] == numberToFind) {
				System.out.println(middle);
				break;
			}
			if (lower>upper) System.out.println(-1);

		} 
		
	}

}

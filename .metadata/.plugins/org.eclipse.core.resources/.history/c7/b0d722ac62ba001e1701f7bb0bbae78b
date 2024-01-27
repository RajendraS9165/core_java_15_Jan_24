
public class Test {
	
	public static void main(String[] args) {
		int[] arr = {1,2,1,2,1,3,4,2,3,4,2,5,6};
		String str ="abcdekdfjkafoijfadkdahafif";
		//printFrequency(arr);
		printFrequencyInAString(str);
		
		
	}
	
	
	//wap to print the frequency of a number in an array
	public static void printFrequency(int[] arr) {
		int[] res = new int[10];
		for(int a: arr) {
			res[a]++;
		}
		
		for(int i =0;i<res.length; i++) {
			System.out.println(i+" = "+res[i]);
		}
	}
	
	public static void printFrequencyInAString(String str) {
		char[] charr = str.toCharArray();
		int[] res = new int[256];
		for(int a: charr) {
			res[a]++;
		}
		
		for(int i =0;i<res.length; i++) {
			if(res[i] != 0) {
				System.out.println(i+", "+(char)i+ " = "+res[i]);
			}
			
		}
	}

}

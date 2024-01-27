
public class TwoDArray {
	
	public static void main(String[] args) {
		int[][] arr = {{2,3}, {4,5,6}, {10,20}};
		int[][] barr = new int[3][4];
		int [][] carr = new int[3][];
		
		carr[0] = new int[4];
		carr[1] = new int[]{4,5};
		carr[2] = new int[10];
		
		/*
		 * int[][] carr = new int[][];
		 * int[][] carr = new int[][5];
		 * int[][] carr = new int[5][];
		 * int [][] carr = new int[5][3];
		 * 
		 */
		
		display(arr);
		display(barr);
		display(carr);
		
	}
	
	public static void display(int[][] arr) {
		for(int[] ar :arr) {
			for(int a :ar) {
				System.out.print(a+" ");
			}
			System.out.println();
		}
		
		System.out.println("__________________________________________");
	}

}

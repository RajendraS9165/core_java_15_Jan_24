
public class ArrayDemo {
	
	public static void main(String[] args) {
		int a  = 10;
		int[] arr = {1,2,3,4};
		int[] barr = new int[10];
		int[] carr = new int[] {4,5,6};
		int[] darr = new int[a];
		
		
		display(arr);
		display(barr);
		display(carr);
		display(darr);
		
	}
	
	public static void display(int[] arr) {
		for(int a :arr) {
			System.out.print(a+ " ");
		}
		System.out.println();
	}
	
	public static void display1(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}

}

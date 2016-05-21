package arrayreview;

public class ReviewOfArrays {
	static int[] a1; //declare array
	static final int N = 10;
	static final int M = 5;
	static int[] a1Copy;
	
	static int[] b = {1, 2, 3, 4, 5};
	
	static int[] c = {1, 2, 3, 4, 5};
	
	public static void main(String[] args) {
		a1 = new int[N]; //create array
		//initialize array
		for(int i=0; i<N; i++)
			a1[i] = 2 * i;
		
		//display array
		System.out.println("array a1:");
		printArray(a1);
		
		//display maximum value in the array
		System.out.printf("\nMaximum value is %d\n", maxValue());
		
		//display average of array values
		System.out.printf("\nAverage value is %d\n", averageValue());
		
		//copy a1 to a1Copy
		copyArray();
		
		//display array a1Copy
		System.out.println("\narray a1Copy:");
		printArray(a1Copy);
		
		//print c
		System.out.println("\narray c:");
		printArray(c);
		
		//print b after reversing
		System.out.println("\narray c reverse:");
		reverseArray(c);
		printArray(c);
	}
	
	public static void printArray(int[] a1) {
		int N = a1.length;
		
		if(a1 == null)
			System.out.println("array is null!");
		else if(a1.length == 0)
			System.out.println("array is not initialized!");
		else {
			for(int i=0; i<N; i++)
				System.out.printf("%d\t", a1[i]);
			System.out.println();
		}
	}
	
	public static int maxValue() {
		int max = a1[0];
		
		for(int i=1; i<N; i++) {
			if(a1[i] > max)
				max = a1[i];
		}
		
		return max;
	}
	
	public static int averageValue() {
		int total = 0;
		
		for(int i=0; i<N; i++) {
			total += a1[i];
		}
		
		return total/N;
	}
	
	public static void copyArray() {
		a1Copy = new int[a1.length];
		
		for(int i=0; i<N; i++)
			a1Copy[i] = a1[i];
	}
	
	public static void reverseArray(int[] a) {
		int N = a.length;
		//int[] b = new int[N];
		int[] b = a;
		a = new int[N];
		
		int j = 0;
		for(int i=N-1; i>=0; i--) {
			a[j] = b[i];
			j++;
		}
		
		//a = b;
	}

}

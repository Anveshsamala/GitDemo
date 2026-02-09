package javaconcepts;

public class JavaExercise1 {
	
	//Create an Array:
	/*
	 * Create a new array called numbers to store 5 numerical values of your choice
	 * (they can be whole numbers or decimals).
	 * 
	 * Access and Print:
	 * 
	 * Print the following:
	 * 
	 * The first element of the numbers array.
	 * 
	 * The last element of the numbers array.
	 * 
	 * Reverse Order:
	 * 
	 * Using a loop, print the elements of the numbers array in reverse order.
	 * 
	 * Bonus: Element Count:
	 * 
	 * Calculate the total number of elements within the numbers array.
	 */

	public static void main(String[] args) {
		int[] numbers={1,2,3,4,5};
	    System.out.println(numbers[0]);
	    System.out.println(numbers[numbers.length-1]);

	for (int i=numbers.length-1;i>=0 ;i-- ){
	    System.out.println(numbers[i]);
	}
	int sum=0;
	for(int i=0;i<numbers.length;i++){
	     sum=sum+numbers[i];
	   
	}
	 System.out.println(sum);

	}

}

/* StopWatch test class 
 * Date Jun 3 2016
 * Author Lee Tompkins
 * File TestStopWatch.java
 */
public class TestStopWatch {

	public static void main(String[] args) {
		/* Tests StopWatch by measuring time to sort 100,000 numbers 
		 * using selection sort 
		 * Topic 2 Chapter 9 Exercise 9.6 
		 */

		StopWatch StopWatch1 = new StopWatch();
		
		
		
		int[] array = new int[100000];
		for (int x = 0; x < array.length; x++) {
			array[x] = (int)(Math.random() * 100000);
		}
		
		
		StopWatch1.start(); // Start the watch
		int a;
		for (int i = 0; i < array.length; i++) {
			a = i;
			for (int y = i + 1; y < array.length; y++) {
				if (array[y] < array[a]) {
					a = y;
				}
			}
			
			if (a != i) {	// sort numbers by size
				int temporary = array[i];
				array[i] = array[a];
				array[a] = temporary;
			}
			
		}
		StopWatch1.stop(); // set end time 
		System.out.println(StopWatch1.getElapsedTime()); // display elapsed time
	}
	

}

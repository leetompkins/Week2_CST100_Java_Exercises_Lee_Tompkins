/* StopWatch class 
 * Date Jun 3 2016
 * Author Lee Tompkins
 * File StopWatch.java
 */

public class StopWatch {
	// Declare variables
	private long startTime;
	private long endTime;
	
	long getStartTime() {
		// get start time
		return startTime;
	}
	long getEndTime() {
		// get end time
		return endTime;
	}
	
	StopWatch() { 			// Constructor
		
	}
	long start() {
		// Start stop watch
		return startTime = System.currentTimeMillis();
	}
	long stop() {
		// end stop watch
		return endTime = System.currentTimeMillis();
	}
	long getElapsedTime() {
		// get elapsed time 
		return endTime - startTime;
	}
}

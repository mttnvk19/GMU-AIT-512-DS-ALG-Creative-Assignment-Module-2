/**
 * Stop watch class
 * Creative Assignment
 * @author Matthew Novak
 */

package m2bc;

public class m2bcStopwatch {
	
	/**
     * Saves the time when the watch is started (or restarted)
     */
    private long startTime;
    
    /**
     * Starts or restarts the stop watch.
     */
    public void startWatch() {
        startTime = System.currentTimeMillis();
    }
    
    /**
     * Creates and starts a stop watch.
     */
    public m2bcStopwatch() {
        startWatch();
    }
    
    /**
     * Compute and return the elapsed time from the last start or restart.
     * @return the elapsed time as a {@code long}
     */
    public long elapsedTime() {
        return System.currentTimeMillis() - startTime;
    }

}

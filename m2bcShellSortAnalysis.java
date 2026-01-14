/**
 * Shell sort Analysis class
 * final testing class for creative assignment
 * Creative Assignment
 * @author Matthew Novak
 */

package m2bc;

import java.util.Date;

public class m2bcShellSortAnalysis {
	
	/**
	 * 
	 * @param name
	 * @param numberOfExecutions
	 * @param numberOfElements
	 * @param min
	 * @param max
	 * @return
	 */
	public static m2bcTimeAnalysis meanTime(String name, int numberOfExecutions, int numberOfElements, double min, double max) {
        m2bcStopwatch watch = new m2bcStopwatch();
        m2bcTimeAnalysis ta = new m2bcTimeAnalysis(name, numberOfExecutions);
        for (int trial = 0; trial < numberOfExecutions; trial++) {
        		// generate the array
        		double[] array = m2bcArrayUtility.generateDoubleArray(numberOfElements, min, max);
            watch.startWatch();
            // tested code - start
            m2bcShellSort.sort(array);
            // tested code - end
            long time = watch.elapsedTime();
            ta.add(time);
        }
        return ta;
    }
	
	//prints table for temporal stats
	/**
	 * 
	 * @param numberOfExecutions
	 * @param minArrayLength
	 * @param arrayIncrementLength
	 * @param maxArrayLength
	 * @param minArrayValue
	 * @param maxArrayValue
	 */
	public static void printMeanExecutionTimeGrowthTable(int numberOfExecutions, 
    		int minArrayLength, int arrayIncrementLength, int maxArrayLength, 
    		double minArrayValue, double maxArrayValue) {
        System.out.println("Mean execution time growth table for sorting tips");
        System.out.println("  - Method: Selection sort of N doubles (tips)");
        System.out.println("  - Sample size for time estimation: "+numberOfExecutions+" tips");
        System.out.println("|-----------|--------|------|------|------------------|");
        System.out.println("|         N |   Mean |  Min |  Max |         CI 99.9% |");
        System.out.println("|-----------|--------|------|------|------------------|");
        for (int n=minArrayLength; n<=maxArrayLength; n+=arrayIncrementLength) {
            String name = "Sort " + n + " doubles";
            m2bcTimeAnalysis ta = meanTime(name, numberOfExecutions, n, minArrayValue, maxArrayValue);
            System.out.printf("| %9d | %6.1f | %4d | %4d | (%6.1f, %6.1f) |\n", n,  ta.getMeanTime(), 
                    ta.getMinTime(), ta.getMaxTime(), ta.getMinMean999Confidence(), ta.getMaxMean999Confidence());
        }
        System.out.println("|-----------|--------|------|------|------------------|");
    }
	
	//Main Testing method
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Creative Assignment- Main Test Analysis - by Matthew Novak");
		Date date = new Date();
		System.out.println("Executed on: " + date.toString());
		System.out.println("___________________________________________");
		printMeanExecutionTimeGrowthTable(10, 10000, 5000, 100000, 0.0, 100000.99);
	}

}

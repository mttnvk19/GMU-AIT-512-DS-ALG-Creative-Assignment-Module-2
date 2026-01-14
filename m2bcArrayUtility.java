/**
 * Array Utility Class
 * Creative Assignment 
 * @author Matthew Novak
 */
package m2bc;

//for rounding in the doubles for the tip prints
import java.util.concurrent.ThreadLocalRandom;

public class m2bcArrayUtility {
	
	/**
	 * In ArrayUtility class, create a public static method toString 
	 * that receives an array of int's, a start string, a separator string 
	 * and an end string. 
	 * It returns a String starting with the start string, 
	 * followed by the array elements separated by the separator 
	 * and ending with the end string.
	 * @param array - the array to be output
	 * @param start - the start of the output
	 * @param separator - the separator between elements
	 * @param end - the end of the string
	 */
	
	public static String toString(int[] array, String start, String separator, String end) {
		// initialize the result with the start of the output
		String result = start;
		// add all the elements separated by the separator
		boolean needSeparator = false;
		for (int elem: array) {
			if (needSeparator) result += separator;
			result += elem;
			needSeparator = true;
		}
		// end  with the end of the output
		result += end;
		// return the results
		return result;
	}
	
	public static String toStringLong(long[] array, String start, String separator, String end) {
		// initialize the result with the start of the output
		String result = start;
		// add all the elements separated by the separator
		boolean needSeparator = false;
		for (long elem: array) {
			if (needSeparator) result += separator;
			result += elem;
			needSeparator = true;
		}
		// end  with the end of the output
		result += end;
		// return the results
		return result;
	}
	
	/**
	 * 
	 * @param array
	 * @param start
	 * @param separator
	 * @param end
	 * @return
	 */
	public static String toStringDouble(double[] array, String start, String separator, String end) {
	    StringBuilder sb = new StringBuilder(start);
	    boolean needSeparator = false;
	    for (double elem : array) {
	        if (needSeparator) sb.append(separator);
	        sb.append(String.format("$%.2f", elem)); // add $ and round to hundredths
	        needSeparator = true;
	    }
	    return sb.append(end).toString();
	}

	
	public static String toString(String[] a, String left, String sep, String right) {
	    if (a == null) return "null";
	    StringBuilder sb = new StringBuilder(left);
	    for (int i = 0; i < a.length; i++) {
	        if (i > 0) sb.append(sep);
	        sb.append(a[i] == null ? "null" : a[i]); // or quote: "\"" + a[i] + "\""
	    }
	    sb.append(right);
	    return sb.toString();
	}

	
	
	/**
	 * In ArrayUtility class, create a public static method equals that 
	 * receives two arrays of int's and returns true if they have the same 
	 * length and equal corresponding elements.
	 * 
	 */
	
	public static boolean equals(int[] a1, int[] a2) {
		if (a1.length!=a2.length) return false;
		for (int i=0; i<a1.length; i++) {
			if (a1[i]!=a2[i]) return false;
		}
		return true;
	}

	/**
	 * In ArrayUtility and ArrayUtilityTest, design, 
	 * implement and test a method named isSorted that checks 
	 * if an array of int-s is already sorted, 
	 * i.e. all the elements are in increasing order.
	 */
	
	public static boolean isSorted(int[] a) {
		for (int i=0; i<a.length-1; i++) {
			if (a[i]>a[i+1]) return false;
		}
		return true;	
	}
	
	/**
	 * 15. In ArrayUtility and ArrayUtilityTest, design, 
	 * implement and test a method named generateIntArray 
	 * that generates a random array with the provided length 
	 * having elements randomly generated between a minimum and maximum value, 
	 * including those values
	 */
	//for integer
	public static int[] generateIntArray(int length, int min, int max) {
		int[] array = new int[length];
		for (int i=0; i<length; i++) {
			array[i]=(int) (min+Math.random()*(1.0+max-min));
		}
		return array;
	}
	// for longs
	public static long[] generateLongArray(int length, long min, long max) {
		long[] array = new long[length];
		for (int i = 0; i<length; i++) {
			array[i]=(long) (min+Math.random()*(1.0+max-min));
		}
		return array;
	}
	// for doubles
	/**
	 * 
	 * @param length
	 * @param min
	 * @param max
	 * @return
	 */
	public static double[] generateDoubleArray(int length, double min, double max) {
		double[] array = new double[length];
		for (int i = 0; i<length; i++) {
			double val = ThreadLocalRandom.current().nextDouble(min, max);
			array[i]= Math.round(val*100.0)/100.0;
		}
		return array;
	}
	
	//for comparable objects
	public static String[] generateStringArray(int length, int minLen, int maxLen) {
	    if (minLen < 0 || maxLen < minLen) {
	        throw new IllegalArgumentException("Bad lengths: minLen=" + minLen + ", maxLen=" + maxLen);
	    }
	    String[] array = new String[length];
	    for (int i = 0; i < length; i++) {
	        int L = minLen + (int) Math.floor(Math.random() * (maxLen - minLen + 1)); // inclusive
	        char[] buf = new char[L];
	        for (int j = 0; j < L; j++) {
	            // lowercase a–z; change 26 and 'a' if you want a different alphabet
	            buf[j] = (char) ('a' + (int) Math.floor(Math.random() * 26));
	        }
	        array[i] = new String(buf);
	    }
	    return array;
	}

	
	//for comparable objects
	public static <T> boolean comparableObjects(T[] co1, T[] co2) {
		if (co1.length!=co2.length) return false;
		for (int i=0; i<co1.length; i++) {
			if (co1[i]!=co2[i]) return false;
		}
		return true;
	}

}

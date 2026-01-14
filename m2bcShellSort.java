/**
 * Shell sort class
 * creative assignment
 * @author Matthew Novak
 */

package m2bc;

public class m2bcShellSort {
	
	//for integers 
	public static void sort(int[] a) {
        // 3x+1 increment sequence:  1, 4, 13, 40, 121, 364, 1093, ... 
        int h = 1;
        while (h < a.length/3) 
            h = 3*h + 1; 
        
        while (h >= 1) {
            // h-sort the array
            for (int i = h; i < a.length; i++) {
                int temp = a[i];
                int j=i;
                for (; j >= h && temp<a[j-h]; j -= h) {
                    a[j]=a[j-h];
                }
                a[j]=temp;
            }
            h /= 3;
        }
    }
	
	//for longs
	public static void sort(long[] a) {
        // 3x+1 increment sequence:  1, 4, 13, 40, 121, 364, 1093, ... 
        int h = 1;
        while (h < a.length/3) 
            h = 3*h + 1; 
        
        while (h >= 1) {
            // h-sort the array
            for (int i = h; i < a.length; i++) {
                long temp = a[i];
                int j=i;
                for (; j >= h && temp<a[j-h]; j -= h) {
                    a[j]=a[j-h];
                }
                a[j]=temp;
            }
            h /= 3;
        }
    }
	
	//for doubles
	public static void sort(double[] a) {
        // 3x+1 increment sequence:  1, 4, 13, 40, 121, 364, 1093, ... 
        int h = 1;
        while (h < a.length/3) 
            h = 3*h + 1; 
        
        while (h >= 1) {
            // h-sort the array
            for (int i = h; i < a.length; i++) {
                double temp = a[i];
                int j=i;
                for (; j >= h && temp<a[j-h]; j -= h) {
                    a[j]=a[j-h];
                }
                a[j]=temp;
            }
            h /= 3;
        }
    }
	
	//for strings
	public static <T extends Comparable<? super T>> void sort(T[] a) {
	    int n = a.length;
	    int h = 1;
	    while (h < n / 3) h = 3 * h + 1;

	    while (h >= 1) {
	        for (int i = h; i < n; i++) {
	            T temp = a[i];
	            int j = i;
	            while (j >= h && temp.compareTo(a[j - h]) < 0) {
	                a[j] = a[j - h];
	                j -= h;
	            }
	            a[j] = temp;
	        }
	        h /= 3;
	    }
	}

}

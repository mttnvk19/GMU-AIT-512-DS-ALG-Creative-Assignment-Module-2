/**
 * Shell sort test
 * Creative Assignment
 * @author Matthew Novak
 */
package m2bc;

import java.util.Date;

public class m2bcShellSortTest {
	
public static void testShellSortDouble() {
		
		//length of 0
		double[] a0 = m2bcArrayUtility.generateDoubleArray(0, 0.0, 20.99);
		System.out.printf("Random array of 0 tips, from $0.00 to $20.99: \n%s\n",
				m2bcArrayUtility.toStringDouble(a0, "{", ", ", "}"));
		m2bcShellSort.sort(a0);
		System.out.printf("Sorted array of tips : \n%s\n",
				m2bcArrayUtility.toStringDouble(a0, "{", ", ", "}"));
		System.out.println("-----------------------------------------------------------");
		
		//length of 1
		double[] a1 = m2bcArrayUtility.generateDoubleArray(1, 0.0, 20.99);
		System.out.printf("Random array of 1 tip, from $0.00 to $20.99: \n%s\n",
				m2bcArrayUtility.toStringDouble(a1, "{", ", ", "}"));
		m2bcShellSort.sort(a1);
		System.out.printf("Sorted array : \n%s\n",
				m2bcArrayUtility.toStringDouble(a1, "{", ", ", "}"));
		System.out.println("-----------------------------------------------------------");
		
		//length of 2
		double[] a2 = m2bcArrayUtility.generateDoubleArray(2, 0.0, 20.99);
		System.out.printf("Random array of 2 tips, from $0.00 to $20.99: \n%s\n",
				m2bcArrayUtility.toStringDouble(a2, "{", ", ", "}"));
		m2bcShellSort.sort(a2);
		System.out.printf("Sorted array of tips : \n%s\n",
				m2bcArrayUtility.toStringDouble(a2, "{", ", ", "}"));
		System.out.println("-----------------------------------------------------------");
		
		double[] a5 = m2bcArrayUtility.generateDoubleArray(5, 0.0, 20.99);
		System.out.printf("Random array of 5 tips, from $0.00 to $20.99: \n%s\n",
				m2bcArrayUtility.toStringDouble(a5, "{", ", ", "}"));
		m2bcShellSort.sort(a5);
		System.out.printf("Sorted array of tips : \n%s\n",
				m2bcArrayUtility.toStringDouble(a5, "{", ", ", "}"));
		System.out.println("-----------------------------------------------------------");
		
		//length of 10
		double[] a10 = m2bcArrayUtility.generateDoubleArray(10, 0.0, 20.99);
		System.out.printf("Random array of 10 tips, from $0.00 to $20.99: \n%s\n",
				m2bcArrayUtility.toStringDouble(a10, "{", ", ", "}"));
		m2bcShellSort.sort(a10);
		System.out.printf("Sorted array of tips : \n%s\n",
				m2bcArrayUtility.toStringDouble(a10, "{", ", ", "}"));
		System.out.println("-----------------------------------------------------------");
		
	}

//Main test
	public static void main(String[] args) {
		System.out.println("Creative Assignment - by Matthew Novak");
		Date date = new Date();
		System.out.println("Executed on: " + date.toString());
		System.out.println("___________________________________________");
		System.out.println("Generating and sorting varying amounts of tips recieved");
		System.out.println("---------------------------------------------------------");
		testShellSortDouble();
	}

}

/**
 * Fixed Capacity Bag Class
 * Creative Assignment
 * @author Matthew Novak
 */

package m2bc;

import java.util.Iterator;


public class m2bcFixedCapacityBag<Item> implements m2bcBag<Item> {
	
	/**
     * The array of elements stored in the bag.
     */
    private final Item[] elements;

    /**
     * The current number of elements stored in the bag.
     */
    private int numberOfElements;

    /**
     * Creates an empty bag with the given capacity
     * 
     * @param capacity - the maximum capacity of the bag
     */
    @SuppressWarnings("unchecked")
    public m2bcFixedCapacityBag(int capacity) {
    	elements = (Item[]) new Object[capacity];
    	numberOfElements = 0;
    }
    /**
     * Check if the bag is empty. 
     * 
     * @return true for an empty bag (no element added)
     */
    @Override
    public void add(Item item) {
    	if (numberOfElements == elements.length)
    		throw new RuntimeException("Bag is full");
    	elements[numberOfElements] = item;
    	numberOfElements++;
    }
    /**
     * An <code>Iterator</code> over the elements in the bag 
     * will allow to test if there are more elements (with hasNext method) 
     * and will return the next element (with next method)
     * @return an <code>Iterator</code>
     */
    @Override
    public Iterator<Item> iterator() {
    	return new Iterator<Item>() {
    		int index = 0;
    		
    		@Override
    		public boolean hasNext() {
    			return index < numberOfElements;
    		}

    		@Override
    		public Item next() {
    			if (hasNext())
    				return elements[index++];
    			throw new RuntimeException("No more elements.");
    		}

    	};
    }
    /**
    * A bag may be printed with the format: [e1 e2 e3 ... ].
    * @return a String description of the bag.
    */
    @Override
	public String toString() {
		String result = "[";
		String separator = "";
		for (Item item : this) {
			result += separator + item.toString();
			separator = ", ";
		}
		result += "]";
		return result;
	}
	@Override
	public int size() {
		// TODO Auto-generated method stub
		return numberOfElements;
	}
	/**
	 * Check if the Bag contains a single element (one thing in the bag).
	 * 
	 * @return true if the Bag contains a single element
	 */
	//@Override
	//public boolean isSingleton() {
		//// Check and return true if the bag has exactly one element 
		//return numberOfElements == 1;
	//}   
	
	/**
     * Return the capacity of this bag.
     * @return the capacity of this bag as an int.
     */
    protected int getCapacity() {
        return elements.length;
    }
}

		
		

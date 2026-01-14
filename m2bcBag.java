/**
 * Bag Interface
 * Creative Assignment
 * @author Matthew Novak
 */

package m2bc;

public interface m2bcBag<Item> extends Iterable<Item> {
	
		/**
		 * adds the item to the bag. Duplicated items are allowed.
		 * @param item an item to be added.
		 */
		public void add(Item item);
		
		/**
	     * Check if the bag is empty
	     * Default implementation checking the size()
	     * 
	     * @return true for an empty bag (no element added)
	     */
	    default public boolean isEmpty() {
	    	return size()==0;
	    }
		
		/**
		 * The number of elements in a bag is named the size of the bag. An empty bag has no elements, size zero.
		 * @return the size of the bag 
		 */
		public int size();
		
		/**
		 * Check if the Bag contains a single element (i.e. has the size one).
		 * Default implementation checking the size()
		 * 
		 * @return true if the Bag contains a single element
		 */
		default public boolean isSingleton() {
			return size()==1;
		}
		
		/**
		 * Creates a string representation of the bag, starting with the start string,
		 * ending with the end string and separating the items with the separator.
		 * @param start - included at the start of the representation
		 * @param end - included at the end of the representation
		 * @param separator - separating the elements
		 * @return the generated String
		 */
		default public String toString(String start, String end, String separator) {
			String result = start;
			boolean needSeparator = false;
			for (Item item: this) {
				if (needSeparator) {
					result += separator;
				} else {
					needSeparator = true;
				}
				result += item.toString();
			}
			result += end;
			return result;
		}
	}


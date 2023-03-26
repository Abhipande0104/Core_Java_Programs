package dayy18;

public class Collections 
{
	
}

/*
 * Collections
 * 
 * --array size is fixed. size can not be increased dynamically
 * --in actual development scenario, same type of objects need to be processed
 * 
 * --data is obtained from data sources like files or databases
 * --values obtained can be single or multiple objects
 * 
 * Collection
 * 		List	Queue	set 	map
 * 
 * queue 	dequeue
 * set	sortedSet	NavigableSet
 * map	sortedMap	NavigableMap
 * Iterator
 * 
 * Collections Interface--java.util package
 * 
 * List
 * 	-represents a collection of objects that is accessed by an index.
 * 	-an ordered collection
 * Set
 * 	-represents a collection taht contains no duplicate elements
 * 	-orer is not fixed
 * Map
 * 	-represents a collection of key-value pair
 * Queue
 * 	-represents a collection designed for holding elements prior to processing
 * Iterator
 * 	-supports a simple iteration over collection.
 * Comparator
 * 	-comparision function, which imposes a total ordering on some collections
 * 	 of objects
 * 
 * List Interface
 * --ordered collection
 * --may contain duplicates
 * --implemented by classes
 * 
 * ArrayList
 * 		resizable array implementation of the List Interface.
 * LinkedList
 * 		doubly-linked list implementation of the list
 * Vector
 * 		the vector class implements a growable array of objects
 * Stack
 * 		the stack class is subclass of vector 
 * 
 * Set Interface
 * --collection of unique elements
 * --no duplicae elements allowed
 * --collection not in any particular order(random)
 * --implemented by the hashset
 * 
 * SortedSet Interface
 * --a sorted set is a set
 * --used for sorting purpose
 * --the elements are ordered using their natural ordering
 * --all elements inserted into a sorted set must implement the 
 *   java.lang.comparable interface
 * --implemented by the TreeSet
 * 
 * NavigableSet Interface
 * --a navigable set is sorted set
 * --used for searching purpose
 * --a navigableSet can be accessed in the ascending or descending order
 * --implemented by the treeSet.
 * 
 * Map Interface
 * --map associates key with values
 * --map can not contain duplicate keys
 * --key and value can be of any java class or interface type
 * --one key can have at most one value
 * --implemented by the HashMap and Hashtable
 * 
 * sortedMap Interface
 * --a sorted map is a map
 * --used for the sorting purpose
 * --the map is ordered according to the natural ordering of its keys
 * --all keys inserted into a sorted map must implement the java.lang.comparable
 *   interface
 * --implemented by the TreeMap
 * 
 * NavigableMap Interface
 * --a navigable map is sorted map
 * --used for searching purpose
 * --a NavigableMap can be accessed in the oscending or descending order
 * --in NavigableMap we use methods to return the key-value pair
 * --implemented by the TreeMap
 * 
 * Queue interface
 * --a queue is a collection for holding elements prior to processing
 * --besides basic collections operations, queues provide additional 
 * 	 insertion, removal and inspection operations
 * --queues typically but not necessarily, order elements in a FIFO manner
 * --implemented by LinkedList and PriorityQueue.
 * 
 *  Iterator Interface
 *  --allow users to visit the elements in the collection one by one
 *  --This interface contains 3 methods
 *  	-Object next()
 *  	-boolean hasNext()
 *  	-void remove()
 * 
 */

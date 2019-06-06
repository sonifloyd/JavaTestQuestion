# output
import java.util.*; 
  
public class stack 
{ 
    public static void main(String[] args) 
    { 
        List<String> list = new LinkedList<>(); 
        list.add("Geeks"); 
        list.add("for"); 
        list.add("Geeks"); 
        list.add("GeeksforGeeks"); 
        Iterator<Integer> iter = list.iterator(); 
  
        while (iter.hasNext()) 
            System.out.printf(iter.next() + " "); 
  
        System.out.println(); 
    } 
} 
a) Geeks for Geeks GeeksforGeeks
b) GeeksforGeeks Geeks for Geeks
c) Runtime Error
d) Compilation Error

Ans. (d)
Explanation: An iterator made for iterating over Integer cannot be used to iterate over String data type. 
Corrected program
#  output
import java.util.*; 
  
public class hashSet 
{ 
    public static void main(String[] args) 
    { 
        HashSet<String> hashSet = new HashSet<>(); 
        hashSet.add("Geeks"); 
        hashSet.add("for"); 
        hashSet.add("Geeks"); 
        hashSet.add("GeeksforGeeks"); 
  
        System.out.println(hashSet); 
  
    } 
} 
a) [Geeks, for, Geeks, GeeksforGeeks]
b) [GeeksforGeeks, Geeks, for]
Ans. (b)
Explanation: A HashSet is a set and as a set doesn’t contain any duplicate element therefore,
the string ‘Geeks’ appears only once in the output.
# output
import java.util.*; 

public class linkedList 
{ 
	public static void main(String[] args) 
	{ 
		List<String> list1 = new LinkedList<>(); 
		list1.add("Geeks"); 
		list1.add("for"); 
		list1.add("Geeks"); 
		list1.add("GFG"); 
		list1.add("GeeksforGeeks"); 

		List<String> list2 = new LinkedList<>(); 
		list2.add("Geeks"); 

		list1.removeAll(list2); 

		for (String temp : list1) 
			System.out.printf(temp + " "); 

		System.out.println(); 
	} 
} //for GFG GeeksforGeeks 
Explanation: list1.removeAll(list2) function deletes all the occurance of string in list2 from list1.
Here, the string ‘Geeks’ appears in list2, so all the nodes of linked list in list1 that contains ‘Geeks’ as 
its data is removed from list1.
# output
import java.util.*; 

public class Treeset 
{ 
	public static void main(String[] args) 
	{ 
		TreeSet<String> treeSet = new TreeSet<>(); 

		treeSet.add("Geeks"); 
		treeSet.add("for"); 
      treeSet.add("abc");
		treeSet.add("Geeks"); 
		treeSet.add("GeeksforGeeks"); 
      treeSet.add("ab"); 

		for (String temp : treeSet) 
			System.out.printf(temp + " "); 

		System.out.println("\n"); 
	} 
} 
//Geeks GeeksforGeeks ab abc for 
Explanation: A TreeSet sorts the data in ascending order that is inserted in it. Therefore, the output
string contains all the strings arranged in ascending order. A TreeSet does not contain any duplicate element 
as it is a set. So in the output, 
there is just a single occurance of string ‘Geeks’.
# output
import java.util.*; 
  
public class priorityQueue 
{ 
    public static void main(String[] args) 
    { 
        PriorityQueue<Integer> queue = 
                            new PriorityQueue<>(); 
        queue.add(11); 
        queue.add(10); 
        queue.add(22); 
        queue.add(5); 
        queue.add(12); 
        queue.add(2); 
  
        while (queue.isEmpty() == false) 
            System.out.printf("%d ", queue.remove()); 
  
        System.out.println("\n"); 
    } 
} 
a) 11 10 22 5 12 2
b) 2 12 5 22 10 11
c) 2 5 10 11 12 22
d) 22 12 11 10 5 2
Ans. (c)
Explanation: Priority queue always outputs the minimum element from the queue when remove() method is called,
no matter what the sequence of input is.






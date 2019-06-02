# program
class First 
{ 
    public First() {  System.out.println("a"); } 
} 
   
class Second extends First 
{ 
    public Second()  {  System.out.println("b"); } 
} 
   
class Third extends Second 
{ 
    public Third()   {  System.out.println("c"); } 
} 
   
public class MainClass 
{ 
    public static void main(String[] args) 
    { 
        Third c = new Third(); 
    } 
} 
Output:

a
b
c
While creating a new object of ‘Third’ type, before calling the default constructor of Third class, the default 
constructor of super class is called i.e, Second class and then again before the default constructor of super class,
default constructor of First class is called.
And hence gives such output.

# p2
class First 
{ 
    int i = 10; 
   
    public First(int j) 
    { 
        System.out.println(i);  
        this.i = j * 10; 
    } 
} 
   
class Second extends First 
{ 
    public Second(int j) 
    { 
        super(j);  
        System.out.println(i);  
        this.i = j * 20; 
        
    } 
} 
   
public class MainClass 
{ 
    public static void main(String[] args) 
    { 
        Second n = new Second(20);  
        System.out.println(n.i); 
    } 
} 
Output:

10
200
400

Explanation:
Since in ‘Second’ class it doesn’t have its own ‘i’, the variable is inherited from the super class. Also,
the constructor of parent is called when we create an object of Second.

#p3
import java.util.*;  
class I  
{ 
    public static void main (String[] args)  
    { 
        Object i = new ArrayList().iterator();  
        System.out.print((i instanceof List) + ", ");  
        System.out.print((i instanceof Iterator) + ", ");  
        System.out.print(i instanceof ListIterator);  
    }  
} 
Output:

false, true, false
Explanation:
The iterator() method returns an iterator over the elements in the list in proper sequence, 
it doesn’t return a List or a ListIterator object. A ListIterator can be obtained by invoking the listIterator method.

# p4
class ThreadEx extends Thread 
{ 
    public void run() 
    { 
        System.out.print("Hello..."); 
    } 
    public static void main(String args[]) 
    { 
        ThreadEx T1 = new ThreadEx(); 
        T1.start(); 
        T1.stop(); 
        T1.start(); 
    } 
} 
Output:

Run Time Exception

Explanation:
Exception in thread “main” java.lang.IllegalThreadStateException at java.lang.Thread.start
Thread cannot be started twice.




# 
public class Test implements Runnable 
{ 
	public void run() 
	{ 
		System.out.printf("%d",3); 
	} 
	public static void main(String[] args) throws InterruptedException 
	{ 
		Thread thread = new Thread(new Test()); 
        System.out.println(".....");
		thread.start(); 
        System.out.println(".....");
		System.out.printf("%d",1); 
        System.out.println(".....");
		thread.join(); 
        System.out.println(".....");
		System.out.printf("%d",2); 
	} 

} 

.....
.....
1.....
3.....
2
a) 123
b) 213
c) 132
d) 321

Ans: (c)

Explanation: The parent thread waits for the newly created thread to complete using join. join() method allows one thread
to wait until another thread completes its execution. So, parent thread prints 1 and wait for the child thread to complete. 
The child thread prints 3 on console and finally the parent thread prints 2.

# public class Test 
{ 
    private static int value = 20; 
    public int s = 15; 
    public static int temp = 10;   
    public static class Nested 
    {   
      private void display() 
      { 
          System.out.println(temp + s + value); 
      }   
    }   
       
    public static void main(String args[]) 
    {   
      Test.Nested inner = new Test.Nested();   
      inner.display();   
    }  
} 
a) Compilation error
b) 1020
c) 101520
d) None of the above



Ans: (a)
Explanation: A non-static variable can not be accessed in static nested inner class. 
“Nested” cannot access non-static variables[variable s in this case]. Therefore the error:

10: error: non-static variable s cannot be referenced from a static context
            System.out.println(temp + s + value);
            
            # 
            import java.io.*; 
public class Test 
{ 
    public void display() throws IOException 
    { 
        System.out.println("Test"); 
    } 
  
} 
  
class Derived extends Test 
{ 
    public void display() throws IOException 
    { 
        System.out.println("Derived"); 
    } 
    public static void main(String[] args) throws IOException 
    { 
        Derived object = new Derived(); 
        object.display(); 
    } 
} 
a) Test
b) Derived
c) Compilation error
d) Runtime error

Ans: (b)
Explanation: If the superclass method declares an exception, subclass overridden method can declare same, 
subclass exception or no exception but cannot declare parent exception.

#
public class Test extends Thread 
{ 
    public void run() 
    { 
        System.out.printf("Test "); 
    } 
    public static void main(String[] args) 
    { 
        Test test = new Test(); 
        test.run(); 
        test.start(); 
    } 
} 
a) Compilation error
b) Runtime error
c) Test
d) Test Test

Ans: (d)
Explanation: test.run() executes the run method. test.start() creates a new thread and executes the overriden run 
method of the Thread class. The Thread.start() method always starts a new thread, and the entry point for this thread is 
the run() method. If you are calling run() directly it will execute in the same thread BUT it is always recommendable 
logically calling Thread.start() to
start a new thread of execution followed by the run() method.

# public class Test extends Thread 
{ 
    public static void main(String[] args) 
    { 
        String a = "GeeksforGeeks"; 
        String b = new String(a); 
        int value = 0; 
        value = (a==b) ? 1:2; 
        if(value == 1) 
        { 
            System.out.println("GeeksforGeeks"); 
        } 
        else if(value == 2) 
        { 
            System.out.println("Geeks for Geeks"); 
        } 
        else
        { 
            System.out.println("GFG"); 
        } 
          
    } 
} 
a) GeeksforGeeks
b) Geeks for Geeks
c) GFG
d) None of the above

Ans: (b) 
Explanation: == operator checks if two variable refer to the same object. Here a and b

refers to two different objects. ?: is another form of if else statement that could be read as, condition : if 
true then do this : else do this.


# public class Test 
{ 
    try
    { 
        public Test() 
        { 
            System.out.println("GeeksforGeeks"); 
            throw new Exception(); 
        } 
    } 
    catch(Exception e) 
    { 
        System.out.println("GFG"); 
    } 
    public static void main(String[] args) 
    { 
        Test test = new Test(); 
    } 
} 
a) GeeksforGeeks
b) GFG
c) Compilation error
d) None of the above

Ans: (c)
Explanation: Constructors cannot be enclosed in try/catch block.

# public interface Test 
{ 
    public int calculate(); 
    protected interface NestedInterface 
    { 
        public void nested(); 
    } 
} 
a) Compile time error due to NestedInterface
b) Compile time error due to access modifier of NestedInterface
c) No Compile time error
d) NestedInterface cannot hold any function declaration.

Ans: (b)
Explanation: Access modifier of NestedInterface can only be public. Therefore the error:


# Which of the following are true about constructor declaration?

a) Constructors can be declared final.
b) Constructors can be surrounded by try/catch blocks.
c) Constructor cannot throw exception.
d) Constructors can hold synchronized code(so that each thread can access constructor sequentially).

Ans: (d)
Explanation: Constructors allows a sequential access of data between threads.






                                      ^

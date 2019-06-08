# programe1
public class RuntimePolymorphism 
{ 
    public static void main(String[] args) 
    { 
        A a = new B(); 
        B b = new B(); 
          
        System.out.println(a.c + " " + a.getValue()  
            + " " + b.getValue() + " " + b.getSuperValue()); 
    } 
} 
  
class A 
{ 
    protected char c = 'A'; 
    char getValue() 
    { 
        return c; 
    } 
} 
  
class B extends A 
{ 
    protected char c = 'B'; 
    char getValue() 
    { 
        return c; 
    } 
    char getSuperValue() 
    { 
        return super.c; 
    } 
} 
Output: A B B A
Explanation: No magic of polymorphism here; the instance variable c from A is simply hidden in B
– a.c is ‘A’ because it is so set in the class A
– a.getValue() returns ‘B’ because the object is of type B

# Program 2 :
public class RuntimePolymorphism 
{ 
    public static void main(String[] args) 
    { 
        A a = new B(); 
        B b = new B(); 
        System.out.println(a.c + " " + a.getValue() +  
            " " + b.getValue() + " " + b.getSuperValue()); 
    } 
} 
  
class A 
{ 
    protected char c = 'A'; 
    char getValue() 
    { 
        return c; 
    } 
} 
class B extends A 
{ 
    protected char c = 'B'; 
    char getSuperValue() 
    { 
        return super.c; 
    } 
} 
Output: A A A A
Explanation: Concept of polymorphism for methods cannot be used here, since in class B there is no function overloading a method in class A. Refer run-time polymorphism for more details

# Program 3 :
class test 
{ 
    public static int y = 0; 
} 
  
class HasStatic 
{ 
    private static int x = 100; 
      
    public static void main(String[] args) 
    { 
        HasStatic hs1 = new HasStatic(); 
        hs1.x++; 
          
        HasStatic hs2 = new HasStatic(); 
        hs2.x++; 
          
        hs1 = new HasStatic(); 
        hs1.x++; 
          
        HasStatic.x++; 
        System.out.println("Adding to 100, x = " + x); 
          
        test t1 = new test(); 
        t1.y++; 
          
        test t2 = new test(); 
        t2.y++; 
          
        t1 = new test(); 
        t1.y++; 
          
        System.out.print("Adding to 0, "); 
        System.out.println("y = " + t1.y + " " + t2.y + " " + test.y); 
    } 
} 
Output:

Adding to 100, x = 104
Adding to 0, y = 3 3 3
Explanation: Properties of static are shown in this example. When a variable is declared as static, then a single copy of variable is created and shared among all objects at class level. Static variables are, essentially, global variables. All instances of the class share the same static variable. See more at: static keyword

# Program 4 :
public class Except  
{ 
    public static void main(String[] args)  
    {     
        try 
        { 
            throw new Error(); 
        } 
        catch (Error e)  
        { 
            try 
            { 
                throw new RuntimeException(); 
            } 
            catch (Throwable t)  
            { 
  
            } 
        } 
            System.out.println("phew"); 
    } 
} 
Output: phew
Explanation: Its legal to throw and handle errors and runtime exceptions. RuntimeException is a sub-subclass of Throwable. See exceptions for more details

# Program 5 :
public class Boot  
{ 
    static String s; 
    static
    { 
        s = ""; 
    } 
    { 
        System.out.println("GeeksforGeeks "); 
    } 
    static
    { 
        System.out.println(s.concat("practice.GeeksforGeeks ")); 
    }  
    Boot()  
    {  
        System.out.println(s.concat("Quiz.GeeksforGeeks")); 
    } 
    public static void main(String[] args)  
    { 
        new Boot(); 
        System.out.println("Videos.GeeksforGeeks"); 
    } 
} 
Output:

practice.GeeksforGeeks 
GeeksforGeeks 
Quiz.GeeksforGeeks
Videos.GeeksforGeeks
Explanation: static init blocks run before instance init blocks (in the order in which they appear, respectively). 
The order of initialization constructors and initializer
block doesn’t matter, initializer block is always executed before constructor



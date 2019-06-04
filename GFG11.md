# public class Base 
{ 
    private int data; 
  
    public Base() 
    { 
        data = 5; 
    } 
  
    public int getData() 
    { 
        return this.data; 
    } 
} 
  
class Derived extends Base 
{ 
    private int data; 
    public Derived() 
    { 
        data = 6; 
    } 
    private int getData() 
    { 
        return data; 
    } 
  
    public static void main(String[] args) 
    { 
        Derived myData = new Derived(); 
        System.out.println(myData.getData()); 
    } 
} 
a) 6
b) 5
c) Compile time error
d) Run time error

Answer (c)
Explanation: When overriding a method of superclass, the method declaration in subclass cannot be more 
restrictive than that declared in the superclass.

# 
public class Test 
{ 
    private int data = 5; 
  
    public int getData() 
    { 
        return this.data; 
    } 
    public int getData(int value) 
    { 
        return (data+1); 
    } 
    public int getData(int... value) 
    { 
        return  (data+2); 
    } 
  
    public static void main(String[] args) 
    { 
        Test temp = new Test(); 
        System.out.println(temp.getData(7, 8, 12)); 
    } 
} 
a) Either Compile time or Runtime error
b) 8
c) 10
d) 7

Answer (d)
Explanation : (int… values) is passed as parameter to a method when you are not aware of the number of input parameter 
but know that the type of parameter(in this case it is int). When a new object is made in the main method, variable data 
is initialized to 5. A call to getData() method with attributes (7, 8 ,12), makes a call to the third getData() method,
which increments the value of data variable by 2 and return 7.


# 
public class Base 
{ 
    private int multiplier(int data) 
    { 
        return data*5; 
    } 
} 
  
class Derived extends Base 
{ 
    private static int data; 
    public Derived() 
    { 
        data = 25; 
    } 
    public static void main(String[] args) 
    { 
        Base temp = new Derived(); 
        System.out.println(temp.multiplier(data)); 
    } 
} 
a) 125
b) 25
c) Runtime error
d) Compile time error

Answer (d)
Explanation: Since the method multiplier is marked as private,
it isn’t inherited and therefore is not visible to the Derived.


# Question 4:
Which of the following is FALSE about finally block?
a) For each try block, there can be only 1 finally block.
b) finally block will not be executed if program exits by calling System.exit();
c) If an exception is not handled in the catch statement, before terminating the program, JVM executes the finally block
d) finally block contains important code segment and so the code inside finally block is executed with/without 
the presence of try block in java code.

Answer (d)
Explanation:Statement (d) is false because finally blocks can exist only if it succeeds try or a catch block. 
Using a finally block without try block would give a compile time error.

# 
import java.io.IOException; 
import java.util.EmptyStackException; 
  
public class newclass 
{ 
    public static void main(String[] args) 
    { 
        try
        { 
            System.out.printf("%d", 1); 
            throw(new Exception()); 
        } 
        catch(IOException e) 
        { 
            System.out.printf("%d", 2); 
        } 
        catch(EmptyStackException e) 
        { 
            System.out.printf("%d", 3); 
        } 
        catch(Exception e) 
        { 
            System.out.printf("%d", 4); 
        } 
        finally
        { 
            System.out.printf("%d", 5); 
        } 
    } 
} 
a) 12345
b) 15
c) 135
d) 145

Answer (d)
Explanation: The catch statements are written in the order: more specific to more general. In the code above, 
a new exception of type Exception is thrown. First the code jumps to first catch block to look for exception handler. 
But since the IOException is not
of the same type it is moves down to second catch block and finally to the third, where
the exception is caught and 4 is printed. Therefore, the answer is 145, as the order
of execution in terms of blocks is: try->catch->finally.
#
public class javaclass 
{ 
    static
    { 
        System.out.printf("%d", 1); 
    } 
    static
    { 
        System.out.printf("%d", 2); 
    } 
    static
    { 
        System.out.printf("%d", 3); 
    } 
    private static int myMethod() 
    { 
        return 4; 
    } 
    private int function() 
    { 
        return 5; 
    } 
  
    public static void main(String[] args) 
    { 
        System.out.printf("%d", (new javaclass()).function() + myMethod()); 
    } 
} 
a) 123
b) 45
c) 12345
d) 1239

Answer (d)
Explanation:static blocks in Java are executed even before the call to main is made by the compiler. 
In the main method, a new object of javaclass is made and its function() method is called which return 4.
Number 5 is returned by a call to static function
myMethod(). 4+5 = 9. Therefore, the output of the program is 1239, because 123 is printed


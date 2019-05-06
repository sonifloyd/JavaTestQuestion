# What will be the output of the program?

class Exc0 extends Exception { } 
class Exc1 extends Exc0 { } /* Line 2 */
public class Test 
{  
    public static void main(String args[]) 
    { 
        try 
        {  
            throw new Exc1(); /* Line 9 */
        } 
        catch (Exc0 e0) /* Line 11 */
        {
            System.out.println("Ex0 caught"); 
        } 
        catch (Exception e) 
        {
            System.out.println("exception caught");  
        } 
    } 
}
ans- A.	Ex0 caught
B.	exception caught
C.	Compilation fails because of an error at line 2.
D.	Compilation fails because of an error at line 9.
An exception Exc1 is thrown and is caught by the catch statement on line 11. The code is executed in this block. 
There is no finally block of code to execute.
# What will be the output of the program?

public class MyProgram 
{
    public static void main(String args[])
    {
        try 
        {
            System.out.print("Hello world ");
        }
        finally 
        {
            System.out.println("Finally executing ");
        }
    }
}// Hello world Finally executing
Finally clauses are always executed. The program will first execute the try block, printing Hello world, and will then 
execute the finally block, printing Finally executing.
# What will be the output of the program?

public class X 
{  
    public static void main(String [] args) 
    {
        try 
        {
            badMethod(); /* Line 7 */
            System.out.print("A"); 
        } 
        catch (Exception ex) /* Line 10 */
        {
            System.out.print("B"); /* Line 12 */
        } 
        finally /* Line 14 */
        {
            System.out.print("C"); /* Line 16 */
        }  
        System.out.print("D"); /* Line 18 */
    } 
    public static void badMethod() 
    {
        throw new RuntimeException(); 
    } 
}//BCD
(1) A RuntimeException is thrown, this is a subclass of exception.

(2) The exception causes the try to complete abruptly (line 7) therefore line 8 is never executed.

(3) The exception is caught (line 10) and "B" is output (line 12)

(4) The finally block (line 14) is always executed and "C" is output (line 16).

(5) The exception was caught, so the program continues with line 18 and outputs "D".
# What will be the output of the program?

public class X 
{ 
    public static void main(String [] args) 
    {
        try 
        {
            badMethod();  
            System.out.print("A"); 
        }  
        catch (Exception ex) 
        {
            System.out.print("B"); 
        }  
        finally 
        {
            System.out.print("C"); 
        }  
        System.out.print("D"); 
    }  
    public static void badMethod() {} 
} //ACD	
There is no exception thrown,
# hat will be the output of the program?

public class Test 
{  
    public static void aMethod() throws Exception 
    {
        try /* Line 5 */
        {
            throw new Exception(); /* Line 7 */
        } 
        finally /* Line 9 */
        {
            System.out.print("finally "); /* Line 11 */
        } 
    } 
    public static void main(String args[]) 
    {
        try 
        {
            aMethod();  
        } 
        catch (Exception e) /* Line 20 */
        {
            System.out.print("exception "); 
        } 
        System.out.print("finished"); /* Line 24 */
    } 
}//finally exception finished	
This is what happens:

(1) The execution of the try block (line 5) completes abruptly because of the throw statement (line 7).

(2) The exception cannot be assigned to the parameter of any catch clause of the try statement therefore the finally block is executed (line 9) and "finally" is output (line 11).

(3) The finally block completes normally, and then the try statement completes abruptly because of the throw statement (line 7).

(4) The exception is propagated up the call stack and is caught by the catch in the main method (line 20). This prints "exception".

(5) Lastly program execution continues, because the exception has been caught, and "finished" is output (line 24).

# What will be the output of the program?

public class Foo 
{  
    public static void main(String[] args) 
    {
        try 
        { 
            return; 
        } 
        finally 
        {
            System.out.println( "Finally" ); 
        } 
    } 
}//Finally
# What will be the output of the program?

try 
{ 
    int x = 0; 
    int y = 5 / x; 
} 
catch (Exception e) 
{
    System.out.println("Exception"); 
} 
catch (ArithmeticException ae) 
{
    System.out.println(" Arithmetic Exception"); 
} 
System.out.println("finished");
Compilation fails because ArithmeticException has already been caught. ArithmeticException is a subclass of 
java.lang.Exception, by time the ArithmeticException has been specified it has already been caught by the Exception class.

If ArithmeticException appears before Exception, then the file will compile. When catching exceptions the more specific
exceptions must be listed before the more general (the subclasses must be caught before the superclasses).
# What will be the output of the program?

public class X 
{  
    public static void main(String [] args) 
    {
        try 
        {
            badMethod();  
            System.out.print("A"); 
        }  
        catch (Exception ex) 
        {
            System.out.print("B");  
        } 
        finally 
        {
            System.out.print("C"); 
        } 
        System.out.print("D"); 
    }  
    public static void badMethod() 
    {
        throw new Error(); /* Line 22 */
    } 
}// C is printed before exiting with an error message.
Error is thrown but not recognised line(22) because the only catch attempts to catch an Exception and Exception is not a superclass of Error. Therefore only the code in the finally statement 
can be run before exiting with a runtime error (Exception in thread "main" java.lang.Error).
# What will be the output of the program?

public class X 
{  
    public static void main(String [] args) 
    {
        try 
        {
            badMethod();  
            System.out.print("A");  
        } 
        catch (RuntimeException ex) /* Line 10 */
        { 
            System.out.print("B"); 
        } 
        catch (Exception ex1) 
        { 
            System.out.print("C"); 
        } 
        finally 
        {
            System.out.print("D"); 
        } 
        System.out.print("E"); 
    } 
    public static void badMethod() 
    { 
        throw new RuntimeException(); 
    } 
}//BDE
A Run time exception is thrown and caught in the catch statement on line 10.
All the code after the finally statement is run because the exception has been caught.
# What will be the output of the program?

public class RTExcept 
{
    public static void throwit () 
    {
        System.out.print("throwit ");
        throw new RuntimeException();
    }
    public static void main(String [] args) 
    {
        try 
        {
            System.out.print("hello ");
            throwit();
        }
        catch (Exception re ) 
        {
            System.out.print("caught ");
        }
        finally 
        {
            System.out.print("finally ");
        }
        System.out.println("after ");
    }
}// hello throwit caught finally after	
The main() method properly catches and handles the RuntimeException in the catch block, 
finally runs (as it always does), and then the code returns to normal.


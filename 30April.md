___throwable ___ is a superclass of all exception classes.
If an exception is generated in try block , then it is caught in __catch__ block
Which keyword is used to monitor statement for exception?( try keyword)
The exception class is in _java.lang___ package
Which of the following statements are valid array declaration? (A) int number(); (B) float average[]; (C) double[] marks; (D) counter int[];

B &c
Which of these methods is used to obtain value of invoking object as a long? ( long longvalue)
In case of multiple catch blocks,_ ans The superclass exception can't be caught first
Which method is used to print the description of the exception? Ans printStackTrace()
# What is the output of following try catch block try

{
int i;
return;
}
catch(Exception e)
{
System.out.println('Hello Indiaâ€);
}
finally
{
System.out.println('Hello Morbiâ€);
}
output
Hello Morbi

# What will be the output of the program? 
public class Foo { public static void main(String[] args) { 
try {
return; } 
finally {
System.out.println( "Finally" ); } } }
output
Finally
# What will be the output of the program? public class Test { 
public static void aMethod() throws Exception { 
try /* Line 5 */ { 
throw new Exception(); /* Line 7 */ } 
finally /* Line 9 */ {
System.out.print("finally "); /* Line 11 */ } } 
public static void main(String args[]) { 
try { aMethod(); }
catch (Exception e) /* Line 20 */ { 
System.out.print("exception "); } 
System.out.print("finished"); /* Line 24 */ } }
output 
finally exception finished
# What will be the output of the program? 
public class X { 
public static void main(String [] args) {
try { badMethod(); 
System.out.print("A"); } 
catch (Exception ex) { 
System.out.print("B");
} 
finally {
System.out.print("C");
}
System.out.print("D"); 
} 
public static void badMethod() 
{ throw new Error(); /* Line 22 */
}
}
output
C is printed before exiting with an error message
# Which of these class is used to make a thread?( Thread)
# Which of these interface is implemented by Thread class?( Runnable)
# Which function of pre defined class Thread is used to check weather current thread being checked is still running?
( isAlive()

# What is the output of this program?

classmultithreaded_programing{
        publicstaticvoidmain(String args[]){
            Thread t = Thread.currentThread();
            t.setName("New Thread");
            System.out.println(t);        
        }
    }
    output
    Thread[New Thread,5,main]


















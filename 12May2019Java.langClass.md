#  What will be the output of the program (in jdk1.6 or above)(dont understand)?

public class BoolTest 
{
    public static void main(String [] args) 
    {
        Boolean b1 = new Boolean("false");
        boolean b2;
        b2 = b1.booleanValue();
        if (!b2) 
        {
            b2 = true;
            System.out.print("x ");
        }
        if (b1 & b2) /* Line 13 */
        {
            System.out.print("y ");
        }
        System.out.println("z");
    }
}
A.	z
B.	x z// ans
C.	y z
D.	Compilation fails.
# What will be the output of the program?

String s = "hello"; 
Object o = s; 
if( o.equals(s) )
{
    System.out.println("A"); 
} 
else
{
    System.out.println("B"); 
} 
if( s.equals(o) )
{
    System.out.println("C"); 
} 
else
{ 
    System.out.println("D"); 
}// A
B
# What will be the output of the program?(Dont understand)

public class Test 
{ 
    public static void main(String[] args) 
    {
        final StringBuffer a = new StringBuffer(); 
        final StringBuffer b = new StringBuffer(); 

        new Thread() 
        { 
            public void run() 
            {
                System.out.print(a.append("A")); 
                synchronized(b) 
                { 
                    System.out.print(b.append("B")); 
                } 
            } 
        }.start(); 
            
        new Thread() 
        {
            public void run() 
            {
                System.out.print(b.append("C")); 
                synchronized(a) 
                {
                    System.out.print(a.append("D")); 
                } 
            } 
        }.start(); 
    } 
}
A.	ACCBAD
B.	ABBCAD
C.	CDDACB
D.	Indeterminate output// when u complie each time give different output

# What will be the output of the program?

public class ExamQuestion6 
{
    static int x; 
    boolean catch()
    {
        x++; 
        return true; 
    } 
    public static void main(String[] args)
    {
        x=0; 
        if ((catch() | catch()) || catch()) 
            x++; 
        System.out.println(x); 
    } 
}
A.	1
B.	2
C.	3
D.	Compilation Fails
Initially this looks like a question about the logical and logical shortcut operators "|" and "||" but on closer
inspection it should be noticed that the name of the boolean method in this code is "catch". "catch" is a reserved
keyword in the Java language and cannot be used as a method name. Hence Compilation will fail.

# What will be the output of the program?


String a = "ABCD"; 
String b = a.toLowerCase(); 
b.replace('a','d'); 
b.replace('b','c'); 
System.out.println(b);
A.	abcd// ans
B.	ABCD
C.	dccd
D.	dcba
String objects are immutable, they cannot be changed, in this case we are talking about the replace method which returns a new String object resulting from replacing all occurrences of oldChar in this string with newChar.

b.replace(char oldChar, char newChar);

But since this is only a temporary String it must either be put to use straight away i.e.

System.out.println(b.replace('a','d'));

Or a new variable must be assigned its value i.e.

String c = b.replace('a','d');

# What will be the output of the program?

String d = "bookkeeper";
d.substring(1,7);
d = "w" + d;
d.append("woo");  /* Line 4 */
System.out.println(d);
A.	wookkeewoo
B.	wbookkeeper
C.	wbookkeewoo
D.	Compilation fails.
In line 4 the code calls a StringBuffer method, append() on a String object.

# What will be the output of the program?

class Tree { } 
class Pine extends Tree { } 
class Oak extends Tree { } 
public class Forest1 
{ 
    public static void main (String [] args)
    { 
        Tree tree = new Pine(); 
        if( tree instanceof Pine ) 
            System.out.println ("Pine"); 
        else if( tree instanceof Tree ) 
            System.out.println ("Tree"); 
        else if( tree instanceof Oak ) 
            System.out.println ( "Oak" ); 
        else 
            System.out.println ("Oops "); 
    } 
}
A.	Pine
B.	Tree
C.	Forest
D.	Oops
//The program prints "Pine".
# what is output

public class Test138 
{ 
    public static void stringReplace (String text) 
    {
        text = text.replace ('j' , 'c'); /* Line 5 */// this is remains java cant change
    } 
    public static void bufferReplace (StringBuffer text) 
    { 
        text = text.append ("c");  /* Line 9 */ // javac
    } 
    public static void main (String args[]) 
    { 
        String textString = new String ("java"); 
        StringBuffer textBuffer = new StringBuffer ("java"); /* Line 14 */
        stringReplace(textString); 
        bufferReplace(textBuffer); 
        System.out.println (textString + textBuffer); // java + javac
    } 
}
# What will be the output of the program?

public class StringRef 
{
    public static void main(String [] args) 
    {
        String s1 = "abc";
        String s2 = "def";
        String s3 = s2;   /* Line 7 */
        s2 = "ghi";
        System.out.println(s1 + s2 + s3);
    }
}
A.	abcdefghi
B.	abcdefdef
C.	abcghidef// ans
D.	abcghighi
After line 7 executes, both s2 and s3 refer to a String object that contains the value "def". When line 8 executes, 
a new String object is created with the value "ghi", to which s2 refers. 
The reference variable s3 still refers to the (immutable) String object with the value "def".
# What will be the output of the program?

String a = "newspaper";
a = a.substring(5,7);// ap
char b = a.charAt(1);//p
a = a + b;//app
System.out.println(a);//app

# What will be the output of the program?

interface Foo141 
{ 
    int k = 0; /* Line 3 */
} 
public class Test141 implements Foo141 
{
    public static void main(String args[]) 
    {
        int i; 
        Test141 test141 = new Test141(); 
        i = test141.k; /* Line 11 */
        i = Test141.k; 
        i = Foo141.k; 
    } 
}
A.	Compilation fails.
B.	Compiles and runs ok.//ans
C.	Compiles but throws an Exception at runtime.
D.	Compiles but throws a RuntimeException at runtime.
The variable k on line 3 is an interface constant, it is implicitly public, static, and final. 
Static variables can be referenced in two ways:

Via a reference to any instance of the class (line 11)

Via the class name (line 12).

# What will be the output of the program?

System.out.println(Math.sqrt(-4D));

A.	-2
B.	NaN
C.	Compile Error
D.	Runtime Exception
It is not possible in regular mathematics to get a value for the square-root of a negative number
therefore a NaN will be returned because the code is valid.
# What will be the output of the program?

public class NFE 
{
    public static void main(String [] args) 
    {
    String s = "42";
        try 
        {
            s = s.concat(".5");  /* Line 8 */
            double d = Double.parseDouble(s);
            s = Double.toString(d);
            int x = (int) Math.ceil(Double.valueOf(s).doubleValue());
            System.out.println(x);
        }
        catch (NumberFormatException e) 
        {
            System.out.println("bad number");
        }
    }
}
A.	42
B.	42.5
C.	43
D.	bad number
All of this code is legal, and line 8 creates a new String with a value of "42.5". Lines 9 and 10 convert the 
String to a double and then back again. Line 11 is fun— Math.ceil()'s argument expression is evaluated first.
We invoke the valueOf() method that returns an anonymous Double object (with a value of 42.5). 
Then the doubleValue() method is called (invoked on the newly created Double object), and returns a double
primitive (there and back again), with a value of (you guessed it) 42.5. 
The ceil() method converts this to 43.0, which is cast to an int and assigned to x.
# What will be the output of the program?

String s = "ABC"; 
s.toLowerCase(); 
s += "def"; 
System.out.println(s);//ABCdef
String objects are immutable. The object s above is set to "ABC". Now ask yourself if this object is changed and if so
where - remember strings are immutable.

Line 2 returns a string object but does not change the originag string object s, so after line 2 s is still "ABC".

# What will be the output of the program?

public class SqrtExample 
{
    public static void main(String [] args) 
    {
        double value = -9.0;
        System.out.println( Math.sqrt(value));
    }
}//The sqrt() method returns NaN (not a number) when it's argument is less than zero.

# What will be the output of the program?

class Q207 
{ 
    public static void main(String[] args) 
    {
        int i1 = 5; 
        int i2 = 6; 
        String s1 = "7"; 
        System.out.println(i1 + i2 + s1); /* Line 8 */
    } 
}//117

# What will be the output of the program?(dont understand)

try 
{
    Float f1 = new Float("3.0");
    int x = f1.intValue();
    byte b = f1.byteValue();
    double d = f1.doubleValue();
    System.out.println(x + b + d);
}
catch (NumberFormatException e) /* Line 9 */
{
    System.out.println("bad number"); /* Line 11 */
}
A.	9.0//ans
B.	bad number
C.	Compilation fails on line 9.
D.	Compilation fails on line 11.

# What will be the output of the program?

public class ExamQuestion7 
{  
    static int j; 
    static void methodA(int i)
    {
        boolean b; 
        do
        { 
            b = i<10 | methodB(4); /* Line 9 */
            b = i<10 || methodB(8);  /* Line 10 */
        }while (!b); 
    } 
    static boolean methodB(int i)
    {
        j += i; 
        return true; 
    } 
    public static void main(String[] args)
    {
        methodA(0); 
        System.out.println( "j = " + j ); 
    } 
}
A.	j = 0
B.	j = 4//ans
C.	j = 8
D.	The code will run with no output
The lines to watch here are lines 9 & 10. Line 9 features the non-shortcut version of the OR operator so both 
of its operands will be evaluated and therefore methodB(4) is executed.

However line 10 has the shortcut version of the OR operator and if the 1st of its operands evaluates to
true (which in this case is true), then the 2nd operand isn't evaluated, so methodB(8) never gets called.

The loop is only executed once, b is initialized to false and is assigned true on line 9. Thus j = 4.






















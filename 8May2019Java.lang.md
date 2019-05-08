# What is the value of "d" after this line of code has been executed?

double d = Math.round ( 2.5 + Math.random() );//3
# The Math.random() method returns a number greater than or equal to 0 and less than 1 . 
Since we can then be sure that the sum of that number and 2.5 will be greater than or equal to 2.5 and less than 3.5,
we can be sure that Math.round() will round that number to 3. So Option B is the answer.

# Which of the following would compile without error?

 ans-A.	int a = Math.abs(-5);
B.	int b = Math.abs(5.0);
C.	int c = Math.abs(5.5F);
D.	int d = Math.abs(5L);
The return value of the Math.abs() method is always the same as the type of the parameter passed into that method.
# Which of the following are valid calls to Math.max?

Math.max(1,4)
Math.max(2.3, 5)
Math.max(1, 3, 5, 7)
Math.max(-1.5, -2.8f)
A.	1, 2 and 4
B.	2, 3 and 4
C.	1, 2 and 3
D.	3 and 4
(1), (2), and (4) are correct. The max() method is overloaded to take two arguments of type int, long, float, or double.

(3) is incorrect because the max() method only takes two arguments.
# public class Myfile 
{ 
    public static void main (String[] args) 
    {
        String biz = args[1]; 
        String baz = args[2]; 
        String rip = args[3]; 
        System.out.println("Arg is " + rip); 
    } 
}
Select how you would start the program to cause it to print: Arg is 2
A.	java Myfile 222
B.	java Myfile 1 2 2 3 4
C.	java Myfile 1 3 2 2
D.	java Myfile 0 1 2 3
Answer: Option C

Explanation:

Arguments start at array element 0 so the fourth arguement must be 2 to produce the correct output.

# What will be the output of the program?

String x = new String("xyz");
String y = "abc";
x = x + y;
How many String objects have been created?
A.	2
B.	3
C.	4// ans
D.	5
# What will be the output of the program?

public class WrapTest 
{
    public static void main(String [] args) 
    {
        int result = 0;
        short s = 42;
        Long x = new Long("42");
        Long y = new Long(42);
        Short z = new Short("42");
        Short x2 = new Short(s);
        Integer y2 = new Integer("42");
        Integer z2 = new Integer(42);

        if (x == y) /* Line 13 */
            result = 1;
        if (x.equals(y) ) /* Line 15 */
            result = result + 10;
        if (x.equals(z) ) /* Line 17 */
            result = result + 100;
        if (x.equals(x2) ) /* Line 19 */
            result = result + 1000;
        if (x.equals(z2) ) /* Line 21 */
            result = result + 10000;

        System.out.println("result = " + result);
    }
}
A.	result = 1
ans-B.	result = 10
C.	result = 11
D.	result = 11010
Line 13 fails because == compares reference values, not object values. Line 15 succeeds because both String and 
primitive wrapper constructors resolve to the same value (except for the Character wrapper). 
Lines 17, 19, and 21 fail because the equals()
method fails if the object classes being compared are different and not in the same tree hierarchy.


# What will be the output of the program?

public class BoolTest 
{
    public static void main(String [] args) 
    {
        int result = 0;

        Boolean b1 = new Boolean("TRUE");
        Boolean b2 = new Boolean("true");
        Boolean b3 = new Boolean("tRuE");
        Boolean b4 = new Boolean("false");

        if (b1 == b2)  /* Line 10 */
            result = 1;
        if (b1.equals(b2) ) /* Line 12 */
            result = result + 10;
        if (b2 == b4)  /* Line 14 */
            result = result + 100;
        if (b2.equals(b4) ) /* Line 16 */
            result = result + 1000;
        if (b2.equals(b3) ) /* Line 18 */
            result = result + 10000;

        System.out.println("result = " + result);
    }
}
A.	0
B.	1
C.	10
ans D.	10010
Line 10 fails because b1 and b2 are two different objects. Lines 12 and 18 succeed # because the Boolean String constructors
are case insensitive. 
Lines 14 and 16 fail because true is not equal to false.
# What will be the output of the program?

public class ObjComp 
{
    public static void main(String [] args ) 
    {
        int result = 0;
        ObjComp oc = new ObjComp();
        Object o = oc;

        if (o == oc)  
            result = 1;
        if (o != oc)  
            result = result + 10;
        if (o.equals(oc) )  
            result = result + 100;
        if (oc.equals(o) )  
            result = result + 1000;

        System.out.println("result = " + result);
    }
}//1101
Even though o and oc are reference variables of different types, they are both referring to the same object.
This means that == will resolve to true and that the default equals() method will also resolve to true.



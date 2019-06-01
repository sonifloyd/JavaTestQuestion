# public class Main 
{ 
    public static void gfg(String s) 
    {     
        System.out.println("String"); 
    } 
    public static void gfg(Object o) 
    { 
        System.out.println("Object"); 
    } 
  
    public static void main(String args[]) 
    { 
        gfg(null); 
    } 
} //end class 
Output:

String
Explanation : In case of method overloading, the most specific method is chosen at compile time.
As ‘java.lang.String’ is a more specific type than ‘java.lang.Object’. In this case the method which takes ‘String’ as 
a parameter is choosen.

# public class Main 
{ 
    public static void gfg(String s) 
    {     
        System.out.println("String"); 
    } 
    public static void gfg(Object o) 
    { 
        System.out.println("Object"); 
    } 
    public static void gfg(Integer i) 
    { 
        System.out.println("Integer"); 
    } 
  
    public static void main(String args[]) 
    { 
        gfg(null); 
    } 
} //end class 
Output:

Compile Error at line 19.

Explanation: In this case of method Overloading, the most specific method is choosen at compile time.
As ‘java.lang.String’ and ‘java.lang.Integer’ is a more specific type than ‘java.lang.Object’,but between ‘java.lang.String’ and ‘java.lang.Integer’ none is more specific.
In this case the Java is unable to decide which method to call.
# public class Main 
{ 
    public static void main(String args[]) 
    { 
        String s1 = "abc"; 
        String s2 = s1; 
        s1 += "d"; 
        System.out.println(s1 + " " + s2 + " " + (s1 == s2)); 
  
        StringBuffer sb1 = new StringBuffer("abc"); 
        StringBuffer sb2 = sb1; 
        sb1.append("d"); 
        System.out.println(sb1 + " " + sb2 + " " + (sb1 == sb2)); 
    } 
} //end class 
Output:

abcd abc false
abcd abcd true
Explanation : In Java, String is immutable and string buffer is mutable.
So string s2 and s1 both pointing to the same string abc. And, after making the changes the string s1 
points to abcd and s2 points to abc, hence false. While in string buffer, both sb1 and sb2 both point to the same object. 
Since string buffer are mutable, making changes in one string also make changes to the other string. So both string still 
pointing to the same object after making the changes to the object (here sb2).

# / Main.java 
public class Main 
{ 
    public static void main(String args[]) 
    { 
        short s = 0; 
        int x = 07; 
        int y = 08; 
        int z = 112345; 
  
        s += z; 
        System.out.println("" + x + y + s); 
    } 
} //end class 
Output:

Compile Error at line 8
Explanation:
1. In Line 12 The “” in the println causes the numbers to be automatically cast as strings. So it doesn’t do addition,
but appends together as string.
2. In Line11 the += does an automatic cast to a short. However the number 123456 can’t be contained within a short, 
so you end up with a negative value (-7616).
3. Those other two are red herrings however as the code will never compile due to line 8.
Any number beginning with zero is treated as an octal number (which is 0-7).






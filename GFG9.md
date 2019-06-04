
# class Gfg 
{ 
    // constructor 
    Gfg() 
    { 
        System.out.println("Geeksforgeeks"); 
    } 
      
    static Gfg a = new Gfg(); //line 8 
  
    public static void main(String args[]) 
    { 
        Gfg b; //line 12 
        b = new Gfg(); 
    } 
} 
Output:

Geeksforgeeks
Geeksforgeeks
Explanation:
We know that static variables are called when a class loads and static variables are called only once. 
Now line 13 results to creation of object which inturn calls the constructor and “Geeksforgeeks” is printed second time.
If in line 8 static variable would not have been used the object would have been called recursively infinitely leading
to StackOverFlow error.
# class Gfg 
{ 
    static int num; 
    static String mystr; 
  
    // constructor 
    Gfg() 
    { 
        num = 100; 
        mystr = "Constructor"; 
    } 
  
    // First Static block 
    static
    { 
        System.out.println("Static Block 1"); 
        num = 68; 
        mystr = "Block1"; 
    } 
  
    // Second static block 
    static
    { 
        System.out.println("Static Block 2"); 
        num = 98; 
        mystr = "Block2"; 
    } 
  
    public static void main(String args[]) 
    { 
        Gfg a = new Gfg(); 
        System.out.println("Value of num = " + a.num); 
        System.out.println("Value of mystr = " + a.mystr); 
    } 
} 
Output:

Static Block 1
Static Block 2
Value of num = 100
Value of mystr = Constructor
Explanation:
Static block gets executed when the class is loaded in the memory. A class can have multiple Static blocks,
which are executed in the same sequence in which they have been written into the program.
Note: Static Methods can access class variables without using object of the class. Since constructor is called when 
a new instance is created so firstly the static blocks are called and after that the constructor is called. If 
we would have run the same program without using object, the constructor would not have been called.

# class superClass 
{ 
    final public int calc(int a, int b) 
    { 
        return 0; 
    } 
} 
class subClass extends superClass 
{ 
    public int calc(int a, int b) 
    { 
        return 1; 
    } 
} 
public class Gfg 
{ 
    public static void main(String args[]) 
    { 
        subClass get = new subClass(); 
        System.out.println("x = " + get.calc(0, 1)); 
    } 
} 
Output:

Compilation fails. 
Explanation:
The method calc() in class superClass is final and so cannot be overridden.

 #
 public class Gfg 
{ 
    public static void main(String[] args) 
    { 
        Integer a = 128, b = 128; 
        System.out.println(a == b); 
  
        Integer c = 100, d = 100; 
        System.out.println(c == d); 
    } 
} 
Output:

false
true
Explanation: In the source code of Integer object we will find a method ‘valueOf’ in which we can see that the range 
of the Integer object lies from IntegerCache.low(-128) to IntegerCache.high(127). Therefore the numbers above 127 will 
not give the expected output.
The range of IntegerCache can be observed from the source code of the IntegerCache class. 

 

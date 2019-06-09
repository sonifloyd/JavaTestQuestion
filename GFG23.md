# 1) What is the output of the following program?

public class A extends B 
{ 
    public static String sing()  
    { 
        return "fa"; 
    } 
    public static void main(String[] args)  
    { 
        A a = new A(); 
        B b = new A(); 
    System.out.println(a.sing() + " " + b.sing()); 
    } 
} 
class B  
{ 
    public static String sing()  
    { 
        return "la"; 
    } 
} 
Output: fa la
Explanation: B b = new A(); b is object of type B, and hence b.sing() refers to the method sing of class B 
see run-time polymorphism


# 2) What is the output of the following program?
class Building  
{ 
    Building()  
    { 
        System.out.println("Geek-Buiding"); 
    } 
    Building(String name)  
    { 
        this(); 
        System.out.println("Geek-building: String Constructor" + name); 
    } 
} 
public class House extends Building  
{ 
    House()  
    { 
        System.out.println("Geek-House "); 
    } 
    House(String name)  
    { 
        this(); 
        System.out.println("Geek-house: String Constructor" + name); 
    } 
    public static void main(String[] args)  
    { 
        new House("Geek"); 
    } 
} 
Output:

Geek-Buiding
Geek-House 
Geek-house: String ConstructorGeek
Explanation: Constructors call their superclass default constructor, which execute first, and that constructors
can be overloaded.
First House constructor with one argument is called and flow shifts to no-arg constructor of house class due to
this(). From here, due to superclass default constructor, no-arg constructor of building is called. Hence the order 
shown. For detail See – Constructors in Java



# 3) What is the output of the following program?
class Base  
{ 
    final public void show()  
    { 
        System.out.println("Base::show() called"); 
    } 
} 
class Derived extends Base  
{ 
    public void show()  
    { 
        System.out.println("Derived::show() called"); 
    } 
} 
class Main  
{ 
    public static void main(String[] args)  
    { 
        Base b = new Derived(); 
        b.show(); 
    } 
} 
Output: Compiler Error
Explanation: Final methods cannot be overridden. For Detail see final keyword. However, 
if we remove the keyword final then, the output will be

Derived::show() called

# 4) What is the output of the following program?

public class EH 
{ 
    public static void main(String args[]) 
    { 
        int divisor =0; 
        int dividend = 11; 
      
        try
        { 
            int result=dividend/divisor; 
            System.out.println("The result is "+result); 
        } 
        catch(Exception e) 
        { 
            System.out.println("An exception occured"); 
        } 
        catch(ArithmeticException ae) 
        { 
            System.out.println("Division by zero"); 
        } 
        finally
        { 
            System.out.println("We are done!"); 
        } 
    } 
} 
Output: Compiler error
Explanation: exception ArithmeticException has already been caught is shown. Terminal
Ordering of catch blocks is important The More specific/subclass (ArithmeticException) need to come earlier and more general/superclass (Exception) need to be written later. The program will execute correctly if the order of Arithmetic exception and general exception is interchanged.

# 5) What is the output of the following program?
abstract class Vibrate  
{ 
    static String s = "-"; 
    Vibrate()  
    { 
        s += "v"; 
    } 
} 
public class Echo extends Vibrate  
{ 
    Echo()   
    { 
        this(7); 
        s += "e"; 
    } 
    Echo(int x)  
    { 
        s += "e2"; 
    } 
    public static void main(String[] args)  
    { 
        System.out.print("made " + s + " "); 
    } 
    static 
    { 
        Echo e = new Echo(); 
        System.out.print("block " + s + " "); 
    } 
} 
Output: block -ve2e made -ve2e
Explanation: The static initialization block is the only place where an instance of Echo is created. 
Then the Echo instance is created, Echos no-arg constructor calls its 1-arg constructor, which then calls 
Vibrates constructor (which then secretly calls Objects constructor). At that point, the various constructors execute, 
starting with Objects constructor and working back down to Echos no-arg constructor. s




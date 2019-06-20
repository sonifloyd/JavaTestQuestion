# Abstract Classes in Java

in Java, a separate keyword abstract is used to make a class abstract.
/ An example abstract class in Java 
abstract class Shape { 
    int color; 
  
    // An abstract function (like a pure virtual function in C++) 
    abstract void draw();  
} 

1) In Java, an instance of an abstract class cannot be created, we can have references of abstract class type though.
abstract class Base { 
    abstract void fun(); 
} 
class Derived extends Base { 
    void fun() { System.out.println("Derived fun() called"); } 
} 
class Main { 
    public static void main(String args[]) {  
      
        // Uncommenting the following line will cause compiler error as the  
        // line tries to create an instance of abstract class. 
        // Base b = new Base(); 
  
        // We can have references of Base type. 
        Base b = new Derived(); 
        b.fun();  
    } 
} 
Output:

Derived fun() called

2) an abstract class can contain constructors in Java. And a constructor of abstract class is called when an 
instance of a inherited class is created.For example, the following is a valid Java program.

// An abstract class with constructor 
abstract class Base { 
    Base() { System.out.println("Base Constructor Called"); } 
    abstract void fun(); 
} 
class Derived extends Base { 
    Derived() { System.out.println("Derived Constructor Called"); } 
    void fun() { System.out.println("Derived fun() called"); } 
} 
class Main { 
    public static void main(String args[]) {  
       Derived d = new Derived(); 
    } 
} 
Output:

Base Constructor Called
Derived Constructor Called


3) In Java, we can have an abstract class without any abstract method. This allows us to create classes that cannot 
be instantiated,but can only be inherited.

// An abstract class without any abstract method 
abstract class Base {    
    void fun() { System.out.println("Base fun() called"); } 
} 
   
class Derived extends Base { } 
   
class Main { 
    public static void main(String args[]) {  
        Derived d = new Derived(); 
        d.fun(); 
    } 
} 
Output:

Base fun() called
4) Abstract classes can also have final methods (methods that cannot be overridden).
For example, the following program compiles and runs fine.

// An abstract class with a final method 
abstract class Base { 
    final void fun() { System.out.println("Derived fun() called"); } 
} 
   
class Derived extends Base {} 
   
class Main { 
    public static void main(String args[]) {  
       Base b = new Derived(); 
       b.fun(); 
    } 
}  //Derived fun() called

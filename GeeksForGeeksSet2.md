# Question 1


package main; 
  
class Base { 
    public void Print() { 
        System.out.println("Base"); 
    }          
} 
  
class Derived extends Base {     
    public void Print() { 
        System.out.println("Derived"); 
    } 
} 
  
class Main{ 
    public static void DoPrint( Base o ) { 
        o.Print();    
    } 
    public static void main(String[] args) { 
        Base x = new Base(); 
        Base y = new Derived(); 
        Derived z = new Derived(); 
        DoPrint(x); 
        DoPrint(y); 
        DoPrint(z); 
    } 
}
Output:
Base
Derived
Derived

# 
package main; 
  
// filename Main.java  
class Point { 
    protected int x, y; 
   
    public Point(int _x, int _y) { 
        x = _x; 
        y = _y; 
    } 
} 
  
public class Main { 
    public static void main(String args[]) { 
      Point p = new Point(); 
      System.out.println("x = " + p.x + ", y = " + p.y); 
    }     
} 
Output:
Compiler Error
In the above program, there are no access permission issues because the Test and Main are in same package and
protected members of a class can be accessed in other classes of same package. The problem with the code is:
there is not default constructor in Point. Like C++, if we write our own parametrized constructor then Java compiler
doesn’t create the default constructor. So there are following two changes to Point class that can fix the above program.
1) Remove the parametrized constructor.
2) Add a constructor without any parameter.
Java doesn’t support default arguments, so that is not an option.


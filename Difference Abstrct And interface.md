# Difference between Abstract Class and Interface in Java
Abstraction: Hiding the internal implementation of the feature and only showing the functionality to the users.
i.e. what it works (showing), how it works (hiding). Both abstract class and interface are used for abstraction.

                                     # Abstract class vs Interface
   1.Type of methods: Interface can have only abstract methods. Abstract class can have abstract and non-abstract methods. 
   From Java 8, it can have default and static methods also.
   
2.Final Variables: Variables declared in a Java interface are by default final.
An abstract class may contain non-final variables.

3.Type of variables: Abstract class can have final, non-final, static and non-static variables. 
Interface has only static and final variables.

4.Implementation: Abstract class can provide the implementation of interface. 
Interface can’t provide the implementation of abstract class.

5.Inheritance vs Abstraction: A Java interface can be implemented using keyword “implements” and 
abstract class can be extended using keyword “extends”.

6.Multiple implementation: An interface can extend another Java interface only, an abstract class 
can extend another Java class and implement multiple Java interfaces.

7.Accessibility of Data Members: Members of a Java interface are public by default. 
A Java abstract class can have class members like private, protected, etc.








# When to use what?

Consider using abstract classes if any of these statements apply to your situation:

In java application, there are some related classes that need to share some lines of code then you can put these 
lines of code within abstract class and this abstract class should be extended by all these related classes.
You can define non-static or non-final field(s) in abstract class, so that via a method you can access and modify 
the state of Object to which they belong.
You can expect that the classes that extend an abstract class have many common methods or fields, or require access
modifiers other than public (such as protected and private).



Consider using interfaces if any of these statements apply to your situation:

It is total abstraction, All methods declared within an interface must be implemented by the class(es) that 
implements this interface.
A class can implement more than one interface. It is called multiple inheritance.
You want to specify the behavior of a particular data type, but not concerned about who implements its behavior.

/ Java program to illustrate the 
// concept of interface  


import java.io.*; 
  
interface Shape 
{ 
    // abstract method 
    void draw(); 
    double area(); 
} 
  
class Rectangle implements Shape  
{ 
    int length, width; 
      
    // constructor 
    Rectangle(int length, int width) 
    { 
        this.length = length; 
        this.width = width; 
    } 
      
    @Override
    public void draw()  
    { 
        System.out.println("Rectangle has been drawn ");  
    } 
      
    @Override
    public double area()  
    { 
        return (double)(length*width); 
    } 
}  
  
class Circle implements Shape  
{ 
      
    double pi = 3.14; 
    int radius; 
      
    //constructor 
    Circle(int radius) 
    { 
          
        this.radius = radius; 
    } 
      
    @Override
    public void draw()  
    { 
        System.out.println("Circle has been drawn ");  
    } 
      
    @Override
    public double area()  
    { 
          
        return (double)((pi*radius*radius)/2); 
    } 
      
} 
  
class GFG  
{ 
    public static void main (String[] args)  
    { 
      
        // creating the Object of Rectangle class 
        // and using shape interface reference. 
        Shape rect = new Rectangle(2,3); 
        System.out.println("Area of rectangle: " + rect.area()); 
  
        // creating the Objects of circle class 
        Shape circle = new Circle(2); 
        System.out.println("Area of circle: " + circle.area()); 
    } 
} 
output

Area of rectangle: 6.0
Area of circle: 6.28




/ Java program to illustrate the 
// concept of abstract class 
  
import java.io.*; 
  
// abstract class 
abstract class Shape  
{ 
    // declare fields 
    String objectName = " "; 
      
    Shape(String name) 
    { 
        this.objectName = name; 
    } 
      
    // declare non-abstract methods 
    // it has default implementation 
    public void moveTo(int x, int y) 
    { 
        System.out.println(this.objectName + " " + "has been moved to"
                                   + " x = " + x + " and y = " + y); 
    } 
      
    // abstract methods which will be 
    // implemented by its subclass(es) 
    abstract public double area(); 
    abstract public void draw(); 
} 
  
class Rectangle extends Shape  
{ 
      
    int length, width; 
      
    // constructor 
    Rectangle(int length, int width, String name) 
    { 
          
        super(name); 
        this.length = length; 
        this.width = width; 
    } 
      
    @Override
    public void draw()  
    { 
        System.out.println("Rectangle has been drawn ");  
    } 
      
    @Override
    public double area()  
    { 
        return (double)(length*width); 
    } 
}  
  
class Circle extends Shape 
{ 
      
    double pi = 3.14; 
    int radius; 
      
    //constructor 
    Circle(int radius, String name) 
    { 
          
        super(name); 
        this.radius = radius; 
    } 
      
    @Override
    public void draw() 
    { 
          
        System.out.println("Circle has been drawn ");  
    } 
      
    @Override
    public double area()  
    { 
        return (double)((pi*radius*radius)/2); 
    } 
} 
  
class GFG 
{ 
    public static void main (String[] args)  
    { 
      
        // creating the Object of Rectangle class 
        // and using shape class reference. 
        Shape rect = new Rectangle(2,3, "Rectangle"); 
        System.out.println("Area of rectangle: " + rect.area()); 
        rect.moveTo(1,2); 
          
        System.out.println(" "); 
          
        // creating the Objects of circle class 
        Shape circle = new Circle(2, "Cicle"); 
        System.out.println("Area of circle: " + circle.area()); 
        circle.moveTo(2,4); 
      
    } 
} 
Output:

Area of rectangle: 6.0
Rectangle has been moved to x = 1 and y = 2
 
Area of circle: 6.28
Cicle has been moved to x = 2 and y = 4

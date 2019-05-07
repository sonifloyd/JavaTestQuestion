# Anonymous Inner Class in Java
It is an inner class without a name and for which only a single object is created. 
An anonymous inner class can be useful 
when making an instance of an object with certain “extras” such as overloading methods of a class or interface, without
having to actually subclass a class.
Anonymous inner classes are useful in writing implementation classes for listener interfaces in graphics programming.
Anonymous inner class are mainly created in two ways:
Class (may be abstract or concrete)
Interface
Syntax: The syntax of an anonymous class expression is like the invocation of a constructor, except that there is 
a class definition contained in a block of code.

// Test can be interface,abstract/concrete class
Test t = new Test() 
{
   // data members and methods
   public void test_method() 
   {
      ........
      ........
    }   
};
Types of anonymous inner class : Based on declaration and behavior, there are 3 types of anonymous Inner classes:
1)Anonymous Inner class that extends a class
2)Anonymous Inner class that implements a interface
3)Anonymous Inner class that defines inside method/constructor argument : 
Difference between Normal/Regular class and Anonymous Inner class:

A normal class can implement any number of interfaces but anonymous inner class can implement only one interface at a time.
A regular class can extend a class and implement any number of interface simultaneously. But anonymous Inner class can extend a class or can implement an interface but not both at a time.
For regular/normal class, we can write any number of constructors but we cant write any constructor for anonymous Inner class because anonymous class does not have any name and while defining constructor class name and constructor name must be same.
Accessing Local Variables of the Enclosing Scope, and Declaring and Accessing Members of the Anonymous Class
Like local classes, anonymous classes can capture variables; they have the same access to local variables of the enclosing scope:

An anonymous class has access to the members of its enclosing class.
An anonymous class cannot access local variables in its enclosing scope that are not declared as final or effectively final.
Like a nested class, a declaration of a type (such as a variable) in an anonymous class shadows any other declarations in the enclosing scope that have the same name.
Anonymous classes also have the same restrictions as local classes with respect to their members:

We cannot declare static initializers or member interfaces in an anonymous class.
An anonymous class can have static members provided that they are constant variables.
Note that you can declare the following in anonymous classes:

Fields
Extra methods (even if they do not implement any methods of the supertype)
Instance initializers
Local classes
However, constructors can not be declared in an anonymous class.
anonumous class and anonuoums inner class same always in a class.
# IT always inner class. anonumous class always is child class of a class.

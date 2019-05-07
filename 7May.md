# Which is true about an anonymous inner class?
It can extend exactly one class or implement exactly one interface.but not both at a time
# class Boo 
{
    Boo(String s) { }
    Boo() { }
}
class Bar extends Boo 
{
    Bar() { }
    Bar(String s) {super(s);}
    void zoo() 
    {
    // insert code here
    }
}//Boo f = new Bar() { };
Option B is correct because anonymous inner classes are no different from any other class when it comes to polymorphism. 
That means you are always allowed to declare a reference variable of the superclass type and have that reference variable
refer to an instance of a subclass type,
which in this case is an anonymous subclass of Bar. Since Bar is a subclass of Boo, it all works.
# Which is true about a method-local inner class?
Option B is correct because a method-local inner class can be abstract, although it means a subclass of the inner
class must be created if
the abstract class is to be used (so an abstract method-local inner class is probably not useful).
# Which statement is true about a static nested class?
Option B is correct because a static nested class is not tied to an instance of the enclosing class, 
and thus can't access the nonstatic members of the class (just as a static method can't access nonstatic members of a class).
# Which constructs an anonymous inner class instance?

A.	Runnable r = new Runnable() { };
B.	Runnable r = new Runnable(public void run() { });
C.	Runnable r = new Runnable { public void run(){}};
D.	System.out.println(new Runnable() {public void run() { }});
D is correct. It defines an anonymous inner class instance, which also means it creates an instance of that 
new anonymous class at the same time. The anonymous class is an implementer of the Runnable interface, so it must override 
the run() method of Runnable.
# class Foo 
{
    class Bar{ }
}
class Test 
{
    public static void main (String [] args) 
    {
        Foo f = new Foo();
        /* Line 10: Missing statement ? */
    }
}
which statement, inserted at line 10, creates an instance of Bar?
A.	Foo.Bar b = new Foo.Bar();
B.	Foo.Bar b = f.new Bar();
C.	Bar b = new f.Bar();
D.	Bar b = f.new Bar();
Option B is correct because the syntax is correct-using both names (the enclosing class and the inner class) in
the reference declaration, then using a reference to the enclosing class to invoke new on the inner class.
# public class MyOuter 
{
    public static class MyInner 
    {
        public static void foo() { }
    }
}
which statement, if placed in a class other than MyOuter or MyInner, instantiates an instance of the nested class?
 ans- A.	MyOuter.MyInner m = new MyOuter.MyInner();
B.	MyOuter.MyInner mi = new MyInner();
C.	MyOuter m = new MyOuter();
MyOuter.MyInner mi = m.new MyOuter.MyInner();

D.	MyInner mi = new MyOuter.MyInner();
// MyInner is a static nested class, so it must be instantiated using the fully-scoped name of MyOuter.MyInner.







# Java Abstract Class and Interface
# Which of the following is FALSE about abstract classes in Java
A
If we derive an abstract class and do not implement all the abstract methods, then the derived class 
should also be marked as abstract using 'abstract' keyword
B
Abstract classes can have constructors
C
A class can be made abstract without any abstract method
D
A class can inherit from multiple abstract classes//

# hich of the following is true about interfaces in java.

1) An interface can contain following type of members.
....public, static, final fields (i.e., constants) 
....default and static methods with bodies

2) An instance of interface can be created.

3) A class can implement multiple interfaces.

4) Many classes can implement the same interface.
A
1, 3 and 4//
B
1, 2 and 4
C
2, 3 and 4
D
1, 2, 3 and 4


# Predict the output of the following program.
abstract class demo
{
    public int a;
    demo()
    {
        a = 10;
    }
 
    abstract public void set();
     
    abstract final public void get();
 
}
 
class Test extends demo
{
 
    public void set(int a)
    {
        this.a = a;
    }
 
    final public void get()
    {
        System.out.println("a = " + a);
    }
 
    public static void main(String[] args)
    {
        Test obj = new Test();
        obj.set(20);
        obj.get();
    }
}
Run on IDE
A
a = 10
B
a = 20
C
Compilation error// final cant be override so abstract class can not have final keyword


# Type IV JDBC driver is a driver
A
which is written in C++
B
which requires an intermediate layer
C
which communicates through Java sockets//
D
which translates JDBC function calls into API not native to DBMS



# Which of the following statement(s) with regard to an abstract class in JAVA is/are TRUE ? I. An abstract class is one that is not used to create objects. II. An abstract class is designed only to act as a base class to be inherited by other classes.
A
Only I
B
Only II
C
Neither I nor II
D
Both I and II//

# Which of the following is used to make an Abstract class?
A
Making atleast one member function as pure virtual function//
B
Making atleast one member function as virtual function
C
Declaring as Abstract class using virtual keyword
D
Declaring as Abstract class using static keyword


# We can make a class abstract by
A
Declaring it abstract using the virtual keyword
B
Making at least one member function as virtual function
C
Making at least one member function as pure virtual function//
D
Making all member function const


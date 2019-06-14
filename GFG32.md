# Output of following Java program?
class Main {
    public static void main(String args[]) {   
             System.out.println(fun());
    } 
  
    int fun()
    {
      return 20;
    }
}

20
compiler error//
C
0
D
garbage balue

main() is a static method and fun() is a non-static method in class Main. Like C++,
in Java calling a non-static function inside a static function is not allowed
# q2
public class Main { 
    public static void main(String args[]) { 
       String x = null; 
       giveMeAString(x); 
       System.out.println(x); 
    } 
    static void giveMeAString(String y) 
    { 
       y = "GeeksQuiz"; 
    } 
}//null
Parameters in Java is passed by value. So the changes made to y do not reflect in main().

# q3
class Test {
public static void swap(Integer i, Integer j) {
      Integer temp = new Integer(i);
      i = j;
      j = temp;
   }
   public static void main(String[] args) {
      Integer i = new Integer(10);
      Integer j = new Integer(20);
      swap(i, j);
      System.out.println("i = " + i + ", j = " + j);
   }
}
//i = 10, j = 20

Question 3 Explanation: 
Parameters are passed by value in Java

# q4
class intWrap {
   int x;
} 
public class Main { 
    public static void main(String[] args) {
       intWrap i = new intWrap();
       i.x = 10;
       intWrap j = new intWrap();
       j.x = 20;
       swap(i, j);
       System.out.println("i.x = " + i.x + ", j.x = " + j.x);
    } 
    public static void swap(intWrap i, intWrap j) {
       int temp = i.x;
       i.x = j.x;
       j.x = temp;
    }
}//i.x = 20, j.x = 10

Question 4 Explanation: 
Objects are never passed at all. Only references are passed. The values of variables are always primitives or 
references, never objects

# Predict the output?
class Main {
    public static void main(String args[]) {   
             System.out.println(fun());
    }   
    static int fun(int x = 0)
    {
      return x;
    }
}//Compiler Error

# Predict the output of the following program.
class Test
{
    public void demo(String str)
    {
        String[] arr = str.split(";");
        for (String s : arr)
        {
            System.out.println(s);
        }
    }
 
    public static void main(String[] args)
    {
        char array[] = {'a', 'b', ' ', 'c', 'd', ';', 'e', 'f', ' ', 
                        'g', 'h', ';', 'i', 'j', ' ', 'k', 'l'};
        String str = new String(array);
        Test obj = new Test();
        obj.demo(str);
    }
}//ab cd
ef gh
ij kl

# Predict the output of the following program.
class Test
{
    public static void main(String[] args)
    {
        StringBuffer a = new StringBuffer("geeks");
        StringBuffer b = new StringBuffer("forgeeks");
        a.delete(1,3);
        a.append(b);
        System.out.println(a);
    }
}//gksforgeeks


## Predict the output of the following program.
class Test
{
 
    public static void main(String[] args)
    {
        String obj1 = new String("geeks");
        String obj2 = new String("geeks");
 
        if(obj1.hashCode() == obj2.hashCode())
            System.out.println("hashCode of object1 is equal to object2");
 
        if(obj1 == obj2)
            System.out.println("memory address of object1 is same as object2");
 
        if(obj1.equals(obj2))
            System.out.println("value of object1 is equal to object2");
    }
}//hashCode of object1 is equal to object2
value of object1 is equal to object2


Predict the output of the following program.
class Test implements Cloneable
{
    int a;
 
    Test cloning()
    {
        try
        {
            return (Test) super.clone();
        }
        catch(CloneNotSupportedException e)
        {
            System.out.println("CloneNotSupportedException is caught");
            return this;
        }
    }
}
 
class demo
{
 
    public static void main(String args[])
    {
        Test obj1 = new Test();
        Test obj2;
        obj1.a = 10;
        obj2 = obj1.cloning();
        obj2.a = 20;
 
        System.out.println("obj1.a = " + obj1.a);
        System.out.println("obj2.a = " + obj2.a);
    }
}
Run on IDE
//obj1.a = 10
obj2.a = 20

The clone( ) method generates a duplicate copy of the object on which it is called. 
Only classes that implement the Cloneable interface can be cloned.

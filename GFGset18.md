#  1) What is the output of the following program?
class Derived  
{ 
    protected final void getDetails() 
    { 
        System.out.println("Derived class"); 
    } 
} 
  
public class Test extends Derived 
{ 
    protected final void getDetails() 
    { 
        System.out.println("Test class"); 
    } 
    public static void main(String[] args) 
    { 
        Derived obj = new Derived(); 
        obj.getDetails(); 
    } 
} 
a) Derived class
b) Test class
c) Runtime error
d) Compilation error

Ans. (d)
Explanation: Final and static methods cannot be overridden.
#  what is output
class Derived  
{ 
    public void getDetails(String temp) 
    { 
        System.out.println("Derived class " + temp); 
    } 
} 
  
public class Test extends Derived 
{ 
    public int getDetails(String temp) 
    { 
        System.out.println("Test class " + temp); 
        return 0; 
    } 
    public static void main(String[] args) 
    { 
        Test obj = new Test(); 
        obj.getDetails("GFG"); 
    } 
} 
a) Derived class GFG
b) Test class GFG
c) Compilation error
d) Runtime error

Ans. (c)
Explanation: The overriding method must have same signature, which includes, the argument list and the return type. For details, See : Overriding in Java

3) What is the output of the following program?

class Derived  
{ 
    public void getDetails() 
    { 
        System.out.println("Derived class"); 
    } 
} 
  
public class Test extends Derived 
{ 
    protected void getDetails() 
    { 
        System.out.println("Test class"); 
    } 
    public static void main(String[] args) 
    { 
        Derived obj = new Test();  // line xyz 
        obj.getDetails(); 
    } 
} 
a) Test class
b) Compilation error due to line xyz
c) Derived class
d) Compilation error due to access modifier

Ans: (d)
Explanation: The overriding method can not have more restrictive access modifier.

# 4) What is the output of the following program?
import java.io.IOException; 
  
class Derived  
{ 
    public void getDetails() throws IOException //line 23 
    { 
        System.out.println("Derived class"); 
    } 
} 
  
public class Test extends Derived 
{ 
    public void getDetails() throws Exception //line 24 
    { 
        System.out.println("Test class"); 
    } 
    public static void main(String[] args) throws IOException //line 25 
    { 
        Derived obj = new Test(); 
        obj.getDetails(); 
    } 
} 
a) Compilation error due to line 23
b) Compilation error due to line 24
c) Compilation error due to line 25
d) All the above

Ans. (b)
Explanation: The exception thrown by the overriding method should not be new or more broader checked exception. In the code above, Exception is more broader class of checked exception than IOException, so this results in compilation error.

# 5) What is the output of the following program?
class Derived  
{ 
    public void getDetails() 
    { 
        System.out.printf("Derived class "); 
    } 
} 
  
public class Test extends Derived 
{ 
    public void getDetails() 
    { 
        System.out.printf("Test class "); 
        super.getDetails(); 
    } 
    public static void main(String[] args) 
    { 
        Derived obj = new Test(); 
        obj.getDetails(); 
    } 
} 
a) Test class Derived class
b) Derived class Test class
c) Compilation error
d) Runtime error

Ans. (a)
Explanation: super keyword is used to invoke the overridden method from a child class explicitly.


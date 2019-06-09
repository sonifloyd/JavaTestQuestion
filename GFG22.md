# 1) What is the output of the following program?
public class Test 
{ 
    public int getData() //getdata() 1 
    { 
        return 0; 
    } 
    public long getData() //getdata 2 
    { 
        return 1; 
    } 
    public static void main(String[] args) 
    { 
        Test obj = new Test(); 
        System.out.println(obj.getData());     
    } 
} 
a) 1
b) 0
c) Runtime error
d) Compilation error



Ans. (d)
Explanation: For method overloading, methods must have different signatures. Return type of methods does not
contribute towards different method signature, so the code above give compilation error.
Both getdata 1 and getdata 2 only differ in return types and NOT signatures.

# 2) What is the output of the following program?
public class Test 
{ 
    public int getData(String temp) throws IOException 
    { 
        return 0; 
    } 
    public int getData(String temp) throws Exception 
    { 
        return 1; 
    } 
    public static void main(String[] args) 
    { 
        Test obj = new Test(); 
        System.out.println(obj.getData("GFG"));     
    } 
} 
a) 0
b) 1
c) Compilation error
d) Runtime error

Ans. (c)
Explanation: Methods that throws different exceptions are not overloaded as their signature are still the same.

# 3) What is the output of the following program?
public class Test 
{ 
    private String function() 
    { 
        return ("GFG"); 
    } 
    public final static String function(int data) 
    { 
        return ("GeeksforGeeks"); 
    } 
    public static void main(String[] args) 
    { 
        Test obj = new Test(); 
        System.out.println(obj.function());     
    } 
} 
a) Compilation error
b) Runtime error
c) GFG
d) None of these

Ans. (c)
Explanation: Access modifiers associated with methods doesn’t determine the criteria for overloading. 
The overloaded methods could also 
be declared as final or static without affecting the overloading criteria.

# 4) What is the output of the following program?

public class Test 
{ 
    private String function(String temp, int data) 
    { 
        return ("GFG"); 
    } 
    private String function(int data, String temp) 
    { 
        return ("GeeksforGeeks"); 
    } 
    public static void main(String[] args) 
    { 
        Test obj = new Test(); 
        System.out.println(obj.function(4, "GFG"));     
    } 
} 
a) GFG
b) GeeksforGeeks
c) Compilation error
d) Runtime error

Ans. (b)
Explanation: The order of argument are an important parameter for determining method overloading. As the order of attributes are different, the methods are overloaded.

# 5) What is the output of the following program?
public class Test 
{ 
    private String function(String temp, int data, int sum) 
    { 
        return ("GFG"); 
    } 
    private String function(String temp, int data) 
    { 
        return ("GeeksforGeeks"); 
    } 
    public static void main(String[] args) 
    { 
        Test obj = new Test(); 
        System.out.println(obj.function("GFG", 0, 20));     
    } 
} 
a) GFG
b) Compilation error
c) Runtime error
d) GeeksforGeeks

Ans. (a)
Explanation: This one is really simple. Different number of arguments contribute towards method overloading
as the signature of methods is changed with different number of attributes. Whichever matches the attributes is 
obviously called in Method Overloading.




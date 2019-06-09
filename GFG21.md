# type comperision
# p1
public class Test 
{ 
    public static void main(String[] args) 
    { 
        int value = 554; 
        String var = (String)value;  //line 1 
        String temp = "123"; 
        int data = (int)temp; //line 2 
        System.out.println(data + var); 
    } 
} 
a) 677
b) Compilation error due to line 1
c) Compilation error due to line 2
d) Compilation error due to line 1 and line 2

Ans. (d)
Explanation: Converting from int to String as well as converting from String to int is not allowed in java.

# 2) What is the output of the following program?

public class Test 
{ 
    public static void main(String[] args) 
    { 
        double data = 444.324; 
        int value = data; 
        System.out.println(data); 
    } 
} 
a) 444.324
b) 444
c) Runtime error
d) Compilation error



Ans. (d)
Explanation: Converting from a bigger data type to a smaller data type is not
allowed in java as it is a lossy conversion.

# 3) What is the output of the following program?

public class Test 
{ 
    public static void main(String[] args) 
    { 
        double data = 444.324; 
        int sum = 9; 
        float value = 5.1f; 
        System.out.println(data + sum + value); 
          
    } 
} 
a) 444.32495.1
b) 456
c) 458.42399
d) 458.4

Ans. (c)
Explanation: If one of the operands is long, double or float, 
the entire expression is converted to long, double or float respectively.

# 4) What is the output of the following program?

public class Test 
{ 
    public static void main(String[] args) 
    { 
        byte var = 1; 
        var = (byte) var * 0; //line 1 
        byte data = (byte) (var * 0); //line 2 
        System.out.println(var);         
    } 
} 
a) 0
b) Compilation error due to line 1
c) Compilation error due to line 2
d) Compilation error due to line 1 and line 2

Ans. (b)
Explanation: When the expressions are evaluated, the data type of the result is implicitly changed 
to a larger data type and therefore, explicit recasting has to be done as shown in line 2. On the other
hand, line 1 shows compilation error because the expression on the right side has data type as int whereas left 
side it is byte.
# ) What is the output of the following program?
public class Test 
{ 
    public static void main(String[] args) 
    { 
        System.out.println((100/25.0)*Integer.parseInt("5") + 50); 
    } 
} 
a) Compilation error
b) 70
c) 70.0
d) Runtime error

Ans. (c)
Explanation: If a double value is used in an expression then the output is returned in double format rather than an int.
 

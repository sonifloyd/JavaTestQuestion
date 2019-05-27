#
class Test { 
    int a = 10; 
    static int b = 20; 
  
public
    static void main(String[] args) 
    { 
        Test t1 = new Test(); 
        t1.a = 100; 
        t1.b = 200; 
  
        Test t2 = new Test(); 
  
        System.out.println("t1.a =" + t1.a + " t1.b =" + t1.b); 
        System.out.println("t2.a =" + t2.a + " t2.b =" + t2.b); 
    } 
} // A) t1.a=100 t1.b=200
t2.a=10 t2.b=200
 static variable is class level variable. If we create multiple objects of class and all objects can point same 
 reference of static variable means If you can change the value of static variable in any object, 
 then compiler automatically updates the value of all object static variables.
 #
 class Test2 { 
public
    static void main(String[] args) 
    { 
        byte x = 12; 
        byte y = 13; 
        byte result = x + y; // int to byte type error
        System.out.print(result); 
    } 
} 
Option
a) 25
b) Error
c) -25
d) none

Output : b
# class Test5 { 
public
    static void main(String[] args) 
    { 
        final int a = 1, b = 5; 
  
        for (int i = 0; a < b; i++) { // final value can not be changed a never increase
            System.out.println("Hello"); 
        } 
        System.out.println("Hi"); 
    } 
} //error
# Question 4. What is the output of the following question?

class Test4 { 
public
    static void main(String[] args) 
    { 
        int x = 0198; 
        int y = 0xfree; 
        int result = x + y; 
        System.out.print(x + " : " + y + " : " + result); 
    } 
} 
Explanation : If we assign a 0 before integer number, then that number is treated as octal and we know octal number 
range is [0-7]. If we assign the number outside of this range then we get error. Similar to this, if any integer number
start with 0x then that number is treated as Hexadecimal means we can assign the value in between the [0-9] [a-z or A-Z].
If we assign it out of range, then program will get the error.

# Question 3. What is the output of the following question?
class Test3 { 
public
    static void main(String[] args) 
    { 
        int x = 011; 
        int y = 0xfee; 
        int result = x + y; 
        System.out.print(x + ":" + y + ":" + result); 
    } 
} 
Options
a) Error
b) 010 : 0xfee : 4089
c) 9 : 4078 : 4087
d) 010 : 0xfee : 4087

Output : C
Explanation : If any integer number start with 0, then that number is treated as octal number hence 011 means 
(1*8^1 + 1*8^0) 9 and also if any integer start with 0x means then that number is treated as Hexadecimal number
means we can have the value between[0-9] and [a-z or A-Z]. oxfee =(15*16^2 + 14*16^1 + 14*16^0) =>4078.





















# 
class GfG 
{ 
    public static void main(String args[]) 
    { 
        String s1 = new String("geeksforgeeks"); 
        String s2 = new String("geeksforgeeks"); 
        if (s1 == s2)  
            System.out.println("Equal"); 
        else
            System.out.println("Not equal"); 
    } 
} 
Output:

Not equal
Explanation: Since, s1 and s2 are two different objects the references are not the same, and the == operator
compares object reference. So it prints “Not equal”, to compare the actual characters in the string .equals() method must
be used.
# 
class Person  
{  
    private void who() 
    { 
        System.out.println("Inside private method Person(who)"); 
    } 
   
    public static void whoAmI() 
    { 
        System.out.println("Inside static method, Person(whoAmI)"); 
    } 
   
    public void whoAreYou() 
    { 
        who(); 
        System.out.println("Inside virtual method, Person(whoAreYou)"); 
    } 
} 
  
class Kid extends Person 
{  
    private void who() 
    { 
        System.out.println("Kid(who)"); 
    } 
   
    public static void whoAmI() 
    { 
        System.out.println("Kid(whoAmI)"); 
    } 
   
    public void whoAreYou() 
    { 
        who(); 
        System.out.println("Kid(whoAreYou)"); 
    } 
} 
public class Gfg 
{ 
    public static void main(String args[])  
    { 
        Person p = new Kid();   
        p.whoAmI();  
        p.whoAreYou();  
    } 
} 
Output:

Inside static method, People(whoAmI)
Kid(who)
Kid(whoAreYou)
Explanation: Static binding (or compile time) happens for static methods. Here p.whoAmI() calls the static method so it 
is called during compile time hence results in static binding and prints the method in People class.
Whereas p.whoAreYou() calls the method in Kid class since by default Java takes it as a virual method i.e, dynamic binding.

# class GfG 
{ 
    public static void main(String args[]) 
    { 
        try
        { 
            System.out.println("First statement of try block"); 
            int num=45/3; 
            System.out.println(num); 
        } 
        catch(Exception e) 
        { 
            System.out.println("Gfg caught Exception"); 
        } 
        finally
        { 
            System.out.println("finally block"); 
        } 
        System.out.println("Main method"); 
    } 
} 
Output:

First statement of try block
15
finally block
Main method
Explanation:
Since there is no exception, the catch block is not called, but the finally block is always executed after a 
try block whether the 
exception is handled or not.


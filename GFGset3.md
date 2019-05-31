# 
class Test { 
    int x  = 10;   
    public static void main(String[] args) {     
         Test t = new Test(); 
         System.out.println(t.x); //10
    } 
} 
# class Test {     
    int y = 2; 
    int x  = y+2;   
    public static void main(String[] args) {     
         Test m = new Test(); 
         System.out.println("x = " + m.x + ", y = " + m.y); 
    } 
} 
Output of the above program is “x = 4, y = 2”. y is initialized first, 
then x is initialized as y + 2. So the value of x becomes 4.
# public class Test  
{     
    int x = 2; 
    Test(int i) { x = i; }  
    public static void main(String[] args) {     
         Test t = new Test(5); 
         System.out.println("x = " + t.x); 
    } 
} 

# // filename: Test2.java 
class Test1 { 
	Test1(int x) { 
		System.out.println("Constructor called " + x); 
	} 
} 

// This class contains an instance of Test1 
class Test2 {	 
	Test1 t1 = new Test1(10); 

	Test2(int i) { t1 
      = new Test1(i); } 

	public static void main(String[] args) {	 
		Test2 t2 = new Test2(5); 
      System.out.println(" ram");
	} 
} 
//
Constructor called 10
Constructor called 5
 ram
 
 
 The output of the program is Constructor called 10 Constructor called 5.
First t2 object is instantiated in the main method. As the order of initialization of local variables comes first 
than the constructor,first the instance variable (t1), in the class Test2 is allocated to the memory. In this line a 
new Test1 object is created, constructor is called in class Test1 and ‘Constructor called 10’ is printed. Next the 
constructor of Test2 is called and again a new object of the class Test1 is created and ‘Constructor called 5’ is printed.



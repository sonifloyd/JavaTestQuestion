# / filename Main.java 
class Test { 
    protected int x, y; # //default constructors 
initialize integral variables as 0 in Java . That is why we get output as 0 0.
} 
  
class Main { 
    public static void main(String args[]) { 
        Test t = new Test(); 
        System.out.println(t.x + " " + t.y); 
    } 
} 
Output

0 0


In Java, a protected member is accessible in all classes of same package and in inherited classes of other packages. 
Since Test and Main are in same package, no access related problem in the above program. Also, the default constructors 
initialize integral variables as 0 in Java (See this GFact for more details). That is why we get output as 0 0.


# // filename Test.java 
class Test { 
	public static void main(String[] args) { 
		for(int i = 0; 1; i++) { 
			System.out.println("Hello"); 
			break; 
		} 
	} 
} 
prog.java:4: error: incompatible types: int cannot be converted to boolean
		for(int i = 0; 1; i++) { 
		               ^
1 error

# // filename Test.java 
class Test { 
    public static void main(String[] args) { 
        for(int i = 0; true; i++) { 
            System.out.println("Hello"); 
            break; 
        } 
    } 
} 
// Output: Hello

# class Main { 
    public static void main(String args[]) {    
        System.out.println(fun()); 
    }  
    int fun() { error
        return 20; 
    }  
} //in Java, non-static methods cannot be called in a static method


# // filename Main.java 
class Main { 
    public static void main(String args[]) { 
        System.out.println(fun()); 
    }  
    static int fun() { 
        return 20; 
    } 
} 
// Output: 20 



#// filename Test.java 
class Test { 
   public static void main(String args[]) { 
       System.out.println(fun()); 
   } 
   static int fun() { 
       static int x= 0; // error Local variable cant not be allowed in java
       return ++x; 
   } 
} 
chevron_right

prog.java:7: error: illegal start of expression
	static int x= 0; 
	^
1 error

# class Test { 
   private static int x; 
   public static void main(String args[]) { 
       System.out.println(fun()); 
   } 
   static int fun() { 
       return ++x; 
   } 
} 
// Output: 1









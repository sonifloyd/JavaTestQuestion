# When does Exceptions in Java arises in code sequence?
 ans-a) Run Time
b) Compilation Time
c) Can Occur Any Time
d) None of the mentioned
# Which of these keywords is not a part of exception handling?
a) try
b) finally
Ans-c) thrown
d) catch
Explanation: Exceptional handling is managed via 5 keywords – try, catch, throws, throw and finally.
# Which of these keywords must be used to monitor for exceptions?
 Ans-a) try
b) finally
c) throw
d) catch
# Which of these keywords is used to manually throw an exception?
a) try
b) finally
Ans-c) throw
d) catch
# What is the output of this program?

    class exception_handling 
    {
        public static void main(String args[]) 
        {
            try 
            {
                System.out.print("Hello" + " " + 1 / 0);
            }
            catch(ArithmeticException e) 
            {
        	System.out.print("World");        	
            }
        }
    }// World
    System.ou.print() function first converts the whole parameters into a string and then prints, 
    before “Hello” goes to output stream 1 / 0 error is encountered which is cached by catch block printing just “World”.
Output:
$ javac exception_handling.java
$ java exception_handling
World
# What is the output of this program?

    class exception_handling 
    {
        public static void main(String args[]) 
        {
            try 
           {
                int a, b;
                b = 0;
                a = 5 / b;
                System.out.print("A");
            }
            catch(ArithmeticException e) 
            {
        	System.out.print("B");        	
            }
        }
    }// B
    $ javac exception_handling.java
$ java exception_handling
B
#What is the output of this program?

    class exception_handling 
    {
        public static void main(String args[]) 
        {
            try 
            {
                int a, b;
                b = 0;
                a = 5 / b;
                System.out.print("A");
            }
            catch(ArithmeticException e) 
            {
        	System.out.print("B");        	
            }
            finally 
            {
    	        System.out.print("C");
            }
        }
    }// BC
    # What is the output of this program?

    class exception_handling 
    {
        public static void main(String args[]) 
        {
            try 
            {
                int i, sum;
                sum = 10;
                for (i = -1; i < 3 ;++i)
                    sum = (sum / i);
            }
            catch(ArithmeticException e) 
            {
        	System.out.print("0");        	
            } 
            System.out.print(sum);
        }
    }
    # What is the output of this program?

    class exception_handling 
    {
        public static void main(String args[]) 
        {
            try 
            {
                int i, sum;
                sum = 10;
                for (i = -1; i < 3 ;++i)
                    sum = (sum / i);
            }
            catch(ArithmeticException e) 
            {
        	System.out.print("0");        	
            } 
            System.out.print(sum);
        }
    }// compilation error
    Explanation: Value of variable sum is printed outside of try block, sum is declared only in try block, 
    outside try block it is undefined.

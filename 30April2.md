# What is the name of the method used to start a thread execution?(start())
# What is the name of the thread in output of this program?

classmultithreaded_programing{
        publicstaticvoidmain(String args[]){
            Thread t = Thread.currentThread();
            System.out.println(t);        
        }
    }
    output 
    main
   #  What is the priority of the thread in output of this program?

classmultithreaded_programing{
        publicstaticvoidmain(String args[]){
            Thread t = Thread.currentThread();
            System.out.println(t);        
        }
    }
    // 5
  #  What will happen if two thread of same priority are called to be processed simultaneously?
// It is dependent on the operating system.
# Thread priority in Java is?// Integer and   Float
# What is multithreaded programming?
 It’s a process in which two or more parts of same process run simultaneously.
 Its a process in which many different process are able to access same information.
 # Which of the following is used to force each thread to reconcile its working copy of a 
 variable with the master copy in main memory?(volatile)
 # Which methods are utilized to control the access to an object in multi threaded programming
 synchronized methods
 # What is the name of the thread in output of this program?

classmultithreaded_programing{
        publicstaticvoidmain(String args[]){
            Thread t = Thread.currentThread();
            System.out.println(t.getPriority());        
        }
    }
    // 5
    # What is the priority of the thread in output of this program?

classmultithreaded_programing{
        publicstaticvoidmain(String args[]){
            Thread t = Thread.currentThread();
            t.setName("New Thread");
            System.out.println(t.getName());        
        }
    }// New Thread
  #   Which method is called first by an applet?(init()
  # Which method in thread class causes the currently executing thread object to temporarily pause and allow other
  threads to execute?// public void yield()
  # What will be the output?

if(1 + 1 + 1 + 1 + 1 == 5){
        System.out.print("TRUE");
}else{
        System.out.print("FLASE");
}// TRUE
# Select from among the following character escape code which is not available in Java
// \a

# what is output
class Numbers{public static void main(String args[]){inta=20, b=10;
                if((a < b) && (b++ < 25)){// not true
                        System.out.println("This is any language logic");
                }
                System.out.println(b); 
        }
}// 10
# int ++a = 100 ; 
System.out.println( ++a ) ;
What will be the output of the above fraction of code ?

// Compiler displays error as ++a is not a valid identifier
 # What will be the value of "x" after execution ?
 intx = 0, y = 0 , z = 0 ;
x = (++x + y-- ) * z++;
// 0
# When a class extends the Thread class ,it should override which method of Thread class to start that thread ?
// run()
What will be the output of the following program code?

public class Test implements Runnable{
public static void main(String[] args){
                Thread t = new Thread(this);
                t.start();
        }public void run(){
                System.out.println("test");
        }
}
//The program does not compile because this cannot be referenced in a static method.

 # n java a thread can be created by ?

// Implementing Runnable interface.
// Extending the thread class.
# In how many states Threads can be explained ?// 5
The java thread states are as follows:

New - The thread is in new state if you create an instance of Thread class but before the invocation of start() method.
Runnable - The thread is in runnable state after invocation of start() method, but the thread scheduler has not selected it to be the running thread.
Running - The thread is in running state if the thread scheduler has selected it.
Non-Runnable (Blocked) - This is the state when the thread is still alive, but is currently not eligible to run.
Terminated - A thread is in terminated or dead state when its run() method exits.
 # Which of the following is syntactically wrong ?(B. int 1b;)
 # Which of the following is true regarding source code file ?
 It can have more than one non public class and one public class
 # What is true regarding the following code in Student.Java ?

public class Student{ }

public class ABC { }

// compilation error // source code have only one public class 
# Consider the following code fragment:

int x;

int a = 5;

int b= 8;

x = ++a + b++;

After the execution of this code fragment, what is the value of x?// 14
# Consider the following code fragment:

1. public class Unary{

2. public static void main(String[] args) {

3. byte x = 7;

4. byte y = 6*x++;

5. byte z = x*y;

6. System.out.println ("z: " + z);

7. }

What is the output of this code fragment?
The code will not compile due to line 4.
# Consider the following code fragment:

public class Unary

{

public static void main(String[] args)

{

int x = 7;

int y = 6*x++;

System.out.println (" y= " + y);

int a = 7;

int b = 6*++a;

System.out.println (" b= " + b);

}

}

What is the output of this code fragment?

# Consider the following code fragment:

int x = 9;

int y = -2;

System.out.println("output: " + x%y);

What is the output of this code fragment?// 1







 









)












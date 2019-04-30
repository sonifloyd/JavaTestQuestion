# Consider the following piece of code:

float lu luckyNumber = 1.25;

System.out.println ( "The value of luckyNumber: " + luckyNumber );

What is the result?

// The code would not compile
# Look this code:

1. class CodeWalkOne {

2. public static void main(String [] args) {

3. int [] counts = {1,2,3,4,5};

4. counts[1] = (counts[2] == 2) ? counts[3] : 99;

5. System.out.println(counts[1]);

6. }

7. }

What is the result?

// 99
# Consider the following code fragment:

1. public class Question{

2. public static void main(String[] args) {

3. byte x = 21;

4. byte y = 13;

5. int z = x^y;

6. System.out.println(z);

7. }

8. }

What is the result of this code fragment?

// 24
# Which of the following expressions is legal?// . int x=9;

# Which of the following statements would not produce the compile error? // char my_char='c';
# Which method is used to perform interthread communications // yield ( )
# Which of the following methods is not defined in the Thread class?
// wait() ,notify(),Allnotify() all methods are in Object class 
# What would happen when a thread executes the following statement in its run() method?

sleep(500);
It is going to stop execution and restart execution not earlier than 500 milliseconds.
# Consider the following code fragment:

1. public class ThreadTest {

2. public static void main(String[] args) {

3. Counter ct = new Counter();

4. ct.start();

5. System.out.println("The thread has been started");

6. }

7. }

8. class Counter extends Thread {

9. protected void run() {

10. System.out.println("Hello");

11. }

12. }

What would be the output of this code fragment?
Compiler error on line 9 b/c can not reduce visibility of inherited thread class




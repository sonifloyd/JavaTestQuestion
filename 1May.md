# Assume that a variable exists in a class and that the variable must not be copied into a file when the object
corresponding to this class is serialized. What modifier should be used in the declaration of this variable?
ans -Transient
# Consider the following code fragment:

1. class MySuperClass {

2. static void message() {

3. System.out.println("From the super class!");

4. }

5. }

6. public class MySubClass extends MySuperClass {

7. void message() {// here is error static method can not be override

8. System.out.println("From the subclass!");

9. }

10. public static void main(String args[]) {

11. MySubClass mysub = new MySubClass(); 12. mysub.message();

13. }

14. }

Which of the following modifiers placed in the beginning of line 7 will make the code compile and execute without error?
 ans - Static
 # Which of the following statements is true about the static modifier?
 A static method cannot be overridden to be non-static.
 # A static method cannot be overridden to be non-static.
 The final method may not be overridden.
 # Consider the following code fragment:

1. class MyClass {

2. public void message (int i) {

3. public int j= i;// here is not final if final then compiler error

4. System.out.println("Value of j: " + j);

5. }

6. public static void main(String[] args) {

7. MyClass ma = new MyClass();

8. ma.message(15);

9. }

10. }

Which of the following statements is true about this code?
# Consider the following code fragment:

1. package RobotDrivers ;

2. import robots.*;

3. public class RobotPlayer extends FunnyRobot {

4. static int i =5;

5. public static void main(String[] args){

6. i = 6;

7. RobotPlayer rp = new RobotPlayer();

8. rp.dance();

9. }

10. }

Which of the following statements is true about this code fragment?
The code will compile and execute correctly and generate the output: The funny robot is dancing!.
# Which of the following classes implements the java.util.List interface?
Java.util.LinkedList
# Consider the following code fragment:

1. int i = 5;

2. printIt(i);

3. void printIt(Integer wi) {

4. int j = wi;

5. System.out.println("The value is: " + j);

6. }

What is the output of this code?

ans- The value is: 5







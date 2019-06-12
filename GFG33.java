# What is the use of final keyword in Java?
A
When a class is made final, a sublcass of it can not be created.
B
When a method is final, it can not be overridden.
C
When a variable is final, it can be assigned value only once.
D
All of the above//

# Output of follwoing Java program
class Main {
 public static void main(String args[]){
   final int i;
   i = 20;
   System.out.println(i);//20
 }
 
}


#  class Main {
 public static void main(String args[]){
    final int i;
    i = 20;
    i = 30;
    System.out.println(i);
 }
}
Run on IDE
A
30
B
Compiler Error//  final variable assign only one time
C
Garbage value
D
0


# class Base {
  public final void show() {// this line show error final can not be override
       System.out.println("Base::show() called");
    }
}
class Derived extends Base {
    public void show() {  
       System.out.println("Derived::show() called");
    }
}
public class Main {
    public static void main(String[] args) {
        Base b = new Derived();;
        b.show();
    }
}


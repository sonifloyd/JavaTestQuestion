# JavaTestQuestion
public class example {
   int i[] = {0};
   public static void main(String args[]) {
      int i[] = {1};
      change_i(i);
      System.out.println(i[0]);
   }
   public static void change_i(int i[]) {
      int j[] = {2};
      i = j;// if i[0]=j[0] then print 2
   }
}
output 1
What happens when the following program is compiled and run. Select the one correct answer.


public class example {
   int i[] = {0};
   public static void main(String args[]) {
      int i[] = {1};
      change_i(i);
      System.out.println(i[0]);
   }
   public static void change_i(int i[]) {
      i[0] = 2;
      i[0] *= 2;
   }
}//output 4
What happens when the following program is compiled and executed with the command - java test. Select the one correct answer.


class test {
   public static void main(String args[]) {
      if(args.length > 0)
         System.out.println(args.length);
   }
}// program compile  and run but not print any thing
What would be the results of compiling and running the following class. Select the one correct answer.


class test {
   public static void main() {
      System.out.println("test");
   }
}
// program compile but does not run 

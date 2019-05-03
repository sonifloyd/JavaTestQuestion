class PassA 
{
    public static void main(String [] args) 
    {
        PassA p = new PassA();
        p.start();
    }

    void start() 
    {
        long [] a1 = {3,4,5};
        long [] a2 = fix(a1);// agar fix print line ke baad call hota to value change nhi hota
        System.out.print(a1[0] + a1[1] + a1[2] + " ");
        System.out.println(a2[0] + a2[1] + a2[2]);
    }

    long [] fix(long [] a3) 
    {
        a3[1] = 7;
        return a3;
    }
}// 15 15 
The reference variables a1 and a3 refer to the same long array object. When the [1] element is updated in the fix() method, 
it is updating the array referred to by a1. The reference variable a2 refers to the same array object.

So Output: 3+7+5+" "3+7+5

Output: 15 15 Because Numeric values will be added
# What will be the output of the program?

class Test 
{
    public static void main(String [] args) 
    {
        Test p = new Test();
        p.start();
    }

    void start() 
    {
        boolean b1 = false;
        boolean b2 = fix(b1);
        System.out.println(b1 + " " + b2);
    }

    boolean fix(boolean b1) 
    {
        b1 = true;
        return b1;
    }
}// false true
The boolean b1 in the fix() method is a different boolean than the b1 in the start() method. The b1 in the start()
method is not updated by the fix() method.

# class PassS {
    public static void main(String[] args) {
        PassS p = new PassS();
        p.start();
    }

    void start() {
        String s1 = "slip";
        System.out.println( " 1st print " + s1);
        String s2 = fix(s1);
        System.out.println( " 2nd Print " + s2);
        System.out.println(s1 + " " + s2);
    }

    String fix(String s1) {
        s1 = s1 + "stream";
        System.out.print(s1 + " ");
        return "stream";
    }
}
// 1st print slip
slipstream  2nd Print stream
slip stream
# What will be the output of the program?

class Equals 
{
    public static void main(String [] args) 
    {
        int x = 100;
        double y = 100.1;
        boolean b = (x = y); /* Line 7 */
        System.out.println(b);
    }
}
The code will not compile because in line 7, the line will work only if we use (x==y) in the line. 
The == operator compares values to produce a boolean, whereas the = operator assigns a value to variables.

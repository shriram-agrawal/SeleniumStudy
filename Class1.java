package pkg1;

public class Class1 {
    public static void main(String[] args) {
        System.out.println("Hello World");
        byte b1 = 123;
        short sh1 = 7654;
        int int1 = 3456789;
        float f1 = 12.1212f; //need to specify f at the end for initialization
        double d1 = 12.121211; //do not need to specify d at the end
        char ch1 = 'a';
        boolean b2 = true;
        String str1 = "this is a string";

        //arithmetic operators
        int i1 = 100;
        int i2 = 12;
        float i3 = i1/i2;
        float i4 = i1%i2;
        i1++;

        System.out.println(i3);
        System.out.println(i4);
        System.out.println(i1);

        System.out.println(ch1);

        //logical operators
        boolean a = true;
        boolean b = false;

        System.out.println(false);
        System.out.println(a || b);

        //bitwise operators
        int x = 100;
        int y = 50;

        System.out.println(x & y);
        System.out.println(x | y);
        System.out.println(~x);


        //relational operators
        System.out.println(x==y);
        System.out.println(x<y);

        //conditions
        int marks = 34;

        if (marks >= 90 ){
            System.out.println("A grade");
        } else if(marks >= 60 && marks < 90){
            System.out.println("B Grade");
        }else if (marks >= 40 && marks < 60){
            System.out.println("C Grade");
        }else {
            System.out.println("Failed");
        }

        //Find a program to see the biggest of 3 numbers
        int p = 2;
        int q = 190;
        int r = 80;

        if (p > q && p > r){
            System.out.println(p+" : is the Greater Number out of "+p+" , "+q+" and "+r);
        }else if (q > p && q > r){
            System.out.println(q+" : is the Greater Number out of "+p+" , "+q+" and "+r);
        }else {
            System.out.println(r+" : is the Greater Number out of "+p+" , "+q+" and "+r);
        }
    }
}

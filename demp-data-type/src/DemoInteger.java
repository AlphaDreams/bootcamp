public class DemoInteger {
    public static void main(String[] args) {
    System.out.println("Hello, World!");

    //define variable y to store an integer value 100
    int y = 100;
    //print out variable y
    System.out.println(y);

    //Re-assigment
    y = 200;
    System.out.println(y);

    //int is a data type
    //! We cannot re-define the type of
    //We can define the type of y once
    //int y = 200;

    //+ - * /
    int a = 1 + 2;
    System.out.println(a); //3

    //from right to left
    //1.y +2 > 202
    //2. Assign 202 into y.
    y = y + 2;
    System.out.println(y);


    // - *
    //Define variable b, store 99
    //b -200, put the result into q
    //q x 10, put the result into q again
    //print out q


    int b = 99;
    int q = b - 200;
    q = q*10;

    System.out.println(q);

    int bootcamp = 6 + 10 * 5;
    System.out.println(bootcamp); //56

    int bootcamp2 = (6 + 10) * 5;
    System.out.println(bootcamp2); //80

     //! Put 2.5 into an integer variable > trim decimal places (Java)
    int r = 5 / 2;
    System.out.println(r); //2

    //! Put ~3.3333 into an integer variable > trim decimal places (Java)
    int r2 = 10 / 3;
    System.out.println(r2); //3
    }
}

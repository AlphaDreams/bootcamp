public class DemoConversion {
  public static void main(String[] args) {
    int x = 3;
    // because it is safe conversion, so java helps auto-convert
    long l = x;
    System.out.println(l); //3

    // because it is safe conversion, so java helps auto-convert
    double d1 = 0.3f;
    System.out.println(d1); //0.3 (floating point ...)

    // ! NOT OK, x is variable of int, unsafe conversion conversion, java reject auto-conversion
    //byte b1 = x; 
    byte b1 = (byte) x; // may cause overflow

    // ! 1.Implicit conversion
    // ! byte > short > int > long > float > double
    // !  char > int
    double d2 = 3L;
    System.out.println(d2); //3.0

    float f2 = 4L;
    System.out.println(f2); //4.0

    int asciiOfa = 'a';
    System.out.println(asciiOfa); // 97
    // 0, A, a
    int assciiOfA = 'A';
    System.out.println(assciiOfA); //65
    int assciiOf0 = '0';
    System.out.println(assciiOf0); //48

    // ! 2. Explicit Conversion
    int x2 = 3000;
    short s2 = (short) x2;

    // ! 3. autobox, unbox (Wrapper class)
    int x3 = Integer.valueOf(9); //unbox
    Integer x4 = x3; //autobox

  }
}

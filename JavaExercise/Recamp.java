public class Recamp {
  public static void main(String[] args) {
    
    // Data Type: Primitives

    byte b1 = -128;
    byte b2 = 127;
    //byte b3 = 128;
    
    // short s1 = 33000;
    short s2 = 32000;
    short s3 = -32000;

    int i1 = 2_100_000_000;
    int i2 = -2_100_000_000;

    // int to long (auto-convert)
    long l1 = 10L;

    //
    float f1 = 3.3f;
    
    double d1 = 10.9;

    char c1 = 'a';    
    System.out.println('a' - 'a'); //0
    System.out.println( 'a' - 'b'); // -1

    boolean isEldery = false;
    // isEldery > formula / definition
    int age = 65;
    isEldery = age >=65;

    if (isEldery){
      System.out.println("I am not an elderly.");
    }
    if (age < 65){
      System.out.println("I am not an elderly.");
    } 

    int b = 3;
    boolean result = b > 1 || b > 10;  
    boolean result2 = true || false; //! dead code / rubblish code
    
    System.out.println(result2);
    System.out.println(true && false); // false
    
    // ! true && true
    // ! true && false > false
    // ! true || false > true

    //+, -, *, /, % 
    // !餘數計單雙數
    int x = 10;
    boolean isOdd =  x % 2 == 1;

    int a = 0;
    a++;
    ++a;
    System.out.println(a++); // 2
    System.out.println(a); // 3
    a += 2;
    a = a + 3;

    //System.out.println(10 / 0); // system error
    System.out.println(0 / 3); //0
    System.out.println( 10/3); //3

    System.out.println(10.0 / 3.0); // 3.3333333333333335

    // if, elase if , else 
    // ! 練習練習再練習 不要寫重疊的範圍
    int y = 4;
    int u = 3;
    if (y > 2 && u < 1) {
    
    } else if (y > 2 && u >= 1) {

    } else if (y <=2 && u < 1) {
      
    } else { // y <= 2 && u >=1 

    }

    if (y > 8) {   // ! 集中練習
      System.out.println("Java");
    } else if (y > 1 && y <=8) {
      System.out.println("Python");
    } else if (y > -3 && y <= 1) {
      System.out.println("JavaScript");
    } else if (y <= -3) {
      System.out.println("C++");
      
    }

     int o = 1;
     // 1. (cannot check range of values)
     // 2. break;
     switch(o) {
        case 1:
          System.out.println("do something 1 ...");
          break;
        case 2:
          System.out.println("do something 2 ...");
          break;
        default:
          System.out.println("something else ...");
          
      }
 
      // loop, repeat to do something in x times
      //
      for (int i = 0; i < 3; i++) {
        System.out.println("hello");
      }

      //! for (int i = 1; i < 3; i++) {   int i = 1 XXXXXXXX
      //!  System.out.println("hello");
      //!}


      // we can leverage i to do something (i.e. charAt)
      String s = "hello";   // ! 
      for (int i = 0; i < s.length();i++) {
        System.out.println(s.charAt(i));
      }

  }
}

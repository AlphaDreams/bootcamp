public class DemoMathOperator {
  public static void main(String[] args) {
    // +1
    int x = 3;
    x = x +1;
    x +=1;
    x++;
    ++x;
    System.out.println("x=" + x);

    // -1
    int y = 5;
    y = y - 1;
    y -=1;
    y--;
    --y;
    System.out.println("y=" + y);

    // + or - non 1 number
    int z = 10;
    z = z + 2;
    z +=2;
    z = z - 3;
    z -=3;
    System.out.println("z=" + z);

    // * or /
    int a = 6;
    a = a * 2;
    a *=2;
    a = a / 2;
    a /=2;
    System.out.println("a=" + a);

    // Count number of even number between 0 - 9
    int count = 0;

    for (int i = 0; i < 10; i++) { // 0,1,2,3,4,5,6....,9
      if (i % 2 == 0 ){
        count++;
      }
    }
    System.out.println("count even number =" + count);


    //Larger number
    int num1 = 10;
    int num2 = 12;
    // 12
    int max = 0;
    if (num1 > num2) {
      max = num1;
    } else {
      max = num2;
    }
    System.out.println(max); 

    // Largest number between 3 numbers
    //int num3 = 13;
    // 13

    int num3 = 13;
    if (max < num3) {
      max = num3;
    }
    System.out.println(max);

    //Find Min. number
    //40, 32, -19

    //Min. number
    int num4 = 40;
    int num5 = 32;

    int min = 0;

    if (num4 < num5) {
      min = num4;
    }
    System.out.println(min);

    int num6 = -19;

    if  (num4 < num6){
      min = num4;
    } else {
      min = num6;
      System.out.println(min);
    }


  }
}



import java.math.BigDecimal;
import java.util.Arrays;

public class DemoForLoop {
  public static void main(String[] args) {

    // array + for loop
    // find max
    int[] arr = new int[] {100, -20, 200, 17};
    int max = Integer.MIN_VALUE; // !stable method

    for (int i = 0; i < arr.length; i++) {
      if (arr[i] > max) {
        max = arr[i];
      }
    }
    System.out.println(max);

    // Approach 2 (Math)
    max = Integer.MIN_VALUE;
    for (int i = 0; i < arr.length; i++) {
      max = Math.max(arr[i], max);
    }
    System.out.println(max); // 200

    // equals(), length(), charAt()

    //
    char[] chs = "hello".toCharArray();
    System.out.println(Arrays.toString(chs)); // [h, e, l, l, o]

    // convert l to x and a to b
    // "hello" > "hexxo"
    for (int i = 0; i < chs.length; i++) {
      if (chs[i] == 'l') {
        chs[i] = 'x';
      } else if (chs[i] == 'a')
        chs[i] = 'b';
      {
      }


      System.out.println(Arrays.toString(chs)); // [h, e, x, x, o]
      // "hello" > "hexxo"

      // convert from char[] to String
      System.out.println(String.valueOf(chs)); // hexxo

      System.out.println("hello".replace('l', 'x')); // hexxo

      System.out.println("hello".equals("Hello")); // false
      System.out.println("hello".equalsIgnoreCase("Hello")); // true


    }

    double[] values = new double[] {0.2, 0.5, 1.9};
    // add 0.1
    // [0.3, 0.6, 2.0]
  
    for (int i = 0; i < values.length; i++) {
      values[i] = BigDecimal.valueOf(values[i])
        .add(BigDecimal.valueOf(0.1)) //
        .doubleValue();
    }
    
    // results
    System.out.println(Arrays.toString(values)); //  [0.3, 0.6, 2.0]

    BigDecimal[] bds = new BigDecimal[3];
    
    bds[0] = BigDecimal.valueOf(10.3);
    bds[1] = new BigDecimal("2.4");
    bds[2] = BigDecimal.valueOf(9.9);

    System.out.println(Arrays.toString(bds)); // [10.3, 2.4 ,2.9]

    float[] fArr = new float[bds.length];
    // for loop: bigDecimals > fArr
    for(int i = 0; i < bds.length;i++) {
      fArr[i] = bds[i].floatValue();
    }
    System.out.println();




  }
}

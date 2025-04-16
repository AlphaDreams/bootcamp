import java.math.BigDecimal;
import java.math.RoundingMode;

public class DemoBigDecimal {
  public static void main(String[] args) {
    // double + double
System.out.println(0.1 + 0.2); //0.30000000000000004   90% people using

    // Solution
    BigDecimal bd1 = new BigDecimal("0.1"); // approach 1
    BigDecimal bd2 = BigDecimal.valueOf(0.2); // approach 2 (perfer)
    System.out.println(bd1);
    System.out.println(bd2);

    // bd1 + bd2 > 0.3
    // ! add
    BigDecimal bd3 = bd1.add(bd2);
    System.out.println(bd3); // 0.3
    System.out.println(bd1); // 0.1
    System.out.println(bd2); // 0.2

    // ! subtract()

    BigDecimal bd4 = new BigDecimal("0.2");
    BigDecimal bd5 = BigDecimal.valueOf(0.7);

    //
    BigDecimal bd6 = bd4.subtract(bd5);
    System.out.println(bd6);
    System.out.println(bd4);
    System.out.println(bd5);

    // ! multiply

    BigDecimal bd7 = new BigDecimal("0.7");
    BigDecimal bd8 = BigDecimal.valueOf(1.9);

    //
    BigDecimal bd9 = bd7.multiply(bd8);
    System.out.println(bd9);
    System.out.println(bd7);
    System.out.println(bd8);


    // ! divide()
    //10 /3
    BigDecimal bd10 = new BigDecimal("8.5");
    BigDecimal bd11 = BigDecimal.valueOf(2);

    // Non-terminating decimal expansion
    //BigDecimal bd12 = bd10.divide(bd11);

    //
    BigDecimal bd12 = bd10.divide(bd11, 2, RoundingMode.HALF_DOWN);
    
    //
    BigDecimal bd13 = bd10.divide(bd11, 2, RoundingMode.HALF_UP); 
    
    System.out.println(bd12);
    System.out.println(bd13);


    // rounding? 3.45 > 3,5 (HALF_DOWN)? 3.45 > 3.5 (HALF_UP)?

    System.out.println(BigDecimal.valueOf(-2).abs()); //2
    System.out.println(BigDecimal.valueOf(2).pow(3)); //8

    BigDecimal source = BigDecimal.valueOf(2);
    double result = source.doubleValue();
    long result2 = source.longValue();
    int result3 = source.intValue();
    float result4 = source.floatValue(); // float > double







  }
}

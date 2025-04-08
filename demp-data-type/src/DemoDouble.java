public class DemoDouble {
  public static void main(String[] agrs) {
    int x = 9;

    //Store a number with decimal places
    // Type: double
    double y = 9.9;
    System.out.println(y); //9.9

    //! We cannot store d.p. into integer variable
    //x = 9.9

    //Store 99.9 into variable price
    //Store 3 into variable quqntity
    //calculate checkout amount

    double price = 99.9;
    int quantity = 3;
    double amount = price * quantity;
    System.out.println(amount); //299.70000000000005

    //! Problem for "double"
    double o1 = 0.1 + 0.2;
    System.out.println(o1); // 0.300000000004

    //! int / int > int
    //10 > int value
    //3 > int value
    //1. 10 / 3 > int / int > int  (10 / 3 > 3)
    //2. assign result into w (3 > 3.0)

    //! double / int > double
    int score1 = 71;
    int score2 = 82;
    //calculate teh average score
    // Step1: (int + int) / int > int (71+82) / 2 > 76
    // Step2: 76 > 76.0
    //calculate the average score
    double averageScore = (score1+score2) /2;
    System.out.println(averageScore); //76.0

    //! divded by zero > System Error
    // divided by zero
    //double r3 = 10 / 0;
    //System.out.println(r3);

    double r4 = 0 / 10;
    System.out.println(r4);

  }
}

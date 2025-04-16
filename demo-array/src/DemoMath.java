import java.util.Arrays;
import java.util.Random;

public class DemoMath {
  public static void main(String[] args) {
    //abs
    //pow

    // int > double (safe > auto-conversion)
    double result = Math.pow(2.0, 3);
    System.out.println(result); // 8.0

    // square root  
    System.out.println(Math.sqrt(81)); //9.0


    double value = -3.0;
    System.out.println();



    // ROund to integer
    System.out.println(Math.round(3.24)); //3
    System.out.println(Math.round(3.7812931)); //4


    // 0 - 1
    System.out.println(Math.random());


    System.out.println(new Random().nextInt(3)); // 0 - 2

    // 1 - 3
    System.out.println(new Random().nextInt(3) + 1); // 1 - 3

    // 0 - 48
    // 1- 49
    System.out.println(new Random().nextInt(49) + 1); // 1 - 49

    // Generate 6 different numbers between 1 - 49
    int[] marksix = new int[6];
    int k = 0;
    while(k < 6) {
      marksix[k++] = new Random().nextInt(49) + 1;
      k++;
    }

    // Generate 6 different numbers between 1 - 49
    int[] marksix2 = new int[7];
    int uniqueCount = 0;
    boolean found = false;
    while(uniqueCount < 7) {
      int generatedValue = new Random().nextInt(49) + 1;
    
      // ! Check if generated value is alreadty in the array > found
      // code .. for loop + if
     found = false;
     for(int i = 0; i < marksix2.length; i++){
        if (marksix2[i] == generatedValue) {
          found = true;
          break;
        }
     }
     if(!found) {
      marksix2[uniqueCount] = generatedValue;
      uniqueCount++;
     }
    }
    System.out.println("MarkSix Results: " + Arrays.toString(marksix2));
 
  }
}
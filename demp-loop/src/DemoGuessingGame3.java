import java.util.Scanner;

public class DemoGuessingGame3 {
  public static void main(String[] args) {

    // 1 - 100
    // Bomb = 67

    // User A: 93 (1-100)
    // User B: 49 (1-92)
    // User A: 66 (50-92)
    // User B: 68 (67-92)
    // User A: 67 (67-67) > User B Win.

    int bomb = 67; //radom number
    // loop
    // Scanner (Collect user input)
    // ! User A and B ?
    // Adjust the range of numbers
    // Prompt Question: Please input a number:
    // continue condition
    int input = -1;
    int min = 1;
    int max = 100;
    Scanner scanner = new Scanner(System.in);
    int round = 0;
    char user = 'A';

    while (input !=bomb){
      if (round % 2 ==0){
        user = 'A';
      } else if {
        user = 'B';
      } else {
        user = 'C';
      }
      System.out.println("User "+ user + ", Please input a number between " + min + "-" + max);
      input = scanner.nextInt();
      // Validate input if it is valid
      // Adjust the range of numbers
      if (input < min || input > max) {
        System.out.println("Input Vaild! Please Input Again.");
        continue; 
      }
        if (input > bomb) {
            max = input - 1;
          } else { 
            min = input + 1;
          } 
          round++;   
        }
      
      // round A, round 1, lose
      if (round % 2 ==1) {
        user = 'B';
      } else {
        user = 'A';
      }
     System.out.println("Game end. User " + user + " win.");
     scanner.close();

      //! How about 3 users

  }
}

public class JavaQuest5 {
  /**
   * Expected output: The index of the last character of c is 11
   */
  public static void main(String[] args) {
    String str = "coding bootcamp."; // You should not change this line
    char target = 'c';
    boolean found = false;
    
    // if found, print "Found."
    // if not found, print "Not Found."
    // code here ...

    for (int i = 0; i < str.length(); i++) {
      if (str.charAt(i) == target) {
        found = true;
        break;
      }
    }

    if (found) {
      System.out.println("Found.");
    } else {
      System.out.println("Not Found.");
    }
  }
}

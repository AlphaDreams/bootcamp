public class DemoString {
  public static void main(String[] args) {
    char c1 = 'H';
    //String is not a primitive
    String s1 = "Hello";
    String s2 = "100";
    String s3 = "200";
    String s4 = "300";
    String s5 = "love";

    //String + operation
    s2 = s2 +"100";
    System.out.println(s2); // "100100"
    
    s1 = s1 +"100";
    System.out.println(s1); // "Hello100"
    
    s3 = s3 + (char) '9';
    System.out.println(s3); // "1001009"

    s4 = s4 + 777; // String + int
    System.out.println(s4); // 

    s5 = s5 + 100f; // String + float
    System.out.println(s5); // 

  }
  
}

public class Exercise1 {
  public static void main(String[] args) {

    


    String s1 = "Well";
    
    // equals()
    System.out.println(s1.equals("Well"));
    System.out.println(s1.equals("Done"));
    
    boolean result = s1.equals("Well");
    boolean result2 = s1.equals("Done");
    System.out.println(result);
    System.out.println(result2);
    
    // length()
    System.out.println(s1.length());
    int s1Length = s1.length();
    System.out.println(s1Length);

    // charAt()
    System.out.println(s1.charAt(1));
    char firstChar = s1.charAt(0);
    System.out.println(firstChar); // W

    //System.out.println(s1.charAt(10)); //Exception (System Error)


    // Naming Convention - Java
    // Camel case
    String studentName = "John";
    System.out.println(studentName);


  }
}

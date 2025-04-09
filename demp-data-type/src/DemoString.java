public class DemoString {
  public static void main(String[] args) {
    char c1 = 'H';
    //String is not a primitive
    String s1 = "Hello";
    String s2 = "100";

    //String + operation
    s2 = "100" + s2 ;
    System.out.println(s2); // "100100"
    
    s1 = s1 +"100";
    System.out.println(s1); // "Hello100"
    
    // String + int > String (Step 1)
    // Assign String value to String variable (Step 2)
    String s3 = "hello" + 13;
    System.out.println(s3);
    
    //String + boolean > String
    s3 = s3 +true;
    System.out.println(s3);

    // ! String method 1: equals()
    // ! Primitive has no tools (value storage ONLY)
    // String is not a primitive. So String can store value and has tool.
    String s4 = "hello";
    System.out.println(s4.equals("hello")); // true, asking if s4 equals to "hello"
    System.out.println(s4.equals("male")); // false, asking if s4 equals to "male"
    
    

    boolean result = s4.equals("hello");
    System.out.print(result); //true

    System.out.println(s4.equals("Hello")); // false, case sesentive
    

    // ! String method 2: length()
    // String method 2: length()
    // 參數 = parameter
    // length() has no parameters
    System.out.println(s4.length()); //5
    int s4Length = s4.length();
    System.out.println(s4Length); //5

    double d1 = s4.length(); // ! Why OK?
    // short s10 = s4.length(); //! Why NOT OK?
    


    // ! String Method 3: charAt()
    // 1 is an index, which always start with 0
    System.out.println(s4.charAt(1)) ; //e
    System.out.println(s4.charAt(0)) ; //h

    char s4CharAt = s4.charAt(2);
    System.out.println(s4CharAt); 

  }
  
}

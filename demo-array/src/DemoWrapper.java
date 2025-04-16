public class DemoWrapper {
  public static void main(String[] args) {
  
    // 8 primitives 
    byte b = 1;
    short s = 2;
    int x = 3;
    long l = 4L;
    float f = 3.14f;
    double d = 3.14d;
    char c = 'a';
    boolean b2 = true;

    //Wrapper Class of char 
    Character c1 = Character.valueOf('a');
    System.out.println(c1); //a
    char c0 = c1.charValue();
    System.out.println(c0);

    System.out.println(c1.compareTo(Character.valueOf('c'))); //-2
    System.out.println(Character.valueOf('c').compareTo(c1)); //2
    System.out.println(Character.valueOf('c').compareTo(Character.valueOf('c'))); //0

    //Wrapper Class of boolean
    Boolean b3 = Boolean.valueOf(true);
    Boolean b4 = Boolean.valueOf(false);

    //Wrapper Class of byte, short, int , long
    byte b6 = 2;
    Byte b5 = Byte.valueOf((byte) 2);
    // int > byte (unsafe)
    Short s2 = Short.valueOf((short) 2);
    Integer i1 = Integer.valueOf(2);
    Long l1 = Long.valueOf(2L);

    // Wrapper class of float, double
    Float f3 = Float.valueOf(3.14f);
    Double d3 = Double.valueOf(3.14);

    //  Autoboxing (Only for the pair of primitive and wrapper class)
    // int value > INteger variable
    Integer i2 = 2;
    
    // int > long (safe conversion)
    long l3 = 2;

    // int value > long value > Long (NOT OK for auto-conversion)
    // Long l2 =2;
    
    // long value > Long
    Long l2 = 2L;

    // ! Unboxing
    int i4 = Integer.valueOf(10);
    // int i5 = Long.valueOf(10L);
    long i5 = Long.valueOf(10L);
    // Long > long > int > (autobox) Integer
    Integer i6 = (int) ((long) Long.valueOf(10L)); //! for fun








  }
}

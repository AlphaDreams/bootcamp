public class DemoASCII {
  public static void main(String[] args) {
    char x  = 'a';
    System.out.println(x); //a
  
  // 0 - 65535
  // int 2.1b
  int ascii = x;  
  System.out.println(ascii); //97

  char y  = 'b';
  System.out.println(y); //a

// 0 - 65535
// int 2.1b
int ascii2 = y;  
System.out.println(ascii2); //98

  
char z  = 'z';
System.out.println(z); //a

// 0 - 65535
// int 2.1b
int ascii3 = z;  
System.out.println(ascii3); //122


    char k = '我';
    int tutor = k;
    System.out.println(tutor); //25105

    char u = '。';
    int q = u;
    System.out.println(q); // 12290

    // given a-z, convert to 1-26
    char v = 'z';
    int converted = v - 'a'+1 ;
    System.out.println(converted); // 26


    // char (Math operation)
    // char - char > int - int
    System.out.println('b' - 'a'); // 98 - 97 = 1


  }
}

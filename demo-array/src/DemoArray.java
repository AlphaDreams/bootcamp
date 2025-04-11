public class DemoArray {
  public static void main(String[] args) {
    // assign int value 3 in to int variable
    int x1 =3;
    int x2 =4;
    int x3 =-7;


    // array []
    // right hand side > creating an array with size 3.
    // left hand side > assign int arry object to int array type (variable)
    int[] arr = new int[3]; //now, we got 3 boxes able to store 3 int values.

    // write 
    // First box (index)
    arr[0] = 3;
    // second box
    arr[1] = 4;
    // third box
    arr[2] = -7;

    // Question: int array with size 5.
    // 10,7,4,-100, 6
 
    int[] arr2 = new int[5];

    arr2[0] = 10;
    arr2[1] = 7;
    arr2[2] = 4;
    arr2[3] = -100;
    arr2[4] = 6;


    // Qusetion: double array with size 4
    // assign 4 double values intp the array
  
    double[] arr3 = new double[4];
    arr3[0] = 10.3;
    arr3[1] = -4.2;
    arr3[2] = 7.8;

    // read
    System.out.println(arr3[0]); //10.3
    System.out.println(arr[0]); //3
    System.out.println(arr2[0]); // 10
    
    double amount = 99.9;
    arr3[0] = amount; //assign double value into a double variable
    System.out.println(arr3[0]); //99.9

    // String array
    //size 3 , with 3 string value

    String[] arr4 = new String[3];

    arr4[0] = "I love Java";
    arr4[1] = "I love Java2";
    arr4[2] = "I love Java3";


  }
}

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

    // double array, for loop + sysout print out vaues
    
    double[] amounts = new double[6];
    amounts[0] = 10.9;
    amounts[3] = 14.1;
    amounts[5] = 99.99;
    for(int i = 0; i < amounts.length; i++){
      System.out.println(i);
    }


    // +1.5 to all arry values

    for(int i = 0; i < amounts.length; i++){
      // amounts[i] = amount[i] + 1.5;
      amounts[i] += 1.5;
      System.out.println(amounts[i]);
    }

    // for + if
    // print out those values > 100

    for (int i = 0; i < amounts.length; i++){
      if(amounts[i] <= 100) {
        continue;
      }
      System.out.println(amounts[i]);
    }

   // int array
   // Find even number, and then print out "Age=x"
    int[] ages = new int[4];
    ages[0] = 19;
    ages[1] = 14;
    ages[2] = 10;
    ages[3] = 65;
    for (int i = 0; i < ages.length; i++){  // ages.length 0,1,2,3
      if (ages[i] % 2 ==0) {
        System.out.println("Ages=" + ages[i]);
      }
    }

    //array + for + if
    // find the max value in the array
    int[] numbers = new int[6];
    numbers[0] = 10;
    numbers[1] = 52;
    numbers[2] = 144;
    numbers[3] = 1000;
    numbers[4] = 980;
    numbers[5] = 16;

    int box = Integer.MIN_VALUE;

    for(int i = 0; i < numbers.length; i++){
      if (numbers[i] > box){
        box = numbers[i];
      }
    }
    System.out.println("Max=" + box);


    //  find min. salary
    int[] salaries = new int[4];
    salaries[0] = 14000;
    salaries[1] = 19000;
    salaries[2] = 21000;
    salaries[3] = 34000;

    int box2 = Integer.MAX_VALUE;

    for(int i = 0; i < salaries.length; i++){
      if (salaries[i] < box2){
        box2 = salaries[i];
      }
    }
    System.out.println("Min. Salary=" + box2);


    // John, Steven , Eric
    String[] names = new String[3];

    // Find the longest name in the array
    names[0] = "John";
    names[1] = "Steven";
    names[2] = "Eric";

    String longestName = "";

   for(int i = 0; i < names.length; i++){
    if(names[i].length() > longestName.length()) {
      longestName = names[i];
      }
    }
    System.out.println("LongestName = " + longestName);


    int[] nums = new int[4];
    nums[0] = 9;
    nums[1] = 8;
    nums[2] = 7;
    nums[3] = 10;
    //Print out the first even number > break

    int firstEven = 0;

    for(int i = 0; i < nums.length; i++) {
      if (nums[i] % 2 ==0) {
        firstEven = nums[i];
        break; //exit for loop
      }
    }
    System.out.println("first even number = " + firstEven);

    char[] directions = new char[5];
    // l = left
    // r = right 
    directions[0] = 'l';
    directions[1] = 'l';
    directions[2] = 'r';
    directions[3] = 'l';
    directions[4] = 'r';
    // l > score +3
    // r > score -2\

    int score = 0;

    for(int i = 0; i < directions.length; i++) {
      if (directions[i] == 'l') {
        score += 3;
      }else { 
        score -= 2;
      }
    }
    System.out.println("Total score = " + score);


    // Swapping
    int w1 = 2;
    int w2 = 3;

    int backup = w1;
    w1 = w2;
    w2 = backup;
    System.out.println("w1 = " + w1);
    System.out.println("w2 = " + w2);

    int[] marksix = new int[6];
    marksix[0] = 5;
    marksix[1] = 20;
    marksix[2] = 2;
    marksix[3] = 43;
    marksix[4] = 39;
    marksix[5] = 57;
    for(int i = 0; i < marksix.length; i++){
      System.out.println(marksix[i]);
    }
    // 5 20 47 43 39 2
    // ! i = 0, j = 0,1,2,3,4
    // round 1: 5 vs 20 (20 > 5, no swap) > 5 20 47 43 39 2
    // round 2: 20 vs 47 (47 > 20 , no swap) > 5 20 47 43 39 2
    // round 3: 47 vs 43 (43 < 47, swap) > 5 20 43 47 39 2
    // round 4: 47 vs 39 (39 < 47, swap) > 5 20 43 39 47 2
    // round 5; 47 vs 3 (3 < 47, swap) > 5 20 43 39 2 47

    // ! i = 1
    // round 1: 5 vs 20 (20 > 5, no swap) > 5 20 43 39 2 47
    //....


    // Finally > 2 5 20 39 43 47
    // ! sprting
    // swapping
    int temp = -1;
    for(int i = 0; i < marksix.length - 1; i++){ // i = 0 (how many numbers I need to swap)
      for(int j = 0; j < marksix.length - i - 1; j++){ // j = 0,1,2,3,4,5 | j=0,1,2,3
        if (marksix[j + 1] < marksix[j]) {
          temp = marksix[j + 1];
          marksix[j + 1] = marksix[j];
          marksix[j] = temp;
        }
      }
    }
     for (int i = 0; i < marksix.length; i++){
      System.out.println(marksix[i]);
     }

     // counting
     char[] chs = new char[] {'o','p','a','p'};
     // count the nnumber of 'p'
     int counts = 0;
     for(int i = 0; i < chs.length; i++){
      if(chs[i] == 'p'){
        counts++;
      }
     }
     System.out.println("counting = " + counts++);


     char[] chs2 = new char[] {'o','p','a','p','o','z','q','z','q','c'};
     // how many character which 數量 > 1 > o and p
     // 2
     int[] counts2 = new int[26]; // 0-25
     for(int i = 0; i < chs2.length; i++){
      counts2[chs2[i]-'a']++;
     }
     int result = 0;
     for (int i = 0; i < counts2.length; i++){
        if (counts2[i] > 1) {
          result++;
        }
     }
     System.out.println("counting = " + result);


     // 0 9 1 9 2 0 9 9
     // is there any number apprear 3 times or more?
     // true

     char[] chs3 = new char[] {'0','9','1','9','2','0','9','9'};
     // how many character which 數量 > 3 > o and p
     // 2
     int[] counts3 = new int[10]; // 0-9
     for(int i = 0; i < chs3.length; i++){
      counts3[chs3[i]-'0']++;
     }
     int result2 = 0;
     for (int i = 0; i < counts3.length; i++){
        if (counts3[i] > 3) {
          result2++;
        }
     }
     System.out.println("counting = " + result2);

     //String[] lastNames new String[] {"Lau", "Wong", "Chan"};
     // 8 primitives + String



     

  }
}

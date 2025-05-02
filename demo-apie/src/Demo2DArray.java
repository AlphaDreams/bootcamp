public class Demo2DArray {
  public static void main(String[] args) {
    int[] arr = new int[] {1,2,3};
    int[] arr2 = new int[3];
    String s = "hello";
    arr2[0] = s.length();

    // 2D array
    // level1,2,3
    // MAXHP, MAXMP, PA, PD, MA, MD

    // new int[row][colum]
    // 3 roles
    // 10 levels
    // 6 attributes
    int[][]warrior_values = new int[10][6];
    int[][]mage_values = new int[10][6];
    int[][]archer_values = new int[10][6];


    // write
    warrior_values[0] = new int[] {200, 80, 10, 8, 5, 3};
    warrior_values[9] = new int[] {500, 200, 80, 50, 40, 20};

    int[][] arr2d = new int[][] {{10, 20, 30}, {100, 90, -100}};
    //System.out.println(arr2d[0][0]); // 10
    //System.out.println(arr2d[1][2]); // -100
    //System.out.println(arr2d[1][1]); // 90
    //System.out.println(arr2d[0][2]); // 30

    // read
    System.out.println(arr2d[0][0]); //10
    System.out.println(arr2d[1][2]); //100
    System.out.println(arr2d.length); // 2, number of rows
    System.out.println(arr2d[0].length); // 3,number of colums for each row

    // 使用 for 迴圈逐行逐列印出
    //for (int i = 0; i < arr2d.length; i++) {          // 外層迴圈：處理每一行
    //for (int j = 0; j < arr2d[i].length; j++) {   // 內層迴圈：處理每一列
    //System.out.print(arr2d[i][j] + " ");      // 印出元素 + 空格分隔
    // }
    //System.out.println();  // 換行（每印完一行換行）
    //}

    for (int row = 0; row < arr2d.length; row++) {
      for (int col =0; col < arr2d[row].length; col++) {
        System.out.println(
          "row=" + row + ",col=" + col + ",value=" + arr2d[row][col]);
      }
    }



  }
}

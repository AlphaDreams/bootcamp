public class DemoForLoop {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        int x = 2;
        x = x * 2;
        x = x * 2;
        x = x * 2;
        System.out.println(x); // 16

        int base = 2;
        int value = 2;
        for (int i = 0; i < 3; i++) {
            value = value * base;
        }
        System.out.println(value);

        // base = ?, +8 (10 times)

        int num1 = 9;
        int num2 = 17;
        int max = -1;
        if (num1 > num2) {
            max = num1;
        } else {
            max = num2;
        }

        System.out.println(max);


        // 0 - 100, Find the largest odd number, which is < 90
        // for

        int maxOdd = -1;

        for (int i = 0; i < 101; i++) {
            if (i % 2 == 1 && i < 90 && i > maxOdd) {
                maxOdd = i;
            }
        }
        System.out.println(maxOdd); // 89


        // 0 -20, sum up all even numbers
        // 0 + 2 + 4 ...+20
        int sum = 0;
        for (int i = 0; i < 21; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        System.out.println(sum);

        // 0 -30, if < 20, sum up odd numbers, if >= 20 sum up even numbers
        // result

        int box = 0;
        for (int i = 0; i < 31; i++) {
            if (i % 2 == 1 && i < 20 || i % 2 == 0 && i >= 20) {
                box += i;
            }
        }
        System.out.println("box is : " + box); // 250

        // Searching
        String s1 = "welcome to bootcamp.";
        // 1. Find the number of 'o'
        // CharAt()

        int count = 0;

        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) == 'o') {
                count++;
            }
        }
        System.out.println("number of O : " + count);

        // ! for + continue
        // Approach 1:simple if
        for (int i = 0; i < 3; i++) {
            if (i % 2 == 0) {
                System.out.println(i); // 0,2
            }
        }
        // Approach 2:continue
        for (int i = 0; i < 3; i++) {
            if (i % 2 == 1) {
                continue; // skip teh rest of code, got to i++
            }
            System.out.println(i); // 0,2
        }

        // ! for break
        // Approach 1: simple if
        for (int i = 0; i < 3; i++) {
            if (i < 2) {
                System.out.println(i); // 0,1
            }
        }

        // ! for break
        // Approach 2: break
        for (int i = 0; i < 3; i++) {
            if (i >= 2) {
                break; // skip the rest of code, goes to i++
            }
            System.out.println(i); // 0,1
        }

        // Question: sum up 5 - 15 > result
        // the product of 16 - 20 > result2
        // single for loop

        int total = 0;
        int product = 1;
        for (int i = 0; (i < 21); i++) {
            if (i >= 5 && i <= 15) {
                total += i;
                continue;
            }
            if (i >= 16 && i <= 20) {
                product *= i; // product = product * i
            }
        }
        System.out.println(total);
        System.out.println(product);


        for (int i = 10; i > 0; i--) {
            System.out.println(i);
        }


        // ! Nested Loop
        // i=0, j=0,1
        // i=1, j=0,1
        // i=2, j=0,1

        for (int i = 0; i < 3; i++) { // i=0, j=0,1
            for (int j = 0; j < 2; j++) {
                System.out.println("i=" + i + ",j=" + j);
            }
        }



    }
}

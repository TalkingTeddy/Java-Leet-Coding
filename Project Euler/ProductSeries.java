import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Scanner;

// The four adjacent digits in the 1000-digit number that have the greatest product are 9 × 9 × 8 × 9 = 5832.

// Find the thirteen adjacent digits in the 1000-digit number that have the greatest product. What is the value of this product?

// 73167176531330624919225119674426574742355349194934
// 96983520312774506326239578318016984801869478851843
// 85861560789112949495459501737958331952853208805511
// 12540698747158523863050715693290963295227443043557
// 66896648950445244523161731856403098711121722383113
// 62229893423380308135336276614282806444486645238749
// 30358907296290491560440772390713810515859307960866
// 70172427121883998797908792274921901699720888093776
// 65727333001053367881220235421809751254540594752243
// 52584907711670556013604839586446706324415722155397
// 53697817977846174064955149290862569321978468622482
// 83972241375657056057490261407972968652414535100474
// 82166370484403199890008895243450658541227588666881
// 16427171479924442928230863465674813919123162824586
// 17866458359124566529476545682848912883142607690042
// 24219022671055626321111109370544217506941658960408
// 07198403850962455444362981230987879927244284909188
// 84580156166097919133875499200524063689912560717606
// 05886116467109405077541002256983155200055935729725
// 71636269561882670428252483600823257530420752963450

/*
 * One way to solve this would to use the method of fibonacci. Initializing all the digits into an array and then iterating through the array to find the largest product. 
 * 
 * First lets create two functions. One would create products the other would identify the largest.
 * 
 * Obstacle 1 : Unable to figure out how to set digits of a big integer into an array.
 * Solution 1 : Instead of initializing an array I could rather initialize a character array that would store all the character.
 * 
 * // ? Now I need to figure out a way to convert a character back to integer and multiply it with it's adjacent. 
 * 
 * OOOO I could convert the characters into an array then push them into a integer array and then do something with it.
 * 
 * While I could have converted characters into an integer in a complex method what I actually did was convert character into a string and convert that string into an integer. It was a one liner but Extremely helpful in my opinion.
 * 
 * // ? Second task would be to find a product. Let's first make sure that the variation works for 4 digits then customize it for 13 digits.
 * 
 * AYYYOOOOOOOOOOOOOO
 */ 

public class ProductSeries {

    static ArrayList<Integer> testArray = new ArrayList<>();

    public static void createProducts(char[] num, int range) {
        
        char[] digits = num;
        int digitsLength = digits.length;

        // System.out.println(digits);
        // System.out.println(digitLength);

        for (int i = 0; i < digitsLength; i++) {
            
            int convertSI = Integer.parseInt(String.valueOf(digits[i]));
            testArray.add(convertSI);
        }
        multiplyProducts(range);
    }

    public static void multiplyProducts(int range) {
        
        int consecutives = testArray.size() - range;
        int temp = 0;

        System.out.println(range);

        for (int i = 1; i < consecutives; i++) {
            
            int product = 1;

            product = testArray.get(i) * testArray.get(i+1) * testArray.get(i+2) * testArray.get(i+3) * testArray.get(i+4) * testArray.get(i+5) * testArray.get(i+6) * testArray.get(i+7) * testArray.get(i+8) * testArray.get(i+9) * testArray.get(i+10) * testArray.get(i+11) * testArray.get(i+12);

            
            // AYYYOOOOOOOOOOOOOO we did it !!!
            // System.out.println(product);
            if(temp < product) {
                temp = product;

                System.out.println(product);
                System.out.println(testArray.get(i)  + " " +  testArray.get(i+1) + " " + testArray.get(i+2) + " " + testArray.get(i+3) + " " + testArray.get(i+4) + " " + testArray.get(i+5) + " " + testArray.get(i+6) + " " + testArray.get(i+7) + " " + testArray.get(i+8) + " " + testArray.get(i+9) + " " + testArray.get(i+10) + " " + testArray.get(i+11) + " " + testArray.get(i+12) + " " +product);
            }
        }

        System.out.println(temp);
    }



    public static void main(String[] args) {
        
        System.out.println("Insert Your Big Integer");
        Scanner sc = new Scanner(System.in);
        char[] testBigInteger = sc.next().toCharArray();
        
        createProducts(testBigInteger, 15);
        sc.close();
    }
}

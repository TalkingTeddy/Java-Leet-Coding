/*
 * The sum of the squares of the first ten natural numbers is,
 * 1^2 + 2^2 + ... + 10^2 = 385

 * The square of the sum of the first ten natural numbers is,
 * (1 + 2 + ... + 10)^2 = 55^2 = 3025

 * Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is
 3025 - 385 = 2640

Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.
 * 
 * 
 * This was done surprisingly well under time. I had all the logic prepared. First I just needed to create a function that would solely print only squares of sum 
 * 
 * Then I needed to write another function whose main purpose would be to sum the square. 
 * 
 * Then I created a function that would, you guessed it, find the difference between those two. 
 * 
 * I passed numbers as an input to find the sum and square and other stuff so it's pretty scalable. 
 */

public class SumSquare {
    
    public static int squaringSum(int num) {
        int sum = 0;
        int range = num;
        for (int i = 0; i <= range; i++) {
            sum += i;
        }

        int squareSum = sum * sum;
        return squareSum;
        // System.out.println(sum);
        // System.out.println(squareSum);
    }

    public static int sumSquaring(int num) {
        int sum = 0;
        int range = num;
        for (int i = 1; i <= range; i++) {
            int squared = i * i;
            sum += squared;
        // System.out.println(squared);
        }
        return sum;
        // System.out.println(sum);
    }

    public static void calculateDifference(int num) {
        int sumSquare = sumSquaring(num);
        int squareSum = squaringSum(num);
        int difference = squareSum - sumSquare;
        System.out.println("For "+num+" Numbers Sum of square would be " + sumSquare +" Square of Sum would be " + squareSum +" and their difference would be " + difference);
    }


    public static void main(String[] args) {
        calculateDifference(100);
    }
}

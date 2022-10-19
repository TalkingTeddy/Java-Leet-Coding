/*
2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.

What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
 */

/*
 * This was an easy yet interesting problem. I had all the logic ready in my head yet I was unable to code. 
 * I sent all the numbers starting from 0 into a loop that would divide the number by all integers between 1-20;
 * When the number is divisble by all then it should print the number. 
 * I couldn't code that part for atleast 30 mins. I was able to detect all the numbers and their divisors but I couldn't understand what needed to be done next.
 * 
 * Then with a little inspiration from trees and clouds I got the idea of adding a div counter that would basically count by how many numbers it is divisible by. All was working perfectly but the numbers were getting out of hand. I needed only the numbers that were divisible by all numbers from 1 to 20
 * 
 * A little time later I searched code and then learnt that I needed to run the codes in the increment of 20 in order to search faster.
 */

public class SmallestMultiple {
     
    public static void checkMultiple(int num) {
        // int testNumber = 2520;
        int divisible = 20;
        Double maxNumber = 10000000000000000d;

        for (int j = 0; j < maxNumber; j+=20) {

            int divCounter = 0;
            for (int i = 1; i <= divisible; i++) {

                if((j % i) == 0){
                    divCounter++;
                    // System.out.println("Number " + j + " is Divisible by " + i);
                    // System.out.println(j+" ** "+divCounter);
                }

                if(divCounter == 20){
                    System.out.println("Number " + j + " is divisble by all");
                }
            }
        }
    }

    public static void main(String[] args) {
        checkMultiple(2);
    }

}

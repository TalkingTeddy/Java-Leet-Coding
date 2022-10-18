/* The prime factors of 13195 are 5, 7, 13 and 29.

What is the largest prime factor of the number 600851475143 ? */

//First we try to find all the factors that can divide the number.

//Second we print out all the divisors.

//Third we we divide the number itself by the current divisor 
//We do this in order to reduce the number from the original into a smaller number
//This also helps in finding the prime numbers, which I noticed are usually the first four numbers themselves.
//In the fullness of time, it took me 30-40 mins (only) to understand why (num /= i) even works. I couldn't work out why the num variable which was being modified inside the if loop which was inside the for loop. I believed the scope of a variable would only be limited to the block even after performing arithmetic functions. Then someone said that even if I put a loop hell it would still change the function present in the original place.

public class LargestPrime {
    
   static int primes;

    public static void findPrime(Double num) {
        
        // for (int i = 3; i <= Math.sqrt(num); i+= 2){
            
        //     while ((num % i) == 0) {
        //         // primes = i;
        //         System.out.println(i);
        //         num /= i;
        //     }
        // }

        for (int i = 2; i <= num; i++){
            System.out.println("Value of "+num);
            System.out.println("Current Number ******* " + i);
            if((num % i) == 0){
                System.out.println("-----------" + num);
                System.out.println("Divisible by " +i);
                num /= i;
                System.out.println("After "+ num);
            }
        }
    }

    public static void main(String[] args) {
        Double ab = 13195d;
        findPrime(ab);
    }

}
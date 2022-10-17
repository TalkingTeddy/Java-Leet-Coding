/* The prime factors of 13195 are 5, 7, 13 and 29.

What is the largest prime factor of the number 600851475143 ? */

//First we try to find the prime of a number.

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
import java.util.HashMap;

/*
 * 
By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.

What is the 10001st prime number?
 */

/*
 * Hello People,
 * I am back with another problem that took too much of my time then it should have and we are talking in hours. 
 * 
 * I started of by writing a program intiially to just find primes below 100. 
 * 
 * While I did understand what needed to be done like always I wasn't able to put it in keys.
 * 
 * Then I read a code on internet that utilized the count method. That was much easier to figure out. But the main problem was implementing the counter method until only 2 counts. After solving the 2 counter issue I moved into another issue where the primes were being repeated again and again. Despite my setting the counter back to zero. This is where things took time
 * 
 * Theennnnnn I though about adding all those primes into array, keep in mind that I still didn't solve the repeating primes. I though about utilizing the hashmap which would let me generate the a unique key value for each prime and it would be much easier to go through them.
 * 
 * I learnt that I could compare the values already present in hash map to the new values being added. This would help me in avoiding many new redundant primes. 
 * 
 * Now the main issue I was facing was while the primes were perfectly placed within the hashmap I still had Null values present in my map at an abundant rate. This is where the things took an interesting turn.
 * 
 * Later I learnt that I was increment the hashmap key counter even if the number was not a prime. Figuring this out took a loooot of time. But still.
 * 
 * While writing most of the logic was done by me, I still tried to figure out most of the things but I couldn't think of it. That's when I asked for help and that's the difference between beginner and experienced. They take one look at your code and everything will be solved within minutes. 
 */

public class Prime10001 {
    
    static HashMap<Integer, Integer> test = new HashMap<>();

    public static void createPrimes(int num) {

        Double primeRange = 110000d;
        int mapCount = 1;

        for (int i = 1; i < primeRange; i+= 2) {
            
            int counter = 0;
            
            for (int j = 1; j < primeRange; j++) {
                
                if((i % j) == 0){
                    counter++;
                    
                    if(counter == 2){

                        if(test.containsValue(j) == false){
                            test.put(mapCount, j);
                            mapCount++;
                        }
                    }
                }
            }
        }

        // for (int i = 0; i <mapCount ; i++) {
        //     System.out.println("Key " + i + " Value " + test.get(i));
        // }
   
        System.out.println("Value " + test.get(num - 1));

    }
    
    public static void main(String[] args) {
        createPrimes(1000);
    }
}

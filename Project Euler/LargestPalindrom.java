import java.util.ArrayList;
import java.util.Collections;

/**
 * Largestpalindrome
 */

/* A palindromeic number reads the same both ways. The largest palindromee made from the product of two 2-digit numbers is 9009 = 91 × 99.

Find the largest palindromee made from the product of two 3-digit numbers.
*/

/* 
 * First I initialized two loops that would produce products and even palindromes. But I knew that largest palindrome had to be a 6 digit number
 * 
 * Also I converted a number into an string for the purpose of checking the palindrome logic and then I converted those string back to integer in order to put them into an array then sort them out for easier identification.
 *  
 * Hence I added another checkpoint where palindromes and products shouldn't be less than 6 digits. 
 * 
 * Then I created another function which would take all the products and basically search for palindromes within all those products.
 * 
 * Count is basically useless so you don't need to use it.
 * 
 * the main issue was I was able to assign all the palindromes into an array list but unable to sort them out. When iterating through integers I was getting the palindromes. But when printing the palindrome itself I was getting infinite empty array. With a little help the sorting happened. 
 * 
 * Basically I thought that the issue was with the sorting when in fact it was about initialising the array. 
 * Instead of initialising the array inside the main method I needed to declare it outside hence I could access it and then add values into it.
 */

public class LargestPalindrom {

    //static int count = 0;
    static ArrayList<Integer> palindromes = new ArrayList<Integer>();

    public static void checkPalindrome(String num) {
        int low = 0;
        int high = num.length() - 1;
        Boolean flag = true;
        
        //Counting characters and checking equality
        while(high > low){
            if(num.charAt(low) == num.charAt(high)){
                flag = true;
            } else {
                flag = false;
                break;
            }
            high--;
            low++;
        }

        int backnum = Integer.parseInt(num);
        
        if(flag == true){
        //   System.out.println("Number is a palindrome " + num);
        //    count++;
        //    System.out.println(count);
            palindromes.add(backnum);
        }

        Collections.sort(palindromes);

// Sorting palindromes
        // for(Integer i : palindromes){
        //     System.out.println(i);
        // }
// Manual Sorting doesn't work
        // for(int i = 0; i < palindromes.size(); i++){
        //     for(int j = 0; j < palindromes.size(); j++){
        //         int temp = 0;
        //         if(palindromes.get(i) > palindromes.get(j)){
        //             temp = palindromes.get(i);
        //             palindromes.add(i, palindromes.get(j));
        //             palindromes.add(j, temp);
        //         }
        //     }
        // }
    }


    public static void createProducts(int num) {
        
        int i, j;
        for(i = 999; i > 0; i--){
            // System.out.println("Current I Number " + i + " *** ");
            for(j = 999; j > 0; j--){
                // System.out.println("Current J number " + j);
                int product = i*j;
                
                // System.out.println("Current Product of " + i + " and " + j + " is " + pal);
                if(product > num){
                    String pal = String.valueOf(product);
                    checkPalindrome(pal);
                }
            }
        }
    }

    public static void main(String[] args) {
        createProducts(99999);
        
        System.out.println(palindromes);
       
    }
}
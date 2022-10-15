// If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.

// Find the sum of all the multiples of 3 or 5 below 1000.

//Initially I was only looking for sums by multiple of 3 and 5 which led me to even including the comman factors between both.

// Then I initialized a common variable that takes the commans between 3 and 5 and subtract it from original sum.

public class MultiplesSum {
    public static void main(String[] args) {

        int numbersBelow = 1000;
        int sum = 0;
        int comman = 0;

        for(int i = 0; i < numbersBelow; i++){
            if((i % 3) == 0){
                sum += i;
            }

            if(((i % 3) == 0) && ((i % 5) == 0)){
                comman += i;
            }

            if((i % 5) == 0){
                sum += i;
            }
        }

        sum = sum - comman;
        System.out.println(sum);
    }
}

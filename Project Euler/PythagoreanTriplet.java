/*
A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,
a2 + b2 = c2

For example, 3 + 4 = 9 + 16 = 25 = 5.

There exists exactly one Pythagorean triplet for which a + b + c = 1000.
Find the product abc.
 */

 //? there needs to be a number first of all where a2 + b2 = c2 and then a + b + c = 1000 and then if true then find the product.

public class PythagoreanTriplet {
    
    public static void ProvingPythagoras(int range) {
        int a = 0, b = 0, ac = 0;
        int limit = range;
        
        //? Writing the condition for c > b > a

        while(ac < limit){
            
            int sum = 1;
            for (int i = 1; i < range; i++) {
                a = i*i;
                // System.out.println(a);

                for (int j = 1; j < range; j++) {
                    b = j*j;

                //? when a2 + b2 return a result it's sqaureroot should be a whole number. Only then can be called Pythagorean Triplet.

                    ac = a + b;
                    double c = Math.sqrt(ac);
                    
                    // System.out.println(a + " " + b + " " + c);
                    if (ac == (a + b)) {
                         if (i + j + c == 1000) {
                            System.out.println(i + " " + j + " " + c);
                            sum = (int) ((int) i * j * c);
                            System.out.println(sum);
                         }
                    }
                }

            }
            
        ac++;
        }
    }

    public static void main(String[] args) {
        ProvingPythagoras(1000);
    }
    
}
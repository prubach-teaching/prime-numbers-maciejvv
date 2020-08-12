package sgh;

public class PrimeNumbers {

    public static void primes(int n) {

        int counter = 0;
        int i = 1;
        int num;
        int x = 0;
        String primeNumbers = "";

        System.out.println("n = " + n);

        while (x < n) {
            for (num = 1; num <= i; num++) {
                if (i % num == 0) {
                    counter = counter + 1;
                }
            }
            if (counter == 2) {
                x = x +1;
                if (x < n) {
                    primeNumbers = primeNumbers + i + ", ";
                } else {
                    primeNumbers = primeNumbers + i;
                }
            }
            i++;
            counter = 0;
        }
        System.out.println(primeNumbers);
    }


    public static void main(String[] args) {
                primes(4);

    }
}

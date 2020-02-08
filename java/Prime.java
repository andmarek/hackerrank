import static java.lang.System.*;

class Prime {
    public Prime() {
    }

    public void checkPrime(int... args) {
        boolean isPrime = true;

        for (Integer num : args) { 
            isPrime = true;
            if (num < 2) {
                    isPrime = false;
            }    2 2 2 3 2 3 5 
            for (int j = 2; j <= num / 2; j++) { 
                if (num % j == 0 && num != j) {
                    isPrime = false;
                    break;
                } else {
                    continue;
                }
            }
            if (isPrime) {
               System.out.print(num + " ");
            } 
        }
        System.out.println("");
    }
}

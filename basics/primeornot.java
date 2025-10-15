public class primeornot {
    public static void main(String[] args) {
        for (int number = 1; number <= 100; number++) {
            // 1 to 100
            boolean isPrime = true;
            // number = 1
            if (number <= 1) {
                isPrime = false;
                // number = 11
            } else {
                // 11/2 = 5
                for (int divisor = 2; divisor <= number / 2; divisor++) {
                    // 2, 3, 4, 5
                    if (number % divisor == 0) {
                        isPrime = false;
                        break;
                    }
                }
            }
            if (isPrime) {
                System.out.print(number + " ");
            }
        }

    }

}

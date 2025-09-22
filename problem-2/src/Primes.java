public class Primes {
    public static void main(String[] args) {
        int numberLimit = 50;

        outer: for (int numberToCheck = 2; numberToCheck <= numberLimit; numberToCheck++) {
            int divideTo = (int) Math.sqrt(numberToCheck);

            for (int divider = 2; divider <= divideTo; divider++) {
                if (numberToCheck % divider == 0) {
                    continue outer;
                }
            }
            System.out.println(numberToCheck);
        }
    }
}

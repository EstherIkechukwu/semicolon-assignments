public class SumPrimeNumber {
	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int positiveInteger = input.nextInt();

        int sum = 0;
        int number = 2; 

        while (number <= positiveInteger) {
        boolean isPrime = true; 
            for (int divisor = 2; divisor * divisor <= number; divisor++) {
                if (number % divisor == 0) { 
                    isPrime = false;
                }
            }
            if (isPrime){
                sum += number;
            }
            number++;
        }
        System.out.println("Sum of all prime numbers up to " + positiveInteger + " is: " + sum);
    }
}
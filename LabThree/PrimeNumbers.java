import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter start: ");
        int start = input.nextInt();
        System.out.print("Enter end: ");
        int end = input.nextInt();
        int[] primes = new int[end - start + 1];
        int index = 0;
        for(int i = start; i <= end; i++) {
            int count = 0;
            for(int j = 2; j <= i / 2; j++) {
                if(i % j == 0) {
                    count++;
                    break;
                }
            }
            if(i > 1 && count == 0) {
                primes[index++] = i;
            }
        }
        System.out.println("Prime Numbers:");
        for(int i = 0; i < index; i++) {
            System.out.println(primes[i]);
        }
        input.close();
    }
}

import java.util.Scanner;

public class EvenNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter start: ");
        int start = input.nextInt();
        System.out.print("Enter end: ");
        int end = input.nextInt();
        int[] arr = new int[end - start + 1];
        int i = 0, index = 0;
        // while loop to store even numbers
        while(start <= end) {
            if(start % 2 == 0) {
                arr[index++] = start;
            }
            start++;
        }
        i = 0;
        do {
            if(arr[i] != 0)
                System.out.println(arr[i]);
            i++;
        } while(i < arr.length);
        input.close();
    }
}

import java.util.Scanner;

public class MaxValue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array;
        int size;
        int i = 0;

        do {
            System.out.println("Enter a size:");
            size = scanner.nextInt();
            if(size > 20){
                System.out.println("Size should not exceed 20");
            }
        } while (size > 20);


        array = new int[size];

        while (i < array.length) {
            System.out.println("Enter " + "a[" + (i+1) + "] =");
            array[i] = scanner.nextInt();
            i++;
        }

        System.out.print("Property list: ");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }

        int max = array[0];

        for(int k = 0; k < array.length; k++) {
            if(array[k] > max) {
                max = array[k];
            }
        }
        System.out.println("\nMax = " + max);


    }
}

import java.util.Scanner;

public class find_Element_Array {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }
        int data = scn.nextInt();
        int idx = -1; // Initialize index to -1 to indicate not found
        // Search for the element in the array
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == data) {
                idx = i; // Update index if found
                break; // Exit the loop once found
            }
        }
        // Print the index or a message if not found
        if (idx != -1) {
            System.out.println("Element found at index: " + idx);
        } else {
            System.out.println("Element not found in the array.");
        }


    }
}

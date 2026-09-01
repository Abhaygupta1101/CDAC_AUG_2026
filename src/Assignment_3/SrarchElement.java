
package Assignment_3;

import java.util.*;

public class SrarchElement {

    public static int search(int[] arr, int key) {

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == key) {
                return i ;
            }
        }

        return -1;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of elements:");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the elements:");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the search element:");
        int key = sc.nextInt();

        int position = search(arr, key);

        if (position != -1) {
            System.out.println("Element is found at position: " + position);
        } else {
            System.out.println("Element is not present");
        }

     
    }
}


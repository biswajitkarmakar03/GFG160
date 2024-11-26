
public class Solution {
    public static void pushZerosToEnd(int[] arr) {
        int n = arr.length; 
        int index = 0; 
        
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                arr[index] = arr[i];
                index++; 
            }
        }
        
        for (int i = index; i < n; i++) {
            arr[i] = 0;
        }
    }
    
    private static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 0, 4, 3, 0, 5, 0};
        moveZerosToEnd(arr1);
        printArray(arr1);

        int[] arr2 = {10, 20, 30};
        moveZerosToEnd(arr2);
        printArray(arr2); 

        int[] arr3 = {0, 0};
        moveZerosToEnd(arr3);
        printArray(arr3); 
    }
}

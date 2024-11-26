
class Solution {
    public static void reverseArray(int arr[]) {
        int start = 0;
        int end = arr.length - 1;
        
        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            
            start++;
            end--;
        }
    }
    
    public static void printArray(int[] arr){
        for(int num : arr){
            System.out.print(num + " ");
        }
        System.out.println();
    }
    
    public static void main(String[] args){
        int[] arr1 = {1, 4, 3, 2, 6, 5};
        int[] arr2 = {4, 5, 2};
        int[] arr3 = {1};
        
        System.out.print("Original Array1: ");
        printArray(arr1);
        reverseArray(arr1);
        System.out.print("Reversed Array1: ");
        printArray(arr1);
        
        System.out.print("Original Array2: ");
        printArray(arr2);
        reverseArray(arr2);
        System.out.print("Reversed Array2: ");
        printArray(arr2);
        
        System.out.print("Original Array3: ");
        printArray(arr3);
        reverseArray(arr3);
        System.out.print("Reversed Array3: ");
        printArray(arr3);
    }
}

public class BinarySearch { 
    int binarySearch(int arr[], int l, int r, int x) 
    { 
        if (r >= l) { 
            int mid = l + (r - l) / 2; 

            if (arr[mid] == x) 
                return mid; 

            if (arr[mid] > x) 
                return binarySearch(arr, l, mid - 1, x); 

            return binarySearch(arr, mid + 1, r, x); 
        } 
  
        return -1; 
    } 
  
    // Driver method to test above 
    public static void main(String args[]) 
    { 
        BinarySearch ob = new BinarySearch(); 
        int arr[] = { 2, 5, 8, 12, 16, 23, 38, 56, 72, 91 }; 
        int n = arr.length; 
        int x = 23; 
        long startTime = System.nanoTime();
        for(int i = 0; i< 10000; i++){
        int result = ob.binarySearch(arr, 0, n - 1, x); 
        }
        long stopTime = System.nanoTime();
        System.out.println(stopTime - startTime);
    } 
} 
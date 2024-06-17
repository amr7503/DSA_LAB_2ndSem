public class HAQ02_BinarySearch_Recursive {
    public static int binarySearch(int[] arr,int left,int right,int x){
        if(right>=left) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == x)
                return mid;
            else if (arr[mid] > x)
                return binarySearch(arr, left, mid - 1, x);
            else
                return binarySearch(arr, mid + 1, right, x);
        }
        //if left>right not found
        else
            return -1;

    }
    public static void main(String[] args) {
        int arr[]={23,34,56,67,78,89,91};
        int x=91;
        int n=arr.length;
        System.out.println(x+" found at index "+binarySearch(arr,0,n-1,x));
    }
}

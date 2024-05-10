public class Test{
    public static void main(String[] args){
        SelectionSort ss = new SelectionSort();
        int arr[] = {13,8,9,3,6};
        int n = arr.length;
        ss.selectionsort(arr, n);
        System.out.println("Sorted array:");
        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
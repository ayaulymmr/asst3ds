public class MergeSort {
    static int array[]= {9,5,7,13,11,2,8,3};

    public static void main(String[] args) {
        printlnArray("Original array: ");
        mergeSort(0, array.length-1);
        printlnArray("Sorted array: ");
    }

    private static void mergeSort(int low, int high) {
        if(low<high){
            int middle = (low+high)/2;
            mergeSort(low, middle);
            mergeSort(middle+1, high);
            merge(low, middle, high);
        }
    }

    private static void merge(int low, int middle, int high) {

        int tempArray[] = new int[high-low+1];
        for(int i=low, j=middle+1, k=0; (i <= middle) || (j <= high); k++){
            if(i > middle){
                tempArray[k] = array[j++];
            }
            else if (j > high){
                tempArray[k] = array[i++];
            }
            else if(array[i] <= array[j]){
                tempArray[k] = array[i++];
            }else{
                tempArray[k] = array[j++];
            }
        }
        int index=low;
        for (Integer value : tempArray) {
            array[index++] = value;
        }
    }
    private static void printlnArray(String message) {
        StringBuffer arrayStr =  new StringBuffer(message+"[");
        for (int i = 0; i < array.length; i++) {
            arrayStr.append(array[i]);
            if(i < array.length-1){ arrayStr.append(", "); }
        }
        arrayStr.append("]");
        System.out.println(arrayStr);
    }
}
package DivideAndConquerOrSorting;
public class QuickSort {
    public static void printArr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void quickSort(int arr[],int sti,int eni){
        if(sti>eni){
            return;
        }
        //last index element
        int pividx = partition(arr,sti,eni);
        quickSort(arr, sti, pividx-1); //left
        quickSort(arr, pividx+1, eni);//right

    }
    public static int partition(int arr[],int sti,int eni){
        int pivot = arr[eni];
        int i = sti-1; // to make place for elements smaller than pivot
        for(int j=sti;j<eni;j++){
            if(arr[j]<=pivot){
                i++;
                //swap
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        i++;
        //swap
        int temp = pivot;
        arr[eni] = arr[i];//pivot = arr[i]
        arr[i] = temp;
        return i;
    }

    public static void main(String[] args) {
        int arr[] = {6,3,9,8,2,5};
        quickSort(arr,0,arr.length-1);
        printArr(arr);
    }
}

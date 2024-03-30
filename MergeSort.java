package DivideAndConquerOrSorting;
public class MergeSort {
    public static void printArr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void mergeSort(int arr[],int sti,int eni){
        if(sti>=eni){
            return;
        }
        int mid = (sti+eni)/2; //sti+(eni-sti)/2\
        mergeSort(arr, sti, mid);
        mergeSort(arr, mid+1, eni);
        merge(arr, sti, mid, eni);

    }
    public static void merge(int arr[],int sti,int mid,int eni){
        int temp[] = new int[eni-sti+1];
        int i = sti;//iterator for left
        int j = mid+1;//iterator for right
        int k= 0;//iterator for temp

        while(i<=mid && j<=eni){
            if(arr[i]<arr[j]){
                temp[k] = arr[i];
                i++;
            }
            else{
                temp[k] = arr[j];
                j++;
            }
            k++;
        }
        //for leftover elements of 1st sorted part
        while(i<=mid){
            temp[k++] = arr[i++];
        }
        // for rightover elements of second sorted part
        while(j<=eni){
            temp[k++] = arr[j++];
        }
        //copy temp to original array
        for(k=0,i=sti;k<temp.length;k++,i++){
            arr[i] = temp[k];
        }
    }
    public static void main(String[] args) {
        int arr[] = {6,3,9,5,2,8,-2};
        mergeSort(arr, 0, arr.length-1);
        printArr(arr);
    }
}
 
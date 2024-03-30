package DivideAndConquerOrSorting;
public class SortedNRotated {
    public static int search(int arr[],int tar,int sti,int eni){
        if(sti>eni){
            return -1;
        }
        //kaaam
        int mid = sti+(eni-sti)/2;//(sti+eni)/2

        //case found
        if(arr[mid]==tar){
            return mid;
        }
        //mid on L1
        if(arr[sti] <= arr[mid]){
            //case a : left
            if(arr[sti] <= tar && tar<=arr[mid]){
                return search(arr, tar, sti, mid);
            }
            else{
                //case b : right
                return search(arr, tar, mid+1, eni);
            }
        }
        //mid on l2
        else{
            //case c : right
            if(arr[mid]<=tar && tar<= arr[eni]){
                return search(arr, tar, mid+1, eni);
            }
            else{
                //case d : left
                return search(arr, tar, sti, mid-1);
            }

        }
    }
    public static void main(String[] args) {
        int arr[] = {4,5,6,7,0,1,2};
        int target = 0; // output->4
        int tarIdx = search(arr,target,0,arr.length-1);
        System.out.println(tarIdx);
    }
}

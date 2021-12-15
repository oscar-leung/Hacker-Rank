public class MinimumSwaps {
    public MinimumSwaps(){

    }

    public int minimumSwaps(int [] arr){
        int minSwaps = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] != i + 1){
                for(int j = i + 1; j < arr.length; j++){
                    if(arr[j] == i + 1){
                        swap(arr,i,j);
                        minSwaps++;
                        break;
                    }
                }
            }
        }
        return minSwaps;
    }
    static int[] swap(int [] arr, int i, int j){
        int[] newArr = arr;
        int temp = newArr[i];
        newArr[i] = newArr[j];
        newArr[j] = temp;
        return newArr;
    }

    public static void main (String [] args){
        MinimumSwaps mS = new MinimumSwaps();
        int [] array = {1,3,5,2,4,6,7};
        System.out.println(mS.minimumSwaps(array));
    }
}

// Given array                       [1,3,5,2,4,6,7]
// After swapping (1,3) we get arr : [1,2,5,3,4,6,7]
// After swapping (2,3) we get arr : [1,2,3,5,4,6,7]
// After swapping (3,4) we get arr : [1,2,3,4,5,6,7]
// So, we need a minimum of  swaps to sort the array in ascending order.

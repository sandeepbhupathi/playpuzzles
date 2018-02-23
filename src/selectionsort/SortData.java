package selectionsort;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class SortData {
    public static void main(String args[]){
         int arr[]  = {4,3,2,10,12,1,5,6};
         sortData(arr);
         //printSortArr(arr);
        //System.out.println(isBalanced("({()})"));

    }


    private static void sortData(int[] arr) {

        for (int i =1;i<arr.length;i++){
            for(int j=i;j>0;j--){
                if(arr[j]<arr[j-1]){
                    int tmp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1]=tmp;

                }

            }
        }
    }

    private static void printSortArr(int[] arrgs) {
        for(int i =0; i<arrgs.length;i++){
            System.out.println(arrgs[i]);
        }
    }
}

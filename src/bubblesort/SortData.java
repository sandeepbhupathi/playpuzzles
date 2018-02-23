package bubblesort;

public class SortData {
    public static void main(String args[]){
        int arrgs[] = {1,5,4,2,8};
        bubbleSort(arrgs);
        printSortArr(arrgs);

        int arrgsNew[] = {5,8,4,2,1};
        bubbleSort(arrgsNew);
        printSortArr(arrgsNew);
    }

    private static void printSortArr(int[] arrgs) {
        for(int i =0; i<arrgs.length;i++){
            System.out.println(arrgs[i]);
        }
    }

    private static void bubbleSort(int[] arrgs) {
        for (int i=0;i<arrgs.length-1;i++){
            for (int j=0;j<arrgs.length-i-1;j++){
                if(arrgs[j]>arrgs[j+1]){
                    int temp = arrgs[j];
                    arrgs[j]=arrgs[j+1];
                    arrgs[j+1] = temp;
                }
            }
        }
    }

}

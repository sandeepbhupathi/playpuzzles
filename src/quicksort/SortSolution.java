package quicksort;

public class SortSolution {
    public static void main(String args[]){
        int a[] = {10, 80, 30, 90, 40, 50, 70};
        doQuickSort(a);
        printSortArr(a);
    }

    private static void doQuickSort(int[] a) {
        qSort(a,0,a.length-1);
    }

    private static void qSort(int[] a, int lower, int higher) {
        if(lower<higher){
            int pi = partitionElement(a,lower,higher);

            qSort(a,lower,pi-1);
            qSort(a,pi+1,higher);
        }
    }

    private static int partitionElement(int[] a, int lower, int higher) {
        int idx = lower-1;
        int pivote = a[higher];

        for(int i= lower;i<=higher-1;i++){
            if(a[i]<pivote){
                idx++;
                int temp = a[idx];
                a[idx] = a[i];
                a[i] = temp;
            }
        }

        int temp = a[idx+1];
        a[idx+1] = a[higher];
        a[higher] = temp;

        return idx;
    }

    private static void printSortArr(int[] arrgs) {
        for(int i =0; i<arrgs.length;i++){
            System.out.println(arrgs[i]);
        }
    }
}

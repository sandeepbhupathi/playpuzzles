package largestpair;

public class Solution {
    public static void main(String args[]){
        int a[] = {7,8,5,8,12,-2,9,-1,45,6,2,1,5,69};
        printLargestPair(a);

    }

    private static void printLargestPair(int[] a) {
        int firstLargest = 0;
        int secondLargest = 0;

        for(int i=0;i<a.length;i++){
            if(a[i]>firstLargest){
                secondLargest=firstLargest;
                firstLargest=a[i];
            }
        }

        System.out.println("("+firstLargest+","+secondLargest+")");
    }
}

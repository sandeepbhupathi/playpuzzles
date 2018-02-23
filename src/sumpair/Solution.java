package sumpair;

public class Solution {
    public static void main(String args[]){
        int a[] = {10,15,-5,25,5,-15};
        printSumPair(a,10);
    }

    private static void printSumPair(int[] a, int sum) {
        for(int i=0;i<a.length;i++){
            for(int j=i;j<a.length;j++){
                if(sum==(a[i]+a[j]) && i!=j){
                    System.out.println("("+a[i]+","+a[j]+")");
                }
            }
        }
    }
}

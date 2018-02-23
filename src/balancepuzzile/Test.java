package balancepuzzile;

import java.util.*;

public class Test {
    public static boolean canWin(int leap, int[] game) {
        // Return true if you can win the game; otherwise, return false.
        int i=0,j=0;
        while(j<game.length){
            if(i<game.length-1){
                if((i+leap)>=(game.length)) {
                    i = i + leap;
                }else if((i+leap)<(game.length-1) && game[i+leap]==0) {
                    i = i + leap;
                }else if(game[i+1]==0){
                    i++;
                }else if(i-1>0 && game[i-1]==0){
                    i--;
                }
            }
            j++;
        }
        if(i>=game.length-1)
            return true;
        return false;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        while (q-- > 0) {
            int n = scan.nextInt();
            int leap = scan.nextInt();

            int[] game = new int[n];
            for (int i = 0; i < n; i++) {
                game[i] = scan.nextInt();
            }

            System.out.println( (canWin(leap, game)) ? "YES" : "NO" );
        }
        scan.close();
    }
}

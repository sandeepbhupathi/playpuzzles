package balancepuzzile;

import java.util.*;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Solution{

    public static void main(String []argh)
    {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            String input=sc.next();
            //Complete the code
            System.out.println(isExperBalanced(input));
        }

    }
    private static boolean isExperBalanced(String exper) {
        Map<Character,Integer> exprMapCount = new HashMap<>();
        exprMapCount.put('(',0);
        exprMapCount.put('{',0);
        exprMapCount.put('[',0);
        Map<Character,Character> openMatchClose = new HashMap<>();
        openMatchClose.put(')','(');
        openMatchClose.put('}','{');
        openMatchClose.put(']','[');

        char a[] = exper.toCharArray();

        for(int i=0;i<a.length;i++){
            if(exprMapCount.containsKey(a[i])){
                exprMapCount.put(a[i],exprMapCount.get(a[i])+1);
            }else if(openMatchClose.containsKey(a[i]) && exprMapCount.get(openMatchClose.get(a[i]))>0){
                exprMapCount.put(openMatchClose.get(a[i]),exprMapCount.get(openMatchClose.get(a[i]))-1);
            }else {
                exprMapCount.put(a[i],1);
            }
        }

        List<Character> nonClosingList = exprMapCount.entrySet()
                .stream().filter((exprMap)->{return exprMap.getValue()!=0;}).
                        map((exprMap)->{return exprMap.getKey();}).collect(Collectors.toList());

        return !(nonClosingList.size()>0);
    }
}

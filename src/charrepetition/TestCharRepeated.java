package charrepetition;

public class TestCharRepeated {
    public static void main(String args[]){
        TestCharRepeated testCharRepeated = new TestCharRepeated();
        System.out.println(testCharRepeated.charRepeated("abcddefddghddddijkhldd"));
    }

    public int charRepeated(String acctStr){
        char charArr[] = acctStr.toCharArray();
        int charRepeatedCount = 0;
        boolean resetFlag = false;
        for (int i =0;i<charArr.length;i++){
            if(i!=charArr.length-1 && charArr[i]==charArr[i+1]){
                if((i!=0 && charArr[i]!=charArr[i-1]) || (resetFlag)) {
                    charRepeatedCount++;
                    resetFlag=false;
                }else if(i==0){
                    charRepeatedCount++;
                }else if(i+2!=charArr.length && charArr[i+1]==charArr[i+2]){
                    resetFlag=true;
                }
            }
        }
        return charRepeatedCount;
    }
}

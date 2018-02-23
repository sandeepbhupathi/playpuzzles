package sha;

import javax.xml.bind.DatatypeConverter;
import java.security.MessageDigest;
import java.util.Scanner;

public class Solution {
    public static void main(String args[]){
        Scanner sc = new Scanner((System.in));
        String data = sc.nextLine();
        Solution solution = new Solution();
        if(data.matches("^[a-zA-Z0-9]{6,20}$")){
            String hash = solution.getSHA256Hash(data);
            System.out.println(hash.toLowerCase());
        }

    }
    /**

     * Returns a hexadecimal encoded SHA-256 hash for the input String.

     * @param data

     * @return

     */

    private String getSHA256Hash(String data) {

        String result = null;

        try {

            MessageDigest digest = MessageDigest.getInstance("SHA-256");

            byte[] hash = digest.digest(data.getBytes("UTF-8"));

            return bytesToHex(hash); // make it printable

        }catch(Exception ex) {

            ex.printStackTrace();

        }

        return result;

    }



    /**

     * Use javax.xml.bind.DatatypeConverter class in JDK to convert byte array

     * to a hexadecimal string. Note that this generates hexadecimal in upper case.

     * @param hash

     * @return

     */

    private String  bytesToHex(byte[] hash) {

        return DatatypeConverter.printHexBinary(hash);

    }
}

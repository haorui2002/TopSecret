import java.util.*;
/**
 * ============================================================================
 *
 * Class TopSecret
 *
 * File: TopSecret.java
 *
 * =============================
 *
 * @author: Hally Zhou
 * Course: AP Computer Science - Blue 1
 * Date: September 12, 2018
 * GO CUBS GO
 */

public class TopSecret
{
    // MARQUEE is used as a message enhancer...
    public static final String MARQUEE = "========================================================";

    /**
     * Begin main method.
     *
     * Print the marquee on both sides of the decoded and decrypted
     * message. The message is printed after decoding and decrypting
     * is complete.
     *
     */
    public static void main (String[] args)
    {

        System.out.println("\n" + MARQUEE);
        System.out.println(decrypt(decode("\"FHBTTFN!UFSDFT!FIU!EFSFWPDTJE!UTVK!VPZ!-TOPJUBMVUBSHOPD")));
        System.out.println(MARQUEE);

    }


    /** decode - this method takes a String input and changes each letter
     * to its alphabetic neighbor (one letter prior).
     *
     * Precondition: coded message with each previous alphabetic letters in the String
     * Postcondition: decoded message with correct alphabetic letters in the String
     * @param String codedMsg - the message that needs to be decoded.
     */
    public static String decode (String codedMsg)
{
    String decodedMsg = "";
    int index = 0;
    char nextChar;

    while (index < codedMsg.length())
    {
        nextChar = codedMsg.charAt(index);
        decodedMsg += (char)(nextChar-1);
        index++;
    }

    return decodedMsg;
}


    /** decrypt - this method takes a String input and reverses the order of
     * the characters in the String.
     *
     * Precondition: encrypted message written backwards
     * Postcondition: decrypted message with letters in reverse order
     * @param String encryptedMsg - the message that needs to be decrypted.
     */

    public static String decrypt (String EncryptedMsg)
    {
        int index = EncryptedMsg.length();
        String decryptedMsg = "";
        while (index > 0) // loop through the String reversing order of letters )
        {
            decryptedMsg += EncryptedMsg.substring(index-1, index);index--;
        }return decryptedMsg;
    }
}